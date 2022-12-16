package collectonjava;

import com.stream.Stream_basic;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList <String>linkedList =new LinkedList<>();
        linkedList.add("rajdhar");
        linkedList.add("raj");
        linkedList.add("ravi");

    //    System.out.println(linkedList);
        linkedList.set(1,"ra");
        System.out.println(linkedList);

        //   while (iterator.hasNext()){
        //  iterator.next();
        //  System.out.println(iterator.next());


        //       }
        //LinkedList<Integer>linkedList1= linkedList.stream().map(Integer::parseInt)

// pass arrays as arraylist
//        Integer[] arr = {1, 2, 45, 5, 67, 8};
//        List<Integer>al=Arrays.asList(arr);
//        System.out.println(al);
//        List<Integer>arr1=new ArrayList<>();
//        Collections.addAll(arr1,arr);
//        System.out.println(arr1);i
//        List<Integer>arr2=new ArrayList<>();
//        for(Integer i:arr){
//            arr2.add(i);
//
//        }
//
//        System.out.println(arr2);

        List<Integer> array=Arrays.asList(12,34,53,54,32);
//       // array.add(112);
//      List<Integer>arra1=new ArrayList<>(array);
//      arra1.add(123);
//        System.out.println(arra1);
//       boolean b=arra1.contains(122);
//        System.out.println(b);
//      //  array.stream().forEach(System.out::println);
//       // using stream print array list
//        Stream.of(arra1).forEach(System.out::println);
//
//        // pritn array to stream
//        String[] strArray = new String[] {"John", "Mary", "Bob"};
//
//        Arrays.stream(strArray).forEach(System.out::println);
//       ArrayList arrayList=new ArrayList<>();
//       arrayList.add("raj");
//       arrayList.add(12);
//       arrayList.add(null);
//       arrayList.add(124.4);
//       arrayList.add('c');
//       arrayList.set(4,"rajdhar");
//        System.out.println(arrayList);

    }
}