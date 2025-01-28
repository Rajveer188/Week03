package com.tit.week03.day01.linked_list.doubly_linked_list.movie_managment;

//class to represent movie node
public class MovieNode {
    //Attribute
    private String title;
    private String director;
    private int year;
    private double rating;
    public MovieNode next;
    public MovieNode prev;

    //constructor to initialize movie
    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }

    //getter and setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
}
