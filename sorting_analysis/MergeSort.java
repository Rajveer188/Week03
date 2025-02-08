package com.tit.week03.day06.runtime_analysis.sorting_analysis;

public class MergeSort {
    //constructor
    public MergeSort(){}

    //method to perform merge sort
    public void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = left +(right-left)/2;

            //recursive call for dividing array
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            //call to merge arr
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        //create two array to store left and right array
        int lLength = mid-left+1;
        int rLength = right-mid;

        int[] leftArray = new int[lLength];
        int[] rightArray = new int[rLength];

        //copy element form array to left and right array
        System.arraycopy(arr, left, leftArray, 0, lLength);
        System.arraycopy(arr, mid+1, rightArray, 0, rLength);

        int i = 0, j=0, index = left;

        //merge array
        while (i < lLength && j <rLength){
            if(leftArray[i] < rightArray[j]){
                arr[index] = leftArray[i];
                index++;
                i++;
            }else {
                arr[index] = rightArray[j];
                index++;
                j++;
            }
        }
        while (i < lLength){
            arr[index] = leftArray[i];
            index++;
            i++;
        }
        while (j <rLength){
            arr[index] = rightArray[j];
            index++;
            j++;
        }
    }
}
