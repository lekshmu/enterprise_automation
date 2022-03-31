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

public class ComplinceManager_WorkFlow_NeativeScenario extends Generic_function{

static int s;
static String str;
static boolean value;

@Given("launch the url for checking the compliance manager workflow negative scenario")
public void launch_the_url_for_checking_the_compliance_manager_workflow_negative_scenario() throws IOException {
	try {
		browser_launch();
		s= Dataiter();
		browser_wait(120000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("launch_the_url_for_checking_the_compliance_manager_workflow_negative_scenario");
			
		}
}

@When("click on the login button for checking the compliance manager workflow negative scenario")
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

@When("check that the user lands on the login page successfully for checking the compliance manager workflow negative scenario")
public void check_that_the_user_lands_on_the_login_page_successfully_for_checking_the_compliance_manager_workflow_negative_scenario() throws IOException {
	try{
		str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();

	Assert.assertEquals(str,td_reader("login_title"));
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("check_that_the_user_lands_on_the_login_page_successfully_for_checking_the_compliance_manager_workflow_negative_scenario");
}
}

@Then("click on the first login part of the compliance manager workflow negative scenario")
public void click_on_the_first_login_part_of_the_compliance_manager_workflow_negative_scenario() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_first_login_part_of_the_compliance_manager_workflow_negative_scenario");
		
		}
}

@Then("validation message is displiayed for the compliance manager workflow negative scenario")
public void validation_message_is_displiayed_for_the_compliance_manager_workflow_negative_scenario() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("validation_message_is_displiayed_for_the_compliance_manager_workflow_negative_scenario");
			
		}
}

@When("enters invalid email id and invalid password in the login page in compliance manager workflow negative scenario")
public void enters_invalid_email_id_and_invalid_password_in_the_login_page_in_compliance_manager_workflow_negative_scenario() throws IOException, InterruptedException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("complince_manager_invalid_email",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_email_of_complaince_manager_workflow_negative_scenarios");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("complince_manager_invalid_pass",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_password_of_complaince_manager_workflow_negative_scenarios");
		}}

@Then("click on the login button after entering invalid email id and invalid password in compliance manager workflow negative scenario")
public void click_on_the_login_button_after_entering_invalid_email_id_and_invalid_password_in_compliance_manager_workflow_negative_scenario() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_login_button_after_entering_invalid_email_id_and_invalid_password_in_compliance_manager_workflow_negative_scenario");
		
		}
}

@Then("check the validation msg in the compliance manager workflow negative scenario")
public void check_the_validation_msg_in_the_compliance_manager_workflow_negative_scenario() throws InterruptedException, IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("check_the_validation_msg_in_the_compliance_manager_workflow_negative_scenario");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@When("enters valid email id and invalid password in the login page of the compliance manager workflow negative scenario")
public void enters_valid_email_id_and_invalid_password_in_the_login_page_of_the_compliance_manager_workflow_negative_scenario() throws InterruptedException, IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_emaill",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("valid_email_of__complaince_negative_workflow");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("complince_manager_invalid_pass",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_password_of_complaince_negative_workflow");
		}
}

@Then("click on the login button after entering valid email id and invalid password in the compliance manager workflow negative scenario")
public void click_on_the_login_button_after_entering_valid_email_id_and_invalid_password_in_the_compliance_manager_workflow_negative_scenario() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_login_button_after_entering_valid_email_id_and_invalid_password_in_the_compliance_manager_workflow_negative_scenario");
		
		}
}

@Then("check the validation msg after entering valid email id and invalid password in the compliance manager workflow negative scenario")
public void check_the_validation_msg_after_entering_valid_email_id_and_invalid_password_in_the_compliance_manager_workflow_negative_scenario() throws IOException, InterruptedException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("check_the_validation_msg_after_entering_valid_email_id_and_invalid_password_in_the_compliance_manager_workflow_negative_scenario");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@When("enters invalid email id and valid password in the login page of the compliance manager workflow negative scenario")
public void enters_invalid_email_id_and_valid_password_in_the_login_page_of_the_compliance_manager_workflow_negative_scenario() throws InterruptedException, IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("complince_manager_invalid_email",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_email_valid_pass_of_complaince_workflow_negative");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("complince_manager_invalid_pass",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("valid_pass_invalid_email_of_complaince_workflow_negative");
		}
}

