package com.tit.week03.day01.linked_list.doubly_linked_list.library_managment;

//class to represent book node
public class BookNode {
    //Attribute
    private String title;
    private String author;
    private String genre;
    private int bookId;
    private boolean isAvailable;
    public BookNode next;
    public BookNode prev;

    //constructor to initialize book
    public BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
    //getter & setter
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public int getBookId() {
        return bookId;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
