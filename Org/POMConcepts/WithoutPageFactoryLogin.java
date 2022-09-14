package Org.POMConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WithoutPageFactoryLogin  // With out page factory annotation  --> they only accept "id" , "Name"
{
	public static WebElement username;
	public static WebElement password;
	public static WebElement submit; 
	
	@Test
	public void loginUrl()
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		PageFactory.initElements(driver, WithoutPageFactoryLogin.class);

		username.sendKeys("Admin");
		password.sendKeys("admin123");
		submit.click();
	}

}
