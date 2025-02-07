package com.tit.week03.day04.challenge_problems.comparison;

public class CompareBufferAndBuilder {
    //constructor
    public CompareBufferAndBuilder(){}

    //method to get performance of string builder
    public long builderPerformance(){
        //create a string and string builder object
        String string = "Rajveer";
        long startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        //iterate loop 1 milliion time
        for(int i =0; i<1000000; i++){
            stringBuilder.append(string);
        }
        long endTime = System.nanoTime();

        //total time taken by string builder
        long totalTime = endTime - startTime;
        //return performance
        return totalTime;
    }
    //method to get performance of string buffer
    public long bufferPerformance(){
        //create a string and string buffer object
        String string = "Rajveer";
        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        //iterate loop 1 milliion time
        for(int i =0; i<1000000; i++){
            stringBuffer.append(string);
        }
        long endTime = System.nanoTime();

        //total time taken by string buffer
        long totalTime = endTime - startTime;
        //return performance
        return totalTime;
    }
}
