package collectonjava;

import java.util.*;

public class setDeom {
    public static void main(String[] args) {
      List l=new ArrayList();
      l.add(10);
      l.add(1);
      l.add(2);
      l.add(5);
      l.add(6);
        l.add(6);
        System.out.println(l);


      Set s =new HashSet(l);

        System.out.println(s);
  SortedSet s2=new TreeSet(l);
        System.out.println(s2);






    }
}
