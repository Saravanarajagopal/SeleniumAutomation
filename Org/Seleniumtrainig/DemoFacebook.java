package Org.Seleniumtrainig;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class DemoFacebook 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		   
		driver.manage().window().maximize();
//		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.google.co.in/");
		
		WebElement google = driver.findElement(By.name("q"));
		google.sendKeys("Facebook"+ Keys.ENTER);
		
		WebElement url = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/table/tbody/tr[1]/td/div/h3/a"));
		String s = url.getText();
		System.out.println(s);
		url.click();
		
		WebElement new_user = driver.findElement(By.xpath("//a[@class='_97w5']"));
		String s1 = new_user.getText();
		System.out.println(s1);
		new_user.click();
		
		WebElement Fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		Fname.sendKeys("Ifran");
		String name = Fname.getAttribute("name");
		System.out.println(name);
		
		WebElement Surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Surname.sendKeys("Ramasamy");
		String Getattribute = Surname.getAttribute("aria-label");
		System.out.println(Getattribute);
		
		WebElement mobileno = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobileno.sendKeys("9442048903");
		String mob = mobileno.getAttribute("aria-label");
		System.out.println(mob);
		
		WebElement Pwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Pwd.sendKeys("killbill@1222");
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']/option[24]"));
		//Select select = new Select(Day);
		//select.getAllSelectedOptions();
		Day.click();
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']/option[4]"));
		Month.click();
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']/option[32]"));
		Year.click();
		
		WebElement gen = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input"));
		gen.click();
		
		WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		String su = submit.getText();
		System.out.println(su);
		submit.click();
	}

}
