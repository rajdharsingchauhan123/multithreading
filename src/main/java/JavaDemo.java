public class JavaDemo {
    int a ;
    String name ;

    public JavaDemo(int a, String name) {
        this.a = a;
        this.name = name;

    }

    @Override
    public String toString() {
        return "JavaDemo{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        JavaDemo j =new JavaDemo(12,"rja");
        System.out.println(j);
    }
}
