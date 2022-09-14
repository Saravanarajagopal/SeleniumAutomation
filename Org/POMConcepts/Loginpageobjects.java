package Org.POMConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobjects 
{
	
    public static void Loginurl(WebDriver driver)
    {
    	driver.get("https://phptravels.org/login");
    	System.out.println("Succeessfully login "+ driver.getTitle());
    }
    public static WebElement username(WebDriver driver)
    {
    	return driver.findElement(By.name("username"));
    }
    public static WebElement password(WebDriver driver)
    {
    	return driver.findElement(By.name("password"));
    }
    public static WebElement capcha(WebDriver driver)  
    {
        driver.switchTo().frame(0);
       return driver.findElement(By.xpath("//*[@id=\'recaptcha-anchor\']/div[1]"));	
    }
    
    public static void backwindow(WebDriver driver) throws InterruptedException
    {
    	driver.switchTo().defaultContent();
    	Thread.sleep(2000);
    }
    
    public static WebElement loginbutton(WebDriver driver)
    {
    	return driver.findElement(By.id("login"));
    }
}
