package com.tit.week03.day01.linked_list.singly_linked_list.friend_connection;

public class SocialMediaMain {public static void main(String[] args) {
    SocialMedia sm = new SocialMedia();

    // Add predefined users
    sm.addUser(1, "Rajveer", 25);
    sm.addUser(2, "Darshan", 27);
    sm.addUser(3, "Aadi", 22);
    sm.addUser(4, "Ankit", 24);

    // Display all users
    System.out.println("All Users - ");
    sm.displayAllUsers();

    // Add friend connections
    sm.addFriendConnection(1, 2);
    sm.addFriendConnection(1, 3);
    sm.addFriendConnection(2, 4);

    // Display friends of a user
    System.out.println("\nFriends of Rajveer:");
    sm.displayFriends(1);

    // Count friends for each user
    System.out.println("\nCounting friends for each user:");
    sm.countFriends();

    // Remove a friend connection
    System.out.println("\nRemoving friend connection between Rajveer and Darshan");
    sm.removeFriendConnection(1, 2);
    sm.displayFriends(1);
}
}
