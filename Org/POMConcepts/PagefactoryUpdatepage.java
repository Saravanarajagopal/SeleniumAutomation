package Org.POMConcepts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PagefactoryUpdatepage 
{
	@FindBy(xpath = "//a[@class='btn btn-success btn-sm btn-block']")
	public static WebElement updateprofile;
	
	@FindBy(name="address2")
	public static WebElement Address2;
	
	@FindBy(name="companyname")
	public static WebElement companyname;
	
	@FindBy(xpath = "//*[@id=\'stateselect\']")
	public static WebElement State;
	
}
