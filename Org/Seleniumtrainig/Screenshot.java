package Org.Seleniumtrainig;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Dropdown.html");
	    TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File Sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
	    File Destinationfile = new File("D:\\Sample\sample.png");
	     //FileHandler is the unique default method in selenium other wise we need to import FileUtil external jar file.
	    FileHandler.copy(Sourcefile, Destinationfile); 
	}

}
