// 課題3: union-findデータ構造 UnionFind.java

public class UnionFind{

    private int[] parents;
    private int[] rank;

    UnionFind(int size){
        parents = new int[size];
        rank = new int[size];

        for(int i = 0; i<size; i++){
            parents[i] = i;
            rank[i] = 0;
        }
    }

    public boolean unite(int nodeA, int nodeB){

        int parentA = find(nodeA);
        int parentB = find(nodeB);

        if(parentA != parentB){
            if(rank[parentA] == rank[parentB]){
                parents[parentB] = parentA;
                rank[parentA]++;
            }
            else{
                parents[parentA] = parentB;
            }
            return true;
        }
        else return false;

    }

    public int find(int x){

        int node = x;

        while(parents[node] != node){
            node = parents[node];
        }

        return node;
    }

    public int[] getParents(){
        return parents;
    }

    public int[] getRank(){
        return rank;
    }

}