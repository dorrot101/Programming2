// 課題4: クラスカル法 MSTTester.java
import java.util.LinkedList;

public class MSTTester{
    public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("How to Use : java MSTTester [filename]");
            System.out.println("Ex) java MSTTester wug_0.txt");
            System.exit(0);
        }

        try{
            WUGraph graph = new WUGraph();
            graph.loadGraph(args[0]);
            Edge[] ans = graph.getMST();

            int sumofCost = 0;

            for(Edge iter : ans){
                sumofCost += iter.getCost();
            }

            System.out.println("TotalWeight: " + sumofCost);
            System.out.println("MST:");
            System.out.println(graph.getNodeSize() + "," + ans.length);
            for(Edge iter : ans){
                System.out.printf("%d:%d,%d,%d\n", iter.getId(), iter.getNodeV(), iter.getNodeU(), iter.getCost());
            }
        }
        catch(Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}