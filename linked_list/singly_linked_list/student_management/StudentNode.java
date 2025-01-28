package com.tit.week03.day01.linked_list.singly_linked_list.student_management;

//class to represent student node
public class StudentNode{
    //Attribute
    private int rollNumber;
    private String name;
    private int age;

    private char grade;
    public StudentNode next;
    //constructor to initialize student object
    public StudentNode(String name, int rollNumber, int age, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }

    //getter and setter to get value of variables
    public void setGrade(char grade) {
        this.grade = grade;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGrade() {
        return grade;
    }
}
