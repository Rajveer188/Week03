package com.tit.week03.day01.linked_list.circular_linked_list.round_robin;

public class RoundRobinMain {
    public static void main(String[] args) {
        //create list to store process
        ProcessList scheduler = new ProcessList();

        //add processes to list
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 15, 2);
        scheduler.addProcess(3, 20, 3);
        scheduler.addProcess(4, 25, 4);

        //display the processes
        scheduler.displayProcesses();

        //simulate round-robin scheduling
        scheduler.simulate(10);

        //average waiting and turnaround times
        scheduler.calculateAndDisplayAverages();
    }
}
