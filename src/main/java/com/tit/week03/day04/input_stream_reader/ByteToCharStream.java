package com.tit.week03.day04.input_stream_reader;

import java.io.*;
import java.lang.reflect.Field;

public class ByteToCharStream{
    public static void main(String[] args) {
        //define file path
        String filePath = "D:\\Com\\Capgemini_Training\\Data Structure\\src\\main\\resources\\TextFile.txt";
        try {
            //create object of file input stream
            FileInputStream fileInputStream = new FileInputStream(filePath);

            //create input stream reader
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            //create a bufferedReader
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            //read line by line from buffered reader
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
