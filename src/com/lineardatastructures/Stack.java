package com.lineardatastructures;

import java.util.Arrays;

public class Stack {
    private final int[] stack;
    private int size;
    private int position;

    public Stack(){
        stack = new int[10];
    }

    public void push(int item){
        if(size==stack.length)
            throw new StackOverflowError();
        size++;
        stack[position++] = item;
    }

    public int pop(){
        if(size==0)
            throw new IllegalStateException();
        size--;
        return stack[--position];
    }

    public int peek(){
        if( position == 0 )
            throw new IllegalStateException();
        return stack[position-1];
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public String toString(){
        int[] contents = Arrays.copyOfRange(stack, 0, position);
        return Arrays.toString(contents);
    }
}
