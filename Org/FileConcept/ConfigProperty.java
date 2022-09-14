package Org.FileConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigProperty 
{
		public static void main(String[] args) throws IOException 
		{
			WebDriver driver =null;
			FileInputStream file = new FileInputStream("Config.properties");
			Properties properties = new Properties();
			properties.load(file); // File loaded and ready to read.
			String browser = properties.getProperty("browser");
			String driverlocation = properties.getProperty("Driverlocation");
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", driverlocation);
			    driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", driverlocation);
			    driver = new ChromeDriver();
			}
			   
			//driver.manage().window().maximize();
            //driver.get("https://www.google.co.in/");
			driver.navigate().to("https://www.google.co.in/");
	}

}
