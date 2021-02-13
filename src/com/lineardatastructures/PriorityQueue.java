package com.lineardatastructures;
import java.util.Arrays;
public class PriorityQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    PriorityQueue(int size){
        queue = new int[size];
    }

    public void enqueue(int item){
        if(isFull())
            throw new IllegalStateException();
        int i = shiftItemsToInsert(item);
        queue[i] = item;
        size++;
    }

    private int shiftItemsToInsert(int item){
        int i;
        for(i = size - 1; i>=0; i--){
            if(queue[i] > item)
                queue[i+1] = queue[i];
            else
                break;
        }
        return i+1;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size==queue.length;
    }

    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();
        return queue[--size];
    }


    @Override
    public String toString(){
        return Arrays.toString(queue);
    }


}
