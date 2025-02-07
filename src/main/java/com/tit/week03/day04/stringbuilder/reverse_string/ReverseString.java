package com.tit.week03.day04.stringbuilder.reverse_string;

public class ReverseString {
    //constructor
    public ReverseString(){}

    //method to reverse a string
    public String reverseString(StringBuilder stringBuffer){
        //reverse string
        stringBuffer.reverse();
        //return reverse string
        return stringBuffer.toString();
    }
}
