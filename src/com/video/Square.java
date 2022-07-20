package com.video;

public class Square {
    private int a;
    public int getA(){
        return a;
    }
    public void setA(int a) throws PerimeterException {
        if(a <= 0){
            throw new PerimeterException("Incorrect side 'a'!");
        }
        this.a = a;
    }
}
