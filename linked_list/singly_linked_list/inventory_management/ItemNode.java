package com.tit.week03.day01.linked_list.singly_linked_list.inventory_management;

//class to represent item node
public class ItemNode {
    //Attribute
    private String itemName;
    private int itemId;
    private int quantity;
    private double price;
    public ItemNode next;
    //constructor to initialize product
    public ItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

    //getter to get product details
    public String getItemName() {
        return itemName;
    }
    public int getItemId() {
        return itemId;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }

    //setter to set variable values
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
