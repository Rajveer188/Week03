package com.tit.week03.day04.stringbuilder.remove_duplicate;

public class Main{
    //main method
    public static void main(String[] args) {
        //create an object of string builder
        StringBuilder stringBuilder = new StringBuilder();
        //append string to string builder
        stringBuilder.append("RajRajveerveer");

        RemoveDuplicate removeObject = new RemoveDuplicate();
        //remove duplicate
        String uniqueString = removeObject.removeDuplicate(stringBuilder);
        //print orignal string
        System.out.println("orignal string - "+stringBuilder);
        //print  string after removing duplicate character
        System.out.println("After removing duplicate "+uniqueString);
    }
}
