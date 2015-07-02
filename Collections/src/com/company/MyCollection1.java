package com.company;

/**
 * Created by eladlavi on 7/2/15.
 */
public class MyCollection1 implements Listable {

    private int[] arr;
    private int counter;

    public MyCollection1(){
        arr = new int[10];
        counter = 0;
    }


    public void add(int number){
        makeRoomIfNecessary();
        arr[counter++] = number;
    }

    private void makeRoomIfNecessary() {
        if(counter == arr.length){
            //no room for the new number.
            int[] newArray = new int[arr.length * 2];
            for (int i = 0; i < counter; i++) {
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
    }

    public boolean remove(int number){return false;}

    public void add(int number, int index){
        makeRoomIfNecessary();
        for (int i = index; i < counter; i++) {

        }
    }

    public void clear(){
        counter = 0;
    }

    public boolean contains(int number){return false;}

    @Override
    public boolean equals(Object obj) {return super.equals(obj);}

    @Override
    public String toString() {
        String s = "{";
        for (int i = 0; i < counter - 1; i++) {
            s += arr[i] + ",";
        }
        if(counter != 0)
            s += arr[counter - 1];
        s += "}";
        return s;
    }

    public int get(int index){ return 0;}

    public int indexOf(int number){return 0;}

    public int lastIndexOf(int number){return 0;}

    public void removeAll(int number){}

    public void set(int number, int index){}

    public int[] toArray(){ return null;}

    public int size(){return counter;}

}
