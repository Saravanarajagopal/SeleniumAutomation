package Org.Seleniumtrainig;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcard 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();  
		  //driver.manage().window().maximize();
		  driver.navigate().to("https://www.flipkart.com/account/login");
		  //Thread.sleep(2000);
		  WebElement search =  driver.findElement(By.xpath("//input[@name='q']"));
		  search.sendKeys("Mobile", Keys.ENTER);
		  
		  WebElement mob = driver.findElement
		     (By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
		  mob.click();
		  
		  Set<String> window = driver.getWindowHandles();
		  //System.out.println(window);
		  for(String newwindow : window)
		  {
			  driver.switchTo().window(newwindow);
		  }
		  
		  driver.findElement(By.xpath(
					  "//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
	      driver.close();
	}

}
