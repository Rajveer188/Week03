package com.tit.week03.day03.sorting_algorithm.counting_sort;

import java.util.Arrays;

public class SortStudentAge {
    public static void main(String[] args) {
        //array to store student age
        int[] age = {10,17,12,15,13,18,18,15,14,11};

        System.out.println("Unsorted age - " + Arrays.toString(age));

        CountingSort sort = new CountingSort();

        //sort age array
        sort.countingSort(age);
        System.out.println("Sorted age - " + Arrays.toString(age));
    }
}
