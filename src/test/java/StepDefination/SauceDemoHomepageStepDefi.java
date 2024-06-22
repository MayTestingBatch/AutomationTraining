package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Then;

public class SauceDemoHomepageStepDefi extends DriverInit {
	
	@Then("user select {string} option from sortdropdown")
	public void user_select_option_from_sortdropdown(String string) {
	     WebElement sortoptios=driver.findElement(By.className("product_sort_container"));
	     Select option= new Select(sortoptios);
	     option.selectByVisibleText(string);
	}

	@Then("user select product from list")
	public void user_select_product_from_list() {
		boolean condtion=false;
	    driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']/../../following::div[1]//button")).click();
	    String count=driver.findElement(By.xpath("//div[@id='shopping_cart_container']//span")).getText();
	    if(count.equals("1")) {
	    	condtion= true;
	    }
	    Assert.assertTrue(condtion);
	}
	
	@Then("user click on dashboard menu")
	public void user_click_on_dashboard_menu() {
	    driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
	}

	@Then("user click on About option from menu")
	public void user_click_on_About_option_from_menu() {
	    driver.findElement(By.xpath("//a[text()='About']")).click();
	    String exppageurl="https://saucelabs./";
	    String actpageurl=driver.getCurrentUrl();
	    Assert.assertEquals(actpageurl, exppageurl);
	}

}
