package com.lineardatastructures;

public class Array {
    private int[] array;
    private int position;

    public Array(int length) {
        array = new int[length];
        position = 0;
    }

    public void insert(int item){
        if(position == array.length){
            int[] newarray = new int[position*2];
            for(int i=0;i<position;i++)
                newarray[i] = array[i];
            array = newarray;
        }
        array[position++] = item;
    }

    public int indexOf(int item){
        for(int i=0;i<position;i++)
            if(array[i] == item)
                return i;
        return -1;
    }

    public void removeAt(int index){
        if(index < 0 || index >= position)
                throw new IllegalArgumentException();
        for(int i=index; i<position;i++)
            array[i] = array[i+1];
        position--;
    }

    public void print(){
        for(int i=0;i<position;i++)
            System.out.println(array[i]);
    }



}
