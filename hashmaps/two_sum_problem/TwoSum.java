package com.tit.week03.day02.hashmaps.two_sum_problem;

import java.util.HashMap;
import java.util.Map;

//class to find indices
public class TwoSum {
    //map to store indices
    private Map<Integer, Integer> map;

    //Constructor
    public TwoSum(){
        map = new HashMap<>();
    }

    //method to find  indices for given sums
    public int[] findIndices(int[] array, int targetSum){
        //iterate throw array
        int length = array.length;
        for (int i=0; i<length; i++){
            int remain = targetSum - array[i];

            if(map.containsKey(remain)){
                int[] result = {map.get(remain), i};
                return result;
            }
            map.put(array[i], i);
        }
        return new int[]{-1,-1};
    }

}
