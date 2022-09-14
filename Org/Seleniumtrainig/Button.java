package Org.Seleniumtrainig;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0092\\WS\\Selenium\\TestTraining\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		   
		driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/Button.html");
	    
	    //1.Position of the Button
	    WebElement GetPositionButton = driver.findElement(By.id("position"));
	    Point pointXY = GetPositionButton.getLocation();
	    int xValue = pointXY.getX();
	    int yValue = pointXY.getY();
	    System.out.println("X Value is :"+ xValue + "Y Value is :"+ yValue);
	    
	    // 2.BG Color of the button
	    WebElement ButtonColor = driver.findElement(By.xpath("//button[@id='color']"));
	    String BGcolor = ButtonColor.getCssValue("background-color");
	    System.out.println(BGcolor);
	    
	    // 3. Find the button size
	    WebElement ButtonSize = driver.findElement(By.xpath("//button[@id='size']"));
	   int hight = ButtonSize.getSize().getHeight();
	   int width = ButtonSize.getSize().getWidth();
	   System.out.println(hight);
	   System.out.println(width);
	   
	   WebElement clickhome = driver.findElement(By.xpath("//button[@id='home']"));
	   String text = clickhome.getText();
	   System.out.println(text);
	   clickhome.click();   
	}

}
