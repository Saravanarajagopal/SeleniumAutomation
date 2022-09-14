package Org.Seleniumtrainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSystemSet {

	public static void main(String[] args) 
	{
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q' and @type='text']"));
		search.sendKeys("Selenium");

	}

}
