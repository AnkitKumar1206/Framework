package Framework.WebELements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElements {

	WebDriver driver= null;
	
	By Username = By.className("_2zrpKA");
	By Password = By.xpath("//input[@type='password']");
	By Login_Button =By.xpath("//div[@class='_1avdGP']//button[@type='submit']");
	
	
	public LoginElements(WebDriver driver) {
		this.driver = driver;
	}
	
	/*public void url(String text) {
		driver.get("text");
	}*/
	
	public void entering_username( String text) {
		
		driver.findElement(Username).sendKeys(text);
	}
	
	public void entering_password( String text) {
		
		driver.findElement(Password).sendKeys(text);
	}
	
	public void click_loginbutton() {
		
		driver.findElement(Login_Button).click();
	}
}
