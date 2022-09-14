package Org.Seleniumtrainig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{

	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   driver.get("https://www.selenium.dev/");
	   System.out.println(driver.getTitle());

	}

}
