package Org.Seleniumtrainig;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com");
		
		 WebElement c = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a"));
		 c.click();
		 WebElement Window = driver.findElement(By.xpath("//li[@id='menuform:m_window']"));
		 Window.click();
		
		 String oldwindow = driver.getWindowHandle();  //Identified the First Window
		 System.out.println("Oldwindow:"+oldwindow); 
		 
		 WebElement open = driver.findElement(By.xpath("//*[@id='j_idt88:new']/span"));
		 open.click();
		 Set<String> handles = driver.getWindowHandles();   // List out the all windows and store the set string
		
		 for (String newwindow : handles) 
		 {
			driver.switchTo().window(newwindow);   //help to itrate the new window
		 }
		  
		  WebElement second = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		  second.click();
          WebElement button = driver.findElement(By.xpath("//*[@id=\"menuform:m_button\"]/a"));
          button.click();
          WebElement click = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]/span"));
          click.click();
          driver.close();  
          driver.switchTo().window(oldwindow);
           
          WebElement openmulti = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']/span[1]"));
          openmulti.click();
          int noofwindow = driver.getWindowHandles().size();
          System.out.println("Number of windows opened :"+noofwindow);
          
          WebElement closewindow = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']//span[2]"));
          closewindow.click();
          Set<String> Newwindows = driver.getWindowHandles();
          for (String allwindows : Newwindows) 
          {
			if(!allwindows.equals(oldwindow))
			{
				driver.switchTo().window(allwindows);
				driver.close();
			}
		    }
	}

}
