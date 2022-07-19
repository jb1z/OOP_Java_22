package data_structures;
import java.util.PriorityQueue;
import java.util.Queue;

public class Imp_PriorityQueue {
    public static void main(String[] args){
        Queue<Double> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(4d);
        priorityQueue.offer(3d);
        priorityQueue.offer(2d);
        priorityQueue.offer(5d);
        priorityQueue.offer(-1d);
        priorityQueue.offer(1d);
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
        // the element in priority queue are ordering in ascending order

        //Queue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        // also we can create a priority queue in reversed order (descending) like this
    }
}
