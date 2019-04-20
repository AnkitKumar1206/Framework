package Framework.StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingUsingTestNG2 {

	WebDriver driver =null;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Automation/Automation Requirements/Drivers/Chrome Driver/chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	
	@Test
	public void flipkart() throws InterruptedException
	{
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.className("_2zrpKA")).sendKeys("9803323789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567890");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_1avdGP']//button[@type='submit']")).click();
		}
	
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	       				
	}
}
