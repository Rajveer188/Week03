package com.tit.week03.day06.runtime_analysis.searching;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SearchingAnalysis{
    //constructor
    public SearchingAnalysis(){}

    //method to fill array with random number
    public void fillRandomNumber(int[] array, int size){
        //create object of random class
        Random random = new Random();
        for(int i=0; i<size; i++){
            array[i] = random.nextInt(size);
        }
    }
    //method to copy data to hashset & treeset
    public void copyData(int array[], HashSet<Integer> hashSet, TreeSet<Integer> treeSet){
        for(int number : array){
            hashSet.add(number);
            treeSet.add(number);
        }
    }
    //method to search in array
    public boolean searchOnArray(int[] array, int target){
        int length = array.length;
        //iterate over array to find target element
        for(int i=0; i<length; i++){
            if(array[i] == target){
                //if target found return its index
                return true;
            }
        }
        return false;
    }
    //method to search in hashset
    public boolean searchOnHashSet(HashSet<Integer> hashSet, int target){
        return hashSet.contains(target);
    }
    //method to search in treeset
    public boolean searchOnTreeSet(TreeSet<Integer> treeSet, int target){
        return treeSet.contains(target);
    }

}
