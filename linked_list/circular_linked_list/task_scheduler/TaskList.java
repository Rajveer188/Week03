package com.tit.week03.day01.linked_list.circular_linked_list.task_scheduler;

//class to represent task list
public class TaskList {
    private TaskNode head;
    private TaskNode current;

    //constructor
    public TaskList(){}

    // method to add task at the beginning
    public void addAtFirst(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newTask.next = head;
        head = newTask;
        temp.next = head;
    }

    // method to add task at  end
    public void addAtLast(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newTask;
        newTask.next = head;
    }

    // method to add task at position
    public void addAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        if (position == 1) {
            this.addAtFirst(taskId, taskName, priority, dueDate);
            return;
        }
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        TaskNode temp = head;
        int index = 1;

        while (index < position - 1 && temp.next != head) {
            temp = temp.next;
            index++;
        }
        newTask.next = temp.next;
        temp.next = newTask;
    }

    // method to remove task by id
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        TaskNode temp = head;
        TaskNode prev = null;

        if (temp.getTaskId() == taskId) {
            if (head.next == head) {
                head = null;
                current = null;
                return;
            }
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
            current = head;
            return;
        }

        // search for task to remove
        do {
            prev = temp;
            temp = temp.next;
            if (temp.getTaskId() == taskId) {
                prev.next = temp.next;
                System.out.println("\nTask removed");
                return;
            }
        } while (temp != head);
        System.out.println("task " + taskId + " not found");
    }
    //method to view current task and move to the next task
    public void viewAndMoveToNext() {
        if (current == null) {
            System.out.println("no task in the scheduler");
            return;
        }
        System.out.println("current task");
        displayTask(current);
        //move to the next task
        current = current.next;
    }
    // method to display all task
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        TaskNode temp = head;
        System.out.println("\nAll tasks -");
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // method to search tasks by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.getPriority() == priority) {
                System.out.println("\nTask found -");
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("no tasks found with priority " + priority);
        }
    }

    private void displayTask(TaskNode task) {
        System.out.println("Task Id- " + task.getTaskId() +
                "\ntask name - " + task.getTaskName() +
                "\npriority - " + task.getPriority() +
                "\ndue date - " + task.getDueDate());
    }
}

