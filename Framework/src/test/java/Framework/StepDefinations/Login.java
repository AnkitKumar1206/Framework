package Framework.StepDefinations;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login {
	
	WebDriver driver =null;
	
	//LoginElements object = new LoginElements(driver);
	
	@Before
	public   void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Automation/Automation Requirements/Drivers/Chrome Driver/chromedriver.exe");
		this.driver = new ChromeDriver();
 	
	                   }

	/*
	 * @Before public void setup() {
	 * 
	 * FirefoxOptions firefoxoptions = new FirefoxOptions();
	 * firefoxoptions.setCapability("marionette", true);
	 * 
	 * System.setProperty("webdriver.gecko.driver",
	 * "C:/Automation/Automation Requirements/Drivers/Geckodriver/geckodriver.exe");
	 * this.driver = new FirefoxDriver(firefoxoptions);
	 * 
	 * }
	 */
	@After
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	       											}

	@Given("^User navigates to the Flipkart page$")
	public void user_navigates_to_the_Flipkart_page() throws Exception {
		//object.url("https://www.flipkart.com");
	driver.get("https://www.flipkart.com");
				this.driver.manage().window().maximize();

	}

	/*
	 * @And("^User click on Login button$") public void user_click_on_Login_button()
	 * throws Exception { Thread.sleep(3000);
	 * driver.findElement(By.className("dHGf8H")).click(); }
	 */

	@And("^user enters correct username$")
	public void user_enters_correct_username() throws Exception {
 		Thread.sleep(3000);
		driver.findElement(By.className("_2zrpKA")).sendKeys("9803323789");
 		//object.entering_username("9803323789");
	}

	@And("^user enters correct password$")
	public void user_enters_correct_password() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567890");
		//object.entering_password("1234567890");
	}

	@When("^user clicks on Login button to enter the flipkart$")
	public void user_clicks_on_Login_button_to_enter_the_flipkart() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_1avdGP']//button[@type='submit']")).click();
		//object.click_loginbutton();
		
	}

	@Then("^user should be navigate to the flipkart home page$")
	public void user_should_be_navigate_to_the_flipkart_home_page() throws Exception {
		Thread.sleep(2000);
		WebElement namebutton = driver.findElement(By.xpath("//div[contains(text(),'Ankit')]"));
		Assert.assertEquals(true, namebutton.isDisplayed());
	}
}
