package com.video;

public class LocalOuter {
    public void start(){
        // if we use class only once we can declare it there
        // local inner classes can access local variables (only final!!!)
        class InnerClass{
            /*
            ...
            */
        }
        // also, there are anonymous classes - when we need only 1 object of class (they have no constructors)
    }
}
