package Bank.atm.exa;

public class Atm {
    private  int Atmavaliblecash =100000;
    public synchronized  void cashwidraw(int widrawcah){
        if(Atmavaliblecash>=widrawcah && widrawcah>100){
            System.out.println("hii ravi" + " " + widrawcah + " "+"sucessful withdrow money");
            Atmavaliblecash=Atmavaliblecash-widrawcah;



        }
        else{
            System.out.println("not enough money");
        }
    }

}
