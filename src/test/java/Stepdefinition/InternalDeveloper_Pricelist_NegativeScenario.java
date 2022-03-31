package Stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Reusable_Functions.Generic_function;
//import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.OR;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.serenitybdd.screenplay.ui.Select;
//import net.serenitybdd.screenplay.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class InternalDeveloper_Pricelist_NegativeScenario extends  Generic_function{
static int s;
static String str;
static boolean value;

@Given("launch the url for checking the internal developer negative login")
public void launch_the_url_for_checking_the_internal_developer_negative_login() throws IOException {
	try {
		browser_launch();
		s= Dataiter();
		browser_wait(120000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("launch_the_url_for_checking_the_internal_developer_negative_login");
			
		}
}

@When("click on the login button for checking internal developer negative login")
public void click_on_the_login_button_for_checking_internal_developer_negative_login() throws IOException {
	try {
		click("first_login");
		Thread.sleep(3000);
		browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_login_button_for_checking_internal_developer_negative_login");
			
		}
}

@When("check that the user lands on the login page successfully for checking the internal developer negative login")
public void check_that_the_user_lands_on_the_login_page_successfully_for_checking_the_internal_developer_negative_login() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
		Assert.assertEquals(str,td_reader("login_title"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("check_that_the_user_lands_on_the_login_page_successfully_for_checking_the_internal_developer_negative_login");
			
		}
}

@Then("click on the first login part in internal developer negative login")
public void click_on_the_first_login_part_in_internal_developer_negative_login() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_first_login_part_in_internal_developer_negative_login");
		
		}
}

@Then("validation message is displiayed for the internal developer negative login")
public void validation_message_is_displiayed_for_the_internal_developer_negative_login() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("validation message is displiayed for the internal developer negative login");
			
		}
}

@When("internal developer enters invalid email id and invalid password in the login page")
public void internal_developer_enters_invalid_email_id_and_invalid_password_in_the_login_page() throws IOException, InterruptedException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("internal_developer_negative_invalid_email",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_email_of_internaldeveloper_negative");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("internal_developer_negative_invalid_pass",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_password_of_internaldeveloper_negative");
		}
}

@Then("internal developer click on the login button after entering invalid email id and invalid password")
public void internal_developer_click_on_the_login_button_after_entering_invalid_email_id_and_invalid_password() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_click_on_the_login_button_after_entering_invalid_email_id_and_invalid_password");
		
		}
}

@Then("internal developer negative login check the validation msg is displayed or not")
public void internal_developer_negative_login_check_the_validation_msg_is_displayed_or_not() throws IOException, InterruptedException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internal_developer_negative_login_check_the_validation_msg_is_displayed_or_not");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@When("internal developer negative logins enters valid email id and invalid password in the login page")
public void internal_developer_negative_logins_enters_valid_email_id_and_invalid_password_in_the_login_page() throws IOException, InterruptedException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_email",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_negative_logins_enters_valid_email_id_and_invalid_password_in_the_login_page");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("internal_developer_negative_invalid_pass",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_negative_logins_invalid_password_valid_emai_in_the_login_page");
		}
}

@Then("internal developer click on the login button after entering valid email id and invalid password")
public void internal_developer_click_on_the_login_button_after_entering_valid_email_id_and_invalid_password() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_click_on_the_login_button_after_entering_valid_email_id_and_invalid_password");
		
		}
}

@Then("internal developer check the validation msg is displayed or not after entering valid email id and invalid password")
public void internal_developer_check_the_validation_msg_is_displayed_or_not_after_entering_valid_email_id_and_invalid_password() throws IOException, InterruptedException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internal_developer_check_the_validation_msg_is_displayed_or_not_after_entering_valid_email_id_and_invalid_password");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@When("internal developer enters invalid email id and valid password in the login page")
public void internal_developer_enters_invalid_email_id_and_valid_password_in_the_login_page() throws InterruptedException, IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("internal_developer_negative_invalid_email",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_email_valid_pass_of_thirdparty_negative_scenario");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("valid_password_invalid_email_of_thirdparty_negative");
		} 
}

@Then("internal developer click on the login button after entering invalid email id and valid password")
public void internal_developer_click_on_the_login_button_after_entering_invalid_email_id_and_valid_password() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_click_on_the_login_button_after_entering_invalid_email_id_and_valid_password");
		
		}
}

@Then("internal developer check the validation msg is displayed or not after entering invalid email id and valid password")
public void internal_developer_check_the_validation_msg_is_displayed_or_not_after_entering_invalid_email_id_and_valid_password() throws IOException, InterruptedException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internal_developer_check_the_validation_msg_is_displayed_or_not_after_entering_invalid_email_id_and_valid_password");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@When("internal developer enters valid email id and valid password in the login page thirdparty negative")
public void internal_developer_enters_valid_email_id_and_valid_password_in_the_login_page_thirdparty_negative() throws InterruptedException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_email",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}


