package com.tit.week03.day04.filereader.count_occurrence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordOccurrenceCounter {
    //main method
    //main function
    public static void main(String[] args) {
        //file path
        String filePath = "D:\\Com\\Capgemini_Training\\Data Structure\\src\\main\\resources\\TextFile.txt";
        try {
            //create an object of file reader
            FileReader fileReader = new FileReader(filePath);

            //create a object of buffered reader
            BufferedReader bufferedReader = new BufferedReader(fileReader);;

            //read line and print
            String line;
            //variable to store word and track count
            int count = 0;
            String word = "believe";
            while ((line = bufferedReader.readLine()) != null){
                //create a string array
                String[] stringArray = line.split(" ");

                for(int i=0; i<stringArray.length; i++){
                    if(stringArray[i].equals(word)) {
                        count++;
                    }
                }
            }
            System.out.println("Word \""+word+"\" occurs "+ count + " times");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO exception");
            e.printStackTrace();
        }
    }
}
