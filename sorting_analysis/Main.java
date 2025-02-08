package com.tit.week03.day06.runtime_analysis.sorting_analysis;
import static java.lang.System.out;
import java.util.Random;

public class Main {
    //create object of different sorting class
    private static BubbleSort bubbleSort = new BubbleSort();
    private static QuickSort quickSort = new QuickSort();
    private static MergeSort mergeSort = new MergeSort();
    //create object of random class
    private static Random random = new Random();

    //main method
    public static void main(String[] args) {
        //variable to store start and end time
        long startTime, endTime, totalTime;

        //define an array
        int length = 10000;
        int[] fistArray = new int[length];
        int[] secondArray = new int[length];
        int[] thirdArray = new int[length];
        //fill data on array
        fillRandomData(fistArray, length);
        fillRandomData(secondArray, length);
        fillRandomData(thirdArray, length);

        //perform bubble sort
        startTime  = System.nanoTime();
        bubbleSort.bubleSort(fistArray);
        endTime = System.nanoTime();
        totalTime = endTime-startTime;
        out.println("time taken by bubble sort in millisecond - "+totalTime/1e6);

        //perform bubble sort
        startTime  = System.nanoTime();
        mergeSort.mergeSort(secondArray, 0, length-1);
        endTime = System.nanoTime();
        totalTime = endTime-startTime;
        out.println("time taken by merge sort in millisecond - "+totalTime/1e6);

        //perform bubble sort
        startTime  = System.nanoTime();
        quickSort.quickSort(thirdArray, 0, length-1);
        endTime = System.nanoTime();
        totalTime = endTime-startTime;
        out.println("time taken by quick sort in millisecond - "+totalTime/1e6);
    }
    //method to fill random data on array
    public static void fillRandomData(int[] array, int size){
        for(int i=0; i<size; i++){
            array[i] = random.nextInt(size);
        }
    }
}
