package com.lineardatastructures;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
//        Array array = new Array(3);
//        array.insert(1);
//        array.insert(2);
//        array.insert(3);
//        array.insert(4);
//        array.insert(5);
//        array.print();
//        array.removeAt(3);
//        array.print();
//        System.out.println(array.indexOf(5));
//        LinkedList list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addFirst(5);
//        list.addLast(50);
//        list.addLast(60);
//        System.out.println("Size " + (list.size()));
//        int x = list.indexOf(10);
//        System.out.println(x);
//        System.out.println(list.contains(10));
//        System.out.println(list.contains(500));
//        list.removeFirst();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        System.out.println("Size " + (list.size()));
//        list.reverse();
//        int[] array = list.toArray();
//        System.out.println(Arrays.toString(array));
//        System.out.println(list.getKthFromTheEnd(-1));
//        System.out.println(list.getMiddle());
//        System.out.println(list.hasLoop());
//        StringReverser string = new StringReverser();
//        System.out.println(string.reverseString("Reverse this string."));
//        Expression expression = new Expression();
//        System.out.println(expression.paranthesisMatch("<(1+2)({}[[]])>"));

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack);




    }

}