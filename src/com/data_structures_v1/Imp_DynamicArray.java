package com.data_structures_v1;

public class Imp_DynamicArray {
    private int size;
    private int capacity;
    Object[] array;

    // initializer
    {
        capacity = 10;
    }

    // constructors
    Imp_DynamicArray(){
        this.array = new Object[this.capacity];
    }
    Imp_DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[this.capacity];
    }

    public int getCapacity(){
        return capacity;
    }

    public void add(Object data){
        if(size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(Object data, int index){
        if(size >= capacity){
            grow();
        }
        for(int i = size; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data){
        for(int i = 0; i < this.size; i++){
            if(array[i] == data){
                for(int j = i; j < size - 1; j++){
                    array[j] = array[j + 1];
                }
                this.size--;
                if(size <= capacity/3){
                    shrink();
                }
            }
        }
    }

    public int search(Object data){
        for(int i = 0; i < this.size; i++){
            if(array[i] == data) return i;
        }
        return -1;
    }

    private void grow(){
        int newCapacity = this.capacity * 2;
        Object[] newArray = new Object[newCapacity];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        this.capacity = newCapacity;
        this.array = newArray;
    }

    private void shrink(){
        int newCapacity = this.capacity / 2;
        Object[] newArray = new Object[newCapacity];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        this.capacity = newCapacity;
        this.array = newArray;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public String toString() {
        StringBuilder stringArray = new StringBuilder();
        for(int i = 0; i < this.size; i++){
            stringArray.append(array[i]);
            stringArray.append(", ");
        }
        String res = stringArray.toString();
        if(!res.equals("")){
            res = "[" + res.substring(0, res.length() - 2) + "]";
        }
        else{
            res = "[]";
        }
        return res;
    }
}
