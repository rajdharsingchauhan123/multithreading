package OptionalEx;

import java.util.Optional;

public class OptionaDemo {
    public static void main(String[] args) {
//        Optional<String> gender = Optional.of("MALE");
//        String answer1 = "Yes";
//        String answer2 = null;
//        System.out.println(gender);
//        System.out.println(gender.get());
//        System.out.println(gender.isEmpty());
//        System.out.println(Optional.empty());
//        System.out.println(Optional.ofNullable(answer2));
//        System.out.println(Optional.of(answer1));
        Optional<Employe> getallemplye1 = EmployDatabase.getallemplye();
//        System.out.println(emp.get());
//        System.out.println(emp.isEmpty());
//        System.out.println(Optional.ofNullable(null));
//        System.out.println(emp.get());


        System.out.println(getallemplye1);
        Optional.of(getallemplye1.map(Employe::getFirstname))
        //System.out.println(s);
       // Employe employe = getallemplye1.get();
        System.out.println(getallemplye1.get());


    }
}
