package Org.POMConcepts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PagefactoryLoginpage 
{
    @FindBy(how=How.NAME, using="username")
	public static WebElement username;
   
    @FindBy(name="password") 
    public static WebElement password;
    
	/*
	 * public static void movetoframe(WebDriver driver) {
	 * driver.switchTo().frame(0); }
	 */
    
    @FindBy(xpath = "//*[@id=\'recaptcha-anchor\']/div[1]")
    public static WebElement capcha;
    
	/*
	 * public static void backtobrowser(WebDriver driver) {
	 * driver.switchTo().defaultContent(); }
	 */
    
    @FindBy(id="login")
    public static WebElement loginbutton;
}
