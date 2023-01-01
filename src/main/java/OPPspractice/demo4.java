package OPPspractice;

interface Demo5 {
    void sleep(int i);

}
class demo4{
    public static void main(String[] args) {
        Demo5 d  = (j) -> {
            System.out.println("hello raj");
        };
        d.sleep(5);

    }
}
