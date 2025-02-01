package com.tit.week03.day03.sorting_algorithm.insertion_sort;

import java.util.Arrays;

public class SortEmployeeID {
    //main method
    public static void main(String[] args) {
        //array to store id's
        int[] id = {88, 1,19,34,7};

        System.out.println("Unsorted id's - " + Arrays.toString(id));

        InsertionSort sort = new InsertionSort();

        //sort id
        sort.insertionSort(id);

        System.out.println("sorted id's - " + Arrays.toString(id));

    }
}
