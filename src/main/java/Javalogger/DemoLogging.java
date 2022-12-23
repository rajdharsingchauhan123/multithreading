package Javalogger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoLogging {
    public DemoLogging(){
        logger.setLevel(Level.SEVERE);
    }
    Logger logger =Logger.getLogger("Log tester");
    public void Methser(){
        // direct using of log level
        logger.severe("Severe Error");
        //use of log only and pass the level
        logger.log(Level.SEVERE,"hello");

    }
    public void methodmarn(){
        logger.warning("warnig looger");

    }
    public void methodinfo(){
        logger.info("Infromation looger");


    }

    public static void main(String[] args) {
        Logger logger1 =Logger.getLogger(DemoLogging.class.getName());
        DemoLogging d =new DemoLogging();
        d.methodinfo();
        d.methodmarn();
        d.Methser();
        System.out.println("hello");
        System.out.println(logger1.getFilter());
    }
}
