package com.tit.week03.day04.challenge_problems;

import java.util.Arrays;

import static java.lang.System.out;

public class FindMissingNumber {
    //constructor
    public FindMissingNumber(){}
    //method to find first missing number
    public int firstMissingNumber(int[] array){
        //get length of array
        int length = array.length;
        //sort array
        Arrays.sort(array);

        //create new array to track the numbers
        int[] visitedArray = new int[length+1];

        //iterate throw array and mark each element as negative number
        for(int i=0; i<length-1; i++){
            int currentNumber = array[i];
            visitedArray[currentNumber-1] = -(array[i]);
        }
        //check for unvisited number
        for(int i=0; i<=length; i++){
            if(visitedArray[i] == 0){
                return i+1;
            }
        }
        return visitedArray.length+1;
    }

    //meth od to search target
    public int findTarget(int[] array, int target){
        int left = 0;
        int right = array.length-1;
        while (left <= right){
            int mid= (left+right)/2;
            if(array[mid] == target){
                return mid;
            }if(array[mid] > target){
                right = mid-1;
            } else if (array[mid] < target) {
                left = mid+1;
            }
        }
        return -1;
    }
    //main method
    public static void main(String[] args) {
        //create object
        FindMissingNumber findMissingNumber = new FindMissingNumber();
        //define an array
        int[] array = {1,2,3,4,5,6,7,9};
        //find first missing positive number
        int firstMissing = findMissingNumber.firstMissingNumber(array);
        //define number to find
        int target = 4;
        //find number
        int index = findMissingNumber.findTarget(array, target);
        out.println("first positive missing number - " + firstMissing);
        if(index != -1){
            out.println(target + " found at index "+ index);
            return;
        }
        out.println(target + " not found");
    }
}
