package com.tit.week03.day01.linked_list.doubly_linked_list.undo_redo;

public class TextEditor {
    private TextNode head;
    private TextNode current;
    private int historySize;
    private int size;
    // Constructor to initialize the text editor
    public TextEditor(int historySize) {
        this.historySize = historySize;
        this.head = null;
        this.current = null;
        this.size = 0;
    }

    // Add a new state to the text editor
    public void addState(String newText) {
        TextNode newState = new TextNode(newText);

        // If this is the first state
        if (head == null) {
            head = newState;
            current = newState;
        } else {
            // Remove any forward history (redo states)
            if (current.next != null) {
                current.next.prev = null;
                current.next = null;
            }

            // Link the new state
            current.next = newState;
            newState.prev = current;
            current = newState;

            // Maintain history size
            size++;
            if (size > historySize) {
                head = head.next;
                head.prev = null;
                size--;
            }
        }

        System.out.println("State added: " + newText);
    }

    // Undo functionality
    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("No more states to undo.");
            return;
        }
        current = current.prev;
        System.out.println("Undo performed. Current state: " + current.textContent);
    }

    // Redo functionality
    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("No more states to redo.");
            return;
        }
        current = current.next;
        System.out.println("Redo performed. Current state: " + current.textContent);
    }

    // Display the current state of the text
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("No text available.");
        } else {
            System.out.println("Current state: " + current.textContent);
        }
    }
}
