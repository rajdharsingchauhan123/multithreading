import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import static java.lang.Math.*;
import static javax.swing.UIManager.get;

public class RandomNuber {
    public static void main(String[] args) {
        List<String> countryList = new ArrayList<>(Arrays.asList("India","Australia","USA","Japana","England","Scotland","Germany","France","Argentina","Brazil"));
           Random random =new Random();
//           String randomcountry =countryList.get(random.nextInt(countryList.size()));
//        System.out.println(randomcountry);// take 5 minute
//        String ramd=countryList.get(ThreadLocalRandom.current().nextInt(countryList.size()));
//        System.out.println(ramd);// 5minute
       // countryList.stream().map(ThreadLocalRandom.current().nextBoolean(get(countryList)));

// using stream
       // String l=countryList.get(random.nextInt(countryList.size()));
        //System.out.println(l);
        String b=countryList.stream().skip(random.nextInt(countryList.size())).findFirst().get();
        System.out.println(b);

    }
}
