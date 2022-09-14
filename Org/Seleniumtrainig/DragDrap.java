package Org.Seleniumtrainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrap 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com");
		
		WebElement View = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a/i[1]"));
		View.click();
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"menuform:m_drag\"]/a"));
		drag.click();
		
		WebElement From = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]/p"));
		Thread.sleep(2000);
		WebElement To = driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]/p"));
		
		Actions action = new Actions(driver);
		//action.clickAndHold(From).moveToElement(To).release(To).build().perform();
		action.dragAndDrop(From, To).build().perform();
	}

}
