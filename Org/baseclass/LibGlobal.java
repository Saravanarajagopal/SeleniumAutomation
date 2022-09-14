package Org.baseclass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LibGlobal 
{
	public static WebDriver driver;    //Global Variable
	
	public static WebDriver launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    return driver;
		
	}
	
	public static void LoadURL(String url)
	{
		driver.get(url);
	}
	
	public static void maxmize()
	{
		driver.manage().window().maximize();
	}
	
	public static void Fill(WebElement element, String text)
	{
		element.sendKeys(text);
	}
	
	public static void buttonclick(WebElement element)
	{
		element.click();
	}
	
	public static void pagetitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void pageUrl()
	{
		String curtUrl = driver.getCurrentUrl();
		System.out.println(curtUrl);
	}
	
	public static void performdragdrop(WebElement from, WebElement to)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}
}
