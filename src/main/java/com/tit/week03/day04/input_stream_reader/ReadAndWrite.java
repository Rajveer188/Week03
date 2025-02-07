package com.tit.week03.day04.input_stream_reader;

import java.io.*;

import static java.lang.System.out;

public class ReadAndWrite {
    //main method
    public static void main(String[] args) {
        try {
            //create object of input stream reader to read from console
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            //create a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            //file writer to write to file
            String filePath = "D:\\Com\\Capgemini_Training\\Data Structure\\src\\main\\resources\\OutputFile.txt";
            FileWriter fileWriter = new FileWriter(filePath, true);
            //buffered write to write
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            out.println("Enter text , enter 'exit' to stop");
            while(!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            //close all resources
            inputStreamReader.close();
            bufferedReader.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
