//課題2: ダイクストラ法による最短経路探索 DijkstraTester.java

public class DijkstraTester{
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Follow this format : java DijkstraTester [filename] [startnode] [endnode]");
            System.out.println("Ex) java DijkstraTester sample.txt 0 2");
            System.exit(1);
        }
        try{

            String filename = args[0];
            int startnode = Integer.parseInt(args[1]);
            int endnode = Integer.parseInt(args[2]);

            Dijkstra graph = new Dijkstra();
            graph.loadGraph(filename);

            /*
            for(int p = 0; p<graph.getSize(); p++){
                int[] Tree = graph.doDijkstra(p);
                System.out.printf("%d : " , p);
                for(int i = 0; i<graph.getSize()-1; i++){
                    if(Tree[i] == -1){
                        System.out.printf("x,");
                    }
                    else System.out.printf("%d,", Tree[i]);
                }
                if(Tree[Tree.length-1] == -1){
                    System.out.println("x");
                }
                else System.out.println(Tree[Tree.length-1]);
            }
            */

            int[] ShortestPath = graph.getShortestPath(startnode,endnode);
            System.out.printf("%d : " , endnode);
            for(int i = 0; i<ShortestPath.length-1; i++){
                System.out.printf("%d,", ShortestPath[i]);
            }
            System.out.println(ShortestPath[ShortestPath.length-1]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }       
    }
}
