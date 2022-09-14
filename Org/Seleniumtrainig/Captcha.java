package Org.Seleniumtrainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Captcha {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.org/login");
		driver.findElement(By.name("username")).sendKeys("kumar@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("Sara@!1224");
		
		driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//*[@id=\'recaptcha-anchor\']/div[1]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-sm btn-block']")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"stateselect\"]"));

	}

}
