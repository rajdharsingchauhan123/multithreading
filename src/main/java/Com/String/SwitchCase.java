package Com.String;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        String name=scanner.nextLine();
//        scanner.close();
        String name ="ravikant";
        switch (name){
            case "raj":
                System.out.println("raj is a java developer");
                break;
            case"ravikant":
                System.out.println("ravikant is a python developer");
                break;
            default:
                System.out.println("no one can be developer");
        }
    }
}
