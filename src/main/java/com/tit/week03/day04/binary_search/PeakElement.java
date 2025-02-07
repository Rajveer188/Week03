package com.tit.week03.day04.binary_search;
import static java.lang.System.out;
public class PeakElement {
    //method to find peak element
    public static int findPeakElement(int[] array){
        //get left and right index
        int left = 0;
        int right = array.length-1;

        while (left < right){
            //find mid
            int mid = (left+right)/2;

            if((array[mid]>array[mid-1]) && array[mid]>array[mid+1]){
                return array[mid];
            }
            if(array[mid] < array[mid-1]){
                right = mid -1;
            }
            if(array[mid] < array[mid+1]){
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //define array
        int[] array = {1, 3, 7, 12, 8, 4, 2};
        //find peak
        int peakElement = findPeakElement(array);
        if(peakElement == -1){
            out.println("No peak element");
            return;
        }
        out.println("peak element - "+peakElement);
    }
}
