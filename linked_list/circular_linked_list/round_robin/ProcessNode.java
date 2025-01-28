package com.tit.week03.day01.linked_list.circular_linked_list.round_robin;

//class to represent process node
public class ProcessNode {
    //Attribute
    private int processId;
    private int burstTime;
    private int priority;
    private int waitingTime;
    private int turnaroundTime;
    public ProcessNode next;

    //constructor to initialize process
    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.next = null;
    }

    //getters and setters
    public int getProcessId() {
        return processId;
    }
    public int getBurstTime() {
        return burstTime;
    }
    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }
    public int getPriority() {
        return priority;
    }
    public int getWaitingTime() {
        return waitingTime;
    }
    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }
    public int getTurnaroundTime() {
        return turnaroundTime;
    }
    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }
}
