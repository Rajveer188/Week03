package com.tit.week03.day03.sorting_algorithm.selection_sort;

import java.util.Arrays;

public class SortExamScore {
    public static void main(String[] args) {
        //array to store marks
        int[] score = {87,34,29,45,23,67};

        System.out.println("Unsorted score - " + Arrays.toString(score));
        //call method to sort array
        SelectionSort sort = new SelectionSort();
        sort.selectionSort(score);

        System.out.println("Sorted score - " + Arrays.toString(score));
    }
}
