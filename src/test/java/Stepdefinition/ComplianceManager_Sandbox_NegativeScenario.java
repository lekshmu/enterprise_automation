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

public class  ComplianceManager_Sandbox_NegativeScenario extends Generic_function{

	static String myapi;	
static int s;
static String str;
static boolean value;


@Given("launch the url for checking the compliance manager sandbox negative scenario")
public void launch_the_url_for_checking_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		browser_launch();
		s= Dataiter();
		browser_wait(120000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("launch_the_url_for_checking_the_compliance_manager_sandbox_negative_scenario");
			
		}
}

@When("click on the login button for checking the compliance manager workflow  negative scenario")
public void click_on_the_login_button_for_checking_the_compliance_manager_workflow_negative_scenario() throws IOException {
	try {
		click("first_login");
		Thread.sleep(3000);
		browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_login_button_for_checking_the_compliance_manager_workflow_negative_scenario");
			
		}
}

@When("check that the user lands on the login page for checking the compliance manager workflow negative scenario")
public void check_that_the_user_lands_on_the_login_page_for_checking_the_compliance_manager_workflow_negative_scenario() throws IOException {
	try{
		str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();

	Assert.assertEquals(str,td_reader("login_title"));
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("check_that_the_user_lands_on_the_login_page_for_checking_the_compliance_manager_workflow_negative_scenario");
}
		}


@Then("click on the first login part of the compliance manager sandbox negative scenario")
public void click_on_the_first_login_part_of_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_first_login_part_of_the_compliance_manager_sandbox_negative_scenario");
		
		}
}

@Then("validation message is displiayed for the compliance manager sandbox negative scenario")
public void validation_message_is_displiayed_for_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("validation_message_is_displiayed_for_the_compliance_manager_sandbox_negative_scenario");
			
		}
}

@When("enters invalid email id and invalid password in the login page in compliance manager sandbox negative scenario")
public void enters_invalid_email_id_and_invalid_password_in_the_login_page_in_compliance_manager_sandbox_negative_scenario() throws InterruptedException, IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("complince_manager_invalid_email",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_email_of_complaince_manager_sandbox_negative_scenarios");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("complince_manager_invalid_pass",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_password_of_complaince_manager_sandbox_negative_scenarios");
		}
}

@Then("click on the login button after entering invalid email id and invalid password in compliance manager sandbox negative scenario")
public void click_on_the_login_button_after_entering_invalid_email_id_and_invalid_password_in_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_login_button_after_entering_invalid_email_id_and_invalid_password_in_compliance_manager_sandbox_negative_scenario");
		
		}
}

@Then("check the validation msg in the compliance manager sandbox negative scenario")
public void check_the_validation_msg_in_the_compliance_manager_sandbox_negative_scenario() throws IOException, InterruptedException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("check_the_validation_msg_in_the_compliance_manager_sandbox_negative_scenario");
			Thread.sleep(1000);
			browser_wait(500);
		}

}

@When("enters valid email id and invalid password in the login page of the compliance manager sandbox negative scenario")
public void enters_valid_email_id_and_invalid_password_in_the_login_page_of_the_compliance_manager_sandbox_negative_scenario() throws InterruptedException, IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_emaill",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("valid_email_of__complaince_sandbox_negative_workflow");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("complince_manager_invalid_pass",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_password_of_complaince_sandbox_negative_workflow");
		}
}

@Then("click on the login button after entering valid email id and invalid password in the compliance manager sandbox negative scenario")
public void click_on_the_login_button_after_entering_valid_email_id_and_invalid_password_in_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_login_button_after_entering_valid_email_id_and_invalid_password_in_the_compliance_manager_sandbox_negative_scenario");
		
		}
}

