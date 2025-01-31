package com.tit.week03.day02.stacks_queues.queue_implementation;

import java.util.Stack;

//class to build custom queue using stacks
public class CustomQueue {
    //two stack to implement queue
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    //constructor
    public CustomQueue(){
        this.enqueueStack = new Stack<>();
        this.dequeueStack = new Stack<>();
    }
    //method to perform enqueue
    public void offer(int number){
        enqueueStack.push(number);
    }
    //method to perform dequeue
    public int poll(){
        if(enqueueStack.isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        emptyStack(dequeueStack);
        Stack<Integer> tempStack = new Stack<>();
        tempStack.addAll(enqueueStack);

        while (!tempStack.isEmpty()){
            dequeueStack.push(tempStack.pop());
        }
        int top = dequeueStack.pop();
        emptyStack(enqueueStack);
        while (!dequeueStack.isEmpty()){
            enqueueStack.push(dequeueStack.pop());
        }
        return top;
    }
    public void emptyStack(Stack stack){
        while (!stack.isEmpty()){
            stack.pop();
        }
    }
    public boolean isEmpty() {
        return enqueueStack.isEmpty();
    }
}
