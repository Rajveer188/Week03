package com.tit.week03.day06.runtime_analysis.search_target;

public class Search {
    //constructor
    public Search(){}

    //method to search target using linear search
    public int linearSearch(int[] array,int length, int target){

        //iterate over array to find target element
        for(int i=0; i<length; i++){
            if(array[i] == target){
                //if target found return its index
                return i;
            }
        }
        return -1;
    }
    //method to search target using binary search
    public int binarySearch(int[] array,int length, int target){
        //variable to store starting and ending index
        int start = 0;
        int end = length-1;
        int mid;

        //iterate over array
        while (start <= end){
            //find mid index
            mid = (start+end)/2;

            //check mid element
            if(array[mid] == target) {
                return mid;
            }else if(array[mid] > target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
