package com.company;

/**
 * Created by eladlavi on 7/2/15.
 */
public class MyCollection1 {

    private int[] arr;
    private int counter;

    public MyCollection1(){
        arr = new int[10];
        counter = 0;
    }


    public void add(int number){}

    public boolean remove(int number){return false;}

    public void add(int number, int index){}

    public void clear(){}

    public boolean contains(int number){return false;}

    @Override
    public boolean equals(Object obj) {return super.equals(obj);}

    @Override
    public String toString() {return super.toString();}

    public int get(int index){ return 0;}

    public int indexOf(int number){return 0;}

    public int lastIndexOf(int number){return 0;}

    public void removeAll(int number){}

    public void set(int number, int index){}

    public int[] toArray(){ return null;}

    public int size(){return counter;}

}
