package com.tit.week03.day04.binary_search;

import static java.lang.System.out;

public class FindOccurrence{
    //constructor
    public FindOccurrence(){}

    //method to find first and last occurrence of number
    public int[] findFirstLastOccurrence(int[] array, int target){
        int left = 0;
        int right = array.length-1;

        int firstOccurrence = -1, lastOccurrence = -1;
        while (left <= right){
            int mid = (left + right)/2;
            if(array[mid] == target){
                firstOccurrence = mid;
                lastOccurrence = mid;

                //find first occurrence
                int tempRight = mid-1;
                int tempLeft = left;

                while (tempLeft<=tempRight){
                    int tempMid = (tempLeft+tempRight)/2;
                    if(array[tempMid] == target){
                        firstOccurrence = tempMid;
                        tempRight = tempMid-1;
                    }else {
                        tempLeft = tempMid+1;
                    }
                }
                //find last occurrence
                tempLeft = firstOccurrence;
                tempRight = array.length-1;
                while (tempLeft<=tempRight){
                    int tempMid = (tempLeft+tempRight)/2;
                    if(array[tempMid] == target){
                        lastOccurrence = tempMid;
                        tempLeft = tempMid +1;
                    }else {
                        tempRight = tempMid-1;
                    }
                }
                break;
            } else if (array[mid]<target){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return new int[]{firstOccurrence, lastOccurrence};
    }

    //main method
    public static void main(String[] args) {
        //create object
        FindOccurrence findOccurrence = new FindOccurrence();
        //define array
        int[] array = {1,2,3,4,5,5,5,5,6,7,8,9};

        //find first and last occurrences
        int target = 5;
        int[] occurrence = findOccurrence.findFirstLastOccurrence(array, target);

        if(occurrence[0] != -1){
            out.println(target +" first occurence - " + occurrence[0] +
                    "\nlast occurrence - " + occurrence[1]);
            return;
        }
        out.println(target + " not found in array");
    }
}
