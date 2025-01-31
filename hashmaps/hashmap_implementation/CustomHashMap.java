package com.tit.week03.day02.hashmaps.hashmap_implementation;

//class to create custom hashmap
public class CustomHashMap<K,V>{
        //inner class to represent node
    private class Node<K,V>{
        K key;
        V value;
        Node<K,V> next;

        Node(K key, V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    //size of hash map
    private int size;

    private Node<K,V>[] bucket;
    //constructor to initialize map
    public CustomHashMap(int size){
        this.size = size;
        this.bucket = new Node[size];
    }

    //method for insertion
    public void put(K key, V value){
        Node<K,V> node = new Node<>(key, value);

        //find index
        int index = getIndex(key);

        if(bucket[index] == null){
            bucket[index] = node;
            return;
        }
        Node<K,V> head = bucket[index];
        //iterate throw linkedlist
        while (head != null ){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            //if last node
            if(head.next == null){
                head.next = node;
                return;
            }
            head = head.next;
        }

    }
    //method to find index
    private int getIndex(K key){
        int index = Math.abs(key.hashCode() % size);
        return index;
    }

    //method to remove element
    public void remove(K key){
        //find index
        int index = getIndex(key);
        if(bucket[index] == null){
            return;
        }
        Node<K,V> head = bucket[index];

        //check first node
        if(head.key.equals(key)){
            bucket[index] = head.next;
        }
        while (head.next != null){
            if(head.next.key.equals(key)){
                head.next = head.next.next;
                return;
            }
            head = head.next;
        }
    }

    //method to retrive value
    public V get(K key){
        int index = getIndex(key);
        Node<K,V> head = bucket[index];
        if(head == null){
            return null;
        }
        while (head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    public void display() {
        for(int i=0; i<size; i++){
            Node<K,V> head = bucket[i];
            if(head == null){
                continue;
            }
            while (head != null){
                System.out.println("Key - " + head.key + " Value " + head.value);
                head = head.next;
            }
        }
    }
}
