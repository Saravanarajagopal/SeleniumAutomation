package Org.Log4jExample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicsConfigurationExample   //1.Basic method
{
	static Logger logger = Logger.getLogger(BasicsConfigurationExample.class); // With out new keyword but create the object for logger using getlogger.class
	
	public static void main(String[] args) 
	{
	    BasicConfigurator.configure();
		logger.debug("Depuging message dispalyed!!!");
	    logger.info("Basic information displayed!!!");
	    logger.warn("Warring Pop-up");
	    logger.error("Error will raise");
	    logger.fatal("The fatal message is displayed!!!");
	}

}
