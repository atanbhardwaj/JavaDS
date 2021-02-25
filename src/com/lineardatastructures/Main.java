package com.lineardatastructures;
import com.nonlineardatastructures.*;

import java.awt.List;
import java.util.*;
import java.util.Stack;

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

//        Stack stack = new Stack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.size());
//        System.out.println(stack);

//    Queue<Integer> queue = new ArrayDeque<>();
//    queue.add(1);
//    queue.add(2);
//    queue.add(3);
//    queue.add(4);
//    queue.add(5);
//    System.out.println(queue);
//    reverse(queue);
//    System.out.println(queue);
//    }
//    public static void reverse(Queue<Integer> queue){
//        Stack<Integer> stack = new Stack();
//        while(!queue.isEmpty())
//            stack.push(queue.remove());
//        while(!stack.isEmpty())
//            queue.add(stack.pop());
//    }

//        ArrayQueue queue = new ArrayQueue(5);
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.isFull());
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        System.out.println(queue.peek());
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.isFull());
//        System.out.println(queue.peek());
//        System.out.println(queue.size());
//        queue.enqueue(5);
//        queue.enqueue(7);
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.enqueue(8);
//        queue.enqueue(9);
//        queue.enqueue(10);
//        queue.dequeue();
//        System.out.println(queue.peek());
//        String array = queue.toString();
//        System.out.println(array);
//        System.out.println(queue.size());


//        QueueWithTwoStacks queuestacks = new QueueWithTwoStacks();
//        queuestacks.enqueue(1);
//        queuestacks.enqueue(2);
//        queuestacks.enqueue(3);
//        System.out.println(queuestacks.dequeue());
//        System.out.println(queuestacks.dequeue());
//        System.out.println(queuestacks.peek());


//        PriorityQueue queue = new PriorityQueue(5);
//        queue.enqueue(4);
//        queue.enqueue(5);
//        queue.enqueue(3);
//        System.out.println(queue.toString());

//        RepeatingChar object = new RepeatingChar();
//        String string = "green apple";
//        char result = object.firstNonRepeatingCharacter(string);
//        System.out.println(result);
//    }

//        char result = object.firstRepeatingCharacter(string);
//        System.out.println(result);


//        HashTable data = new HashTable();
//        data.put(1,"Anjali");
//        data.put(2,"John");
//        data.put(3,"Kate");
//        System.out.println(data.get(3));
//        System.out.println(data.get(1));
//        System.out.println(data.get(2));
//        data.put(2,"Natalie");
//        data.remove(3);
//        System.out.println(data.get(2));

//        Trees tree = new Trees();
//        tree.insert(7);
//        tree.insert(5);
//        tree.insert(9);
//        tree.insert(11);
//        tree.insert(1);
//        tree.insert(4);
//        tree.insert(6);
//        tree.insert(79);
//        Trees tree2 = new Trees();
//        tree2.insert(7);
//        tree2.insert(5);
//        tree2.insert(9);
//        tree2.insert(11);
//        tree2.insert(1);
//        tree2.insert(4);
//        tree2.insert(6);
//        tree2.insert(79);
//        boolean answer = tree.isEquals(tree2);
//        System.out.println(answer);
//        tree.preOrderTraversal();
//        System.out.println();
//        tree.postOrderTraversal();
//        System.out.println();
//        tree.inOrderTraversal();
//        System.out.println("\n" + tree.height());
//        int minimum = tree.min();
//        System.out.println("\n" + minimum);
//        System.out.println(tree.isBinarySearchTree());
//        ArrayList<Integer> list =tree.getNodesAtDistance(3);
//        System.out.println(list);
//        tree.levelOrderTraversal();


        //AVL TREE

//        AVLTree avltree = new AVLTree();
//        avltree.insert(10);
//        avltree.insert(30);
//        avltree.insert(20);
//        avltree.insert(50);
//        avltree.insert(60);
//        avltree.insert(5);
//        avltree.insert(1);
//        avltree.insert(3);
//        avltree.insert(23);
//        avltree.inOrderTraversal();


