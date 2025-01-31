package com.tit.week03.day02.hashmaps.pair_with_given_sum;

import java.util.HashMap;
import java.util.Map;

public class PairSum{
    //method to find pair
    public void findPair(int[] array, int targetSum){
        Map<Integer, Integer> map = new HashMap<>();
        boolean found = false;
        for (int i=0; i<array.length; i++) {
            int remainingSum = targetSum - array[i];
            if (map.containsKey(remainingSum)) {
                System.out.println(remainingSum + " " + array[i]);
                found = true;
                return;
            }
            map.put(array[i], i);
        }

        if (!found) {
            System.out.println("no pair found");
        }
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,2,3,8,0,3};
        int targetSum = 5;

        //call method to find pair
        PairSum pairSum = new PairSum();

        pairSum.findPair(array, targetSum);

    }
}
