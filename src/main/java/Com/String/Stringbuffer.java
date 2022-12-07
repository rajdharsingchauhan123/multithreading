package Com.String;

public class Stringbuffer {
    public static void main(String[] args) {
        String name ="rajdhar";

        StringBuilder str=new StringBuilder("rajdharsinghchauhan");
        str.delete(4,5);
        System.out.println(str);
        str.append("to");
        System.out.println(str);
        str.append("simlilearn");
        System.out.println(str);
    }
}