//
//        Heap heap = new Heap();
//
//
//        int []numbers = {7,10,1,3,6};
//
//        for(int n: numbers)
//            heap.insert(n);
//
//        for(int i = numbers.length-1; i >= 0; i--)
//            numbers[i] = heap.remove();
//
//        System.out.println(Arrays.toString(numbers));


//        PriorityQueueWithHeaps pq = new PriorityQueueWithHeaps();
//        pq.enqueue(10);
//        pq.enqueue(7);
//        pq.enqueue(15);
//        System.out.println(pq.dequeue());
//        System.out.println(pq.dequeue());

//        int []numbers = {15,4 ,7, 154,3,78,1,422,2};
//        int []numbers = {5,10,4,1,3,2};
//        MaxHeap.heapify(numbers);
//        System.out.println(Arrays.toString(numbers));



//        Trie trie = new Trie();
//        trie.insert("cow");
//        trie.insert("cows");
//        trie.insert("canada");
////        System.out.println("Done");
//        System.out.println(trie.contains("canada"));
//        System.out.println(trie.contains("can"));
//        System.out.println(trie.contains("cows"));


//        trie.traversePost();
//        trie.traversePre();


//        Trie trie = new Trie();
//        trie.insert("car");
//        trie.insert("care");
//        trie.remove("car");
//        System.out.println(trie.contains("car"));
//        System.out.println(trie.contains("care"));


//        Trie trie = new Trie();
//        trie.insert("cannon");
//        trie.insert("car");
//        trie.insert("candle");
//        trie.insert("cat");
//        trie.insert("carrying");
//        trie.insert("carol");
//        trie.insert("and");
//        trie.insert("card");
//        trie.insert("careful");
//        trie.insert("eggs");
//        trie.insert("chicken");
        
//        System.out.println(trie.findWords(""));

//        trie.traversePre();


//        Graph graph = new Graph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addEdge("A", "B");
//        graph.addEdge("A", "C");
//        graph.addEdge("A", "D");
//        graph.addEdge("C", "D");
////        graph.removeEdge("A","C");
////        graph.removeNode("B");
////        graph.removeNode("A");
//        graph.addEdge("B","C");
//        graph.print();
////        graph.dfsRecurvsive("A");
//
//        graph.dfsIterative("R");

//        graph.bfs("C");

//        Graph graph = new Graph();
//        graph.addNode("X");
//        graph.addNode("A");
//        graph.addNode("P");
//        graph.addNode("B");
//
//        graph.addEdge("X","A");
//        graph.addEdge("X","B");
//        graph.addEdge("A","P");
//        graph.addEdge("B","P");
//
//        System.out.println(graph.topologicalSort("X"));

//        Graph graph = new Graph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addEdge("A","B");
//        graph.addEdge("A","C");
//        graph.addEdge("A","D");
//        graph.print();
//        System.out.println(graph.hasCycle());


        WeightedGraph wgraph = new WeightedGraph();
        wgraph.addNode("A");
        wgraph.addNode("B");
        wgraph.addNode("C");
        wgraph.addNode("D");
        wgraph.addNode("E");
        wgraph.addNode("F");
        wgraph.addEdge("A","B",3);
        wgraph.addEdge("A","C",4);
        wgraph.addEdge("A","D",2);
        wgraph.addEdge("B", "D",6);
        wgraph.addEdge("C", "D",1);
        wgraph.addEdge("B", "E",3);
        wgraph.addEdge("D", "E",5);
        wgraph.addEdge("D", "F",1);
        wgraph.addEdge("F", "E",2);
        wgraph.print();
        int distance = wgraph.getShortestDistance("A", "E");
        System.out.println("Shortest Distance: " + distance);
        System.out.println("Shortest Path: " + wgraph.getShortestPath("A","E"));
        System.out.println("Has Cycle: "+ wgraph.hasCycle());

        WeightedGraph wgraph1 = new WeightedGraph();
        wgraph1.addNode("A");
        wgraph1.addNode("B");
        wgraph1.addNode("C");
        wgraph1.addNode("D");
        wgraph1.addEdge("A","B",2);
        wgraph1.addEdge("B","C",2);
        wgraph1.addEdge("C","D",2);
        System.out.println("Has Cycle: "+wgraph1.hasCycle());
    }
}