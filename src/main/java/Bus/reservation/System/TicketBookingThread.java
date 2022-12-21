package Bus.reservation.System;

public class TicketBookingThread extends Thread{
    private Ticketcounter ticketcounter2;
    private String passname;
    private  int numberofseatavailbel;

    public TicketBookingThread(Ticketcounter ticketcounter, Ticketcounter ticketcounter1, String pname, int numberofseatavailbel){
        this.ticketcounter2 = ticketcounter;
        this.numberofseatavailbel=numberofseatavailbel;
        this.passname=pname;
        this.numberofseatavailbel=numberofseatavailbel;

    }

    @Override
    public void run() {
       ticketcounter2.bookticket(passname,numberofseatavailbel);
    }
}
