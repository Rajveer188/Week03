package com.tit.week03.day06.runtime_analysis.file_reading_efficiently;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args){
        //create object of reader class
        Reader reader = new Reader();
        long startTime;
        long endTime;
        long totalTime;

        //get performance of file reader
        startTime = System.nanoTime();
        reader.readUsingFileReader();
        endTime = System.nanoTime();

        totalTime = endTime-startTime;
        out.println("time taken by file reader in millisecond - " + totalTime/1e6);

        //get performance of file reader
        startTime = System.nanoTime();
        reader.readUsingInputStreamReader();
        endTime = System.nanoTime();

        totalTime = endTime-startTime;
        out.println("time taken by input stream reader in millisecond - " + totalTime/1e6);

    }
}
