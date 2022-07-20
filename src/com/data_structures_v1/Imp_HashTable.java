package com.data_structures_v1;
import java.util.Hashtable;

public class Imp_HashTable {
    public static void main(String[] args){
        final int CAPACITY = 10;
        Hashtable<Integer, String> table = new Hashtable<>(CAPACITY);
        table.put(100, "Jack");
        table.put(150, "John");
        table.put(236, "Joe");
        table.put(124, "Jim");
        table.put(22, "Jeremy");

        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() % CAPACITY + ": " + key + ": " + table.get(key));
        }
    }
}
