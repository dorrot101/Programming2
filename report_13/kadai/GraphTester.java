// 課題1: テキストファイルからグラフを作成 GraphTester.java

public class GraphTester{
    public static void main(String[] args) {
        
        if(args.length != 1){
            System.out.println("How to Use : java GraphTester [filename]");
            System.out.println("Ex) java GraphTester graph001.txt");
            System.exit(0);
        }
        
        try{
            Graph graph = new Graph();
            graph.loadGraph(args[0]);
            graph.printGraph();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}