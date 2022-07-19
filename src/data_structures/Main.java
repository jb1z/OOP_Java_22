package data_structures;

public class Main {
    public static void main(String[] args){
        Imp_DynamicArray dynamicArray = new Imp_DynamicArray(10);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.insert("D", 1);
        System.out.println(dynamicArray);
        dynamicArray.delete("B");
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.search("D"));
        System.out.println(dynamicArray.isEmpty());
        int capacity = dynamicArray.getCapacity();
        System.out.println(capacity);
    }
}
