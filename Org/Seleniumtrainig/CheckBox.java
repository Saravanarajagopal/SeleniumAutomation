package Org.Seleniumtrainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/checkbox.html");
	    
	    WebElement check1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
	    Thread.sleep(2000);
	    check1.click();
	    
	    WebElement check2 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/input[1]"));
	    Boolean ch = check2.isSelected();
	    System.out.println(ch);
	    
	    WebElement deselectcheck1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
	    if(deselectcheck1.isSelected())
	    {
	    	deselectcheck1.click();
	    	Boolean status1 = deselectcheck1.isSelected();
	    	System.out.println(status1);
	    }
	    
	    WebElement deselectcheck2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
	    if(deselectcheck2.isSelected())
	    {
	    	deselectcheck2.click();
	    	Boolean status2 = deselectcheck2.isSelected();
		    System.out.println(status2);
	    }
	    
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]")).click();
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]")).click();
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]")).click();
	}
}
