package com.tit.week03.day03.sorting_algorithm.insertion_sort;

public class InsertionSort {
    //constructor
    public InsertionSort(){}

    //method to perform insertion sort
    public void insertionSort(int[] id){
        //get length of array
        int length = id.length;

        for(int i=1; i<length; i++){
            int currentId = id[i];
            int j = i-1;
            while (j>=0 && currentId < id[j]){
                id[j+1] = id[j];
                j--;
            }
            //store element at right position
            id[j+1] = currentId;
        }
    }
}
