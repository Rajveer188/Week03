package com.tit.week03.day01.linked_list.circular_linked_list.task_scheduler;

//class to represent task node
public class TaskNode {
    //Attribute
    private int taskId;
    private String taskName;
    private int priority;
    private String dueDate;
    public TaskNode next;

    //constructor to initialize task
    public TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }

    // getters
    public int getTaskId() {
        return taskId;
    }
    public String getTaskName() {
        return taskName;
    }
    public int getPriority() {
        return priority;
    }
    public String getDueDate() {
        return dueDate;
    }
}
