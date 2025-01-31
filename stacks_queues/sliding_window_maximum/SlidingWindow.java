package com.tit.week03.day02.stacks_queues.sliding_window_maximum;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindow{
    //method to find maximum
    private int[] findMaximum(int[] arr, int windowSize){
        int length = arr.length;
        //array to store result
        int[] result = new int[length-windowSize+1];
        int index = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0; i<length; i++){
            while (!deque.isEmpty() && deque.peek() == i-windowSize){
                deque.poll();
            }
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]){
                deque.pollLast();
            }
            deque.offer(i);
            if(i >= windowSize -1){
                result[index++] = arr[deque.peek()];
            }
        }
        return result;

    }
    //method to print array
    private void printArray(int[] arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,5,7,4,3,2,1,3};
        int windowSize = 3;

        //create object of slindingWindow
        SlidingWindow slidingWindow = new SlidingWindow();
        int [] result = slidingWindow.findMaximum(arr, windowSize);

        //print arr
        slidingWindow.printArray(result);
    }
}
