package com.tit.week03.day01.linked_list.singly_linked_list.inventory_management;

public class InventoryMain {
    public static void main(String[] args) {
        //create list and add items
        ItemList inventory = new ItemList();

        inventory.addAtLast("Laptop", 101, 2, 70000);
        inventory.addAtFirst("Mouse", 102, 5, 520);
        inventory.addAtPosition("Keyboard", 103, 3, 1200,2);
        inventory.addAtPosition("Hard disk", 104,2, 5000,3);

        //display list
        System.out.println("Items - ");
        inventory.displayList();

        //update quantity
        inventory.updateQuantity(101, 4);
        //display total
        inventory.displayTotal();

        //sort and display
        inventory.sortById();
        inventory.displayList();
    }
}
