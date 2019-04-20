package Framework.RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = { "src/test/java/Framework/FeatureFiles/" }, 
		glue = { "Framework/StepDefinations/" }, 
		monochrome = true,
			plugin = {
				"pretty",  
				"html:target/Cucumber",
				"json:target/Cucumber.json",
		      //  " com.cucumber.listener.ExtentCucumberFormatter:target/Report.html"
		}
		         )

public class RunnerClass {

}
