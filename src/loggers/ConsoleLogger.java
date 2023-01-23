package loggers;

import java.util.Date;

public class ConsoleLogger implements Logable{
    @Override
    public void saveLog(String msg) {
        System.out.println(new Date() + " : " + msg);
    }
}
