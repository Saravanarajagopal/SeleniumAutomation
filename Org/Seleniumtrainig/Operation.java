package Org.Seleniumtrainig;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Operation 
{
	public static void main(String[] args) throws IOException, AWTException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//Explicit Timeout
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		username.sendKeys("Admin"); /* WebElement username = driver.findElement(By.name("username")); */

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
	
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		
		//ScreenShots
		TakesScreenshot Screenshot = (TakesScreenshot) driver;
		File sourcefile = Screenshot.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("C:\\Users\\GIS0092\\Documents\\Software\\new\\Screenshot.png");
		FileHandler.copy(sourcefile, destinationfile);
		
		Robot robot= new Robot();
		Dimension Screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(Screensize);
		BufferedImage source = robot.createScreenCapture(rectangle);
		File destinationsfile = new File("C:\\Users\\GIS0092\\Documents\\Software\\new\\RobotScreenshot.png");
		ImageIO.write(source, "png", destinationsfile);
		
		
	}

}
