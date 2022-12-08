package Com.inheritace;

interface animal {
    default  int run(){
        return 123;

    }

}
interface dog extends animal {
 default int run(){
     return 1234;
 }
}
 class raj implements animal,dog{

}
 class test{
    public static void main(String[] args) {
        raj j=new raj();
        j.run();
        System.out.println(j.run());

    }
}