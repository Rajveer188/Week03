package com.tit.week03.day06.runtime_analysis.searching;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        long totalTime;
        Random random = new Random();

        //create object of search analysis
        SearchingAnalysis searchingAnalysis = new SearchingAnalysis();
        //define test cases length
        int[] testCaseLength = {1000, 100000, 1000000};

        for(int length : testCaseLength){
            //create array, hashset and treeset
            int array[] = new int[length];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            //define target value
            int target = random.nextInt(length);

            //fill data in array
            searchingAnalysis.fillRandomNumber(array, length);
            //copy data to hashset and treeset
            searchingAnalysis.copyData(array,hashSet,treeSet);


            out.println("\nPerformance for size - " + length);
            startTime = System.nanoTime();
            searchingAnalysis.searchOnArray(array, target);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            out.println("time taken by array in millisecond - " + totalTime/1e6);

            startTime = System.nanoTime();
            searchingAnalysis.searchOnHashSet(hashSet, target);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            out.println("time taken by hashset in millisecond - " + totalTime/1e6);

            startTime = System.nanoTime();
            searchingAnalysis.searchOnTreeSet(treeSet, target);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            out.println("time taken by treeset in millisecond - " + totalTime/1e6);
        }
    }
}
