package com.tit.week03.day06.runtime_analysis.sorting_analysis;

public class QuickSort {
    //method to perform swap
    private void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //method to find pivot index
    private int findPivot(int[] arr, int start, int end){
        int index = start-1;
        //take last element as pivot
        int pivot = arr[end];
        for(int i=start; i<end; i++){
            if(arr[i] < pivot){
                index++;
                swap(arr, index, i);
            }
        }
        index++;
        swap(arr,index,end);
        return index;
    }
    //method to perform quick sort
    public void quickSort(int[] price, int start, int end){
        if(start < end){
            //find pivot index
            int pivotIndex = findPivot(price,start,end);

            quickSort(price, start , pivotIndex-1);
            quickSort(price, pivotIndex+1, end);
        }
    }
}
