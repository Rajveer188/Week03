package com.tit.week03.day02.hashmaps.zero_sum_subarray;


import java.util.HashMap;
import java.util.Map;

public class ZeroSum {
    //method to find subarray
    private void findSubarray(int[] arr){
        int sum = 0;
        int currentSum = 0;

        HashMap<Integer , Integer> map = new HashMap<>();

        int length = arr.length;

        for(int i = 0 ; i<length ; i++){
            currentSum += arr[i];
            if(map.containsKey(currentSum-sum)){
                int start = map.get(currentSum - sum) + 1;
                System.out.println("subarray from index " + start + " to" + i);
            }
            map.put(currentSum , i);
        }
    }
    public static void main(String[] args) {
         int[] arr = {4,2,1,-3,5,1,-4,5};

         ZeroSum zeroSum = new ZeroSum();
         zeroSum.findSubarray(arr);
    }
}
