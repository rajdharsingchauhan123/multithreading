package Javalogger;

import org.example.Main;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Loggerdemo {

    // static logger
    private final static Logger LOGGER =Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // create fileHandler
        Handler fileHandler;
        // file handerler constructor may throw an exception
        // so we have to put it into try-catch block
        try{
            fileHandler =new FileHandler("./important.log");
            // set the file handler's minimun level
            fileHandler.setLevel(Level.WARNING);
            // add handler to the logger
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
           // throw new RuntimeException(e);
            LOGGER.log(Level.SEVERE,"Error occur in FileHandler .",e);
        }
    }
}
