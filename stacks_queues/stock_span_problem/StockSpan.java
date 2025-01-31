package com.tit.week03.day02.stacks_queues.stock_span_problem;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    //method to calculate span
    private void calculateSpan(int[] stocks){
        Stack<Integer> stack = new Stack<>();

        //loop to iterate throw array
        int length = stocks.length;
        for(int i=0; i<length; i++){
            while (!stack.isEmpty() && stocks[stack.peek()] <= stocks[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                System.out.print(i + 1 +" ");
            }else {
                System.out.print(i - stack.peek()+" ");
            }
            stack.push(i);
        }
    }

    //main method
    public static void main(String[] args) {
        int arr[] = {9, 6, 5, 96, 100, 35};

        StockSpan stockSpan = new StockSpan();
        stockSpan.calculateSpan(arr);
    }
}
