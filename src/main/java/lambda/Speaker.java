package lambda;

interface Speaker {
     String say();
}
 class lambdd2{
     public static void main(String[] args) {
         Speaker s =()->{
             return "hello raj how are you";
         };
         System.out.println(s.say());
     }

}
