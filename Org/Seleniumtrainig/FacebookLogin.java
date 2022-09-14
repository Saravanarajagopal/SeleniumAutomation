package Org.Seleniumtrainig;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// login URL
		driver.navigate().to("https://www.facebook.com/login/");

		// New Account create
		WebElement Newsignup = driver.findElement(By.xpath("//*[@id=\"login_link\"]/a[2]"));
		Newsignup.click();

		// Fill the Form
		WebElement Firstname = driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Nedumaaran");
		String name = Firstname.getAttribute("value");
		System.out.println("First Name: " + name);

		WebElement Surname = driver.findElement(By.name("lastname"));
		Surname.sendKeys("Rajangam");
		String sname = Surname.getAttribute("value");
		System.out.println("Surname: " + sname);

		WebElement Number = driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__']"));
		Number.sendKeys("7010987208");
		String no = Number.getAttribute("value");
		System.out.println("Mobile Number: " + no);

		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("over@123");
		String pswd = Password.getAttribute("value");
		System.out.println("Password: " + pswd);

		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select select = new Select(Day);
		select.selectByValue("24");
		List<WebElement> selectoption = select.getAllSelectedOptions();
		for (WebElement iselect : selectoption) {
			System.out.println("Day: " + iselect.getText());
		}

		WebElement Month = driver.findElement(By.id("month"));
		Select s = new Select(Month);
		s.selectByVisibleText("Dec");
		WebElement monthvalue = s.getFirstSelectedOption();
		System.out.println("Month: " + monthvalue.getText());

		WebElement Year = driver.findElement(By.id("year"));
		Select s1 = new Select(Year);
		s1.selectByValue("1991");
		WebElement yearvalue = s1.getFirstSelectedOption();
		System.out.println("Year: " + yearvalue.getText());

		WebElement Radiobutton = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]"));
		Radiobutton.click();
		Boolean value = Radiobutton.isEnabled();
		System.out.println(value);

		WebElement signup = driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']"));
		signup.click();
		String sign = signup.getText();
		System.out.println("Successfully " + sign);
         
		
		
		
		driver.quit();
	}
}
