package OptionalEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cardatabase {

    public static Optional<List<Car>>getallcar(){
        List<Car>list=new ArrayList<>();
        list.add(new Car());
//        list.add(new Car("farari",1234,"s234bmw","red"));
//        list.add(new Car("jagiur",1234,"s234bmw","red"));
//        list.add(new Car("audi",1234,"s234bmw","red"));
//        list.add(new Car("mercidez benz s class",1234,"s234bmw","red"));
        return Optional.of(list);

    }
}
