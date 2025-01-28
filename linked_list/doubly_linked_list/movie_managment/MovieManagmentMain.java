package com.tit.week03.day01.linked_list.doubly_linked_list.movie_managment;

public class MovieManagmentMain {
    public static void main(String[] args) {
        MovieList movieList = new MovieList();

        // Adding movies
        movieList.addAtFirst("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addAtLast("Seven", "David Fincher", 1995, 9.2);
        movieList.addAtPosition("The Holiday", "Nancy Meyers", 2006, 8.6, 2);

        // display movies in forward and reverse order
        movieList.displayForward();
        movieList.displayReverse();

        //search for movies
        movieList.searchByDirectorOrRating("Christopher Nolan", 8.8);
        movieList.searchByDirectorOrRating("Nancy Meyers", 9.2);

        //update a movie rating
        movieList.updateRating("Inception", 9.0);

        // remove a movie by title
        movieList.removeByTitle("Seven");

        movieList.displayForward();
    }
}
