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

public class InternalDeveloper_Sandbox_PositiveScenario extends Generic_function{

static String myapi;
int s;
static String str;
static boolean value;
private CharSequence my;
@Given("launches urll")
public void launches_urll() throws IOException {
	browser_launch();
	s= Dataiter();

	browser_wait(120000);


	   
	   //throw new io.cucumber.java.PendingException();
	}



@Then("able to click on login buttonn for checking sandbox")
public void able_to_click_on_login_buttonn_for_checking_sandbox() {
	try {
		click("first_login");
		Thread.sleep(3000);
		browser_wait(1000);
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		e.printStackTrace();
		//takeScreenShot("login_positive_clicks_on_login");

		//str= driver.findElement(By.xpath(OR_reader("org_title"))).getText();
		//Assert.assertEquals(str,td_reader("org_title"));
		}
    //throw new io.cucumber.java.PendingException();
}

@Then("lands on login pagee for sandbox")
public void lands_on_login_pagee_for_sandbox() throws IOException {
	str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
	Assert.assertEquals(str,td_reader("login_title"));
	   //throw new io.cucumber.java.PendingException();
   // throw new io.cucumber.java.PendingException();
}
@When("Superadmin enters valid email and password for sandbox")
public void superadmin_enters_valid_email_and_password_for_sandbox() throws InterruptedException {
	try {
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
  
@When("hits login button and lands on superadmin page for sandbox")
public void hits_login_button_and_lands_on_superadmin_page_for_sandbox() throws IOException {
	try {
		click("login");
		Thread.sleep(4000);
		browser_wait(2000);
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		////e.printStackTrace();
		//takeScreenShot("login_positive_clicks_on_login");

		//str= driver.findElement(By.xpath(OR_reader("org_title"))).getText();
		//Assert.assertEquals(str,td_reader("org_title"));
		}

}
//@When("hits on the pending button for sandbox")
//public void hits_on_the_pending_button_for_sandbox() throws IOException, InterruptedException {
	//click("pending");
    //Thread.sleep(7000);
    //browser_wait(9000);
    //throw new io.cucumber.java.PendingException();
    //throw new io.cucumber.java.PendingException();
//}
@When("click on the create application button")
public void click_on_the_create_application_button() throws IOException {
    // Write code here that turns the phrase above into concrete actions
	try {
		click("create_app");
		Thread.sleep(3000);
		browser_wait(3000);
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		e.printStackTrace();
		//takeScreenShot("login_positive_clicks_on_login");

		str= driver.findElement(By.xpath(OR_reader("create_apph"))).getText();
		Assert.assertEquals(str,td_reader("create_apph"));
		}

}
    //throw new io.cucumber.java.PendingException();

@Then("login to the page")
public void login_to_the_page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("enter the valid data field")
public void enter_the_valid_data_field() throws IOException {
	//String app31 = RandomStringUtils.randomAlphabetic(8);
	//driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app31);
	Random randomGeneratorapp31 = new Random();  
    int randomInt31 = randomGeneratorapp31.nextInt(1000);
    driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("application00"+ randomInt31 );
	
	Random randomGenerator1 = new Random();  
    int randomInt1 = randomGenerator1.nextInt(1000);
    driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomInt1 +".cornell.edu");
	
    String app1 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(app1);
	
    Random randomGenerator = new Random();  
    int randomInt = randomGenerator.nextInt(1000);
    driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("app"+ randomInt +"@gmail.com");
    
    String app32 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(app32);
		
	String app33 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(app33);
	
	//driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
	str= driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
	Assert.assertEquals(str,td_reader("query_limit"));
	click("query_limit");
}
   

@Then("click on the create button")
public void click_on_the_application_button1() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	click("create");
	browser_wait(7000);
	Thread.sleep(2000);
}
@Then("click on the xbutton")
public void click_on_the_xbutton() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	click("xsymbol");
	Thread.sleep(3000);
    browser_wait(5000);
}


