package com.tit.week03.day06.runtime_analysis.file_reading_efficiently;
import java.io.*;
import static java.lang.System.out;

public class Reader {
    //Attribute
    private String filePath = "D:\\Com\\Capgemini_Training\\Data Structure\\src\\main\\resources\\TheLandOfUmbrellas.txt";
    //constructor
    public Reader(){}

    //method to read file using file reader
    public void readUsingFileReader(){
        try (FileReader  fileReader = new FileReader(filePath)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String currentLine;
            //get every line from file, while it's not empty
            while((currentLine = bufferedReader.readLine()) != null){
                //out.print(currentLine);
            }
        } catch (FileNotFoundException e) { //handle expected exceptions
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //method to read file using input stream reader
    public void readUsingInputStreamReader(){
        try {
            //create object of file input stream
            FileInputStream fileInputStream = new FileInputStream(filePath);
            //create object of input stream reader
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            //create object of buffered reader
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            //read all line
            String currentLine;
            while((currentLine = bufferedReader.readLine()) != null){
                //out.print(currentLine);
            }
        } catch (FileNotFoundException e) {
            out.println("File not found");
        } catch (IOException e) {
            out.println("Exception during reading file");
        }
    }
}
