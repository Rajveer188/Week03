package com.tit.week03.day04.stringbuffer.concatenate_string;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        //create object of concatenate class
        Concatenate concatenate = new Concatenate();

        //create an array
        String[] stringArray = {"Hey ", "it's " , "me ", "Rajveer."};
        //concatenate
        String concatenatedString = concatenate.concatenateString(stringArray);

        out.println(concatenatedString);
    }
}