@Then("go back to the pending application page for sandbox")
public void go_back_to_the_pending_application_page_for_sandbox() throws IOException, InterruptedException {
	//click("pending");
   // Thread.sleep(5000);
   //// browser_wait(7000);
  // throw new io.cucumber.java.PendingException();
	 click("pending");
	    Thread.sleep(3000);
	    browser_wait(5000);
}
@When("click on the first application")
public void click_on_the_first_application() throws IOException, InterruptedException {
	click("inte_pe_last_app");
	//click("eg");
    Thread.sleep(3000);
    browser_wait(5000);
    //throw new io.cucumber.java.PendingException();
    //throw new io.cucumber.java.PendingException();
    //throw new io.cucumber.java.PendingException();
}
@Then("get the api key")
public void get_the_api_key() throws IOException, InterruptedException {
	
	myapi = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div[14]/div/div[2]/div")).getText();	 
	System.out.println(myapi);
	
}
@Then("hits on the xsymboll")
public void hits_on_the_xsymboll() throws IOException, InterruptedException {
	click("api_xsymbol");
    Thread.sleep(3000);
    browser_wait(5000);
    //
   // throw new io.cucumber.java.PendingException();s
}
@When("click on the sandbox")
public void click_on_the_sandbox() throws IOException, InterruptedException {
	click("sandbox1");
    Thread.sleep(3000);
    browser_wait(5000);
    //throw new io.cucumber.java.PendingException();
}

@Then("click on the authorize")
public void click_on_the_authorize() throws IOException, InterruptedException {
	click("authorize");
    Thread.sleep(3000);
    browser_wait(5000);
    //throw new io.cucumber.java.PendingException();
}   
@Then("give the value")
public void give_the_value() throws IOException, InterruptedException {
	//driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("my",0));
	//Thread.sleep(2000);
     ////browser_wait(1000);
	//driver.findElement (By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[4]/section/div/span/div/div/div/span[36]/div/div[2]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/input")).sendKeys(myOrderText ));
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	//driver.findElement(By.id("api_input")).sendKeys(Keys.CONTROL+"v");
	System.out.println(myapi);
	driver.findElement(By.xpath(OR_reader("api_input"))).sendKeys(myapi);
	
	//WebElement a=driver.findElement(By.xpath("//input[@placeholder='TENANT']"));
	//a.sendKeys(myOrderText);
	
	//driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("api_value",0));
	//driver.findElement(By.xpath("//input[@placeholder='TENANT']")).sendKeys(td_reader("api_value",0));
	Thread.sleep(2000);
    browser_wait(1000);
	
//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/section/div/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/div[4]/section/input")).sendKeys(myOrderText);
	//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/section/div/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/div[4]/section/input")).sendKeys(myOrderText);
	//driver.findElement (By.xpath("/html/body/main/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[2]/td[2]")).sendKeys(Keys.chord(Keys.CONTROL, "v"))
	////driver.findElement (By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/section/div/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/div[4]/section/input")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
}

@Then("click on the authorize1")
public void click_on_the_authorize1() throws IOException, InterruptedException {
	click("authorize1");
    Thread.sleep(3000);
    browser_wait(5000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}

@Then("click on the into button")
public void click_on_the_into_button() throws IOException, InterruptedException {
	click("close");
	//scrolldown();
    Thread.sleep(1000);
    browser_wait(3000);
  // scrolldown();
  // browser_wait(1000);
    }


@When("click on the patient")
public void click_on_the_patient() throws IOException, InterruptedException {
	scrolldown();
	//browser_wait(1000);
	click("patient_get");
    Thread.sleep(1000);
    browser_wait(3000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}


@Then("click on the try it out for patient acess")
public void click_on_the_try_it_out_for_patient_acess() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	click("patient-try-it-out");
    Thread.sleep(1000);
    browser_wait(3000);
    //throw new io.cucumber.java.PendingException();
}
@Then("give any text in tenat")
public void give_any_text_in_tenat() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	driver.findElement(By.xpath(OR_reader( "patient-tenat"))).sendKeys(td_reader("sand_value",0));
	Thread.sleep(2000);
   browser_wait(1000);//scrolldown();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	//driver.findElement (By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[4]/section/div/span/div/div/div/span[36]/div/div[2]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/input")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
	//driver.findElement (By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[4]/section/div/span/div/div/div/span[36]/div/div[2]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/input")).sendKeys(str);
}


