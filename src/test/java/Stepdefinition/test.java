

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

public class test extends Generic_function{

static String myapi;
int s;
static String str;
static boolean value;
private CharSequence my;

@Given("sucessfully launch the url in logo")
public void sucessfully_launch_the_url_in_logo() throws IOException {
	try {
		browser_launch();
		s= Dataiter();
		browser_wait(120000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("landing_page_of_thirdparty====");
			
		}
}

@When("user sucessfully view the mph logo")
public void user_sucessfully_view_the_mph_logo() throws IOException {
	try {
		WebElement i = driver.findElement
			      (By.xpath("/html/body/div/div/div/div/div/div/img"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("mph logo");
			
		}
}

@When("user should view mph text below the mph logo")
public void user_should_view_mph_text_below_the_mph_logo() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("we"))).getText();
		Assert.assertEquals(str,td_reader("we"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("user_should_view_mph_text_below_the_mph_logo");
			
		}  
}

@When("user should be able to click the login")
public void user_should_be_able_to_click_the_login()  throws IOException {
	try {
		click("first_login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("verify_user_should_be_able_to_click_ythe_login");
		}
}
}
