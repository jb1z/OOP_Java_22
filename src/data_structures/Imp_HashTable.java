package data_structures;
import java.util.Hashtable;

public class Imp_HashTable {
    public static void main(String[] args){
        Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(100, "Jack");
        table.put(150, "John");
        table.put(236, "Joe");
        table.put(124, "Jim");
        table.put(22, "Jeremy");

        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() % 10 + ": " + key + ": " + table.get(key));
        }
    }
}
