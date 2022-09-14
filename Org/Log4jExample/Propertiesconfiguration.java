package Org.Log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Propertiesconfiguration 
{
	static Logger logger = Logger.getLogger(Propertiesconfiguration.class);
	public static void main(String[] args) 
	{
		PropertyConfigurator.configure("Log4j.properties");
		logger.debug("Depuging message dispalyed!!!");
	    logger.info("Basic information displayed!!!");
	    logger.warn("Warring Pop-up");
	    logger.error("Error will raise");
	    logger.fatal("The fatal message is displayed!!!");
	}

}
