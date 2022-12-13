package Quiz;


// inner class in java
//public  class demo {
//    private static int a=200;
//    public static class  inner{
//        private static int b=100;
//
//    }
//    public static void main(String[] args) {
//        demo outer =new demo();
//        //demo.inner inner1=new demo().new inner();
     // static method ob created
//        demo.inner inner1= new demo.inner();
//        System.out.println(inner1.b + outer.a);
//
//
//
//    }
//
//}
    // local method in inner class
// class outer {
//    // int x=23;
//
//    void outermethod() {
//       int x =98;
//        System.out.println("hello outer method");
//
//        class inner {
//            void innermethod() {
//
//                System.out.println("hello innner class");
//                System.out.println(x);
//            }
//        }
//        inner y = new inner();
//        y.innermethod();
//
//    }
//}
//class test{
//    public static void main(String[] args) {
//        outer x =new outer();
//        x.outermethod();
//    }
//}

// static inner class
//class outer {
//    protected static void outermthod() {
//        System.out.println("hello outer class");
//    }
//
//    static class inner {
//
//       public static void innermethod() {
//            System.out.println("hello inner");
//            outermthod();
//
//        }
//    }
//
//
//
//}
//class test {
//    public static void main(String[] args) {
//        outer.inner obj=new outer.inner();
//         obj.innermethod();
//         //outer o =new outer();
//        //   outer.outermthod();
//         //o.outermthod();
//
//    }
//
//}
  // anomnus static method in java
 interface  hello{
  void show ();
}
class demo{
  static hello h =new hello(){
   public void show(){
    System.out.println("hello ravi how are you");
   }

 };

 public static void main(String[] args) {
  h.show();
 }


}
// using in lambda
// public static void main(String[] args) {
//  int x=0;
// // hello o= ()->System.out.println(x);
////  o.show();
//hello o = ()-> {
// return "hello i am";
//};
//String i=o.show();
//  System.out.println(i);
// }
//
//}

