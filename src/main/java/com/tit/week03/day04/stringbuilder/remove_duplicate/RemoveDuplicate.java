package com.tit.week03.day04.stringbuilder.remove_duplicate;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate{
    //constructor
    public RemoveDuplicate(){}
    //method to remove duplicate
    public String removeDuplicate(StringBuilder stringBuilder){
        //create a hashset and stringbuilder
        Set<Character> hashSet = new HashSet<>();
        StringBuilder uniqueString = new StringBuilder();

        //get length
        int length = stringBuilder.length();

        //loop to iterate over string builder
        for(int i=0; i<length; i++){
            char currentChar = stringBuilder.charAt(i);
            if(!(hashSet.contains(currentChar))){
                uniqueString.append(currentChar);
                hashSet.add(currentChar);
            }
        }
        //return unique string
        return uniqueString.toString();
    }
}
