package Framework.StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Framework.WebELements.LoginElements;

public class LoginPOM {

	public static void main(String[] args) throws InterruptedException {
		FLipkartTest();
	}

	public static void FLipkartTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Automation/Automation Requirements/Drivers/Chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		LoginElements object = new LoginElements(driver);
				driver.get("https://www.flipkart.com");
					
						object.entering_username("9803323789");
						object.entering_password("1234567890");
						
						object.click_loginbutton();
						
						Thread.sleep(5000);
						driver.close();
						
	}
}
