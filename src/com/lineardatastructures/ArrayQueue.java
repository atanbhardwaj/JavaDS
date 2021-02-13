package com.lineardatastructures;

import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int length){
        queue = new int[length];
    }
    public void enqueue(int item){
        if(isFull())
            throw new IllegalStateException();
        queue[rear] = item;
        rear = (rear+1) % queue.length;
        size++;
    }

    public int dequeue(){
        if(size==0)
            throw new IllegalStateException();
        size--;
        int value = queue[front];
        queue[front] = 0;
        front = ( front + 1 ) % queue.length;
        return value;

    }

    public int peek(){
        return queue[front];
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return front==rear && front!=0 && rear!=0;
    }

    public int size(){
        return size;
    }


    @Override
    public String toString(){
//        int[] queuearray = Arrays.copyOfRange(queue, front, rear);
        return  Arrays.toString(queue);
    }

}
