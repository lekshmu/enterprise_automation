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

public class ComplianceManager_Sandbox_PositiveScenario extends Generic_function{

static String myapi;
int s;
static String str;
static boolean value;
private CharSequence my;

//@Given("launches urll")
@When("launch the url for complaince manager cmm")
public void launch_the_url_for_complaince_manager_cmm() throws IOException {
	browser_launch();
	s= Dataiter();

	browser_wait(120000);


	   
	   //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("complaince manager can click on the login button cmm")
public void complaince_manager_can_click_on_the_login_button_cmm() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
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
    //throw n
}

@Then("lands on the complaince manager login page cmm")
public void lands_on_the_complaince_manager_login_page_cmm() throws IOException {
	str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
	Assert.assertEquals(str,td_reader("login_title"));
	   //throw new io.cucumber.java.PendingException();
   // throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("cm enters the login id and password cmm")
public void cm_enters_the_login_id_and_password_cmm() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_emaill",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_passwordd",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}

@Then("hits on the login button foe com and check the sucessfull login cmm")
public void hits_on_the_login_button_foe_com_and_check_the_sucessfull_login_cmm() {
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


@When("click on pending applications cmm")
public void click_on_pending_applications_cmm() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	//click("pending");
	   // Thread.sleep(5000);
	   //// browser_wait(7000);
	  // throw new io.cucumber.java.PendingException();
		 click("pending");
		    Thread.sleep(3000);
		    browser_wait(5000);
}

@Then("click on the first application for cmm")
public void click_on_the_first_application_for_cmm() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	//click("checking2");
	click("last_appli");
    Thread.sleep(3000);
    browser_wait(5000);
    //throw new io.cucumber.java.PendingException();
    //throw new io.cucumber.java.PendingException();
    //throw new io.cucumber.java.PendingException();
    //throw new io.cucumber.java.PendingException();
    //throw new io.cucumber.java.PendingException();
    //throw new io.cucumber.java.PendingException();
}

@Then("get the api key cmm")
public void get_the_api_key_cmm() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	myapi = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div[14]/div/div[2]/div")).getText();	 
	System.out.println(myapi);
}

@Then("close the applications cmm")
public void close_the_applications_cmm() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	click("api_xsymbol");
    Thread.sleep(3000);
    browser_wait(5000);
    //
   // throw new io.cucumber.java.PendingException();s
}

@When("click on the sandbox cm")
public void click_on_the_sandbox_cm() throws InterruptedException, IOException {
	click("sandbox2");
    Thread.sleep(3000);
    browser_wait(5000);
    //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("click on the authorize cm")
public void click_on_the_authorize_cm() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	click("authorize");
    Thread.sleep(3000);
    browser_wait(5000);
    //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("give the value cm")
public void give_the_value_cm() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
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
		////driver.findElement (By.xpath("/html/bod
}

