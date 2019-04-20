package Framework.StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DesiredCapabilitiesWithTestNG {

	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	 WebDriver driver = null;
	 
	@BeforeTest
	public void setup() {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreProtecteModeSettings", true);

		 htmlreporter = new ExtentHtmlReporter("Extent Report.html");
	     extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		System.setProperty("webdriver.ie.driver",
				"C:/Automation/Automation Requirements/Drivers/IE Driver/IEDriverServer.exe");
		this.driver = new InternetExplorerDriver();
	}
	
	@Test
	public void flipkart() throws InterruptedException
	{
		ExtentTest test = extent.createTest("Flipkart Test");	
	
		test.log(Status.INFO, "Test case Started");
		driver.get("https://www.flipkart.com");
		test.pass("Flipkart is open");
		Thread.sleep(3000); 
		
		driver.findElement(By.className("_2zrpKA")).sendKeys("9803323789");
		test.pass("Username is entered");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567890");
		test.pass("Password is entered");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='_1avdGP']//button[@type='submit']")).click();
		test.pass("Login button is pressed");
		Thread.sleep(2000);
		}
	
	@AfterTest
	public void close() throws InterruptedException
	{
		ExtentTest test = extent.createTest("Flipkart Test");
	
		Thread.sleep(3000);
		driver.close();
		test.pass("Browser is closed");
		test.info("Test Completed");
		extent.flush();
	}
}
