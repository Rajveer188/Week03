package com.tit.week03.day02.hashmaps.longest_sequence;

import java.util.HashMap;
import java.util.Map;

public class ConsecutiveSequence {
    //method to find length of longest consequtive sequence
    private int findSequence(int[] arr){
        //hashmap to store array element
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : arr){
            map.put(num, true);
        }
        int longestConsequtive = 0;
        //iterate throw loop
        for(int num : arr){
            int currentLength = 1;
            int currentNum = num;
            while (map.containsKey(currentNum+1)){
                currentLength++;
                currentNum++;
            }
            longestConsequtive = Math.max(currentLength, longestConsequtive);
        }
        //return answer
        return longestConsequtive;
    }
    //main method
    public static void main(String[] args) {
        ConsecutiveSequence sequence = new ConsecutiveSequence();

        int[] arr = {100, 45, 1, 3, 2, 56, 4, 99, 0, 5};
        //find longest length
        int longestLength = sequence.findSequence(arr);
        System.out.println("Longest consecutive sequence length - " + longestLength);
    }
}
