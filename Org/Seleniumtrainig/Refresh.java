package Org.Seleniumtrainig;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh 
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q' and @type='text']"));
		search.sendKeys("Selenium");
		
		//1.Refresh option
		driver.navigate().refresh();
		
		//2.refresh option
		driver.get(driver.getCurrentUrl());
		
		//3.refresh option - Javascript executor
		JavascriptExecutor executor = (JavascriptExecutor) driver; 
		executor.executeScript("location.reload()"); //history.go(0);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		
	}

}
