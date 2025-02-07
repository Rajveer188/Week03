package com.tit.week03.day04.stringbuilder.reverse_string;

public class Main{
    //main method
    public static void main(String[] args) {
        //create a object of string builder
        StringBuilder stringBuilder = new StringBuilder();
        //append string to string builder
        stringBuilder.append("Rajveer");
        stringBuilder.append(" Kajle");

        ReverseString reverseObject = new ReverseString();
        //reverse string
        String reversedString = reverseObject.reverseString(stringBuilder);
        System.out.println(reversedString);
    }
}
