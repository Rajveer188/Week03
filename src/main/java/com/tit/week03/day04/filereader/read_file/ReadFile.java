package com.tit.week03.day04.filereader.read_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    //main function
    public static void main(String[] args) {
        //file path
        String filePath = "D:\\Com\\Capgemini_Training\\Data Structure\\src\\main\\resources\\TextFile.txt";
        try {
            //create a object of file reader
            FileReader fileReader = new FileReader(filePath);

            //create a object of buffered reader
            BufferedReader bufferedReader = new BufferedReader(fileReader);;

            //read line and print
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            //close file
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO exception");
            e.printStackTrace();
        }
    }
}
