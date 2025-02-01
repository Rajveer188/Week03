package com.tit.week03.day03.sorting_algorithm.counting_sort;

import java.util.Arrays;

public class CountingSort {
    //constructor
    public CountingSort(){}

    //method to perform counting sort
    public void countingSort(int[] age){
        int length = age.length;

        //find largest element
        int largest = age[0];
        for (int currentAge : age){
            if(largest < currentAge){
                largest = currentAge;
            }
        }
        //create array to store frequency
        int[] count = new int[largest+1];
        //count frequency
        for (int i=0; i<length; i++){
            count[age[i]]++;
        }

        //store element to orignal array
        int index =0;
        for(int i=0; i<=largest; i++){
            while(count[i] > 0){
                age[index++] = i;
                count[i]--;
            }
        }
    }
}