@Then("click on the login button after entering invalid email id and valid password in the compliance manager workflow negative scenario")
public void click_on_the_login_button_after_entering_invalid_email_id_and_valid_password_in_the_compliance_manager_workflow_negative_scenario() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_login_button_after_entering_invalid_email_id_and_valid_password_in_the_compliance_manager_workflow_negative_scenario");
		
		}
}

@Then("check the validation msg after entering invalid email id and valid password in the compliance manager workflow negative scenario")
public void check_the_validation_msg_after_entering_invalid_email_id_and_valid_password_in_the_compliance_manager_workflow_negative_scenario() throws IOException, InterruptedException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("check_the_validation_msg_after_entering_invalid_email_id_and_valid_password_in_the_compliance_manager_workflow_negative_scenario");
			Thread.sleep(1000);
			browser_wait(500);
		}}

@When("enters valid email id and valid password in the login page in the compliance manager workflow negative scenario")
public void enters_valid_email_id_and_valid_password_in_the_login_page_in_the_compliance_manager_workflow_negative_scenario() throws InterruptedException, IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_emaill",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("valid_email_pass_of_complaince_workflow_negatve");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_passwordd",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("valid_password_email_of_complaince_workflow_negative");
		}
}

@Then("click on the login button after entering valid email id and valid password in the compliance manager workflow negative scenario")
public void click_on_the_login_button_after_entering_valid_email_id_and_valid_password_in_the_compliance_manager_workflow_negative_scenario() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_login_button_after_entering_valid_email_id_and_valid_password_in_the_compliance_manager_workflow_negative_scenario");
		
		}
}
@When("complaince manager click on the pending button in the dashboard for approving")
public void complaince_manager_click_on_the_pending_button_in_the_dashboard_for_approving() throws IOException {
	try{
		click("pending");
	
    Thread.sleep(5000);
    browser_wait(7000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("complaince_manager_click_on_the_pending_button_in_the_dashboard_for_approving");
		}
}
@Then("able to see the applications in the pending lists")
public void able_to_see_the_applications_in_the_pending_lists() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("cm_third_first_app_dash"))).getText();
		Assert.assertEquals(str,td_reader("cm_third_first_app_dash"));
			
		Thread.sleep(5000);
	    browser_wait(7000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("able_to_see_the_applications_in_the_pending_lists");
	}
}
@When("click on the last created application in the pending list")
public void click_on_the_last_created_application_in_the_pending_list() throws IOException {
	try {
		//click("checking1");
			click("last_appli");
			
		Thread.sleep(5000);
	    browser_wait(7000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_last_created_application_in_the_pending_list");
	}
}

@Then("click on the approve button for approving the application")
public void click_on_the_approve_button_for_approving_the_application() throws IOException {
	try {

		WebElement approve= driver.findElement(By.xpath("//*[contains(text(),'Approve Request')]"));
		//click("approve");
		approve.click();
		Thread.sleep(3000);
	    browser_wait(5000);
	    throw new io.cucumber.java.PendingException();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_approve_button_for_approving_the_application");
			
			}
}

@When("complaince manager click on the pending button in the dashboard for denying")
public void complaince_manager_click_on_the_pending_button_in_the_dashboard_for_denying() throws IOException {
	try {
    	click("pending2");
        Thread.sleep(5000);
        browser_wait(7000);
        
    
	} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("complaince_manager_click_on_the_pending_button_in_the_dashboard_for_denying");
	
	}
}

