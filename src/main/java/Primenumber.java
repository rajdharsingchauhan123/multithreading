import java.io.IOException;
import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg);
    }


}

class voting{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your age :");
        int age =scanner.nextInt();
        try {
            if (age < 18) {
                throw new YoungerAgeException("you are not eligible");
            } else {
                System.out.println("you can vote succesful");
            }
        }
        catch (Exception e){
            System.out.println(e);

        }
        System.out.println("rajdhar");



    }
}
