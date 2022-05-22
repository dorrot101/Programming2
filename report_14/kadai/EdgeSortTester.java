// 課題2: 辺のソート EdgeSortTester.java
import java.util.LinkedList;

public class EdgeSortTester{
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("How to Use : java EdgeSortTester [filename]");
            System.out.println("Ex) java EdgeSortTester wug_0.txt");
            System.exit(0);
        }

        try{
            WUGraph wugraph = new WUGraph();
            wugraph.loadGraph(args[0]);
            LinkedList<Edge> edges = wugraph.getsortedEdges();
            for(Edge iter : edges){
                System.out.printf("%d:%d,%d,%d\n",iter.getId(),iter.getNodeU(),iter.getNodeV(),iter.getCost());
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}