package Generics;

public class GenericsFuctionDemo {
 static <T> void genricdisplay(T element){
     System.out.println(element.getClass().getName() +" "+element);

 }

    public static void main(String[] args) {
        genricdisplay("raj");
        genricdisplay("raj");
        genricdisplay(12.5);
        genricdisplay(123.f);
        genricdisplay(12);
    }
}
