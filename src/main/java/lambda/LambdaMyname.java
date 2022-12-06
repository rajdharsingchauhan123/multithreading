package lambda;

interface LambdaMyname {
    void sayname();

}
class lambdaexa{
    public static void main(String[] args) {
        LambdaMyname p =()->{
            System.out.println("hello raj");
        };
        p.sayname();
    }
}