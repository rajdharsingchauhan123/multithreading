package Com.String;

import java.util.HashMap;
import java.util.Map;

class DemoMap {
    public static void main(String[] args) {
        Map<String,Integer>numbers =new HashMap<>();
        numbers.put("rajdhar",2);
        numbers.put("raj",43);
        numbers.put("ravikant",56);
        numbers.put("pramod",6);
        numbers.put("rajdhar Singh",5);
        numbers.put("rajdha",4);
        System.out.println(numbers);
        System.out.println(numbers.keySet());
        System.out.println(numbers.values());
        System.out.println(numbers.entrySet());





    }
}
