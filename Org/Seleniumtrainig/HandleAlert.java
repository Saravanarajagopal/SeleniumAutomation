package Org.Seleniumtrainig;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Pop-Up Concept 
// Alert pop-up, confirm alert pop-up, Prompt pop-up, calendar pop-up,...etc
//Alert is the interfaces

public class HandleAlert 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		   
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
	    
	    Thread.sleep(3000);
	    WebElement Alertbox = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
	    Alertbox.click();
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    
	    
	    Thread.sleep(3000);
	    WebElement Confirmbox = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
        Confirmbox.click();
        Alert confirmalert = driver.switchTo().alert();
        Thread.sleep(2000);
        confirmalert.dismiss();
        
        Thread.sleep(3000);
        WebElement Promptbox = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
        Promptbox.click();
        Alert promptalert = driver.switchTo().alert();
        Thread.sleep(2000);
        promptalert.sendKeys("Tamilnadu");
        Thread.sleep(2000);
        promptalert.accept();
        
	}

}
