package Org.Seleniumtrainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_gmail 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/");
		
		driver.findElement(By.xpath("/html/body/header/div/ol[2]/li[3]/a")).click();
		//driver.navigate().to("https://www.google.co.in/");
		
		//driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
		//driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("kumar999@gmail.com");
		
		//driver.findElement(By.xpath("//*[@id=\'identifierNext\']")).click();
		//driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("995555885");
		
		
	}

}
