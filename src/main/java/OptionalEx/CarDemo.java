package OptionalEx;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class CarDemo {
    public static void main(String[] args) {
        Optional<List<Car>> getallcar = cardatabase.getallcar();
        List<Car> cars = getallcar.get();
        System.out.println(cars);
        // size of list
        Integer integer = getallcar.map(List::size).orElse(0);
        System.out.println(integer);
        // print of all list of cars
        List<Optional<List<Car>>> collect = getallcar.stream().map(o -> Optional.of(o)).collect(Collectors.toList());

        // list of using set
getallcar.stream().map(o->Optional.ofNullable(o)).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println(collect);

        Optional.ofNullable(cars).stream().flatMap(List::stream).filter(Objects::nonNull).forEach(System.out::println);
    }
}
