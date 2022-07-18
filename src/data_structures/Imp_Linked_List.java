package data_structures;
import java.util.LinkedList;

public class Imp_Linked_List {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        // we treat it like a stack
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("E");
        //System.out.println(list.pop());
        System.out.println(list);
        // but we also can treat it like a queue
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.offer("E");
        //System.out.println(list.poll());
        System.out.println(list);
        list.remove("D");
        System.out.println(list);
        // //
        list.addFirst("H");
        list.addLast("H");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
