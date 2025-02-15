package lld.design.patterns.chainofresponsibility;
import java.io.FileOutputStream;

public abstract class Logger implements LoggerInterface{
    protected FileOutputStream out; 
    private Logger nextLogger;     
    public Logger(Logger nextLogger, FileOutputStream out){
        this.out = out;
        this.nextLogger = nextLogger;    
    }
    @Override
    public void log(String log, LogLevel logLevel){
        if(this.nextLogger!=null){
            this.nextLogger.log(log, logLevel);
        }
    }   
}
