package com.tit.week03.day01.linked_list.singly_linked_list.student_management;

public class StudentManagmentMain extends Object{
    public static void main(String[] args) {
        //create student list
        StudentList list = new StudentList();
        //add values
        list.addAtFirst("Rajveer", 88,19 ,'A');
        list.addAtLast("Darshan", 34,22 ,'A');
        list.atAtPosition("Aadi", 7,20 ,'B',2);
        list.atAtPosition("Aadarsh", 1,21 ,'C',4);
        list.atAtPosition("Ankit", 29,20 ,'A',3);

        //display list
        list.displayList();

        //delet student
        list.deleteStudent(29);

        list.displayList();

        list.deleteStudent(99);

        //search student
        list.searchByRollNumber(88);
        list.searchByRollNumber(99);

        //upgrade grade
        list.upgradeGrade(1,'B');

        list.displayList();
    }
}
