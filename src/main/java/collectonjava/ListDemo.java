package collectonjava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList <String>linkedList =new LinkedList<>();
        linkedList.add("rajdhar");
        linkedList.add("raj");
        linkedList.add("ravi");

        System.out.println(linkedList);

        Iterator<String> iterator =linkedList.iterator();
        while (iterator.hasNext()){
          //  iterator.next();
          //  System.out.println(iterator.next());



        }
        //LinkedList<Integer>linkedList1= linkedList.stream().map(Integer::parseInt)


    }




}
