package utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logname {
	
	private static Logger log;
	
	
	//We can use it when starting tests this needs to be added before class
	  public static void startLog (){
		log=Logger.getLogger(logname.class.getName());
		PropertyConfigurator.configure("./properties/Log4j.properties");
		log.info("Test is starting");
	}
	
		//We can use it when ending tests
	    public static void endLog (String testClassName){
	    	log.info("Test is Ending...");
}
	  //Info Level Logs
	    public static void info (String message) {
	        log.info(message);
	    }
	 
	    //Warn Level Logs
	    public static void warn (String message) {
	        log.warn(message);
	    }
	 
	    //Error Level Logs
	    public static void error (String message) {
	        log.error(message);
	    }
	 
	    //Fatal Level Logs
	    public static void fatal (String message) {
	        log.fatal(message);
	    }
	 
	    //Debug Level Logs
	    public static void debug (String message) {
	        log.debug(message);
}
}

/*
<!-- https://mvnrepository.com/artifact/log4j/log4j -->
<dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
</dependency>
*/