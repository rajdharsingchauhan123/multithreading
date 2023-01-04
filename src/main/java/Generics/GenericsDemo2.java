package Generics;

public class GenericsDemo2 <T,U> {
    T obj1;
    U obj2;

    public GenericsDemo2(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        GenericsDemo2<String,Integer>genericsDemo2=new GenericsDemo2<>("raj",12);
        genericsDemo2.print();
    }
}
