package com.tit.week03.day02.hashmaps.hashmap_implementation;

public class Main {
    public static void main(String[] args) {
        //create custom hash map
        int size = 10;
        CustomHashMap<Integer, String> map = new CustomHashMap<>(size);

        //add element to map
        map.put(88, "Rajveer");
        map.put(34, "Darshan");
        map.put(1, "Aadarsh");
        map.put(7, "Aadi");

        //use get function
        int key = 88;
        String name = map.get(key);
        if(name != null){
            System.out.println("\nvalue found " + name + " for "+ key);
        }else {
            System.out.println("\no value found for " + key);
        }
        map.display();
        System.out.println();
        // remove
        map.remove(1);
        System.out.println("after remove- ");
        map.display();
    }
}
