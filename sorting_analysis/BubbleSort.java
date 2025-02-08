package com.tit.week03.day06.runtime_analysis.sorting_analysis;

//class to implement bubble sort
public class BubbleSort {
    //method to perform swap
    private void swap(int[] marks , int i , int j){
        int temp = marks[i];
        marks[i] = marks[j];
        marks[j] = temp;
    }
    //method to perform bubble  sort
    public void bubleSort(int[] marks){
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
}
