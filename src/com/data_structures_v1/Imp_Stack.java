package com.data_structures_v1;
import java.util.Stack;

public class Imp_Stack {
    public static void main(String[] args){
        System.out.println("STACK");
        Stack<String> stack = new Stack<>();
        stack.push("Jack");
        stack.push("Jenny");
        stack.push("Jack");
        stack.push("Joe");
        stack.push("Jeremy");
        String last1 = stack.pop(); // returns last element and remove it
        String last2 = stack.peek(); // returns last element and DON'T remove it
        System.out.println(last1);
        System.out.println(last2);
        System.out.println(stack); // the method *toString* is calling here
        System.out.println(stack.search("Jack")); // returns a position of an element in stack
        // (first appearance in stack by popping)
    }
}
