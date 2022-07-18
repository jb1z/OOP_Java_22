package com.company;

public class Book_SumImp implements Book_I_Sums {
    public int y = 0;
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
    @Override
    public int getSumm() {
        return SUMM;
    }
    public int Iter(){
        return 1;
    }
}
