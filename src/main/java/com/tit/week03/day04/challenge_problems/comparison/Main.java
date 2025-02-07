package com.tit.week03.day04.challenge_problems.comparison;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        //compare string buffer and string builder
        CompareBufferAndBuilder compare = new CompareBufferAndBuilder();

        //time taken by string builder
        long builderTime = compare.builderPerformance();
        //time taken by string buffer
        long bufferTime = compare.bufferPerformance();

        out.println("time taken by string builder - "+ builderTime +
                "\ntime taken by string buffer - "+ bufferTime);

        //file reader comparison
        CompareReader compareReader = new CompareReader();
        out.println("FileReader - ");
        compareReader.performanceOfFileReader();
        out.println("InputStreamReader - ");
        compareReader.performanceOfInputStreamReader();
    }
}