@Then("check the validation msg after entering valid email id and invalid password in the compliance manager sandbox negative scenario")
public void check_the_validation_msg_after_entering_valid_email_id_and_invalid_password_in_the_compliance_manager_sandbox_negative_scenario() throws IOException, InterruptedException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("check_the_validation_msg_after_entering_valid_email_id_and_invalid_password_in_the_compliance_manager_sandbox_negative_scenario");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@When("enters invalid email id and valid password in the login page of the compliance manager sandbox negative scenario")
public void enters_invalid_email_id_and_valid_password_in_the_login_page_of_the_compliance_manager_sandbox_negative_scenario() throws IOException, InterruptedException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("complince_manager_invalid_email",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_email_valid_pass_of_complaince_sandbox_workflow_negative");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("complince_manager_invalid_pass",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("valid_pass_invalid_email_of_complaince_sandbox_workflow_negative");
		}
}

@Then("click on the login button after entering invalid email id and valid password in the compliance manager sandbox negative scenario")
public void click_on_the_login_button_after_entering_invalid_email_id_and_valid_password_in_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_login_button_after_entering_invalid_email_id_and_valid_password_in_the_compliance_manager_workflow_negative_scenario");
		
		}}

@Then("check the validation msg after entering invalid email id and valid password in the compliance manager sandbox negative scenario")
public void check_the_validation_msg_after_entering_invalid_email_id_and_valid_password_in_the_compliance_manager_sandbox_negative_scenario() throws IOException, InterruptedException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("check_the_validation_msg_after_entering_invalid_email_id_and_valid_password_in_the_compliance_manager_sandbox_negative_scenario");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@When("enters valid email id and valid password in the login page in the compliance manager sandbox negative scenario")
public void enters_valid_email_id_and_valid_password_in_the_login_page_in_the_compliance_manager_sandbox_negative_scenario() throws InterruptedException, IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_emaill",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("valid_email_pass_of_complaince_sandbox_workflow_negatve");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_passwordd",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("valid_password_email_of_complaince_sandbox_workflow_negative");
		}
}

