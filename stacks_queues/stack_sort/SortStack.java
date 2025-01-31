package com.tit.week03.day02.stacks_queues.stack_sort;

import java.util.Stack;

public class SortStack {
    public SortStack(){}

    //method to sort stack
    public static void sort(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int top = stack.pop();
            sort(stack);
            insertInOrder(stack, top);
        }
    }
    //method to insert at right order
    private static void insertInOrder(Stack<Integer> stack, int top) {
        if(stack.isEmpty() || top >= stack.peek()){
            stack.push(top);
        }else{
            int temp = stack.pop();
            //recursive call
            insertInOrder(stack, top);
            stack.push(temp);
        }
    }
}
