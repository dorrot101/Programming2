import java.util.PriorityQueue;

//課題3: PQを用いたダイクストラ法  PQDijkstra.java

public class PQDijkstra extends Dijkstra{

    int[] doDijkstra(int start){
        int[] pathTree = new int[super.getSize()];
        double[] distance = new double[super.getSize()];
        PriorityQueue<PQEdge> PQueue = new PriorityQueue<>();

        for(int to = 0; to<super.getSize(); to++){
           distance[to] = Double.POSITIVE_INFINITY;
           pathTree[to] = -1;
           PQueue.add(new PQEdge(to, distance[to]));
        }

        distance[start] = 0;
        pathTree[start] = start;

        PQueue.add(new PQEdge(start, distance[start]));

        while(PQueue.isEmpty() == false){
            PQEdge node = PQueue.remove();
            if(node.getWeight() == distance[node.getTo()]){
                Node curNode = super.getNode(node.getTo());
    
                for(int index = 0; index<curNode.getSize(); index++){
                    int To = curNode.getEdgeTo(index);
                    if(distance[To] > (distance[curNode.getId()] + curNode.getEdgeWeight(index))){
                        distance[To] = curNode.getEdgeWeight(index);
                        pathTree[To] = curNode.getId();
                        PQueue.add(new PQEdge(To, distance[To]));
                    }
                }
            }
        }
        return pathTree;
    }
}

class PQEdge extends Edge implements Comparable<PQEdge>{
    PQEdge(int To, double weight){super(To, weight);}

    @Override
    public int compareTo(PQEdge target){
        return this.getWeight() >= target.getWeight() ? 1 : -1;
    }
}