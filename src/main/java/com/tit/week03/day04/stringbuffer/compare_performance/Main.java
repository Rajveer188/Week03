package com.tit.week03.day04.stringbuffer.compare_performance;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        //create object of compare class
        Compare compare = new Compare();

        //time taken by string builder
        long builderTime = compare.builderPerformance();
        //time taken by string buffer
        long bufferTime = compare.bufferPerformance();

        out.println("time taken by string builder - "+ builderTime +
                "\ntime taken by string buffer - "+ bufferTime);
    }
}
