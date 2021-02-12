package com.lineardatastructures;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size;

    public void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(first==last)
            first = last = null;
        else
        {
            Node temp = first.next;
            first.next = null;
            first = temp;
        }
        size--;
    }

    public void addLast(int item){
        Node node = new Node(item);
        if( isEmpty() )
            first = last = node;
        else
            last = last.next = node;
        size++;
    }

    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first==last)
            first = last = null;
        else{
            Node previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node){
        Node current = first;
        while(current!=null){
            if(current.next == node)    return current;
            current = current.next;
        }
        return null;
    }

    private boolean isEmpty(){
        return first==null;
    }

    public int indexOf(int item){
        int index = 0;
        Node current = first;
        while( current != null ){
            if(current.value==item)
                return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        Node current = first;
        int index = 0;
        while ( current != null ){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse(){
        if(isEmpty()) return;
        Node p = first,q = null,r = null;
        while(p!=null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        last = first;
        last.next = null;
        first = q;
    }

    public int getKthFromTheEnd(int k){
        if(isEmpty()) throw new IllegalStateException();
        Node apoint = first;
        Node bpoint = first;
        while((k-1)>0){
            bpoint = bpoint.next;
            if(bpoint == null)  throw new IllegalArgumentException();
            k--;
        }
        while(bpoint!=last){
            apoint = apoint.next;
            bpoint = bpoint.next;
        }
        return apoint.value;
    }

    public int getMiddle(){
        if(isEmpty())   return -1;
        Node slow = first;
        Node fast = first;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    public boolean hasLoop(){
        if(isEmpty()) return false;
        Node slow = first;
        Node fast = first;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }

}
