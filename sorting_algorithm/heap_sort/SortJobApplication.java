package com.tit.week03.day03.sorting_algorithm.heap_sort;

import com.tit.week03.day03.sorting_algorithm.quick_sort.QuickSort;

import java.util.Arrays;

public class SortJobApplication {
    public static void main(String[] args) {
        //array to store product price
        int[] salary = {22000,30000,90000,10000,85000,20000};
        System.out.println("Unsorted salary - " + Arrays.toString(salary));

        //sort salry
        HeapSort sort = new HeapSort();
        sort.heapSort(salary);

        System.out.println("sorted salary - " + Arrays.toString(salary));
    }
}
