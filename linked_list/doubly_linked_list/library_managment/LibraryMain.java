package com.tit.week03.day01.linked_list.doubly_linked_list.library_managment;

public class LibraryMain {
    public static void main(String[] args) {
        BookList library = new BookList();

        // Adding books
        library.addAtFirst("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1, true);
        library.addAtLast("1984", "George Orwell", "Dystopian", 2, true);
        library.addAtPosition("Pride and Prejudice", "Jane Austen", "Romance", 3, false, 2);

        //display books
        library.displayForward();
        library.displayReverse();

        //search for a book
        library.searchBook("George Orwell");

        //update availability
        library.updateAvailability(3, true);

        //remove a book
        library.removeByBookId(2);

        //display updated library
        library.displayForward();

        //count books
        System.out.println("Total books in library- " + library.countBooks());
    }
}
