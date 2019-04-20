package Framework.StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cucumber.api.java.After;

public class MultiBrowser {

	WebDriver driver = null;
	
	@Parameters("browsername")
	@BeforeTest
		public void setup( String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
						System.setProperty("webdriver.chrome.driver",
					"C:/Automation/Automation Requirements/Drivers/Chrome Driver/chromedriver.exe");
						driver = new ChromeDriver();
				}
		
		 else if ((browsername.equalsIgnoreCase("firefox")))
				{
				System.setProperty("webdriver.gecko.driver",
					  "C:/Automation/Automation Requirements/Drivers/Geckodriver/geckodriver.exe");
				driver = new FirefoxDriver();
				
				}
		
		}
	@Test
	public void test() throws InterruptedException
	{
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
	}
	
	@After
	public void close() {
		
		driver.close();
	}
}
