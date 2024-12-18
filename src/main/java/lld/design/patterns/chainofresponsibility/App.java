package lld.design.patterns.chainofresponsibility;

import java.io.File;
import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) throws Exception{
        FileOutputStream out = new FileOutputStream(new File("./App.log"));

        out.write(0);

        Logger logger = new ErrorLogger(new DebugLogger(null, out), out); 

        logger.log("THIS IS ERROR", LogLevel.ERROR);
        logger.log("THIS IS DEBUG", LogLevel.DEBUG);

    }
}
