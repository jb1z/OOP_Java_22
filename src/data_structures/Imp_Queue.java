package data_structures;
import java.util.LinkedList;
import java.util.Queue;

public class Imp_Queue {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();
        queue.offer("John");
        queue.offer("Jack");
        queue.offer("Joe");
        queue.offer("John");
        queue.offer("Jack");
        System.out.println(queue);
        System.out.println(queue.element()); // returns the first element of a queue
        System.out.println(queue);
        String a = queue.remove(); // returns the first element of a queue and REMOVE it
        System.out.println(a);
        System.out.println(queue);
    }
}
