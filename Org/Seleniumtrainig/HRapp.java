package Org.Seleniumtrainig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRapp 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		   
		//driver.manage().window().maximize();
	    
	      driver.navigate().to("http://ec2-3-239-245-73.compute-1.amazonaws.com/hrqa/#/auth/login");
		  String title = driver.getTitle();
		  System.out.println(title);
	}

}
