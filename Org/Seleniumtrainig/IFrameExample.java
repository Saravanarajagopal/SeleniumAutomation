package Org.Seleniumtrainig;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IFrameExample 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/");
		
		WebElement browser = driver.findElement(By.xpath("//*[@id=\'menuform:j_idt39\']/a/i[1]"));
		browser.click();
		
		WebElement ClickFrame = driver.findElement(By.xpath("//*[@id=\"menuform:m_frame\"]/a"));
		ClickFrame.click();
		
		driver.switchTo().frame(0);
		WebElement click1 = driver.findElement(By.xpath("//button[@id='Click']"));
		click1.click();
		String showtext = click1.getText();
		System.out.println("Visable text are Frame1 : "+ showtext);
		driver.switchTo().defaultContent();
		
		//again move to frame 2
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement click2 = driver.findElement(By.xpath("//*[@id='Click' and @onclick='change()']")); 
		click2.click();
		String showtext2 = click2.getText();
		System.out.println("Visable text are Frame2 : "+showtext2);
		driver.switchTo().defaultContent();
		
		//Frame 3
		driver.switchTo().frame(1);
		WebElement click3 = driver.findElement(By.id("Click"));
		click3.click();
		String showthird = click3.getText();
		System.out.println("Visable text are Frame3: "+ showthird);
		driver.switchTo().defaultContent();
		
		List<WebElement> TotalFrame = driver.findElements(By.tagName("iframe"));
		int Total = TotalFrame.size();
		System.out.println("Total number of Frames: "+ Total);
		
		driver.close();
	}
}
