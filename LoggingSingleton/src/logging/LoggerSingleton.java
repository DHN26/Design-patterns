package logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerSingleton {

	
		private static LoggerSingleton instance;
	    private Logger logger;

	    private LoggerSingleton() {
	        logger = Logger.getLogger(LoggerSingleton.class.getName());
	    }

	    public static LoggerSingleton getInstance() {
	        if (instance == null) {
	            instance = new LoggerSingleton();
	        }
	        return instance;
	    }

	    public void log(Level level, String message) {
	        logger.log(level, message);
	    }

	    public static void main(String[] args) {
	        LoggerSingleton logger1 = LoggerSingleton.getInstance();
	        

	        logger1.log(Level.INFO, "Info message");
	        logger1.log(Level.WARNING, "Warning message");
	        System.out.println();

	        LoggerSingleton logger2 = LoggerSingleton.getInstance();
	        
	        logger2.log(Level.INFO, "Another info message");
	        logger2.log(Level.WARNING, "Another warning message");
	        System.out.println();
	        
	        LoggerSingleton logger3 = LoggerSingleton.getInstance();
	        

	        logger3.log(Level.INFO, "Another info message");
	        logger3.log(Level.WARNING, "Another warning message");


	}

}
