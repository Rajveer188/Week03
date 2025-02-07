package com.tit.week03.day04.binary_search;
import static java.lang.System.out;

public class SearchInMatrix {
    // Method to search value inmatrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        //get row and column
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows*cols - 1;

        while (left <= right) {
            //find mid
            int mid = (left + right) / 2;

            int row = mid / cols;
            int col = mid % cols;
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //define a matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 9;

        //find target value
        boolean found = searchMatrix(matrix, target);
        if(found){
            out.println( target + " found");
            return;
        }
        out.println( target + " not found");
    }
}

