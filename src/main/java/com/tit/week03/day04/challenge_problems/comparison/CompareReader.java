package com.tit.week03.day04.challenge_problems.comparison;

import java.io.*;

import static java.lang.System.out;

public class CompareReader {
    //define file path
    private static String filePath = "D:\\Com\\Capgemini_Training\\Data Structure\\src\\main\\resources\\Book.txt";
    //constructor
    public CompareReader(){}

    //method to calculate performance of FileReader
    public void performanceOfFileReader(){
        int wordCount = 0;
        long startTime=0, endTime=0;
        try {
            startTime = System.nanoTime();
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] split = line.split(" ");
                wordCount = wordCount + split.length;
            }
            endTime = System.nanoTime();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println("Word count - "+wordCount);
        long totalTime = endTime-startTime;
        out.println("total time taken - " +totalTime);

    }
    //method to calculate performance of InputStreamReader
    public void performanceOfInputStreamReader(){
        int wordCount = 0;
        long startTime=0, endTime=0;
        try {
            startTime = System.nanoTime();
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] split = line.split(" ");
                wordCount = wordCount + split.length;
            }
            endTime = System.nanoTime();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println("Word count - "+wordCount);
        long totalTime = endTime-startTime;
        out.println("total time taken - " +totalTime);

    }
}
