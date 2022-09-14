package Org.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.Assert;

public class LoginValidation
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		
		// Redirect the URL
		driver.navigate().to("http://zero.webappsecurity.com");
		
		// Validate URL Title
		String title = driver.getTitle();
		if(title.equals("Zero - Personal Banking - Loans - Credit Cards"))
		{
			System.out.println("Pass: Title is correct"+ title);
		}
		else
		{
			System.out.println("Failed: Wrong title displayed");
		}
		
		WebElement Signin = driver.findElement(By.className("icon-signin"));
		Signin.click();
		
		//Login
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
		
		WebElement Loginbutton = driver.findElement(By.xpath("//input[@type='submit' and @name='submit']"));
		Loginbutton.click();
		
		/*
		driver.navigate().back();
		
		WebElement morebutton = driver.findElement(By.id("online-banking"));
		morebutton.click();
		
		WebElement acc_sum = driver.findElement(By.xpath("//span[@id='account_summary_link']"));
		acc_sum.click();
		
		String expected_title = "Zero - Account Summary";
		String actual_title = driver.getTitle();
		
		//Assert.assertEquals(actual_title, expected_title);
		
		if(expected_title.equals(actual_title))
		{
			System.out.println("validation successfully");
		}
		else
		{
			System.out.println("Failed validation");
		} 
		
		WebElement savings = driver.findElement
				(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/a"));
		savings.click();
	      //Thread.sleep(1000);
		  WebElement save = driver.findElement(By.xpath("//select[@id='aa_accountId']"));
		  Select saveit = new Select(save);
		  saveit.selectByVisibleText("Loan");
		  */
		  driver.close();
		 
		}
}
