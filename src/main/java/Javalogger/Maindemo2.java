package Javalogger;

import org.example.Main;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Maindemo2 {
private  static final Logger logger =Logger.getLogger(Main.class.getName());
private  static Logger logger1 =Logger.getLogger(java.util.logging.Handler.class.getName());

    public static void main(String[] args) {
        Handler filehandler;
        try {
            filehandler =new FileHandler("./important.log");
            filehandler.setLevel(Level.WARNING);
            logger.addHandler(filehandler);
        } catch (IOException e) {
           // throw new RuntimeException(e);
            logger.log(Level.SEVERE,"Error occur in filehanler",e);
        }
        // logging
        logger.finest("finest message log");
        logger.finer("finer massage in log");
        logger.config("config massage log");
        logger.fine("fine massage log");
        logger.info("info massage log");
        logger.warning("warn massage log");
        logger.severe("severe massage log");
        logger1.log(Level.INFO,"hello world");

    }
}
