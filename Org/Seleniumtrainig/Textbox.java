package Org.Seleniumtrainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox 
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
			
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   driver.get("http://www.leafground.com/");
		   System.out.println(driver.getTitle());
		   
		   WebElement button = driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']"));
		   button.click();
		   
		   WebElement emailBox = driver.findElement(By.xpath("//input[@id='email']"));
		   emailBox.sendKeys("kumarsara@test.com");
		   
		  //String value = driver.findElement(By.xpath("//input[@value='Append ']")).getText();
		  //System.out.println(value);
		   
		  WebElement AppendBox = driver.findElement(By.xpath("//input[@value='Append ']"));
		  AppendBox.sendKeys("- Check");
	      System.out.println(AppendBox.getTagName());
	      
	      WebElement TextEnter = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
	      String value = TextEnter.getAttribute("Value");
	      System.out.println(value);
	       
	      WebElement ClearText = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
	      ClearText.clear();
	      //ClearText.sendKeys("New Text");
	      String text = ClearText.getAttribute("Text");
	      System.out.println(text);
	      
	      WebElement disableBox = driver.findElement(By.xpath("//input[@disabled]"));
	      boolean enable = disableBox.isEnabled();
	      System.out.println(enable); 
	      
	}

}
