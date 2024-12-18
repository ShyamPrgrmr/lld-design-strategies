package lld.design.patterns.chainofresponsibility;
import java.io.FileOutputStream;
import java.io.IOException;

public class DebugLogger extends Logger{       
    public final LogLevel LEVEL = LogLevel.DEBUG;

    public DebugLogger(Logger nextLogger, FileOutputStream out) throws Exception{
        super(nextLogger, out);  
    }
    
    @Override
    public void log(String log, LogLevel logLevel) {
        if(logLevel != LEVEL){
           super.log(log, logLevel);
        }else{
            try {
                log = LEVEL + log;  
                char ch[] = log.toCharArray(); 
                System.out.println("Appending "+LEVEL.toString()+" logs....");
                for(char c : ch) out.write((int)c);
                out.flush();
                System.out.println("Appended logs...."); 
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
