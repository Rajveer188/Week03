package com.tit.week03.day03.sorting_algorithm.selection_sort;

public class SelectionSort {
    //constructor
    public SelectionSort(){}

    //method to perform swap
    private void swap(int[] score , int i , int j){
        int temp = score[i];
        score[i] = score[j];
        score[j] = temp;
    }

    //method to perform selection sort
    public void selectionSort(int[] score){
        int length = score.length;

        for(int i=0; i<length-1; i++){
            int minIndex = i;
            for(int j = i+1; j<length; j++){
                if(score[minIndex] > score[j]){
                    minIndex = j;
                }
            }
            swap(score,minIndex, i);
        }
    }
}
