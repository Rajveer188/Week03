package com.tit.week03.day02.stacks_queues.queue_implementation;

public class Main {
    public static void main(String[] args) {
        //create custom queue object
        CustomQueue queue = new CustomQueue();
        //add element to queue
        queue.offer(1);
        queue.offer(3);

        System.out.println("remove - " +queue.poll());

        queue.offer(5);
        queue.offer(7);
        //remove and print element
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        queue.poll();
    }
}
