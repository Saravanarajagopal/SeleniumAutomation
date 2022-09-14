package Org.Seleniumtrainig;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.hdfcbank.com/");
		//driver.manage().window().maximize();

		String homepage = driver.getWindowHandle();
		System.out.println(homepage);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();

		WebElement login = driver.findElement
				(By.xpath("//button[@type='button' and @class='btn btn-primary login-btn hide-in-mobileApp ng-scope']"));
		login.click();
		String text = login.getText();
		System.out.println(text+ "Successfully!!!");

		Set<String> Window = driver.getWindowHandles();
		System.out.println(Window);
		Iterator<String> iterator = Window.iterator();
		String Currentwindow;
		while(iterator.hasNext())
		{
			Currentwindow = iterator.next().toString();
			System.out.println(Currentwindow);
			if(!Currentwindow.equals(homepage)) 
			{
				driver.switchTo().window(Currentwindow);
				//driver.close();
			}
		}

		WebElement log = driver.findElement (By.xpath(
				"//*[@id=\'main\']/div[2]/div[11]/div[3]/div/div/div/div/div[2]/div[2]/div[3]/div/div/div[1]/div/a[1]")); 
		log.click(); 
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/a")).click();

	}
}
