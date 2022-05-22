// 課題1: テキストファイルからグラフを作成 Graph.java
import java.util.*;
import java.io.*;

public class Graph{
    private ArrayList<Node> nodes = new ArrayList<Node> ();
    
    public void loadGraph(String filename) throws Exception{
        File srcfile = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(srcfile));
        String line;
        int count = 0;
        while((line = reader.readLine()) != null){
            nodes.add(new Node(count, line));
            count++;
        }

        reader.close();
    }
    
    public void printGraph(){
        for(int i = 0; i<nodes.size(); i++){
            Node t_node = nodes.get(i);
            int t_size = t_node.getSize(); 

            System.out.print(t_node.getId()+":");
            if(t_size > 0){
                for(int j = 0; j<t_size-1; j++){
                    System.out.print(t_node.getEdgeTo(j) + "@" + t_node.getEdgeWeight(j) +","); 
                }
                System.out.println(t_node.getEdgeTo(t_size-1)+ "@" + t_node.getEdgeWeight(t_size-1));
            }else System.out.println();
        }
    }

    public int getSize(){
        return nodes.size();
    }

    public Node getNode(int index){
        return nodes.get(index);
    }
}

class Node{
    private int id;
    private ArrayList<Edge> list;

    Node(int id){this.id = id; list = new ArrayList<Edge>();}

    Node(int id, String line){
        this(id);
        String[] sp1 = line.split(":");
        id = Integer.parseInt(sp1[0]);
        if(sp1.length != 1){
            String[] sp2 = sp1[1].split(",");
            for(String s : sp2){
                String[] sp3 = s.split("@");
                int to = Integer.parseInt(sp3[0]);
                double weight = Double.parseDouble(sp3[1]);
                list.add(new Edge(to,weight));
            }
        }
        
    }

    public int getId(){
        return id;
    }

    public int getSize(){
        return list.size();
    }

    public Edge getEdge(int index){
        return list.get(index);
    }

    public int getEdgeTo(int index){
        return list.get(index).getTo();
    }

    public double getEdgeWeight(int index){
        return list.get(index).getWeight();
    }
}

class Edge{
    private int to;
    private double weight;

    Edge(int to){this.to = to;}
    Edge(int to, double weight){this.to = to; this.weight = weight;}

    public int getTo(){return to;}
    public double getWeight(){return weight;}

}