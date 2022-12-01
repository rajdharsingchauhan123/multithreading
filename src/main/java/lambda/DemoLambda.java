package lambda;

import java.util.TreeMap;

public class DemoLambda {
    public static void main(String[] args) {
        TreeMap<Integer,String> my_treemap=new TreeMap<>((o1 ,o2) -> (o1>o2) ? -1:(o1 < o2) ? 1 : 0);
        my_treemap.put(56, "Joe");
        my_treemap.put(43, "Bill");
        my_treemap.put(21, "Charolette");
        my_treemap.put(33, "Jonas");
        System.out.println("The treemap contains the following elements : " + my_treemap);
    }
}


