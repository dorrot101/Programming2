//課題2: ダイクストラ法による最短経路検索  Dijkstra.java
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Dijkstra extends Graph{

    int[] doDijkstra(int start){
        int[] pathTree = new int[super.getSize()];
        double[] distance = new double[super.getSize()];
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i = 0; i<pathTree.length; i++){
            pathTree[i] = -1;
         }

        for(int i = 0; i<distance.length; i++){
           distance[i] = Double.POSITIVE_INFINITY;
        }

        distance[start] = 0;
        pathTree[start] = start;

        while(queue.size() != super.getSize()){

            double min = Double.POSITIVE_INFINITY;
            int minIndex = 0;

            for(int i = 0; i<distance.length; i++){
                if(queue.contains(i) == false && min >= distance[i]){
                    min = distance[i];
                    minIndex = i;
                }
            }

            Node curNode = super.getNode(minIndex);
            queue.offer(minIndex);

            for(int index = 0; index<curNode.getSize(); index++){
                int To = curNode.getEdgeTo(index);
                if(distance[To] > (distance[curNode.getId()] + curNode.getEdgeWeight(index))){
                    pathTree[To] = curNode.getId();
                    distance[To] = distance[curNode.getId()] + curNode.getEdgeWeight(index);
                }
            }
        }

        return pathTree;
    }

    int[] getShortestPath(int start, int end){
        int[] Path = doDijkstra(start);
        int[] ShortestPath;

        Stack<Integer> stack = new Stack<Integer>();

        int SuperNode = end;
        stack.push(SuperNode);
        
        while(SuperNode != start){
            SuperNode = Path[SuperNode];
            stack.push(SuperNode);
        }

        ShortestPath = new int[stack.size()];
        for(int i = 0; i<ShortestPath.length; i++){
            ShortestPath[i] = stack.pop();
        }

        return ShortestPath;
    }
}