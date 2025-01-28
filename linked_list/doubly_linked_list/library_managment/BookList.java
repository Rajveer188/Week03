package com.tit.week03.day01.linked_list.doubly_linked_list.library_managment;

public class BookList {
    private BookNode head;
    private BookNode tail;

    //method to add at first
    public void addAtFirst(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newBook = new BookNode(bookTitle, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
            return;
        }
        newBook.next = head;
        head.prev = newBook;
        head = newBook;
    }

    //method to add at last
    public void addAtLast(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newBook = new BookNode(bookTitle, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
            return;
        }
        tail.next = newBook;
        newBook.prev = tail;
        tail = newBook;
    }

    // method to add book at position
    public void addAtPosition(String bookTitle, String author, String genre, int bookId, boolean isAvailable, int position) {
        if (position == 1) {
            this.addAtFirst(bookTitle, author, genre, bookId, isAvailable);
            return;
        }
        BookNode newBook = new BookNode(bookTitle, author, genre, bookId, isAvailable);
        BookNode temp = head;
        int index = 1;

        while (index < position - 1 && temp != null) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            System.out.println("adding at the end");
            this.addAtLast(bookTitle, author, genre, bookId, isAvailable);
            return;
        }

        newBook.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newBook;
        } else {
            tail = newBook;
        }
        temp.next = newBook;
        newBook.prev = temp;
    }

    // method to remove book by Book ID
    public void removeByBookId(int bookId) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;

        while (temp != null && temp.getBookId() != bookId) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book " + bookId + " not found");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book " + bookId + " removed successfully");
    }

    // Search for a book by Title or Author
    public void searchBook(String searchKey) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.getTitle().equalsIgnoreCase(searchKey) || temp.getAuthor().equalsIgnoreCase(searchKey)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found ");
        }
    }

    //method to update book availability Status
    public void updateAvailability(int bookId, boolean status) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;

        while (temp != null) {
            if (temp.getBookId() == bookId) {
                temp.setAvailable(status);
                System.out.println("Book Id" + bookId + " availability updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book id" + bookId + " not found");
    }

    //method to display books in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;
        System.out.println("\nBooks in forward order -");
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    //method to display all books in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = tail;
        System.out.println("\nBooks in reverse order -");
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // method to count total number of books
    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Helper method to display a book
    private void displayBook(BookNode book) {
        System.out.println("Book id - " + book.getBookId() +
                "\ntitle - " + book.getTitle() +
                "\nauthor- " + book.getAuthor() +
                "\ngenre - " + book.getGenre() +
                "\navailable - " + (book.isAvailable() ? "Yes" : "No"));
    }
}
