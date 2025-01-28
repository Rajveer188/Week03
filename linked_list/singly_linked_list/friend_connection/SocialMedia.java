package com.tit.week03.day01.linked_list.singly_linked_list.friend_connection;

public class SocialMedia {
    private UserNode head;

    // Add a user to the system
    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        if (head == null) {
            head = newUser;
            return;
        }
        UserNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newUser;
    }

    // Find a user by User ID
    private UserNode findUserById(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        addFriendToList(user1, userId2);
        addFriendToList(user2, userId1);

        System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
    }

    // Add a friend to a user's friend list
    private void addFriendToList(UserNode user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        if (user.friendList == null) {
            user.friendList = newFriend;
            return;
        }
        FriendNode temp = user.friendList;
        while (temp.next != null) {
            if (temp.friendId == friendId) {
                return; // Friend already exists
            }
            temp = temp.next;
        }
        temp.next = newFriend;
    }

    // Remove a friend connection between two users
    public void removeFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        removeFriendFromList(user1, userId2);
        removeFriendFromList(user2, userId1);

        System.out.println("Friend connection removed between " + user1.name + " and " + user2.name);
    }

    // Remove a friend from a user's friend list
    private void removeFriendFromList(UserNode user, int friendId) {
        if (user.friendList == null) {
            return;
        }

        if (user.friendList.friendId == friendId) {
            user.friendList = user.friendList.next;
            return;
        }

        FriendNode temp = user.friendList;
        while (temp.next != null && temp.next.friendId != friendId) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        FriendNode temp = user.friendList;
        if (temp == null) {
            System.out.println("No friends.");
            return;
        }

        while (temp != null) {
            UserNode friend = findUserById(temp.friendId);
            System.out.println("Name: " + friend.name + ", ID: " + friend.userId);
            temp = temp.next;
        }
    }

    // Count the number of friends for each user
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode friendTemp = temp.friendList;
            while (friendTemp != null) {
                count++;
                friendTemp = friendTemp.next;
            }
            System.out.println(temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }

    // Display all users
    public void displayAllUsers() {
        if (head == null) {
            System.out.println("No users in the system.");
            return;
        }

        UserNode temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", ID: " + temp.userId + ", Age: " + temp.age);
            temp = temp.next;
        }
    }
}
