package com.tit.week03.day03.sorting_algorithm.bubble_sort;

import java.util.Arrays;

//class to implement bubble sort
public class SortMarks {
    //method to perform swap
    private void swap(int[] marks , int i , int j){
        int temp = marks[i];
        marks[i] = marks[j];
        marks[j] = temp;
    }
    //method to perform bubble  sort
    private void bubleSort(int[] marks){
        int length = marks.length;

        for(int i=0; i<length-1; i++){
            boolean swaped = false;
            for (int j=0; j<length-i-1; j++){
                if(marks[j] > marks[j+1]){
                    swap(marks, j, j+1);
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }

    }

    public static void main(String[] args) {
        //array to store marks
        int[] marks = {87,34,29,45,23,67};

        System.out.println("Unsorted marks - " + Arrays.toString(marks));
        //call method to sort array
        SortMarks sortMarks = new SortMarks();
        sortMarks.bubleSort(marks);

        System.out.println("Sorted marks - " + Arrays.toString(marks));
    }
}