@Then("click on the login button after entering valid email id and valid password in the compliance manager sandbox negative scenario")
public void click_on_the_login_button_after_entering_valid_email_id_and_valid_password_in_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_login_button_after_entering_valid_email_id_and_valid_password_in_the_compliance_manager_sandbox_negative_scenario");
		
		}
}
@When("complince manager click on the sanbox in the dasboard")
public void complince_manager_click_on_the_sanbox_in_the_dasboard() throws IOException {
	try {
		click("sandbox2");
	    Thread.sleep(3000);
	    browser_wait(5000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("complince_manager_click_on_the_sanbox_in_the_dasboard");
		}
}

@Then("check that complince manager is sucessfully navigated to thesandbox page")
public void check_that_complince_manager_is_sucessfully_navigated_to_thesandbox_page() throws IOException, InterruptedException {
	try {
		str= driver.findElement(By.xpath(OR_reader("com_sand_landing_page"))).getText();
		Assert.assertEquals(str,td_reader("com_sand_landing_page"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("check_that_complince_manager_is_sucessfully_navigated_to_thesandbox_page");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@Then("click on the authorize button in the sandbox dasboard in sandbox negative scenario")
public void click_on_the_authorize_button_in_the_sandbox_dasboard_in_sandbox_negative_scenario() throws IOException {
	try {
		click("authorize");
	    Thread.sleep(3000);
	    browser_wait(5000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_authorize_button_in_the_sandbox_dasboard_in_sandbox_negative_scenario");
		}
}

@Then("give the invalid api key in the available authorizations page in sandbox negative scenario")
public void give_the_invalid_api_key_in_the_available_authorizations_page_in_sandbox_negative_scenario() throws IOException, InterruptedException {
	try {
		driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("invalid_api",0));
		Thread.sleep(1000);
	   browser_wait(3000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("give_the_invalid_api_key_in_the_available_authorizations_page_in_sandbox_negative_scenario");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@Then("click the authorize button in the available authorizations page in sandbox negative scenario")
public void click_the_authorize_button_in_the_available_authorizations_page_in_sandbox_negative_scenario() throws IOException, InterruptedException {
	try {
		click("authorize1");
	    Thread.sleep(3000);
	    browser_wait(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_the_authorize_button_in_the_available_authorizations_page_in_sandbox_negative_scenario");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@Then("close the internal available authorizations page in sandbox negative scenario")
public void close_the_internal_available_authorizations_page_in_sandbox_negative_scenario() throws IOException, InterruptedException {
	try {
		click("close");
		//scrolldown();
	    Thread.sleep(1000);
	    browser_wait(3000);
	   scrolldown();
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("close_the_internal_available_authorizations_page_in_sandbox_negative_scenario");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@When("click on the encounter resource")
public void click_on_the_encounter_resource() throws IOException, InterruptedException {
	try {
		scrolldown();
		Thread.sleep(1000);
		click("encounter");
	    Thread.sleep(1000);
	    browser_wait(3000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_encounter_resource");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@Then("click on the try it out button inside the encounter resource")
public void click_on_the_try_it_out_button_inside_the_encounter_resource() throws IOException, InterruptedException {
	try {
		click("try_it_out1");
	    Thread.sleep(1000);
	    browser_wait(3000);
	    // Write code here that turns the phrase above into concrete actions
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_try_it_out_button_inside_the_encounter_resource");
			Thread.sleep(1000);
			browser_wait(500);
		}

}

@Then("give any text inside the tenat field of the encounter")
public void give_any_text_inside_the_tenat_field_of_the_encounter() throws IOException, InterruptedException {
	try {
		driver.findElement(By.xpath(OR_reader( "sand_input1"))).sendKeys(td_reader("sand_value",0));
		Thread.sleep(2000);
	   browser_wait(1000);//scrolldown();
	    // Write code here that turns the phrase above into concrete actions
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("give any text inside the tenat field of the encounter");
			Thread.sleep(1000);
			browser_wait(500);
		}

}

@Then("click on the execute button inside the encounter")
public void click_on_the_execute_button_inside_the_encounter() throws IOException {
	try {
		click("execute1");
		scrolldown();
	   Thread.sleep(5000);
	   browser_wait(7000);
	    // Write code here that turns the phrase above into concrete actions
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_execute_button_inside_the_encounter");
			
		}
}
@When("complince manager click the applications in dashboard")
public void complince_manager_click_the_applications_in_dashboard() throws IOException {
	try {
		click("applications_cmsa");
	    Thread.sleep(5000);
	    browser_wait(7000);
	    // Write code here that turns the phrase above into concrete actions
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("complince_manager_click_the_applications_in_dashboard");
			
		}
}

@Then("complince manager click on the any one of the pending application")
public void complince_manager_click_on_the_any_one_of_the_pending_application() throws IOException {
	try {
		click("last_appli");
	    Thread.sleep(5000);
	    browser_wait(7000);
	    // Write code here that turns the phrase above into concrete actions
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("complince_manager_click_on_the_any_one_of_the_pending_application");
			
		}
}

@Then("get the api key for the application")
public void get_the_api_key_for_the_application() throws IOException {
	try {
		myapi = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div[14]/div/div[2]/div")).getText();	 
		System.out.println(myapi);
	    // Write code here that turns the phrase above into concrete actions
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("get_the_api_key_for_the_application");
			
		}
}

@Then("after that close that application tab")
public void after_that_close_that_application_tab() throws IOException {
	try {
		click("api_xsymbol");
	    Thread.sleep(3000);
	    browser_wait(5000);
	    //
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("after_that_close_that_application_tab");
			
		}
}

@When("complince manager click on the sandbox in the dashbord for giving the valid api key")
public void complince_manager_click_on_the_sandbox_in_the_dashbord_for_giving_the_valid_api_key() throws IOException {
	try {
		click("sandbox2");
	    Thread.sleep(3000);
	    browser_wait(5000);
	    //
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("complince_manager_click_on_the_sandbox_in_the_dashbord_for_giving_the_valid_api_key");
			
		}
}

@Then("complince manager click on the authorize for giving the valid api key")
public void complince_manager_click_on_the_authorize_for_giving_the_valid_api_key() throws IOException {
	try {
		click("authorize");
	    Thread.sleep(3000);
	    browser_wait(5000);
	    //
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("complince_manager_click_on_the_authorize_for_giving_the_valid_api_key");
			
		}
}

@Then("complince manager give the valid api key")
public void complince_manager_give_the_valid_api_key() throws IOException {
	try {
		System.out.println(myapi);
		driver.findElement(By.xpath(OR_reader("api_input"))).sendKeys(myapi);
		
		//WebElement a=driver.findElement(By.xpath("//input[@placeholder='TENANT']"));
		//a.sendKeys(myOrderText);
		
		//driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("api_value",0));
		//driver.findElement(By.xpath("//input[@placeholder='TENANT']")).sendKeys(td_reader("api_value",0));
		Thread.sleep(2000);
	    browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("complince_manager_give_the_valid_api_key");
			
		}
}

@Then("complince manager click on the authorize1 after giving the valid api key")
public void complince_manager_click_on_the_authorize1_after_giving_the_valid_api_key() throws IOException {
	try {
		click("authorize1");
	    Thread.sleep(3000);
	    browser_wait(5000);
	    //
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("complince_manager_click_on_the_authorize1_after_giving_the_valid_api_key");
			
		}
}

@When("click on the encounter after giving the valid api key")
public void click_on_the_encounter_after_giving_the_valid_api_key() throws IOException {
	try {
		scrolldown();
		Thread.sleep(1000);
		click("encounter");
	    Thread.sleep(1000);
	    browser_wait(3000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_encounter_after_giving_the_valid_api_key");
			
		}
}

@Then("click on the try it out button inside the enconter after giving the valid api key")
public void click_on_the_try_it_out_button_inside_the_enconter_after_giving_the_valid_api_key() throws IOException {
	try {
		click("try_it_out1");
	    Thread.sleep(1000);
	    browser_wait(3000);
		
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_try_it_out_button_inside_the_enconter_after_giving_the_valid_api_key");
			
		}
}

@Then("click on the execute button of the encounter resorce and check it with out giving the tenant value")
public void click_on_the_execute_button_of_the_encounter_resorce_and_check_it_with_out_giving_the_tenant_value() throws IOException {
	try {
		click("execute1");
		scrolldown();
	   Thread.sleep(5000);
	   browser_wait(7000);
	   //scrolldown()
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_execute_button_of_the_encounter_resorce_and_check_it_with_out_giving_the_tenant_value");
			
		}
}

@When("complince manager click on the tenant field for giving the tenant value")
public void complince_manager_click_on_the_tenant_field_for_giving_the_tenant_value() throws IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "sand_input1"))).sendKeys(td_reader("sand_value",0));
		Thread.sleep(2000);
	   browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("complince_manager_click_on_the_tenant_field_for_giving_the_tenant_value");
			
		}
}

@Then("complince manager click the execute button of the encounter resouce")
public void complince_manager_click_the_execute_button_of_the_encounter_resouce() throws IOException {
	try {
		click("execute1");
		scrolldown();
	   Thread.sleep(5000);
	   browser_wait(7000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("complince_manager_click_the_execute_button_of_the_encounter_resouce");
			
		}
}
@When("click the provider directory present in compliance manager sandbox negative scenario")
public void click_the_provider_directory_present_in_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		click("cm_pe_provider_directory");
	    Thread.sleep(3000);
	    browser_wait(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_the_provider_directory_present_in_compliance_manager_sandbox_negative_scenario");
			
		}
}
@Then("click authorize") 
	public void click_authorize() throws IOException {	
	try {
		click("cm_pe_provider_directory_authorize");
	    Thread.sleep(3000);
	    browser_wait(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_authorize");
			
		}
}
@Then("give the invalid api key in that field in the compliance manager sandbox negative scenario")
public void give_the_invalid_api_key_in_that_field_in_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "cm_pe_provider_directory_api"))).sendKeys(td_reader("invalid_api",0));
		Thread.sleep(1000);
	   browser_wait(3000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("give_the_invalid_api_key_in_that_field_in_the_compliance_manager_sandbox_negative_scenario");
			
		}
}

@Then("click on the authorize button after giving the invalid api key for checking the compliance manager sandbox negative scenario")
public void click_on_the_authorize_button_after_giving_the_invalid_api_key_for_checking_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		click("cm_pe_provider_directory_authorize1");
	    Thread.sleep(3000);
	    browser_wait(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_authorize_button_after_giving_the_invalid_api_key_for_checking_the_compliance_manager_sandbox_negative_scenario");
			
		}
}

@Then("click on the into button after giving the invalid api key in compliance manager sandbox negative scenario")
public void click_on_the_into_button_after_giving_the_invalid_api_key_in_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		click("cm_pe_provider_directory_into");
	    Thread.sleep(3000);
	    browser_wait(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_into_button_after_giving_the_invalid_api_key_in_compliance_manager_sandbox_negative_scenario");
			
		}
}

@When("click on the healthcareservices provider directory for checking the compliance manager sandbox negative scenario")
public void click_on_the_healthcareservices_provider_directory_for_checking_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		click("cm_pe_provider_directory_endpoints");
	    Thread.sleep(3000);
	    browser_wait(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_healthcareservices_provider_directory_for_checking_the_compliance_manager_sandbox_negative_scenario");
			
		}
}

@Then("click on the try it out in the theprovider directory for checking the  compliance manager sandbox negative scenario")
public void click_on_the_try_it_out_in_the_theprovider_directory_for_checking_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		click("cm_pe_provider_directory_tryit");
	    Thread.sleep(3000);
	    browser_wait(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_try_it_out_in_the_theprovider_directory_for_checking_the_compliance_manager_sandbox_negative_scenario");
			
		}
}

@Then("give the tenant value for hitting sandbox APIs for checking the compliance manager sandbox negative scenario")
public void give_the_tenant_value_for_hitting_sandbox_ap_is_for_checking_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		driver.findElement(By.xpath(OR_reader("cm_pe_provider_directory_tenat"))).sendKeys(td_reader("sand_value",0));
		Thread.sleep(2000);
	   browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("give_the_tenant_value_for_hitting_sandbox_ap_is_for_checking_the_compliance_manager_sandbox_negative_scenario");
			
		}
}

@Then("click on the execute button in the provider directory for checking the  compliance manager sandbox negative scenario")
public void click_on_the_execute_button_in_the_provider_directory_for_checking_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		click("cm_pe_provider_directory_execute");
		scrolldown();
	    Thread.sleep(9000);
	    browser_wait(7000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_execute_button_in_the_provider_directory_for_checking_the_compliance_manager_sandbox_negative_scenario");
			
		}
}

@When("click the authorize button for giving the valid api key")
public void click_the_authorize_button_for_giving_the_valid_api_key() throws IOException {
	try {
		click("cm_pe_provider_directory_authorize");
	    Thread.sleep(3000);
	    browser_wait(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_the_authorize_button_for_giving_the_valid_api_key");
			
		}
}

@Then("compliance manager click on the logout button for giving the valid api key")
public void compliance_manager_click_on_the_logout_button_for_giving_the_valid_api_key() throws IOException {
	try {
		click("logout");
		scrolldown();
	    Thread.sleep(9000);
	    browser_wait(7000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("compliance_manager_click_on_the_logout_button_for_giving_the_valid_api_key");
			
		}
}

@Then("give the valid api key in that field in the compliance manager sandbox negative scenario")
public void give_the_valid_api_key_in_that_field_in_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try {
		System.out.println(myapi);
		driver.findElement(By.xpath(OR_reader("cm_pe_provider_directory_api"))).sendKeys(myapi);
		Thread.sleep(2000);
	    browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("give_the_valid_api_key_in_that_field_in_the_compliance_manager_sandbox_negative_scenario");
			
		}
}

@Then("click on the authorize button after giving the valid api key for checking the compliance manager sandbox negative scenario")
public void click_on_the_authorize_button_after_giving_the_valid_api_key_for_checking_the_compliance_manager_sandbox_negative_scenario() throws IOException {
	try{
		click("cm_pe_provider_directory_authorize1");
	    Thread.sleep(3000);
	    browser_wait(5000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("cm_pe_provider_directory_authorize1");
}
}

@Then("click on the into button after giving the valid api key in compliance manager sandbox negative scenario")
public void click_on_the_into_button_after_giving_the_valid_api_key_in_compliance_manager_sandbox_negative_scenario() throws IOException {
	try{
		click("cm_pe_provider_directory_into");
	    Thread.sleep(3000);
	    browser_wait(5000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_into_button_after_giving_the_valid_api_key_in_compliance_manager_sandbox_negative_scenario");
}
}

@Then("click on the execute button in the provider directory with valid api key")
public void click_on_the_execute_button_in_the_provider_directory_with_valid_api_key() throws IOException {
	try{
		click("cm_pe_provider_directory_execute");
		scrolldown();
	    Thread.sleep(9000);
	    browser_wait(7000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("cm_pe_provider_directory_execute");
}
	
}












@When("compliance manager click the applications in dashboard for copying the valid api key")
public void compliance_manager_click_the_applications_in_dashboard_for_copying_the_valid_api_key() throws IOException {
	try{
		click("cm_appli");
	    Thread.sleep(3000);
	    browser_wait(5000);
		
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("compliance_manager_click_the_applications_in_dashboard_for_copying_the_valid_api_key");
	}
}
@Then("click approve")
public void click_approve() throws IOException {
	try{
		click("approved");
	    Thread.sleep(3000);
	    browser_wait(5000);
		
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_approve");
	}
}
@Then("compliance manager click on the any one of the pending application")
public void compliance_manager_click_on_the_any_one_of_the_pending_application() throws IOException {
	try{
		click("com_ap_last_app");
		
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("compliance_manager_click_on_the_any_one_of_the_pending_application");
	}
}

@Then("get the valid api key of the approved application")
public void get_the_valid_api_key_of_the_approved_application() throws IOException {
	try{
		myapi = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div[14]/div/div[2]/div")).getText();	 
		System.out.println(myapi);
		
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("get_the_valid_api_key_of_the_approved_application");
	}
}


@Then("after that compliance manager close that application tab")
public void after_that_compliance_manager_close_that_application_tab() throws IOException {
	try{
		click("api_xsymbol");
	    Thread.sleep(3000);
	    browser_wait(5000);
		
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("after_that_compliance_manager_close_that_application_tab");
	}
}

@When("compliance manager click on the sandbox in the dashbord for giving the valid api key of the approved application")
public void compliance_manager_click_on_the_sandbox_in_the_dashbord_for_giving_the_valid_api_key_of_the_approved_application() throws IOException {
	try{
		click("sandbox2");
	    Thread.sleep(3000);
	    browser_wait(5000);
	    //
		
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("compliance_manager_click_on_the_sandbox_in_the_dashbord_for_giving_the_valid_api_key_of_the_approved_application");
	}
}

@Then("compliance manager click on the authorize for giving the valid api key")
public void compliance_manager_click_on_the_authorize_for_giving_the_valid_api_key() throws IOException {
	try{
		click("authorize");
	    Thread.sleep(500);
	    browser_wait(1000);
	    //throw new io.cucumber.java.PendingException();
		
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("compliance_manager_click_on_the_authorize_for_giving_the_valid_api_key");
	}
}

@Then("compliance manager give the valid approved application api key")
public void compliance_manager_give_the_valid_approved_application_api_key() throws IOException {
	try{
		System.out.println(myapi);
		driver.findElement(By.xpath(OR_reader("api_input"))).sendKeys(myapi);
		
		
}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("compliance_manager_give_the_valid_approved_application_api_key");
	}
}

@Then("compliance manager click on the authorize1 after giving the valid api key of the approved application")
public void compliance_manager_click_on_the_authorize1_after_giving_the_valid_api_key_of_the_approved_application() throws IOException {
	try{
		click("authorize1");
	    Thread.sleep(1000);
	    browser_wait(3000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	   
		
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("compliance_manager_click_on_the_authorize1_after_giving_the_valid_api_key_of_the_approved_application");
	}
	}
	
	

@Then("click on the into button after giving the valid api key of the approved application")
public void click_on_the_into_button_after_giving_the_valid_api_key_of_the_approved_application() throws IOException {
	try{
		click("close");
		//scrolldown();
	    Thread.sleep(1000);
	    browser_wait(2000);
	   
		
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_into_button_after_giving_the_valid_api_key_of_the_approved_application");
}
}

@When("click on the patient after giving the valid api key")
public void click_on_the_patient_after_giving_the_valid_api_key() throws IOException {
	try{
		click("patient_cm_api");
		//scrolldown();
	   Thread.sleep(1000);
	   browser_wait(3000);
	   
		
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_patient_after_giving_the_valid_api_key");
}
}

@Then("click on the try it out button inside the patient after giving the valid api key")
public void click_on_the_try_it_out_button_inside_the_patient_after_giving_the_valid_api_key() throws IOException {
	try{
		click("patient_cm_try_it_out");
		//scrolldown();
	   Thread.sleep(1000);
	   browser_wait(3000);
		
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_try_it_out_button_inside_the_patient_after_giving_the_valid_api_key");
}
    }

@Then("click on the execute button of the patient resorce and check it with out giving the tenant value")
public void click_on_the_execute_button_of_the_patient_resorce_and_check_it_with_out_giving_the_tenant_value() throws IOException  {
	try{
		click("patient_complaince_execute");
		scrolldown();
	   Thread.sleep(9000);
	   browser_wait(7000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_execute_button_of_the_patient_resorce_and_check_it_with_out_giving_the_tenant_value");
}

}

@When("compliance manager click on the tenant field for giving the tenant value and checking the sandbox working")
public void compliance_manager_click_on_the_tenant_field_for_giving_the_tenant_value_and_checking_the_sandbox_working() throws IOException {
	try{
		driver.findElement(By.xpath(OR_reader("patient_cm_tenat"))).sendKeys(td_reader("sand_value",0));
		Thread.sleep(2000);
	   browser_wait(1000);
			}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("compliance_manager_click_on_the_tenant_field_for_giving_the_tenant_value_and_checking_the_sandbox_working");
}
}

@Then("compliance manager click the execute button of the patient resouce")
public void compliance_manager_click_the_execute_button_of_the_patient_resouce() throws IOException {
	try{
		click("patient_complaince_execute");
		scrolldown();
	   Thread.sleep(9000);
	   browser_wait(7000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("compliance_manager_click_on_the_signout_field_in_compliance_manager_sandbox_negative_scenario");
}

}

@When("compliance manager click on the signout field in  compliance manager sandbox negative scenario")
public void compliance_manager_click_on_the_signout_field_in_compliance_manager_sandbox_negative_scenario1() throws IOException {
	try{
		click("so1");
		
		Thread.sleep(3000);
	    browser_wait(5000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("compliance_manager_click_on_the_signout_field_in_compliance_manager_sandbox_negative_scenario");
}
	
}



@Then("compliance manager click the logout field in  compliance manager sandbox negative scenario")
public void compliance_manager_click_the_logout_field_in_compliance_manager_sandbox_negative_scenario1() throws IOException {
	try{
		click("so2");
		
		Thread.sleep(3000);
	    browser_wait(5000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("compliance_manager_click_the_logout_field_in_compliance_manager_sandbox_negative_scenario");
}
	
}
}
