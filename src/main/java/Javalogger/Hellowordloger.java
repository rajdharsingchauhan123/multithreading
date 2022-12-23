package Javalogger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hellowordloger {
    private static Logger logger =Logger.getLogger(Hellowordloger.class.getName());

    public static void main(String[] args) {
        logger.info("This is info level info logging");
        logger.log(Level.WARNING,"This is level warning logging");
        logger.log(Level.SEVERE,"This is the level of sever logging");
        logger.log(Level.SEVERE, "Hello logging: {0}, {1}",
                new Object[] {"P1", "P2"});
        logger.log(Level.SEVERE, "Hello logging",
                new RuntimeException("Error"));

        System.out.println("Hello java looging api");
    }
}
