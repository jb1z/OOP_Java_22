package com.video;

public class Main {
    public static void main(String[] args) {
        InnerClasses iClass = new InnerClasses();
        iClass.start();
        InnerClasses.StaticInnerClass innerClass = new InnerClasses.StaticInnerClass(iClass);
        // we can create an instance of STATIC inner classes
    }
}
