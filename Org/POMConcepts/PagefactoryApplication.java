package Org.POMConcepts;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PagefactoryApplication {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://phptravels.org/login");

		PageFactory.initElements(driver,PagefactoryLoginpage.class);

		PagefactoryLoginpage.username.sendKeys("kumar@phptravels.com");
		PagefactoryLoginpage.password.sendKeys("Sara@!1224");
		driver.switchTo().frame(0);
		PagefactoryLoginpage.capcha.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent(); 
		PagefactoryLoginpage.loginbutton.click();

		PageFactory.initElements(driver,PagefactoryUpdatepage.class);
		PagefactoryUpdatepage.updateprofile.click();
		PagefactoryUpdatepage.Address2.sendKeys("VIP Colony");
		PagefactoryUpdatepage.companyname.sendKeys("VIP");
		PagefactoryUpdatepage.State.click();
	}

}
