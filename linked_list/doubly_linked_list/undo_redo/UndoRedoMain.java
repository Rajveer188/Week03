package com.tit.week03.day01.linked_list.doubly_linked_list.undo_redo;

public class UndoRedoMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10); // Limit history to 10 states

        // Add states
        editor.addState("Hey");
        editor.addState("Hey, it's me");
        editor.addState("Rajveer Kajle");

        // Display the current state
        editor.displayCurrentState();

        // Undo operations
        editor.undo();
        editor.undo();

        // Redo operations
        editor.redo();

        // Display the current state
        editor.displayCurrentState();
    }
}