@Then("click on the authorize1 cm")
public void click_on_the_authorize1_cm() throws IOException, InterruptedException {
	click("authorize1");
    Thread.sleep(3000);
    browser_wait(5000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}

@Then("click on the into button cm")
public void click_on_the_into_button_cm() throws IOException, InterruptedException {
	click("close");
	//scrolldown();
    Thread.sleep(1000);
    browser_wait(3000);
   scrolldown();
  // browser_wait(1000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    
} 
@When("click on the encounter cm")
public void click_on_the_encounter_cm() throws IOException, InterruptedException {
	scrolldown();
	Thread.sleep(1000);
	click("encounter");
    Thread.sleep(1000);
    browser_wait(3000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("click on the try it out cm")
public void click_on_the_try_it_out_cm() throws IOException, InterruptedException {
	click("try_it_out1");
    Thread.sleep(1000);
    browser_wait(3000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("give the text cm")
public void give_the_text_cm() throws IOException, InterruptedException {
	driver.findElement(By.xpath(OR_reader( "sand_input1"))).sendKeys(td_reader("sand_value",0));
	Thread.sleep(2000);
   browser_wait(1000);//scrolldown();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	//driver.findElement (By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[4]/section/div/span/div/div/div/span[36]/div/div[2]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/input")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
	//driver.findElement (By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Then("click on the execute cm")
public void click_on_the_execute_cm() throws IOException, InterruptedException {
	click("execute1");
	scrolldown();
   Thread.sleep(5000);
   browser_wait(7000);
   //scrolldown();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
@When("click on the immunization cm")
public void click_on_the_immunization_cm() throws IOException, InterruptedException {
	click("immunization_cm");
	//scrolldown();
   Thread.sleep(1000);
   browser_wait(3000);
}

@Then("click on the try it out immunization cm")
public void click_on_the_try_it_out_immunization_cm() throws IOException, InterruptedException {
	click("immunization_try_it_out");
	//scrolldown();
   Thread.sleep(1000);
   browser_wait(3000);
}

@Then("give the text immunization cm")
public void give_the_text_immunization_cm() throws IOException, InterruptedException {
	driver.findElement(By.xpath(OR_reader("immunization_tenet"))).sendKeys(td_reader("sand_value",0));
	Thread.sleep(2000);
   browser_wait(1000);
}

@Then("click on the execute immunization cm")
public void click_on_the_execute_immunization_cm() throws IOException, InterruptedException {
	click("immunization_execute");
	scrolldown();
   Thread.sleep(9000);
   browser_wait(7000);
   }
@When("click on the sandbox cm provider directory")
public void click_on_the_sandbox_cm_provider_directory() throws IOException, InterruptedException {
	click("cm_pe_provider_directory");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("click on the authorize cm provider directory")
public void click_on_the_authorize_cm_provider_directory() throws IOException, InterruptedException {
	click("cm_pe_provider_directory_authorize");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("give the value cm provider directory")
public void give_the_value_cm_provider_directory() throws IOException, InterruptedException {
	System.out.println(myapi);
	driver.findElement(By.xpath(OR_reader("cm_pe_provider_directory_api"))).sendKeys(myapi);
	
	//WebElement a=driver.findElement(By.xpath("//input[@placeholder='TENANT']"));
	//a.sendKeys(myOrderText);
	
	//driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("api_value",0));
	//driver.findElement(By.xpath("//input[@placeholder='TENANT']")).sendKeys(td_reader("api_value",0));
	Thread.sleep(2000);
    browser_wait(1000);
}

@Then("click on the authorize1 cm provider directory")
public void click_on_the_authorize1_cm_provider_directory() throws IOException, InterruptedException {
	click("cm_pe_provider_directory_authorize1");
    Thread.sleep(3000);
    browser_wait(5000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}

@Then("click on the into button cm provider directory")
public void click_on_the_into_button_cm_provider_directory() throws IOException, InterruptedException {
	click("cm_pe_provider_directory_into");
    Thread.sleep(3000);
    browser_wait(5000);
}

@When("click on the endpoints cm provider directory")
public void click_on_the_endpoints_cm_provider_directory() throws IOException, InterruptedException {
	click("cm_pe_provider_directory_endpoints");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("click on the try it out cm provider directory")
public void click_on_the_try_it_out_cm_provider_directory() throws IOException, InterruptedException {
	click("cm_pe_provider_directory_tryit");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("give the text provider directory")
public void give_the_text_provider_directory() throws IOException, InterruptedException {
	driver.findElement(By.xpath(OR_reader("cm_pe_provider_directory_tenat"))).sendKeys(td_reader("sand_value",0));
	Thread.sleep(2000);
   browser_wait(1000);
}

@Then("click on the execute cm provider directory")
public void click_on_the_execute_cm_provider_directory() throws IOException, InterruptedException {
	click("cm_pe_provider_directory_execute");
	scrolldown();
    Thread.sleep(9000);
    browser_wait(7000);
}

@When("click on the application cmsa")
public void click_on_the_application_cmsa() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	click("applications_cmsa");
    Thread.sleep(5000);
    browser_wait(7000);
}
@Then("click on the approved application cmsa")
public void click_on_the_approved_application_cmsa() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	//click("caap");
		//Thread.sleep(5000);
	    //browser_wait(7000);
	  //throw new io.cucumber.java.PendingException();
	//}
		try {
		click("approve1cmsa");
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

@Then("click on the first applications cmsa")
public void click_on_the_first_applications_cmsa() throws IOException {
	//click("com-san-app");
	click("com_ap_last_app");
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
}
@Then("get the api key cmm second")
public void get_the_api_key_cmm_second() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	 // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	myapi = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div[14]/div/div[2]/div")).getText();	 
	System.out.println(myapi);
}

@Then("close the applications cmm scecond")
public void close_the_applications_cmm_scecond() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	// Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	click("api_xsymbol");
    Thread.sleep(3000);
    browser_wait(5000);
    //
   // throw new io.cucumber.java.PendingException();s
}

@When("click on the sandbox cm scecond")
public void click_on_the_sandbox_cm_scecond() throws IOException, InterruptedException {
	click("sandbox2");
    Thread.sleep(3000);
    browser_wait(5000);
    //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("click on the authorize cm scecond")
public void click_on_the_authorize_cm_scecond() throws IOException, InterruptedException {
	 // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	click("authorize");
    Thread.sleep(500);
    browser_wait(1000);
    //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("give the value cm scecond")
public void give_the_value_cm_scecond() throws IOException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
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
			
}

@Then("click on the authorize1 cm scecond")
public void click_on_the_authorize1_cm_scecond() throws IOException, InterruptedException {
	click("authorize1");
    Thread.sleep(1000);
    browser_wait(3000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("click on the into button cm scecond")
public void click_on_the_into_button_cm_scecond() throws IOException, InterruptedException {
	click("close");
	//scrolldown();
    Thread.sleep(1000);
    browser_wait(2000);
  // scrolldown();
  // browser_wait(1000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("click on the encounter cm scecond")
public void click_on_the_encounter_cm_scecond() throws InterruptedException, IOException {
	click("condition");
Thread.sleep(1000);
browser_wait(3000);
// Write code here that turns the phrase above into concrete actions
//throw new io.cucumber.java.PendingException();

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("click on the try it out cm scecond")
public void click_on_the_try_it_out_cm_scecond() throws IOException, InterruptedException {
	click("condition-try-it-out");
    Thread.sleep(1000);
    browser_wait(3000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("give the text cm scecond")
public void give_the_text_cm_scecond() throws IOException, InterruptedException {
	driver.findElement(By.xpath(OR_reader( "condition-tenet"))).sendKeys(td_reader("sand_value",0));
	Thread.sleep(500);
   browser_wait(1000);//scrolldown();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	//driver.findElement (By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[4]/section/div/span/div/div/div/span[36]/div/div[2]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/input")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
	//driver.findElement (By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Then("click on the execute cm  scecond")
public void click_on_the_execute_cm_scecond() throws IOException, InterruptedException {
	click("condition-execute");
	scrolldown();
   Thread.sleep(7000);
   browser_wait(9000);
   //scrolldown();
    
    //throw new io.cucumber.java.PendingException();
}
@When("click on the patient cm api")
public void click_on_the_patient_cm_api() throws IOException, InterruptedException {
	click("patient_cm_api");
	//scrolldown();
   Thread.sleep(1000);
   browser_wait(3000);
   
}

@Then("click on the try it out patient cm")
public void click_on_the_try_it_out_patient_cm() throws IOException, InterruptedException {
	click("patient_cm_try_it_out");
	//scrolldown();
   Thread.sleep(1000);
   browser_wait(3000);
}

@Then("give the text patient cm")
public void give_the_text_patient_cm() throws InterruptedException, IOException {
	driver.findElement(By.xpath(OR_reader("patient_cm_tenat"))).sendKeys(td_reader("sand_value",0));
	Thread.sleep(2000);
   browser_wait(1000);
}

@Then("click on the execute patient cm")
public void click_on_the_execute_patient_cm() throws IOException, InterruptedException {
	click("patient_complaince_execute");
	scrolldown();
   Thread.sleep(9000);
   browser_wait(7000);
}

@When("click on the sandbox cm ap provider directory")
public void click_on_the_sandbox_cm_ap_provider_directory() throws IOException, InterruptedException {
	click("cm_ap_provider_directory");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("click on the authorize cm ap provider directory")
public void click_on_the_authorize_cm_ap_provider_directory() throws IOException, InterruptedException {
	click("cm_ap_provider_directory_authorize");
    Thread.sleep(3000);
    browser_wait(5000);
    }

@Then("give the value cm ap provider directory")
public void give_the_value_cm_ap_provider_directory() throws InterruptedException, IOException {
	System.out.println(myapi);
	driver.findElement(By.xpath(OR_reader("cm_ap_provider_directory_api"))).sendKeys(myapi);
	
	//WebElement a=driver.findElement(By.xpath("//input[@placeholder='TENANT']"));
	//a.sendKeys(myOrderText);
	
	//driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("api_value",0));
	//driver.findElement(By.xpath("//input[@placeholder='TENANT']")).sendKeys(td_reader("api_value",0));
	Thread.sleep(2000);
    browser_wait(1000);
}

@Then("click on the authorize1 cm ap provider directory")
public void click_on_the_authorize1_cm_ap_provider_directory() throws IOException, InterruptedException {
	click("cm_ap_provider_directory_authorize1");
    Thread.sleep(3000);
    browser_wait(5000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}

@Then("click on the into button cm ap provider directory")
public void click_on_the_into_button_cm_ap_provider_directory() throws IOException, InterruptedException {
	click("cm_ap_provider_directory_into");
    Thread.sleep(3000);
    browser_wait(5000);
}


@When("click on the endpoints cm ap provider directory healthcareservice")
public void click_on_the_endpoints_cm_ap_provider_directory_healthcareservice() throws IOException, InterruptedException {
	click("cm_ap_provider_directory_healthcareservices");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("click on the try it out cm ap provider directory healthcareservice")
public void click_on_the_try_it_out_cm_ap_provider_directory_healthcareservice() throws IOException, InterruptedException {
	click("cm_ap_provider_directory_tryit");
    Thread.sleep(3000);
    browser_wait(5000);
}

@Then("give the text provider cm ap directory healthcareservice")
public void give_the_text_provider_cm_ap_directory_healthcareservice() throws IOException, InterruptedException {
	driver.findElement(By.xpath(OR_reader("cm_ap_provider_directory_tenat"))).sendKeys(td_reader("sand_value",0));
	Thread.sleep(2000);
   browser_wait(1000);
}

@Then("click on the execute cm ap provider directory healthcareservice")
public void click_on_the_execute_cm_ap_provider_directory_healthcareservice() throws IOException, InterruptedException {
	click("cm_ap_provider_directory_execute");
	scrolldown();
    Thread.sleep(9000);
    browser_wait(7000);
}



@Then("go back to the dashobard complaince secondd")
public void go_back_to_the_dashobard_complaince_secondd() throws IOException {
    click("dashboardd");// Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
}
 


}
