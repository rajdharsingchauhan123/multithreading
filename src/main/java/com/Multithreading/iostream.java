package com.Multithreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class iostream {
    public static void main(String[] args) throws IOException {

        // file creating the file
        File file = new File("source.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        // writing the text into the above created file using fileoutput

        FileOutputStream fos = new FileOutputStream(file);

        String texttobewitten = "my name is rahdhar";
        fos.write(texttobewitten.getBytes());
        fos.flush();
        fos.close();
        // reading the txt from the file using fileinputstream
        FileInputStream fis = new FileInputStream(file);
        int i = fis.read();
        while (!(i == -1)) {
//        System.out.println((char)fis.read());
            char c =(char)i;
            System.out.print(c);
            i =fis.read();



        }
        fis.close();
    }
}