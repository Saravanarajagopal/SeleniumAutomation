package Org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SampleBase extends LibGlobal
{
	public static void main(String[] args) 
	{
		WebDriver d = launchBrowser();
		LoadURL("https://www.facebook.com/");
		maxmize();
		pagetitle();
		pageUrl();
		
		WebElement username = d.findElement(By.name("email"));
		Fill(username,"Thalasara12");
		WebElement password = d.findElement(By.name("pass"));
		Fill(password, "9944445928");
		
		WebElement clk = d.findElement(By.name("login"));
		buttonclick(clk);
		
		d.quit();
	}

}
