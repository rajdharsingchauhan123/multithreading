package OPPspractice;

public class Demo4 {
    int i;
    String name;

    public Demo4(int i, String name) {
        this.i = i;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo4{" +
                "i=" + i +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Demo4 d =new Demo4(12,"ravikant");
       System.out.println(d);
        d.i=12;
        d.name ="raj";
        System.out.println(d.i+""+d.name);
    }
}
