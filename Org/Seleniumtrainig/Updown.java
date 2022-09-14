package Org.Seleniumtrainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		   
		driver.manage().window().maximize();
	    driver.get("https://www.leafground.com/dashboard.xhtml");
	    driver.findElement(By.xpath("//*[@id=\'menuform:j_idt41\']/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"menuform:m_crud\"]")).click();
	    driver.findElement(By.xpath
	    		("/html/body/div[1]/div[5]/div[2]/form/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[9]/button[1]/span[1]")).click();
	    Thread.sleep(2000);
	    WebElement c =driver.findElement(By.xpath
	    		("/html/body/div[1]/div[5]/div[2]/form/div/div/div/div[3]/div[2]/div/div/div[1]/input"));
	    c.clear();
	    c.sendKeys("Watch");
	    
	    WebElement d= driver.findElement(By.xpath("//*[@id='form:quantity']/a[2]/span/span"));
	    // d.clear();
	    //d.sendKeys("10");
	    d.click();
	    
	    
	}

}
