package Org.Seleniumtrainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examselenium 
{

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	 
	 WebDriver d = new ChromeDriver();
	 d.get("https://www.facebook.com/");
	 
	 WebElement username = d.findElement(By.id("email"));
	 username.sendKeys("Kumar990");
	 System.out.println("Username: " + username.getTagName());
	 
	 d.findElement(By.xpath("//input[@name='pass']")).sendKeys("dfhfoidf");
	 d.findElement(By.xpath("//button[@name='login']")).click();
	 

	}

}
