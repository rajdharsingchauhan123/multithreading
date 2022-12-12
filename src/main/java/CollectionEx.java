import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class CollectionEx {
    public static void main(String[] args) {


// // Array list example
//        ArrayList al=new ArrayList();
//        al.add("rja");
//        al.add(34.2);
//        System.out.println(al);
//        al.add(123);
        //System.out.println(al);

        // linked list
//
        // Vector example
//        Vector<String>vector=new Vector<String>();
//        vector.add("radjar");
//        vector.add("ravi");
//       vector.add(new String("sahvag"));
//        System.out.println(vector);
//        System.out.println(vector.size());
//
//
//        Stack<Double>s=new Stack<>();
//        s.push(10.4);
//        s.push(23.4);
//        s.push(23.4123);
//        s.push(23.4345);
//        System.out.println(s);
//        System.out.println(s.pop());
//        System.out.println(s.peek());


        // iterating ex
//        ArrayList<String>arrayList=new ArrayList<>();
//        arrayList.add("raj");
//        arrayList.add("monkkey");
//        arrayList.add("rja");
//        Iterator<String>integer=arrayList.iterator();
//        while (integer.hasNext()){
//            String Next = integer.next();
//            System.out.println(Next);

        // list iterator
//        ArrayList<String>arrayList =new ArrayList<>();
//        arrayList.add("raj");
//        arrayList.add("monkkey");
//        arrayList.add("rja");
//        ListIterator<String>listIterator=arrayList.listIterator();
//        while (listIterator.hasNext()){
//            String Next = listIterator.next();
//            System.out.println(Next);
//        }
        // enumeration iterator
//        Vector<Integer>v =new Vector<>();
//        v.add(21);
//        v.add(22);
//        v.add(24);
//        v.add(25);
//        v.add(25);
//        v.add(2);
//        System.out.println(v);
//
//        Enumeration  e=v.elements();
//        while (e.hasMoreElements()){
//            System.out.println(e.nextElement());

        // hash set
//        HashSet<Integer>hs =new HashSet<>();

//        hs.add(12);
//        hs.add(122);
//        hs.add(121);
//        hs.add(1222);
//        hs.add(142);
//        hs.add(null);
//        System.out.println(hs.size());
//        for(Integer e:hs){
//            System.out.println(e);
//        }
//        Iterator it = hs.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

// linked hashset
//        LinkedHashSet<Integer>hs=new LinkedHashSet<>();
//        hs.add(12);
//        hs.add(122);
//        hs.add(121);
//        hs.add(1222);
//        hs.add(142);
//        hs.add(null);
//        System.out.println(hs.size());
//        for(Integer e:hs){
//            System.out.println(e);
//        }
//        Iterator it = hs.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        // Sorted set in java
//        SortedSet ss =new TreeSet();
//        for (int i=0;i<=20;i++)
//            ss.add(i);
//        System.out.println(ss.first());
//        System.out.println(ss.last());
//        System.out.println(ss.headSet(12));
//        System.out.println(ss.tailSet(15));
//        System.out.println(ss.subSet(12,14));
//        System.out.println(ss.comparator());
//
//

        // Tree set in colletion

        // we are not add first element in null they will not take null value
//        TreeSet<String>ts=new TreeSet<>();
//       // ts.add(null);
//        ts.add("rajdhar");
////        ts.add(null);
//        System.out.println(ts);
        TreeSet ts=new TreeSet();
        ts.add(new StringBuffer("java"));
        ts.add(new StringBuffer("raj"));
        ts.add(new StringBuffer("rahul"));
        ts.add(new StringBuffer("money"));
        System.out.println(ts);
    }
}
