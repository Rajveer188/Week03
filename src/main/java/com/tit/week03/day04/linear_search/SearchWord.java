package com.tit.week03.day04.linear_search;
import static java.lang.System.out;
public class SearchWord {
    //method to find word in string array
    public static String findWord(String[] sentences,String word){
        //iterate over sentences
        for(String currentSentense : sentences){
            //iterate current sentence
            String[] words = currentSentense.split(" ");
            for(String currentWord : words){
                if(currentWord.equals(word)){
                    //if word found return current sentense
                    return currentSentense;
                }
            }
        }
        //if word not found
        return "Not found";
    }
    //main method
    public static void main(String[] args) {
        //array to store sentences
        String[] sentences = {"Even the darkest night will end and the sun will rise.",
                "Love each other dearly always.",
                "There is scarcely anything else in the world but that: to love one another.",
                "You look around and the world is so big,",
                "yet all that really matters is that you are loved and that you give love." };
        String wordToFind = "around";

        //find word
        String result = findWord(sentences,wordToFind);
        out.println("Result - " + result);
    }
}
