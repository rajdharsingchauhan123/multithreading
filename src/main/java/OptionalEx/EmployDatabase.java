package OptionalEx;

import java.util.Arrays;
import java.util.Optional;

public class EmployDatabase {
    public static Optional<Employe> getallemplye() {
        Employe employe = new Employe("rajdhar", 12, 12322, "male");

        return Optional.ofNullable(employe);
//public static void main(String[] args) {
//    Employe employe =new Employe("raj",124,12345,null);
//Optional<String> gender1 = Optional.of(employe.getGender());
//
//    Optional<String> firstname1 = Optional.of(employe.getFirstname());
//    System.out.println(firstname1);
//    //Optional<String> gender1 = Optional.of(employe.getGender());
//    Optional<String> gender2 = Optional.ofNullable(employe.getGender());
//    System.out.println(gender2);
//}
//
//    }


    }
}