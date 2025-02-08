package com.tit.week03.day06.runtime_analysis.string_performance;

public class StringConcatenation{
    //Attribute
    private long startTime;
    private long endTime;
    private String stringToConcate = "Rajveer";
    private int numberOfIteration = 1000000;
    //constructor
    public StringConcatenation(){}

    //method to measure string performance
    public long getStringPerformance(){
        //create a String
        String string = "";
        //get start time
        startTime = System.nanoTime();
        //perform concatenation a million time
        for (int i=0; i<numberOfIteration; i++){
            string = string + stringToConcate;
        }
        //get end time
        endTime = System.nanoTime();

        //calculate and return exact time
        long totalTime = endTime - startTime;
        return totalTime;
    }
    //method to measure string buffer performance
    public long getStringBufferPerformance(){
        //create a String buffer
        StringBuffer stringBuffer = new StringBuffer();
        //get start time
        startTime = System.nanoTime();
        //perform concatenation a million time
        for(int i=0; i<numberOfIteration; i++){
            stringBuffer.append(stringToConcate);
        }
        //get end time
        endTime = System.nanoTime();

        //calculate and return exact time
        long totalTime = endTime - startTime;
        return totalTime;
    }
    //method to measure string builder performance
    public long getStringBuilderPerformance(){
        //create a String builder
        StringBuilder stringBuilder = new StringBuilder();
        //get start time
        startTime = System.nanoTime();
        //perform concatenation a million time
        for (int i=0; i<numberOfIteration; i++){
            stringBuilder.append(stringToConcate);
        }
        //get end time
        endTime = System.nanoTime();
        //calculate and return exact time
        long totalTime = endTime - startTime;
        return totalTime;
    }
}
