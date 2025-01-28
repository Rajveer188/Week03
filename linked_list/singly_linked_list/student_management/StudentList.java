package com.tit.week03.day01.linked_list.singly_linked_list.student_management;

import javax.swing.*;

//class to represent student list
public class StudentList {
    //list to store students;
    private StudentNode head;
    private int totalStudent = 0;

    //constructor
    public StudentList(){}

    //method to add at beginning of list
    public void addAtFirst(String name, int rollNumber, int age, char grade){
        //creat new node for store student details
        StudentNode student = new StudentNode(name, rollNumber, age, grade);
        //check if list is empty
        if(head == null){
            head = student;
            totalStudent++;
            return;
        }
        student.next = head;
        head = student;
        //increase student count
        totalStudent++;
    }
    //method to add at last of list
    public void addAtLast(String name, int rollNumber, int age, char grade){
        //creat new node for store student details
        StudentNode student = new StudentNode(name, rollNumber, age, grade);
        //check if list is empty
        if(head == null){
            head = student;
            totalStudent++;
            return;
        }
        StudentNode tempNode = head;
        while (tempNode.next != null){
            tempNode = tempNode.next;
        }
        tempNode.next = student;

        //increase student count
        totalStudent++;
    }
    //method to add at specefic position
    public void atAtPosition(String name, int rollNumber, int age, char grade,int position){
        //if position is 1st or list is empty call add at first method
        if(position == 1 || head == null){
            this.addAtFirst(name, rollNumber, age, grade);
            return;
        }
        //if last position call add at last method
        if(position == (totalStudent+1) || position > totalStudent){
            this.addAtLast(name, rollNumber, age, grade);
            return;
        }
        //create new node for store student details
        StudentNode student = new StudentNode(name, rollNumber, age, grade);
        int tempCount = 1;
        StudentNode tempList = head;

        while (tempCount != position-1 && tempList.next != null){
             tempList = tempList.next;
             tempCount++;
        }
        student.next = tempList.next;
        tempList.next = student;
        totalStudent++;
    }
    //method to delete student
    public void deleteStudent(int rollNumber){
        if(head == null){
            return;
        }
        StudentNode tempList = head;

        if(tempList.getRollNumber() == rollNumber){
            head = tempList.next;
            System.out.println("\nstudent " + rollNumber + "deleted successfully");
            totalStudent--;
            return;
        }
        //loop to find student with rollnumber
        while(tempList.next != null){
            if(tempList.next.getRollNumber() == rollNumber){
                tempList.next = tempList.next.next;
                System.out.println("\nstudent " + rollNumber + " deleted successfully");
                totalStudent--;
                //return after deleting student
                return;
            }
            tempList = tempList.next;
        }
        System.out.println("\nstudent " + rollNumber +" not present in list");
    }
    //method to search student by roll number
    public void searchByRollNumber(int rollNumber){
        if(head == null){
            return;
        }
        StudentNode tempList = head;
        while (tempList != null){
            if(tempList.getRollNumber() == rollNumber){
                System.out.println("\nStudent found - ");
                displayStudent(tempList);
                return;
            }
            tempList = tempList.next;
        }
        System.out.println("\nroll number "+ rollNumber +" not exist");
    }
    //method to upgrade grade
    public void upgradeGrade(int rollNumber, char grade){
        if(head == null){
            return;
        }
        StudentNode tempList = head;
        while (tempList != null){
            if(tempList.getRollNumber() == rollNumber){
                tempList.setGrade(grade);
                System.out.println("\nGrade updated successfully");
                return;
            }
            tempList = tempList.next;
        }
        System.out.println("\nroll number "+ rollNumber +" not exist");
    }

    //method to display list
    public void displayList(){
        StudentNode tempList = head;
        while (tempList != null){
            displayStudent(tempList);
            tempList = tempList.next;
        }
    }
    //method to print perticular student
    private void displayStudent(StudentNode student){
        if(student == null){
            return;
        }
        System.out.println("\nName - " + student.getName() +
                "\nroll number - " + student.getRollNumber() +
                "\nage - "+ student.getAge() +
                "\ngrade - " + student.getGrade());
    }
}