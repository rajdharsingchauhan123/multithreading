package Generics;

public class Genericsfuction2 {
    public <T> void Genericsmethod(T data){
        System.out.println("This is a generics method");
        System.out.println("This is a basic");
    }

    public static void main(String[] args) {
        Genericsfuction2 obj =new Genericsfuction2();
        obj.<String>Genericsmethod("string");
    }
}
