package com.tit.week03.day01.linked_list.doubly_linked_list.movie_managment;

public class MovieList {
    private MovieNode head;
    private MovieNode tail;

    //constructor
    public MovieList() {
    }

    //method to add at first
    public void addAtFirst(String title, String director, int year, double rating) {
        MovieNode movie = new MovieNode(title, director, year, rating);
        //check if list is empty
        if (head == null) {
            head = movie;
            tail = movie;
            return;
        }
        movie.next = head;
        head.prev = movie;
        head = movie;
    }

    //method to add at end
    public void addAtLast(String title, String director, int year, double rating) {
        MovieNode movie = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = movie;
            return;
        }
        tail.next = movie;
        movie.prev = tail;
        tail = movie;
    }

    // Add a movie at position
    public void addAtPosition(String title, String director, int year, double rating, int position) {
        if (position == 1) {
            this.addAtFirst(title, director, year, rating);
            return;
        }

        MovieNode movie = new MovieNode(title, director, year, rating);
        MovieNode temp = head;
        int index = 1;

        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            this.addAtLast(title, director, year, rating);
        } else {
            movie.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = movie;
            } else {
                tail = movie;
            }
            temp.next = movie;
            movie.prev = temp;
        }
    }

    // method to remove movie by title
    public void removeByTitle(String title) {
        MovieNode temp = head;

        if(temp == null){
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            if (temp.getTitle().equalsIgnoreCase(title)) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                }else if(temp == tail) {
                    tail = tail.prev;
                    if (tail != null){
                        tail.next = null;
                    }
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("movie " + title + " removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("movie " + title + " not found");
    }

    // method to search movie by director or rating
    public void searchByDirectorOrRating(String director, Double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if ((temp.getDirector().equalsIgnoreCase(director)) ||
                    (temp.getRating() == rating)) {
                System.out.println("movie found -" + temp.getTitle() + " Director - " + temp.getDirector() +
                        " year " + temp.getYear() + " rating: " + temp.getRating());
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for the given director or rating");
        }
    }

    //method to display movies in forward order
    public void displayForward() {
        MovieNode temp = head;
        if (temp == null) {
            System.out.println("list is empty");
            return;
        }
        System.out.println("movies in forward order - ");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // method to display movies in reverse order
    public void displayReverse() {
        MovieNode temp = tail;
        if (temp == null) {
            System.out.println("list is empty");
            return;
        }
        System.out.println("movies in reverse order -");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }
    private void displayMovie(MovieNode movie) {
        System.out.println("Title - " + movie.getTitle() +
                ", director -  " + movie.getDirector() +
                ", year - " + movie.getYear() +
                ", rating - " + movie.getRating());
    }
    //method to update rating
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.getTitle().equalsIgnoreCase(title)) {
                temp.setRating(newRating);
                System.out.println("updated rating of " + title + " to " + newRating);
                return;
            }
            temp = temp.next;
        }
        System.out.println("movie " + title + " not found");
    }
}
