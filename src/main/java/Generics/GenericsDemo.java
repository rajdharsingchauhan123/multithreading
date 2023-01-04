package Generics;

public class GenericsDemo <T> {
    T obj;


    public GenericsDemo(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }

    public static void main(String[] args) {
        GenericsDemo<Integer>genericsDemo=new GenericsDemo<>(5);
        System.out.println(genericsDemo.getObj());

        GenericsDemo<String>genericsDemo1=new GenericsDemo<>("raj");
        System.out.println(genericsDemo1.getObj());

    }
}
