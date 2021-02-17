package com.nonlineardatastructures;

public class MaxHeap {

    public static void heapify(int []array){
        for(int i=0;i<array.length;i++)
            heapify(array, i);
    }

    private static void heapify(int []array, int index){
        int largerIndex = index;

        int leftIndex = index * 2 + 1;
        if(leftIndex < array.length && (array[leftIndex] > array[largerIndex]))
            largerIndex = leftIndex;

        int rightIndex = index * 2 + 2;
        if(rightIndex < array.length && (array[rightIndex] > array[largerIndex]))
            largerIndex = rightIndex;

        if(index == largerIndex)
            return;


        swap(array, index, largerIndex);
        heapify(array, largerIndex);
    }

    private static void swap(int []array, int index, int largerIndex){
        int temp = array[index];
        array[index] = array[largerIndex];
        array[largerIndex] = temp;
    }

}