@Then("internal developer click on the login button after entering valid email id and valid password thirdparty negative")
public void internal_developer_click_on_the_login_button_after_entering_valid_email_id_and_valid_password_thirdparty_negative() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_click_on_the_login_button_after_entering_valid_email_id_and_valid_password_thirdparty_negative");
		
		}
}
@When("click on the price list in the internal developer negative")
public void click_on_the_price_list_in_the_internal_developer_negative() throws IOException {
	try{
		click("internal_pricelist_negative_dash");
        Thread.sleep(3000);
        browser_wait(5000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_price_list_in_the_internal_developer_negative");
	}
}

@Then("validate navigated to the price list page list in the internal developer negative")
public void validate_navigated_to_the_price_list_page_list_in_the_internal_developer_negative() throws IOException {
	try{
		str= driver.findElement(By.xpath(OR_reader("pricelist_title"))).getText();
	
    Assert.assertEquals(str,td_reader("pricelist_title"));
} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("validate_navigated_to_the_price_list_page_list_in_the_internal_developer_negative");
}
}

@When("click on the search button in the internal developer negative scenarios")
public void click_on_the_search_button_in_the_internal_developer_negative_scenarios() throws IOException {
	try{
		click("search_lobs");
	Thread.sleep(1000);
    browser_wait(3000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_search_button_in_the_internal_developer_negative_scenarios");
	}
}

@Then("give any invalidata for searching the internal developer negative scenarios")
public void give_any_invalidata_for_searching_the_internal_developer_negative_scenarios() throws IOException {
try{
		
		driver.findElement(By.xpath(OR_reader( "search_lobs"))).sendKeys(td_reader("invalid_search_data",0));
		Thread.sleep(1000);
	   browser_wait(3000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("thirdparty_negative_scenario_click_the_search_lobs");
		
}
}

@When("clear the search field in the internal developer negative scenarios")
public void clear_the_search_field_in_the_internal_developer_negative_scenarios() throws IOException {
	try {
		backspace("search_lobs");
        Thread.sleep(1000);
       
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("clear_the_search_field_in_the_internal_developer_negative_scenarios");
}
}

@Then("thirdparty can give valid data for searching the internal developer negative scenarios")
public void thirdparty_can_give_valid_data_for_searching_the_internal_developer_negative_scenarios() throws IOException {
	
	try {
		driver.findElement(By.xpath(OR_reader( "search_lobs"))).sendKeys(td_reader("search_data",0));
		Thread.sleep(1000);
	   browser_wait(3000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("thirdparty_can_give_valid_data_for_searching_the_internal_developer_negative_scenarios");
		}
}

@Then("click the corresponding pricelist of the internal developer negative scenarios")
public void click_the_corresponding_pricelist_of_the_internal_developer_negative_scenarios() throws IOException {
	try {
		click("view_price_list");
		Thread.sleep(1000);
	    browser_wait(3000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_the_corresponding_pricelist_of_the_internal_developer_negative_scenarios");
		}
}

@Then("click the any of the prise list file in the internal developer negative scenarios")
public void click_the_any_of_the_prise_list_file_in_the_internal_developer_negative_scenarios() throws IOException {
	try{
		click("any_price_list");
	    Thread.sleep(3000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_the_any_of_the_prise_list_file_in_the_internal_developer_negative_scenarios");
	}
}

@Then("click on the second download button of internal developer negative scenarios")
public void click_on_the_second_download_button_of_internal_developer_negative_scenarios() throws IOException {
	try {    
		click("any_price_list2");
			
			Thread.sleep(3000);
		    browser_wait(5000);
		}  catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_second_download_button_of_internal_developer_negative_scenarios");
		}}

@Then("go back to the price list dashboard of the internal developer negative scenarios")
public void go_back_to_the_price_list_dashboard_of_the_internal_developer_negative_scenarios() throws IOException {

	try{
		click("price_list_dashboard");
	   Thread.sleep(3000);
       browser_wait(5000);
	}catch (Exception e) {
    	e.printStackTrace();
    	takeScreenShot("go_back_to_the_price_list_dashboard_of_the_internal_developer_negative_scenarios");
    }}


@When("internal developer negative scenarios signout")
public void internal_developer_negative_scenarios_signout() throws IOException {
	try{
		click("so1");
		
		Thread.sleep(3000);
	    browser_wait(5000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_negative_scenarios_signout");
}
}

@Then("internal developer negative scenarios logout")
public void internal_developer_negative_scenarios_logout() throws IOException {
	try{
		click("so2");
		
		Thread.sleep(3000);
	    browser_wait(5000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_negative_scenarios_logout");
}
}


}


