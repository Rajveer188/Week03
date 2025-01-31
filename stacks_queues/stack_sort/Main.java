package com.tit.week03.day02.stacks_queues.stack_sort;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        SortStack sortStack = new SortStack();
        //create stack and add element
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(5);
        stack.add(2);
        stack.add(9);
        stack.add(3);
        stack.add(4);

        //sort stack
        sortStack.sort(stack);
        //display stack
        System.out.println(stack);
    }
}
