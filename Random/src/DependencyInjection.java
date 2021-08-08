
interface ILogger {
    void log(String msg);
}

class Logger {
    private ILogger logger;

    public Logger(ILogger logger) {
        this.logger = logger;
    }

    public void log(String msg) {
        logger.log(msg);
    }
}

class FileLog implements ILogger {
    @Override
    public void log(String msg) {
        System.out.println("Error logged in File: " + msg);
    }
}

class DBLog implements ILogger {
    @Override
    public void log(String msg) {
        System.out.println("Error logged in Databse: " + msg);
    }
}

//class conlog{
//    public void log(String msg){
//        System.out.println("Log saved in text file: "+msg);
//    }
//}

public class DependencyInjection {

    public static void main(String[] args) {
        //conlog logc = new conlog();
//        FileLog fileLog = new FileLog();         //simply creating object of a class without using dependency injection.
//        DBLog dbLog = new DBLog();               // That's why everytime when the dependency is changing it's needs to create new object.
        // For this the code gets tightly coupled.
//       Logger logger = new Logger(fileLog);
//        Logger logger = new Logger(dbLog);


        ILogger lgr;
        String getfromconfig = "DB";                       //  Making the code loosely coupled.
        //Injecting Dependency
        if (getfromconfig == "DB") {                         //  Using dependency injection concept.
            lgr = new DBLog();                             //  Here no needs to create object manually everytime.
        }                                                  //  Dependency handles al the instance or its own.
        else {
            lgr = new FileLog();
        }
        Logger logger = new Logger(lgr);

        try {
            throw new Exception("Test exception");
        } catch (Exception e) {
            logger.log(e.getMessage());

        }
    }
}
