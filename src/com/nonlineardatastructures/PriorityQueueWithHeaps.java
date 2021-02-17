package com.nonlineardatastructures;

public class PriorityQueueWithHeaps {
    Heap heap = new Heap();

    public void enqueue(int value){
        heap.insert(value);
    }

    public int dequeue(){
        return heap.remove();
    }

    public boolean isEmpty(){
        return heap.isEmpty();
    }

    public boolean isFull(){
        return heap.isFull();
    }

}
