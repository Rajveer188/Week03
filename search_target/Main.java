package com.tit.week03.day06.runtime_analysis.search_target;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class Main{
    private static Random random = new Random();
    private static Search search = new Search();

    public static void main(String[] args) {
        //variable to store start and ending time
        long startTime;
        long endTime;
        long totalTime;

        int[] testCaseLength = {1000, 10000,1000000};
        for(int length : testCaseLength){
            int[] array = new int[length];
            //generate a random array
            generateArray(array, length);
            int target = random.nextInt(length);

            out.println("test case length - " + length);

            //performance of linear search
            startTime = System.nanoTime();
            search.linearSearch(array, length,target);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            out.println("time taken by linear search in millisecond - " + totalTime/1e6);

            //performance of binary search
            Arrays.sort(array);
            startTime = System.nanoTime();
            search.binarySearch(array, length,target);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            out.println("time taken by binary search in millisecond - " + totalTime/1e6);
        }
    }

    private static void generateArray(int[] array, int length) {
        for(int i=0; i<length; i++){
            array[i] = random.nextInt(length);
        }
    }
}
