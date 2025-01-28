package com.tit.week03.day01.linked_list.singly_linked_list.friend_connection;

public class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendList; // Linked list to store Friend IDs
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendList = null;
        this.next = null;
    }
}
