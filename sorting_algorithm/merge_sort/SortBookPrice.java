package com.tit.week03.day03.sorting_algorithm.merge_sort;

import java.util.Arrays;

public class SortBookPrice{
    public static void main(String[] args) {
        //array to store book price
        int[] price = {870,340,290,145,200,117,90};

        System.out.println("Unsorted price - " + Arrays.toString(price));
        //call method to sort array
        MergeSort sort = new MergeSort();
        int left = 0;
        int right = price.length-1;
        sort.mergeSort(price, left, right);

        System.out.println("Sorted price - " + Arrays.toString(price));
    }
}
