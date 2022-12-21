package Bus.reservation.System;

public class Test {
    public static void main(String[] args) {
        Ticketcounter ticketcounter = new Ticketcounter();
        TicketBookingThread t1 = new TicketBookingThread(ticketcounter, ticketcounter, "ravi", 2);
        TicketBookingThread t2 = new TicketBookingThread(ticketcounter, ticketcounter, "raj", 5);
        t1.start();
        t2.start();

    }
}