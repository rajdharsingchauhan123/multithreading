import java.util.Scanner;

    class dailyproblem{



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            scanner.close();
            if(n%2!=0){
                System.out.println("Weird");

            }
            else {
                System.out.println("Not Weird");


            }

        }}


