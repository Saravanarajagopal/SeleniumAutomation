package Org.Seleniumtrainig;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activplant {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Redirect the URL
		driver.navigate().to("http://172.28.218.166/activplant_new/default.aspx");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Administrator");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Administrator");
		driver.findElement(By.className("logonButton")).click();
		
		WebElement Config = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/div/div[2]/div[1]"));
		Config.click();
		
		WebElement Plantmanag = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/div/div[2]/div[2]/span[3]/span/img"));
		Plantmanag.click();
		
		driver.switchTo().frame(1);
		
		
	}

}
