package Bus.reservation.System;

public class Ticketcounter {
    private int ticketavailbeseet =3;
    public synchronized void bookticket(String pname,int numberofseet)
    {
        if(ticketavailbeseet>=numberofseet  && numberofseet>0){
            System.out.println("hii " +pname +" :"+numberofseet+ " "+" Seats Sucessful booked");
            ticketavailbeseet =ticketavailbeseet-numberofseet;
        }
        else
        System.out.println("hii" +pname +" Seats are not availble");
    }
}
