package OPPspractice;

import java.util.Map;
import java.util.TreeMap;

public class Demo6 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
map.put("raj",12);
if(map!=null){


    map.forEach((k,v)-> System.out.println(k+" "+v));
}



    }



}