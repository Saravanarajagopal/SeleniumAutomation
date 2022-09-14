package Org.Seleniumtrainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton 
{
	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/radio.html");
	    
	   WebElement Unchecked = driver.findElement(By.xpath("//input[@name='news' and @value='0']"));
	   WebElement Checked = driver.findElement(By.xpath("//input[@name='news' and @value='1']"));
	   Boolean status1 = Unchecked.isSelected();
	   Boolean status2 = Checked.isSelected();
	   System.out.println(status1);
	   System.out.println(status2);
	   
	   WebElement ClickRadio = driver.findElement(By.xpath("//input[@name='age' and @value='2']"));
	   Thread.sleep(3000);
	   ClickRadio.click();
	    
	  }

}
