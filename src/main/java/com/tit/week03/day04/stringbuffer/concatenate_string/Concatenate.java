package com.tit.week03.day04.stringbuffer.concatenate_string;

public class Concatenate {
    //constructor
    public Concatenate(){}

    //method to concatenate string
    public String concatenateString(String[] stringArray){
        //create a object of string buffer
        StringBuffer stringBuffer = new StringBuffer();

        //iterate over string array
        for(String currentString : stringArray){
            stringBuffer.append(currentString);
        }
        //return
        return stringBuffer.toString();
    }

}
