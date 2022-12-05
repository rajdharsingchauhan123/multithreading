import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class Readandwrite{
    void readfile() throws FileNotFoundException {

        FileInputStream fis =new FileInputStream("d/abc.txt");


    }
void savefile() throws FileNotFoundException{
        String Text= "this is demo";
    FileOutputStream f =new FileOutputStream("d/xyz.txt");

}
}
class test{
    public static void main(String[] args) {
        Readandwrite rw =new Readandwrite();
        try {
            rw.readfile();
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