@Then("able to see the applications presented in the pending list")
public void able_to_see_the_applications_presented_in_the_pending_list() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("cm_third_first_app_dash"))).getText();
		Assert.assertEquals(str,td_reader("cm_third_first_app_dash"));
			
		Thread.sleep(5000);
	    browser_wait(7000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("able_to_see_the_applications_presented_in_the_pending_list");
	}
}

@When("click on the last created application in the pending list for denying")
public void click_on_the_last_created_application_in_the_pending_list_for_denying() throws IOException {
	try {
		//click("checking1");
			click("last_appli");
			
		Thread.sleep(5000);
	    browser_wait(7000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_last_created_application_in_the_pending_list_for_denying");
	}
}

@Then("click on the deny button for denying the application")
public void click_on_the_deny_button_for_denying_the_application() throws IOException {
	try{
		click("deny");
	
    Thread.sleep(3000);
    browser_wait(5000);
   // throw new io.cucumber.java.PendingException();
} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("click_on_the_deny_button_for_denying_the_application");
	
	}
}
@When("complaince manager click on the approved field to perfome revoke acess operation")
public void complaince_manager_click_on_the_approved_field_to_perfome_revoke_acess_operation()  throws IOException {
	try{
		click("internal_approve_dash");
	
    Thread.sleep(5000);
    browser_wait(7000);
   // throw new io.cucumber.java.PendingException();
} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("complaince_manager_click_on_the_approved_field_to_perfome_frevoke_acess_operation");
	
	}
}

@Then("able to see the applications presented in the approved list")
public void able_to_see_the_applications_presented_in_the_approved_list() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("cm_third_first_app_dash"))).getText();
		Assert.assertEquals(str,td_reader("cm_third_first_app_dash"));
			
		Thread.sleep(3000);
	    browser_wait(5000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("able_to_see_the_applications_presented_in_the_approved_list");
	}}

@When("click on the last application presented in the approved list")
public void click_on_the_last_application_presented_in_the_approved_list() throws IOException {
	try {
		//click("checking1");
			click("app_last_app");
			
		Thread.sleep(3000);
	    browser_wait(5000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_last_application_presented_in_the_approved_list");
		
}}

@Then("click on the revoke acess button to cancel the approval of theapplication")
public void click_on_the_revoke_acess_button_to_cancel_the_approval_of_theapplication() throws IOException {
	try {
		//click("checking1");
			click("revoke_acess");
			
		Thread.sleep(5000);
	    browser_wait(7000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_revoke_acess_button_to_cancel_the_approval_of_theapplication");
		
}}
@When("complaince manager click on the pending field")
public void complaince_manager_click_on_the_pending_field() throws IOException {
	try{
		click("internal_dashboard_applications_pending");
	
    Thread.sleep(3000);
    browser_wait(5000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("complaince_manager_click_on_the_pending_field");
		}
}

@Then("complince manager click on the approved field")
public void complince_manager_click_on_the_approved_field() throws IOException {
	try{
		click("internal_approve_dash");
	
    Thread.sleep(3000);
    browser_wait(000);
   // throw new io.cucumber.java.PendingException();
} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("complince_manager_click_on_the_approved_field");
	
	}
}

@Then("complince manager click on the denied field")
public void complince_manager_click_on_the_denied_field() throws IOException {
	try{
		click("com_deny_dash");
	
    Thread.sleep(3000);
    browser_wait(000);
   // throw new io.cucumber.java.PendingException();
} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("complince_manager_click_on_the_denied_field");
	
	}
}

@When("complaince manager click on the logout")
public void complaince_manager_click_on_the_logout() throws IOException {
	try{
		click("so1");
		
		Thread.sleep(3000);
	    browser_wait(5000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("complaince_manager_click_on_the_logout");
}
}

@Then("complince manager click on the logout1")
public void complince_manager_click_on_the_logout1() throws IOException {
	try{
		click("so2");
		
		Thread.sleep(3000);
	    browser_wait(5000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("complince_manager_click_on_the_logout1");
}
}

}