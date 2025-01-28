package com.tit.week03.day01.linked_list.doubly_linked_list.undo_redo;

public class TextNode {
    String textContent;
    TextNode prev;
    TextNode next;
    // Constructor to initialize a text state
    public TextNode(String textContent) {
        this.textContent = textContent;
        this.prev = null;
        this.next = null;
    }
}
