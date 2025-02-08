package com.tit.week03.day06.runtime_analysis.string_performance;
import static java.lang.System.out;

public class Main{
    public static void main(String[] args){
        //create an object of StringConcatenation class
        StringConcatenation stringConcatenation = new StringConcatenation();

        //find performance of string , string buffer and string builder
        long stringPerformance = stringConcatenation.getStringPerformance();
        long stringBufferPerformance = stringConcatenation.getStringBufferPerformance();
        long stringBuilderPerformance = stringConcatenation.getStringBuilderPerformance();

        //print result
        out.println("for concatenating a million strings in second - " +
                "\nString takes - " + stringPerformance/1e9 +
                "\nstring buffer takes - " + stringBufferPerformance/1e9 +
                "\nString builder takes - " + stringBuilderPerformance/1e9);
    }
}
