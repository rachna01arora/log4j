package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Loggingin {
	
	public static void writelog(String classname, String exemode, String message){
		
		Logger logger=Logger.getLogger(classname);
		PropertyConfigurator.configure("./properties/Log4j.properties");
		 
		switch(exemode.toLowerCase()){
		case "debug" : 
			logger.debug(message);
		break;
		case "info" :
			logger.info(message);
		break;
		case "error" :
			logger.error(message);
			break;
		case "fatal" :
			logger.fatal(message);
			break;
		
	}
		

}
}
