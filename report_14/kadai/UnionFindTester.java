// 課題3: union-findデータ構造 UnionFindTester.java

public class UnionFindTester{
    public static void main(String[] args) {
        UnionFind ufGraph = new UnionFind(10);
        ufGraph.unite(5,6);
        ufGraph.unite(1,4);
        ufGraph.unite(3,2);
        ufGraph.unite(4,6);
        ufGraph.unite(7,9);
        ufGraph.unite(8,5);

        int[] Parents = ufGraph.getParents();
        int[] Rank = ufGraph.getRank();

        for(int i : Parents){
            System.out.print(i+",");
        }
        System.out.println();

        for(int i : Rank){
            System.out.print(i+",");
        }
    }
}