package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoLoginStepDefi  extends DriverInit{
	

	@Given("user on login page of the application")
	public void user_on_login_page_of_the_application() {
		driver.get("https://www.saucedemo.com/v1/index.html");
	}

	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String string, String string2) {
		driver.findElement(By.id("user-name")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
       driver.findElement(By.cssSelector("input#login-button")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		 boolean condition= false;
           List<WebElement> app_logo=driver.findElements(By.xpath("//div[@class='app_logo']"));
           if(app_logo.size()>=1) {//false
        	   condition=true;
           }
           Assert.assertTrue(condition);
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
           driver.close();
	}

}
