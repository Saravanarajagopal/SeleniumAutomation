package Org.POMConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Updaterprofile 
{
	public static WebElement updateprofile(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[@class='btn btn-success btn-sm btn-block']"));
	}

	public static WebElement Address2(WebDriver driver) throws InterruptedException 
	{ 
		Thread.sleep(2000);
		return driver.findElement(By.name("address2"));
	}

	public static WebElement companyname(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.findElement(By.name("companyname"));
	}
	
	public static WebElement State(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement so = driver.findElement(By.xpath("//*[@id=\'stateselect\']"));
		Select s = new Select(so);
		s.selectByVisibleText("Tamil Nadu");
		System.out.println(s);
		return so;
		
	}  
}
