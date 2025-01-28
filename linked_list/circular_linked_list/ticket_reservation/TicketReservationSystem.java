package com.tit.week03.day01.linked_list.circular_linked_list.ticket_reservation;

public class TicketReservationSystem {
    private TicketNode head;
    private TicketNode tail; // Tail of the circular linked list

    // Constructor to initialize the system
    public TicketReservationSystem() {
        head = null;
        tail = null;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            tail = newTicket;
            newTicket.next = head; // Circular link
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head; // Circular link
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets in the system.");
            return;
        }

        TicketNode current = head;
        TicketNode previous = null;

        // If the ticket to be removed is the head
        if (current.getTicketId() == ticketId) {
            if (head == tail) { // Only one ticket in the system
                head = tail = null;
            } else {
                tail.next = current.next;
                head = current.next;
            }
            System.out.println("Ticket with ID " + ticketId + " has been removed.");
            return;
        }

        // Traverse the circular linked list to find the ticket
        while (current.next != head) {
            previous = current;
            current = current.next;

            if (current.getTicketId() == ticketId) {
                previous.next = current.next;
                if (current == tail) { // If the ticket is the last one
                    tail = previous;
                }
                System.out.println("Ticket with ID " + ticketId + " has been removed.");
                return;
            }
        }

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    // Display all tickets in the system
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets in the system.");
            return;
        }

        TicketNode current = head;
        do {
            System.out.println("Ticket ID: " + current.getTicketId());
            System.out.println("Customer: " + current.getCustomerName());
            System.out.println("Movie: " + current.getMovieName());
            System.out.println("Seat: " + current.getSeatNumber());
            System.out.println("Booking Time: " + current.getBookingTime());
            System.out.println();
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by customer name
    public void searchTicketByCustomerName(String customerName) {
        if (head == null) {
            System.out.println("No tickets in the system.");
            return;
        }

        TicketNode current = head;
        boolean found = false;
        do {
            if (current.getCustomerName().equalsIgnoreCase(customerName)) {
                System.out.println("Ticket found:");
                System.out.println("Ticket ID: " + current.getTicketId());
                System.out.println("Customer: " + current.getCustomerName());
                System.out.println("Movie: " + current.getMovieName());
                System.out.println("Seat: " + current.getSeatNumber());
                System.out.println("Booking Time: " + current.getBookingTime());
                found = true;
                break;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No ticket found for customer: " + customerName);
        }
    }

    // Calculate and display the total number of booked tickets
    public void totalTickets() {
        if (head == null) {
            System.out.println("No tickets in the system.");
            return;
        }

        int count = 0;
        TicketNode current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        System.out.println("Total number of booked tickets: " + count);
    }
}
