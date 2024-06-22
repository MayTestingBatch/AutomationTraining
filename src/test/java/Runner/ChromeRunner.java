package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "C:\\Users\\ADMIN\\18th Batch 06th May 2024\\Framework\\CucumberPractice\\src\\test\\java\\features",
		dryRun = false,// it will provide snippet of code of unimplemented code
		glue = {"StepDefination"},
		snippets = SnippetType.UNDERSCORE,
		tags = "@homepage", // In bdd by using tags we can control execution of scenarios
		plugin = {"pretty", "html:CucumberReport", "rerun:target/failedrerun.txt"}
		)

public class ChromeRunner extends AbstractTestNGCucumberTests{


}
