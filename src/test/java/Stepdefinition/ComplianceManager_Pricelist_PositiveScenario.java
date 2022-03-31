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
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class ComplianceManager_Pricelist_PositiveScenario extends Generic_function{

static String myapi;
int s;
static String str;
static boolean value;
private CharSequence my;

@Given("launches url for checking the price list for complaince")
public void launches_url_for_checking_the_price_list_for_complaince() throws IOException {
	try {
		browser_launch();
		s= Dataiter();
		browser_wait(120000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("landing_page_of_pricelist_complaince");
			
		}
}

@Then("for checking the priselist complaince manager able to click on the login button")
public void for_checking_the_priselist_complaince_manager_able_to_click_on_the_login_button() throws IOException {
	try {
		click("first_login");
		Thread.sleep(3000);
		browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_login_button_of_pricelist_complaince");
			
		}
	    
}

@Then("lands on the login page for complaince manager pricelist")
public void lands_on_the_login_page_for_complaince_manager_pricelist() throws IOException {
	try{
		str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();

	Assert.assertEquals(str,td_reader("login_title"));
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_login_button_of_pricelist_complaince");
		
	}   
  
}

@When("complaince manager enters valid email and password for checking the price list")
public void complaince_manager_enters_valid_email_and_password_for_checking_the_price_list() throws InterruptedException, IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_emaill",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("email_of_pricelist_complaince");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_passwordd",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("password_of_pricelist_complaince");
		}
		
   
}

@When("hits login button and lands on icomplaince manager page for price list")
public void hits_login_button_and_lands_on_icomplaince_manager_page_for_price_list() throws IOException {
	try {
		click("login");
		Thread.sleep(4000);
		browser_wait(2000);
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("login_positive_clicks_on_login_pricelist_complaince");

		//str= driver.findElement(By.xpath(OR_reader("org_title"))).getText();
		//Assert.assertEquals(str,td_reader("org_title"));
		}

}
    

@When("click on the price list in the cm page")
public void click_on_the_price_list_in_the_cm_page() throws IOException, InterruptedException {
	try {
	click("complaince_pricelist");
	Thread.sleep(5000);
    browser_wait(7000);
	} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("click_on_the_pricelist_pricelist_complaince");
}}

@Then("validate navigated to the price list page of the cm")
public void validate_navigated_to_the_price_list_page_of_the_cm() throws IOException {
	try {
	str= driver.findElement(By.xpath(OR_reader("pricelist_title"))).getText();
    Assert.assertEquals(str,td_reader("pricelist_title"));
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("validate_navigated_to_the_price_list_page_of_the_cm_pricelist_complaince");
}
}
@When("click on the search button present in the complaince manager page")
public void click_on_the_search_button_present_in_the_complaince_manager_page() throws IOException, InterruptedException {
	try{
		click("search_lobs");
	Thread.sleep(1000);
    browser_wait(3000);
	} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("click_on_the_search_button_present_in_the_complaince_manager_page_pricelist_complaince");
}}

@Then("give any data for searching in the cm")
public void give_any_data_for_searching_in_the_cm() throws IOException, InterruptedException {
	try{
		driver.findElement(By.xpath(OR_reader( "search_lobs"))).sendKeys(td_reader("complaince_search",0));
		Thread.sleep(1000);
        browser_wait(3000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("give_any_data_for_searching_in_the_cm_pricelist_complaince");
	}}
@Then("click the corresponding complaince pricelist")
public void click_the_corresponding_complaince_pricelist() throws IOException, InterruptedException {
	try{
		click("view_price_list");
	    Thread.sleep(1000);
        browser_wait(3000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_the_corresponding_complaince_pricelist_pricelist_complaince");
	}}
    


@Then("click the any of the prise list file of the complaince manager")
public void click_the_any_of_the_prise_list_file_of_the_complaince_manager() throws IOException, InterruptedException {
    try {
	click("any_price_list");
	Thread.sleep(3000);
    browser_wait(5000);
    } catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_the_any_of the_pricelist_complaince");
	}}
    
@Then("click on the second download button")
public void click_on_the_second_download_button() throws IOException, InterruptedException {
    try {
	click("any_price_list2");
	Thread.sleep(3000);
    browser_wait(5000);
    } catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_second_download_button_pricelist_complaince");
	}}
 

@Then("go back to the price list of the cm dashboard")
public void go_back_to_the_price_list_of_the_cm_dashboard() throws IOException, InterruptedException {
try{
	click("price_list_dashboard");
    Thread.sleep(5000);
    browser_wait(7000);
} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("go_back_to_the_price_list_of_the_cm_dashboard_pricelist_complaince");
}}


}
