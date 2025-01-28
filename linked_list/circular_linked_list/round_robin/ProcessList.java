package com.tit.week03.day01.linked_list.circular_linked_list.round_robin;

public class ProcessList {
    private ProcessNode head;
    private ProcessNode tail;

    //method to add at end
    public void addProcess(int processId, int burstTime, int priority) {
        ProcessNode newProcess = new ProcessNode(processId, burstTime, priority);

        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    // method to remove process by Process ID
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("no processes in the queue");
            return;
        }

        ProcessNode current = head;
        ProcessNode prev = null;

        do {
            if (current.getProcessId() == processId) {
                if (current == head && current == tail) {
                    head = tail = null;
                } else if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }

                System.out.println("process " + processId + " removed");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("process " + processId + " not found");
    }

    //method to simulate round-robin scheduling
    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }

        ProcessNode current = head;
        int currentTime = 0;

        System.out.println("\nstarting Round Robin Scheduling -");

        while (head != null) {
            System.out.println("\nexecuting process ID - " + current.getProcessId());
            System.out.println("burst time before execution -" + current.getBurstTime());

            if (current.getBurstTime() > timeQuantum) {
                current.setBurstTime(current.getBurstTime() - timeQuantum);
                currentTime += timeQuantum;
                System.out.println("remaining burst time - " + current.getBurstTime());
            } else {
                currentTime += current.getBurstTime();
                current.setTurnaroundTime(currentTime);
                current.setWaitingTime(current.getTurnaroundTime() - current.getBurstTime());
                removeProcess(current.getProcessId());
            }

            //move to the next process
            current = current.next;
        }
    }

    //method to display all processes
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue");
            return;
        }

        ProcessNode current = head;
        System.out.println("processes in the circular queue - ");
        do {
            System.out.println("process ID - " + current.getProcessId() +
                    "\nburst time: " + current.getBurstTime() +
                    "\npriority: " + current.getPriority());
            current = current.next;
        } while (current != head);
    }

    //method to calculate and display average waiting time and turnaround time
    public void calculateAndDisplayAverages() {
        if (head == null) {
            System.out.println("No processes to calculate averages.");
            return;
        }

        ProcessNode current = head;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int processCount = 0;

        do {
            totalWaitingTime += current.getWaitingTime();
            totalTurnaroundTime += current.getTurnaroundTime();
            processCount++;
            current = current.next;
        } while (current != head);

        System.out.println("\naverage waiting time - " + (double) totalWaitingTime / processCount);
        System.out.println("average turnaround time: " + (double) totalTurnaroundTime / processCount);
    }
}
