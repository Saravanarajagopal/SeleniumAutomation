package Org.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationEx {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Redirect the URL
		driver.navigate().to("http://zero.webappsecurity.com");
		
		// Validate URL Title
		String title = driver.getTitle();
		if(title.equals("Zero - Personal Banking - Loans - Credit Cards"))
		{
			System.out.println("Title is correct: "+ title);
		}
		else
		{
			System.out.println("Failed: Wrong title displayed");
		}
        
		WebElement Signin = driver.findElement(By.className("icon-signin"));
		Signin.click();
		
		//Login Page
		WebElement Username = driver.findElement(By.xpath("//input[@type='text']"));
		Username.sendKeys("username");
		Username.getAttribute("name");
		
		System.out.println(Username.getAccessibleName());
		String name = Username.getAccessibleName();
		if(name.equals("Login"))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Failed");
		}
		
		WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
		password.sendKeys("password");
		System.out.println(password.getAccessibleName());
		
		WebElement Loginbutton = driver.findElement(By.xpath("//input[@type='submit' and @name='submit']"));
		Loginbutton.click();
		System.out.println("Successfully Login!!!");
		
		//Navigate method
		driver.navigate().back();
		//Thread.sleep(3000);
		
		WebElement morebutton = driver.findElement(By.id("online-banking"));
		morebutton.click();
		String more = morebutton.getText();
		System.out.println(more);	

	}

}
