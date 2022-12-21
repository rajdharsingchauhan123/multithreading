package Bank.atm.exa;

public class AtmTest {
    public static void main(String[] args) {
        Atm atm =new Atm();
        Atmwidrowthread a1 =new Atmwidrowthread(atm,1234);
        Atmwidrowthread a2 =new Atmwidrowthread(atm,12344444);
        a2.start();
        a1.start();
    }

}
