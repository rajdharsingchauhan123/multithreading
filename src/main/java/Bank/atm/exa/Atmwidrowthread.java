package Bank.atm.exa;

public class Atmwidrowthread extends Thread{
    private Atm atm;
    private int atmwidrwocash;
    Atmwidrowthread(Atm atm,int atmwidrwocash){
        this.atm=atm;
        this.atmwidrwocash=atmwidrwocash;

    }

    @Override
    public void run() {
     atm.cashwidraw(atmwidrwocash);
    }
}
