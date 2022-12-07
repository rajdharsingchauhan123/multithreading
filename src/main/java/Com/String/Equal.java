package Com.String;

public class Equal {
    public static void main(String[] args) {

        // equals() method with Object class
        // create two objects
        Object obj1 = new Object();
        Object obj2 = new Object();

        // check if obj1 and obj2 are equal
        System.out.println(obj1.equals(obj2));  // false


        // assign obj1 to obj3
        Object obj3 = obj1;
        System.out.println(obj1.equals(obj3));  // true

    }
}

