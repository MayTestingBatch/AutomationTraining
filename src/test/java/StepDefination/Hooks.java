package StepDefination;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks  extends DriverInit{
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@After
	public void tearDown(cucumber.api.Scenario scenario) throws IOException {
		if(scenario.isFailed()) { //true
		    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    String projectlocation= System.getProperty("user.dir");
		    FileUtils.copyFile(src, new File(projectlocation+"//screenshot.png"));
		}
		driver.close();
	}

}
