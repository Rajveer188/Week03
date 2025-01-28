package com.tit.week03.day01.linked_list.singly_linked_list.inventory_management;

//class to represent itemlist
public class ItemList {
    //Attribute
    private ItemNode head;

    //constructor to initialize list of item
    public ItemList(){}

    //method to add at first
    public void addAtFirst(String itemName, int itemId, int quantity, double price){
        ItemNode item = new ItemNode(itemName, itemId, quantity, price);
        if(head == null){
            head = item;
            return;
        }
        item.next = head;
        head = item;
    }
    //method to add at last
    public void addAtLast(String itemName, int itemId, int quantity, double price){
        ItemNode item = new ItemNode(itemName, itemId, quantity, price);
        //check if list is empty
        if(head == null){
            head = item;
            return;
        }
        //create a temporary
        ItemNode tempList = head;
        //travers till end
        while (tempList.next != null){
            tempList = tempList.next;
        }
        tempList.next = item;
    }
    //method to add at position
    public void addAtPosition(String itemName, int itemId, int quantity, double price, int position){
        //create new item node
        ItemNode item = new ItemNode(itemName, itemId, quantity, price);

        if(position == 1 || head == null){
            this.addAtFirst(itemName, itemId, quantity, price);
            return;
        }
        //create a temporary
        ItemNode tempList = head;

        int index =1;
        //iterate to find position
        while (index != position-1 && tempList.next != null){
            tempList = tempList.next;
            index++;
        }
        item.next = tempList.next;
        tempList.next = item;
    }

    //method to remove item by id
    public void removeItem(int itemID){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.getItemId() == itemID){
            head = head.next;
            System.out.println("Item " + itemID + "deleted");
            return;
        }
        ItemNode tempList = head;
        while (tempList.next != null){
            if(tempList.next.getItemId() == itemID){
                tempList.next = tempList.next.next;
                System.out.println("Item " + itemID + "deleted");
                return;
            }
            tempList = tempList.next;
        }
        System.out.println("Item " +itemID +"not present in list");
    }

    //method to update item quantity by id
    public void updateQuantity(int itemID, int quantity){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.getItemId() == itemID){
            head.setQuantity(quantity);
            System.out.println("Item " + itemID + "quantity updated successfully");
            return;
        }
        ItemNode tempList = head;
        while (tempList.next != null){
            if(tempList.next.getItemId() == itemID){
                tempList.next.setQuantity(quantity);
                System.out.println("Item " + itemID + "quantity updated successfully");
                return;
            }
            tempList = tempList.next;
        }
        System.out.println("Item " +itemID +"not present in list");
    }
    //method to find item by id
    public void searchItem(int itemID){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.getItemId() == itemID){
            System.out.println("\nItem found -");
            this.displayItem(head);
            return;
        }
        ItemNode tempList = head;
        while (tempList.next != null){
            if(tempList.next.getItemId() == itemID){
                System.out.println("\nItem found -");
                this.displayItem(tempList.next);
                return;
            }
            tempList = tempList.next;
        }
        System.out.println("Item " +itemID +"not present in list");
    }
    //overloaded method to find item by name
    public void searchItem(String name){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.getItemName() == name){
            System.out.println("\nItem found -");
            this.displayItem(head);
            return;
        }
        ItemNode tempList = head;
        while (tempList.next != null){
            if(tempList.next.getItemName() == name){
                System.out.println("\nItem found -");
                this.displayItem(tempList.next);
                return;
            }
            tempList = tempList.next;
        }
        System.out.println("Item " +name +"not present in list");
    }

    //method to display total value
    public void displayTotal(){
        double total = 0;
        ItemNode tempList = head;
        while (tempList != null){
            double price = tempList.getPrice();
            int quantity = tempList.getQuantity();
            total += price*quantity;
            tempList = tempList.next;
        }
        System.out.println("total amount of inventory is - " + total);
    }

    //method to sort items
    public void sortById() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            ItemNode current = head;
            while (current.next != null) {
                if (current.getItemId() > current.next.getItemId()) {
                    // Swap item
                    swapItems(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    //method to swap
    private void swapItems(ItemNode a, ItemNode b) {
        String tempName = a.getItemName();
        int tempId = a.getItemId();
        int tempQuantity = a.getQuantity();
        double tempPrice = a.getPrice();

        a.setItemName(b.getItemName());
        a.setItemId(b.getItemId());
        a.setQuantity(b.getQuantity());
        a.setPrice(b.getPrice());

        b.setItemName(tempName);
        b.setItemId(tempId);
        b.setQuantity(tempQuantity);
        b.setPrice(tempPrice);
    }
    //method to display list
    public void displayList(){
         ItemNode tempList = head;
         while (tempList != null){
             this.displayItem(tempList);
             tempList = tempList.next;
         }
    }

    private void displayItem(ItemNode tempList) {
        if(tempList == null){
            return;
        }
        System.out.println("\nItem id - "+ tempList.getItemId() +
                "\nitem name - " + tempList.getItemName() +
                "\nitem price - " + tempList.getPrice() +
                "\nitem quantity - " + tempList.getQuantity());
    }
}
