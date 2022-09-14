package Org.POMConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        Loginpageobjects.Loginurl(driver);
        Loginpageobjects.username(driver).sendKeys("kumar@phptravels.com");
        Loginpageobjects.password(driver).sendKeys("Sara@!1224");
        Loginpageobjects.capcha(driver).click();
        Loginpageobjects.backwindow(driver);
        Loginpageobjects.loginbutton(driver).click();
        
        Updaterprofile.updateprofile(driver).click();
        Updaterprofile.Address2(driver).sendKeys("VIP Colony");
        Updaterprofile.companyname(driver).sendKeys("World New");
        Updaterprofile.State(driver);
        

	}

}
