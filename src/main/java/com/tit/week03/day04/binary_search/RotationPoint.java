package com.tit.week03.day04.binary_search;
import static java.lang.System.out;

public class RotationPoint {
    //method to find rotation point
    public static int findRotationPoint(int[] rotatedArray, int left, int right){
        //find mid point
        int mid = (left + right) / 2;

        while (left != right){
            if(rotatedArray[mid] > rotatedArray[right]){
                left = mid +1;
            }
            if(rotatedArray[mid]<rotatedArray[right]){
                right = mid;
            }
            //update mid
            mid = (left + right) / 2;
        }
        return rotatedArray[left];
    }

    public static void main(String[] args) {
        //define a rotated array
        int[] rotatedArray = {6,7,1,2,3,4,5};

        //get rotation point
        int left = 0;
        int right = rotatedArray.length-1;
        int rotationPoint = findRotationPoint(rotatedArray,left,right);

        out.println("Rotation point - " + rotationPoint);
    }
}
