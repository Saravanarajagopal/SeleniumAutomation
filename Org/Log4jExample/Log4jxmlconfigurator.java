package Org.Log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jxmlconfigurator 
{
	static Logger logger = Logger.getLogger("Log4jxmlconfigurator");
	public static void main(String[] args) 
	{
		DOMConfigurator.configure("l og4j.xml");
		logger.debug("Depuging message dispalyed!!!");
	    logger.info("Basic information displayed!!!");
	    logger.warn("Warring Pop-up");
	    logger.error("Error will raise");
	    logger.fatal("The fatal message is displayed!!!");
	}
}
