package loggers;


import java.util.Date;


public class FileLogger implements Logable {

   FileLoggerInt fileLoggerInt;

    public FileLogger(FileLoggerInt fileLoggerInt) {
        this.fileLoggerInt = fileLoggerInt;
    }


    @Override
    public void saveLog(String msg) {
        fileLoggerInt.saveLogToFile(new Date() + ": " + msg);

    }
}
