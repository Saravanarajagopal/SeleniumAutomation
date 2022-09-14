package Org.Seleniumtrainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbuzaar
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
	
		 driver.get("https://www.policybazaar.com/general-insurance/");
         driver.findElement(By.xpath("//*[@id=\'health_bu\']/div[1]/div[3]/input")).sendKeys("Tester");
         driver.findElement(By.id("name5")).sendKeys("9944445828");
         WebElement cl = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[5]/button[1]"));
         cl.click();
       
         
	}

}
