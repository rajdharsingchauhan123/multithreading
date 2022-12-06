package Demo;

public class person {
    // Generic type method
    public <T> void Showdetails(T i){
        System.out.println("persono show details: " +i);


    }

    public static void main(String[] args) {
        person p =new person();
        p.Showdetails(14);
        p.Showdetails("rajdhar singh");
        p.Showdetails(12.6666f);
    }
}