@Then("click on the execute button and check it")
public void click_on_the_execute_button_and_check_it() throws IOException, InterruptedException {
	click("patient-execute");
	scrolldown();
   Thread.sleep(5000);
   //scrolldown();
   browser_wait(7000);
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@When("click on the procedure")
public void click_on_the_procedure() throws InterruptedException, IOException {
	click("proce_int");
    //scrolldown();
   Thread.sleep(1000);
   browser_wait(3000);
}

@Then("click on the try it out for procedure")
public void click_on_the_try_it_out_for_procedure() throws IOException, InterruptedException {
	click("proce_try_it_out");
	//scrolldown();
   Thread.sleep(1000);
   browser_wait(3000);
}

@Then("give text in  procedure tenat")
public void give_text_in_procedure_tenat() throws IOException, InterruptedException {
	driver.findElement(By.xpath(OR_reader("proce_tenat"))).sendKeys(td_reader("sand_value",0));
	Thread.sleep(2000);
   browser_wait(1000);
}

@Then("click on the procedure execute button and check it")
public void click_on_the_procedure_execute_button_and_check_it() throws InterruptedException, IOException {
	click("proce_execute");
	scrolldown();
   Thread.sleep(9000);
   browser_wait(7000);
}
@When("click on the sandbox internal provider directory")
public void click_on_the_sandbox_internal_provider_directory() throws IOException, InterruptedException {
	click("internal_pe_provider_directory");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("click on the authorize internal provider directory")
public void click_on_the_authorize_internal_provider_directory() throws IOException, InterruptedException {
	click("internal_pe_provider_directory_authorize");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("give the value internal provider directory")
public void give_the_value_internal_provider_directory() throws IOException, InterruptedException {
	System.out.println(myapi);
	driver.findElement(By.xpath(OR_reader("internal_pe_provider_directory_api"))).sendKeys(myapi);
	
	//WebElement a=driver.findElement(By.xpath("//input[@placeholder='TENANT']"));
	//a.sendKeys(myOrderText);
	
	//driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("api_value",0));
	//driver.findElement(By.xpath("//input[@placeholder='TENANT']")).sendKeys(td_reader("api_value",0));
	Thread.sleep(2000);
    browser_wait(1000);
}

@Then("click on the authorize1 internal provider directory")
public void click_on_the_authorize1_internal_provider_directory() throws IOException, InterruptedException {
	click("internal_pe_provider_directory_authorize1");
    Thread.sleep(3000);
    browser_wait(5000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}

@Then("click on the into button internal provider directory")
public void click_on_the_into_button_internal_provider_directory() throws IOException, InterruptedException {
	click("internal_pe_provider_directory_into");
    Thread.sleep(3000);
    browser_wait(5000);
}

@When("click on the insurance internal provider directory")
public void click_on_the_insurance_internal_provider_directory() throws InterruptedException, IOException {
	click("internal_pe_provider_directory_insurance");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("click on the try it out internal provider directory")
public void click_on_the_try_it_out_internal_provider_directory() throws IOException, InterruptedException {
	click("internal_pe_provider_directory_tryit");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("give the text provider directory for internal")
public void give_the_text_provider_directory_for_internal() throws IOException, InterruptedException {
	driver.findElement(By.xpath(OR_reader("internal_pe_provider_directory_tenat"))).sendKeys(td_reader("sand_value",0));
	Thread.sleep(2000);
   browser_wait(1000);
}


@Then("click on the execute internal provider directory")
public void click_on_the_execute_internal_provider_directory() throws IOException, InterruptedException {
	click("internal_pe_provider_directory_execute");
	scrolldown();
    Thread.sleep(9000);
    browser_wait(7000);
}
   
  


@When("click on the Applications for internal")
public void click_on_the_applications_for_internal() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	click("applications");
	scrolldown();
	Thread.sleep(5000);
    browser_wait(7000);
}





@Then("click on the approved applications internal")
public void click_on_the_approved_applications_internal() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	// Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	try {
		click("approve1");
		Thread.sleep(3000);
		browser_wait(1000);
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		//e.printStackTrace();
		//takeScreenShot("login_positive_clicks_on_login");

		//str= driver.findElement(By.xpath(OR_reader("org_title"))).getText();
		//Assert.assertEquals(str,td_reader("org_title"));
		}
} 
//@Then("click on the first application internall")
//public void click_on_the_first_application_internall() throws  InterruptedException, IOException {
    //click("checking_internal");
    //Thread.sleep(7000);
   // browser_wait(9000);
//}
@Then("click application for  internal developer")
public void click_application_for_internal_developer() throws IOException {
	click("inte_ap_last_app");
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
}
@Then("copy the token internal")
public void copy_the_token_internal() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	myapi = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div[14]/div/div[2]/div")).getText();	 
	System.out.println(myapi);
}

@Then("close it internal")
public void close_it_internal() throws InterruptedException, IOException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	click("api_xsymbol");
    Thread.sleep(3000);
    browser_wait(5000);
}
@When("click on the sandbox internal")
public void click_on_the_sandbox_internal() throws IOException, InterruptedException  {
	click("sandbox1");
    Thread.sleep(3000);
    browser_wait(5000);
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Then("click on the authorize internal")
public void click_on_the_authorize_internal() throws IOException, InterruptedException {
	click("authorize");
    Thread.sleep(500);
    browser_wait(1000);
    //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("give the value internal")
public void give_the_value_internal() throws IOException, InterruptedException {
	//driver.findElement(By.id("api_input")).sendKeys(Keys.CONTROL+"v");
		System.out.println(myapi);
		driver.findElement(By.xpath(OR_reader("api_input"))).sendKeys(myapi);
		
		//WebElement a=driver.findElement(By.xpath("//input[@placeholder='TENANT']"));
		//a.sendKeys(myOrderText);
		
		//driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("api_value",0));
		//driver.findElement(By.xpath("//input[@placeholder='TENANT']")).sendKeys(td_reader("api_value",0));
		Thread.sleep(2000);
	    browser_wait(1000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("click on the authorize1 internal")
public void click_on_the_authorize1_internal() throws IOException, InterruptedException {
	click("authorize1");
    Thread.sleep(1000);
    browser_wait(3000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("click on the into button internal")
public void click_on_the_into_button_internal() throws IOException, InterruptedException {
	click("close");
	//scrolldown();
    Thread.sleep(1000);
    browser_wait(2000);
  // scrolldown();
  
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
@When("click on the device")
public void click_on_the_device() throws IOException, InterruptedException {
	//scrolldown();
	//browser_wait(1000);
	click("device-zf");
    Thread.sleep(1000);
    browser_wait(3000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("click on the try it out for device acess")
public void click_on_the_try_it_out_for_device_acess() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	click("device-try");
    Thread.sleep(3000);
    browser_wait(1000);
}

@Then("give any text in device tenat")
public void give_any_text_in_device_tenat() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	// Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	driver.findElement(By.xpath(OR_reader( "device-tenat"))).sendKeys(td_reader("sand_value",0));
	Thread.sleep(1000);
   browser_wait(3000);//scrolldown();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	//driver.findElement (By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[4]/section/div/span/div/div/div/span[36]/div/div[2]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/input")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
	//driver.findElement (By.xp

}

@Then("click on the device execute button and check it")
public void click_on_the_device_execute_button_and_check_it() throws IOException, InterruptedException {
	click("device-execute");
	scrolldown();
   Thread.sleep(7000);
   //scrolldown();
   browser_wait(9000);
   //scrolldown();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@When("click on the medicationknowledge")
public void click_on_the_medicationknowledge() throws IOException, InterruptedException {
	click("medi_int");
	//scrolldown();
   Thread.sleep(1000);
   browser_wait(3000);
}

@Then("click on the try it out for medicationknowledge")
public void click_on_the_try_it_out_for_medicationknowledge() throws IOException, InterruptedException {
	click("medi_try_it_out");
	//scrolldown();
   Thread.sleep(1000);
   browser_wait(3000);
}

@Then("give text in medicationknowledge tenat")
public void give_text_in_medicationknowledge_tenat() throws IOException, InterruptedException {
	driver.findElement(By.xpath(OR_reader("medi_tenat"))).sendKeys(td_reader("sand_value",0));
	Thread.sleep(2000);
   browser_wait(1000);
}

@Then("click on the medi execute button and check it")
public void click_on_the_medi_execute_button_and_check_it() throws IOException, InterruptedException {
	click("medi_execute");
	scrolldown();
   Thread.sleep(9000);
   browser_wait(7000);
}

@When("click on the sandbox internal ap provider directory")
public void click_on_the_sandbox_internal_ap_provider_directory() throws IOException, InterruptedException {
	click("internal_ap_provider_directory");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("click on the authorize internal ap provider directory")
public void click_on_the_authorize_internal_ap_provider_directory() throws IOException, InterruptedException {
	click("internal_ap_provider_directory_authorize");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("give the value internal ap provider directory")
public void give_the_value_internal_ap_provider_directory() throws IOException, InterruptedException {
	System.out.println(myapi);
	driver.findElement(By.xpath(OR_reader("internal_ap_provider_directory_api"))).sendKeys(myapi);
	
	//WebElement a=driver.findElement(By.xpath("//input[@placeholder='TENANT']"));
	//a.sendKeys(myOrderText);
	
	//driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("api_value",0));
	//driver.findElement(By.xpath("//input[@placeholder='TENANT']")).sendKeys(td_reader("api_value",0));
	Thread.sleep(2000);
    browser_wait(1000);
}

@Then("click on the authorize1 internal ap provider directory")
public void click_on_the_authorize1_internal_ap_provider_directory() throws IOException, InterruptedException {
	click("internal_ap_provider_directory_authorize1");
    Thread.sleep(3000);
    browser_wait(5000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}

@Then("click on the into button internal ap provider directory")
public void click_on_the_into_button_internal_ap_provider_directory() throws IOException, InterruptedException {
	click("cm_ap_provider_directory_into");
    Thread.sleep(3000);
    browser_wait(5000);
}

@When("click on the location internal ap provider directory")
public void click_on_the_location_internal_ap_provider_directory() throws IOException, InterruptedException {
	click("internal_ap_provider_directory_location");
    Thread.sleep(3000);
    browser_wait(5000);
}
@Then("click on the try it out internal ap provider location")
public void click_on_the_try_it_out_internal_ap_provider_location() throws IOException, InterruptedException {
	click("internal_ap_provider_directory_tryit");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("give the text to the location")
public void give_the_text_to_the_location() throws IOException, InterruptedException {
	driver.findElement(By.xpath(OR_reader("internal_ap_provider_directory_tenat"))).sendKeys(td_reader("sand_value",0));
	Thread.sleep(2000);
   browser_wait(1000);
}

@Then("click on the execute internal ap provider directory location")
public void click_on_the_execute_internal_ap_provider_directory_location() throws IOException, InterruptedException {
	click("internal_ap_provider_directory_execute");
	scrolldown();
    Thread.sleep(9000);
    browser_wait(000);
}





@Then("goback to the dashbord for internal developer")
public void goback_to_the_dashbord_for_internal_developer() throws IOException, InterruptedException {
	click("sandbox_internal_dashboard");
	scrolldown();
   Thread.sleep(10000);
}}



