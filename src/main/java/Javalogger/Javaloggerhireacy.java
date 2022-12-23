package Javalogger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class Javaloggerhireacy {
    private  static  final  Logger logger  = Logger.getLogger("com.jenkov.web");
    Logger logger5 =Logger.getLogger(Javaloggerhireacy.class.getName());

    // hirarcy of logger
    Logger logger4  = Logger.getLogger("");
     Logger logger1 = Logger.getLogger("com");
    Logger logger2 = Logger.getLogger("com.jenkov");
    Logger logger3 = Logger.getLogger("com.jenkov.web");


    public static void main(String[] args) {
        logger.warning("waring");
    }
}
