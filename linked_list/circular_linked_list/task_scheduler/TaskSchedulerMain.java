package com.tit.week03.day01.linked_list.circular_linked_list.task_scheduler;

public class TaskSchedulerMain {
    public static void main(String[] args) {
        TaskList scheduler = new TaskList();

        // Add tasks
        scheduler.addAtFirst(1, "A", 3, "2025-01-30");
        scheduler.addAtLast(2, "B", 1, "2025-01-28");
        scheduler.addAtPosition(3, "C", 2, "2025-01-29", 2);

        //display all tasks
        scheduler.displayAllTasks();

        //view and move to the next task
        scheduler.viewAndMoveToNext();

        //remove a task
        scheduler.removeByTaskId(2);
        //search by priority
        scheduler.searchByPriority(2);

        scheduler.displayAllTasks();

    }
}
