package com.tit.week03.day04.linear_search;

import com.tit.week03.day02.hashmaps.pair_with_given_sum.PairSum;

public class FirstNegativeNumber {
    //method to find first negative number
    public static int findNegative(int[] array){
        //iterate over loop to find negative number
        int length = array.length;
        for (int index=0; index<length; index++) {
            int currentNumber = array[index];
            if (currentNumber < 0) {
                return index;
            }
        }
        return -1;
    }
    //main method
    public static void main(String[] args) {
        //define an array
        int[] array = {5,3,2,8,-1,5,2,-5};
        //find negative number index
        int index = findNegative(array);
        if(index == -1){
            System.out.println("No negative number in array");
            return;
        }
        System.out.println("first negative number at index " + index);
    }
}
