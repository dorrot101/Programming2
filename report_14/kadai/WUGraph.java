// 課題1～4: 重み付き無向グラフのクラス WUGraph.java

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class WUGraph{

    LinkedList<Node> nodes;
    LinkedList<Edge> edges;

    public void loadGraph(String filename) throws Exception{
        File srcfile = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(srcfile));
        String line = reader.readLine();

        String[] numSet = line.split(",");

        int nodeNum = Integer.parseInt(numSet[0]);
        int edgeNum = Integer.parseInt(numSet[1]);

        nodes = new LinkedList<Node> ();
        edges = new LinkedList<Edge> ();

        for(int node = 0; node < nodeNum; node++){
            nodes.add(new Node(node));
        }

        while((line = reader.readLine()) != null){
            String[] sp1 = line.split(":");
            if(sp1[1].length() > 0){
                String[] sp2 = sp1[1].split(",");
                if(sp2.length == 3){
                    int id = Integer.parseInt(sp1[0]);
                    int nodeV = Integer.parseInt(sp2[0]);
                    int nodeU = Integer.parseInt(sp2[1]);
                    int cost = Integer.parseInt(sp2[2]);     
                    edges.add(new Edge(id,nodeV,nodeU,cost));
                }
            }
        }
        reader.close();
    }

    public void printGraph(){
        System.out.println(nodes.size() + "," + edges.size());
        for(int index = 0; index < edges.size(); index++){
            Edge e = edges.get(index);
            System.out.printf("%d:%d,%d,%d\n",e.getId(),e.getNodeV(),e.getNodeU(),e.getCost());
        }
    }

    public LinkedList<Edge> getsortedEdges(){
        LinkedList<Edge> sortedEdges = new LinkedList<>(this.edges);
        Collections.sort(sortedEdges);
        return sortedEdges;
    }

    public Edge[] getMST(){
        UnionFind ufGraph = new UnionFind(this.getNodeSize());
        LinkedList<Edge> sortedEdges = this.getsortedEdges();
        ArrayList<Edge> mstArrList = new ArrayList<Edge>();

        for(Edge iter : sortedEdges){
            if(ufGraph.unite(iter.getNodeV(), iter.getNodeU())){
                mstArrList.add(iter);
            }
        }

        Edge[] mstArr = new Edge[mstArrList.size()];
        for(int i = 0; i<mstArr.length; i++){
            mstArr[i] = mstArrList.get(i);
        }

        return mstArr;
    }

    public int getNodeSize(){
        return nodes.size();
    }

    public int getEdgeSize(){
        return edges.size();
    }
}

class Edge implements Comparable<Edge>{
    private int id;
    private int nodeV;
    private int nodeU;
    private int cost;

    Edge(int id, int nodeV, int nodeU, int cost){
        this.id = id;
        this.nodeV = nodeV;
        this.nodeU = nodeU;
        this.cost = cost;
    }

    int getId(){
        return id;
    }
    
    int getNodeV(){
        return nodeV;
    }
    
    int getNodeU(){
        return nodeU;
    }
    
    int getCost(){
        return cost;
    }

    @Override
    public int compareTo(Edge edge){
        return this.cost >= edge.getCost() ? 1 : -1;
    }
}

class Node{
    int id;

    Node(int id){
        this.id = id;
    }

    int getId(){
        return id;
    }
}

