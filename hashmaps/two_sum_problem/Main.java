package com.tit.week03.day02.hashmaps.two_sum_problem;

import com.tit.week03.day02.stacks_queues.stack_sort.SortStack;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,5,2,3,1,9,4};
        int targetSum = 8;

        TwoSum twoSum = new TwoSum();

        //get indices
        int[] result = twoSum.findIndices(array, targetSum);
        if(result[0] == -1 || result[1] == -1){
            System.out.println("No indices found");
        }else {
            System.out.println("indices are - "+result[0] + " "+ result[1]);
        }
    }
}
