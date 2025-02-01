package com.tit.week03.day03.sorting_algorithm.quick_sort;

import java.util.Arrays;

public class SortProductPrice {
    public static void main(String[] args) {
        //array to store product price
        int[] price = {220,134,90,199,850,200};
        System.out.println("Unsorted price - " + Arrays.toString(price));

        //sort price
        QuickSort sort = new QuickSort();
        int start = 0;
        int end = price.length-1;
        sort.quickSort(price, start, end);

        System.out.println("sorted price - " + Arrays.toString(price));
    }
}
