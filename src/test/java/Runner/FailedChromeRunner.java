package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "@target/failedrerun.txt",
		dryRun = false,
		glue={"StepDefination"}
		//tags = "@homepage",
	    //plugin = {"pretty", "html.CucumberReport"}
		)

public class FailedChromeRunner extends AbstractTestNGCucumberTests {
	
	

}
