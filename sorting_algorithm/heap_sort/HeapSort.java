package com.tit.week03.day03.sorting_algorithm.heap_sort;

public class HeapSort {
    //constructor
    public HeapSort(){}

    private void heapify(int arr[], int length, int i) {
        int largest = i;
        // left index
        int l = 2* i +1;
        // right index
        int r = 2 *i+2;

        if (l <length && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r <length && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, length, largest);
        }
    }
    //method to perform heap sort
    public void heapSort(int arr[]) {
        int length = arr.length;
        //build heap
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(arr, length, i);
        }
        //extract element from heap
        for (int i = length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //call max heapify
            heapify(arr, i, 0);
        }
    }
}
