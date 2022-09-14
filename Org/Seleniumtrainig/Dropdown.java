package Org.Seleniumtrainig;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		   
		driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/Dropdown.html");
	    
	    WebElement Dropbox1= driver.findElement(By.xpath("//select[@id='dropdown1']"));
	    Select select = new Select(Dropbox1);
	    
	    select.selectByIndex(3);
	    select.selectByValue("2"); 
	    select.selectByVisibleText("Loadrunner");
	    
	    List<WebElement> listofoption =  select.getOptions();
	    int size = listofoption.size();
	    System.out.println(" Number of element"+ size);  
	    
	    WebElement Multitext = driver.findElement(By.xpath("//div[5][@class='example']//following::select//following::select"));
	    Select multiselect = new Select(Multitext);
	    multiselect.selectByIndex(1);
	    multiselect.selectByIndex(2);
	    multiselect.selectByIndex(3);  
		}

}
