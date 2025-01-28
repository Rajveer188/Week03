package com.tit.week03.day01.linked_list.circular_linked_list.ticket_reservation;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Adding some tickets
        system.addTicket(1, "John Doe", "Inception", "A1", "2025-01-28 14:30");
        system.addTicket(2, "Jane Smith", "Avatar", "B2", "2025-01-28 16:00");
        system.addTicket(3, "Sam Brown", "Titanic", "C3", "2025-01-28 18:00");

        // Display all tickets
        system.displayTickets();

        // Search for a ticket by customer name
        system.searchTicketByCustomerName("Jane Smith");

        // Remove a ticket by ID
        system.removeTicket(2);

        // Display all tickets again after removal
        system.displayTickets();

        // Calculate total tickets
        system.totalTickets();
    }
}
