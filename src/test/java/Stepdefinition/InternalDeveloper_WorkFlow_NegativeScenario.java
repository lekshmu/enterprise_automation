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

public class InternalDeveloper_WorkFlow_NegativeScenario extends Generic_function{

static int s;
static String str;
static boolean value;

@Given("launch the url for checking the internaldeveloper login criteria")
public void launch_the_url_for_checking_the_internaldeveloper_login_criteria() throws IOException {
	try {
		browser_launch();
		s= Dataiter();
		browser_wait(120000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("launch_the_url_for_checking_the_internaldeveloper_login_criteria_negative_scenarios");
			
		}

}

@When("click on the login button for checking the internaldeveloper login criteria")
public void click_on_the_login_button_for_checking_the_internaldeveloper_login_criteria() throws IOException {
	try {
		click("first_login");
		Thread.sleep(3000);
		browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_login_button_for_checking_the_internaldeveloper_login_criteria");
			
		}
}

@Then("check that the user lands on the login page successfully for checking the internaldeveloper login criteria")
public void check_that_the_user_lands_on_the_login_page_successfully_for_checking_the_internaldeveloper_login_criteria() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
		Assert.assertEquals(str,td_reader("login_title"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("check_that_the_user_lands_on_the_login_page_successfully_for_checking_the_internaldeveloper_login_criteria");
			
		}
}

@Then("click on the first login part for internaldeveloper login criteria")
public void click_on_the_first_login_part_for_internaldeveloper_login_criteria() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_first_login_part_for_internaldeveloper_login_criteria");
		
		}
}

@Then("checking the validation msg after entering the invalid credentials")
public void checking_the_validation_msg_after_entering_the_invalid_credentials() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("checking_the_validation_msg_after_entering_the_invalid_credentials");
			
		}

}

@When("internaldeveloper enters invalid email id and invalid password in the login page")
public void internaldeveloper_enters_invalid_email_id_and_invalid_password_in_the_login_page() throws InterruptedException, IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("internal_developer_negative_invalid_email",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_email_of_internaldeveloper_workflow_negative_scenarios");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("internal_developer_negative_invalid_pass",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_password_of_internaldeveloper_workflow_negative_scenarios");
		}  
}

@Then("internaldeveloper click on the login button after entering invalid email id and invalid password")
public void internaldeveloper_click_on_the_login_button_after_entering_invalid_email_id_and_invalid_password() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internaldeveloper_click_on_the_login_button_after_entering_invalid_email_id_and_invalid_password");
		
		}
}

@Then("check that internaldeveloper gets a validation msg")
public void check_that_internaldeveloper_gets_a_validation_msg() throws IOException, InterruptedException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("check_that_internaldeveloper_gets_a_validation_msg");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@When("internaldeveloper enters valid email id and invalid password in the login page")
public void internaldeveloper_enters_valid_email_id_and_invalid_password_in_the_login_page() throws InterruptedException, IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_email",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_workflow_negative__enters_valid_email_id_and_invalid_password_in_the_login_page");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("internal_developer_negative_invalid_pass",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_workflow_negative_logins_invalid_password_valid_emai_in_the_login_page");
		}
}

@Then("internaldeveloper click on the login button after entering valid email id and invalid password")
public void internaldeveloper_click_on_the_login_button_after_entering_valid_email_id_and_invalid_password() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internaldeveloper_click_on_the_login_button_after_entering_valid_email_id_and_invalid_password");
		
		}
}

@Then("internaldeveloper check the validation msg")
public void internaldeveloper_check_the_validation_msg() throws IOException, InterruptedException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internaldeveloper_check_the_validation_msg");
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@When("internaldeveloper enters invalid email id and valid password in the login page")
public void internaldeveloper_enters_invalid_email_id_and_valid_password_in_the_login_page() throws IOException, InterruptedException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("internal_developer_negative_invalid_email",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("invalid_email_valid_pass_of_workflow_negative_scenarios_login_page");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("valid_password_invalid_email_of_workflow_negative_scenarios_login_page");
		} 
}

@Then("internaldeveloper then click on the login button after entering invalid email id and valid password")
public void internaldeveloper_then_click_on_the_login_button_after_entering_invalid_email_id_and_valid_password() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internaldeveloper_then_click_on_the_login_button_after_entering_invalid_email_id_and_valid_password");
		
		}
}

@Then("checkthat internal developer get validation msg after entering invalid email id and valid password")
public void checkthat_internal_developer_get_validation_msg_after_entering_invalid_email_id_and_valid_password() throws InterruptedException {
	try {
		str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("validation_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			try {
				takeScreenShot("checkthat_internal_developer_get_validation_msg_after_entering_invalid_email_id_and_valid_password");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Thread.sleep(1000);
			browser_wait(500);
		}
}

@When("internaldeveloper enters valid email id and valid password in the login page")
public void internaldeveloper_enters_valid_email_id_and_valid_password_in_the_login_page() throws InterruptedException {
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

@Then("internaldeveloper click on the login button after entering valid email id and valid password")
public void internaldeveloper_click_on_the_login_button_after_entering_valid_email_id_and_valid_password() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internaldeveloper_click_on_the_login_button_after_entering_valid_email_id_and_valid_password");
		
		}
}
@When("click on the create application button in internaldeveloper Negative Workflow")
public void click_on_the_create_application_button_in_internaldeveloper_negative_workflow() throws IOException {
	try {
		click("create_app");
		Thread.sleep(3000);
		browser_wait(3000);
		
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_create_application_button_in_internaldeveloper_negative_workflow");

		str= driver.findElement(By.xpath(OR_reader("create_apph"))).getText();
		Assert.assertEquals(str,td_reader("create_apph"));
		}
}

@Then("lands on the create application page in internaldeveloper Negative Workflow")
public void lands_on_the_create_application_page_in_internaldeveloper_negative_workflow() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("internal_create_app_page"))).getText();
		Assert.assertEquals(str,td_reader("internal_create_app_page"));
		Thread.sleep(3000);
		browser_wait(3000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("lands_on_the_create_application_page_in_internaldeveloper_negative_workflow");
	}
}

@Then("giving only the app name")
public void giving_only_the_app_name() throws IOException {
	try {
		Random randomGeneratorapp1 = new Random();  
	    int randomInt = randomGeneratorapp1.nextInt(1000);
	    driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("Internal Application"+ randomInt );
	    Thread.sleep(3000);
		browser_wait(3000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internaldeveloper_negative_workflow_try-to_give_only_the_app_name");
	}
}

@Then("click on the create application button after giving the application name")
public void click_on_the_create_application_button_after_giving_the_application_name() throws IOException {
	try {
		click("create");
		Thread.sleep(3000);
		browser_wait(3000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_create_application_button_after_giving_the_application_name");
			}
}

@When("internal developer fill all mandatory fields")
public void internal_developer_fill_all_mandatory_fields() throws IOException {
	try {
		
	    
		Random randomGeneratordo = new Random();  
	    int randomIntdo1 = randomGeneratordo.nextInt(1000);
	   driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.edu");
		
	    String appdes1 = RandomStringUtils.randomAlphabetic(8);
		driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(appdes1);
		
	    Random randomGenerator = new Random();  
	    int randomIntem = randomGenerator.nextInt(1000);
	    driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("first"+ randomIntem +"@gmail.com");
	    
	  String appli1 = RandomStringUtils.randomAlphabetic(8);
	  driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);
			
	String appterms1 = RandomStringUtils.randomAlphabetic(8);
   driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);
		
  driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
 str= driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
 Assert.assertEquals(str,td_reader("query_limit"));
 click("query_limit");
		Thread.sleep(2000);
		browser_wait(3000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internal_developer_fill_all_mandatory_fields");
	}
}   

@Then("click on application ceation in the internaldeveloper Negative Workflow")
public void click_on_application_ceation_in_the_internaldeveloper_negative_workflow() throws IOException {
	try {
		click("create");
		Thread.sleep(3000);
		browser_wait(3000);
		
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_application_ceation_in_the_internaldeveloper_negative_workflow");
		}
}

@Then("close the window presented in the application creation in internaldeveloper Negative Workflow")
public void close_the_window_presented_in_the_application_creation_in_internaldeveloper_negative_workflow() throws IOException {
	try{
		click("xsymbol");
	
	Thread.sleep(3000);
    browser_wait(5000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("close_the_window_presented_in_the_application_creation_in_sandbox_negative_scenarios");
		}
}
@When("click on the create application button in internal developer workflow negative scenarios")
public void click_on_the_create_application_button_in_internal_developer_workflow_negative_scenarios() throws IOException {
	try {
		click("create_app");
		Thread.sleep(3000);
		browser_wait(3000);
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_create_application_button_in_internal_developer_workflow_negative_scenarios");
		}
}

@Then("lands on the create application page in  internal developer workflow negative scenarios")
public void lands_on_the_create_application_page_in_internal_developer_workflow_negative_scenarios() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("internal_create_app_heading"))).getText();
		Assert.assertEquals(str,td_reader("internal_create_app_heading"));
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("lands_on_the_create_application_page_in_internal_developer_workflow_negative_scenarios");
		}
}

@Then("able to fill some fiels and left some fields are blank in internal developer workflow negative scenarios")
public void able_to_fill_some_fiels_and_left_some_fields_are_blank_in_internal_developer_workflow_negative_scenarios() throws IOException {
	try {
		Random randomGeneratordo = new Random();  
	    int randomIntdo1 = randomGeneratordo.nextInt(1000);
	   driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.edu");
		
	    String appdes1 = RandomStringUtils.randomAlphabetic(8);
		driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(appdes1);
		
	    Random randomGenerator = new Random();  
	    int randomIntem = randomGenerator.nextInt(1000);
	    driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("first"+ randomIntem +"@gmail.com");
	    
	  String appli1 = RandomStringUtils.randomAlphabetic(8);
	  driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);
		Thread.sleep(2000);
		browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("able_to_fill_some_fiels_and_left_some_fields_are_blank_in_internal_developer_workflow_negative_scenarios");
	}
}

@Then("click on the create application button in the internal developer workflow negative scenario")
public void click_on_the_create_application_button_in_the_internal_developer_workflow_negative_scenario() throws IOException {
	try {
		click("create");
		Thread.sleep(3000);
		browser_wait(3000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_create_application_button_in_the_internal_developer_workflow_negative_scenario");
			}
}

@When("internal developer fill all mandatory fields in workflow negative scenarios")
public void internal_developer_fill_all_mandatory_fields_in_workflow_negative_scenarios() throws IOException {
	try{
		Random randomGeneratorapp1 = new Random();  
	    int randomInt = randomGeneratorapp1.nextInt(1000);
	    driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("Second Application"+ randomInt );
		
		String appterms1 = RandomStringUtils.randomAlphabetic(8);
		driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);
		
		//driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
		str= driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
		Assert.assertEquals(str,td_reader("query_limit"));
		click("query_limit");
} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("internal_developer_fill_all_mandatory_fields_in_workflow_negative_scenarios");
}

}

@Then("click on application ceation in the workflow negative scenarios")
public void click_on_application_ceation_in_the_workflow_negative_scenarios() throws IOException {
	try {
		click("create");
		Thread.sleep(3000);
		browser_wait(3000);
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_application_ceation_in_the_workflow_negative_scenarios");
		}
}

@Then("close the window presented in the application creation in workflow negative scenarios")
public void close_the_window_presented_in_the_application_creation_in_workflow_negative_scenarios() throws IOException {
	try{
		click("xsymbol");
	
	Thread.sleep(3000);
    browser_wait(5000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("close_the_window_presented_in_the_application_creation_in_workflow_negative_scenarios");
		}
}


@When("click on the create application button to check that with an invalid email id application is created or not in workflow negative scenarios")
public void click_on_the_create_application_button_to_check_that_with_an_invalid_email_id_application_is_created_or_not_in_workflow_negative_scenarios() throws IOException {
	try {
		click("create_app");
		Thread.sleep(3000);
		browser_wait(3000);
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot(" click_on_the_create_application_button_to_check_that_with_an_invalid_email_id_application_is_created_or_not_in_workflow_negative_scenarios");
		}
}

@Then("lands on the create application page in workflow negative scenarios")
public void lands_on_the_create_application_page_in_workflow_negative_scenarios() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("internal_create_app_heading"))).getText();
		Assert.assertEquals(str,td_reader("internal_create_app_heading"));
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("lands_on_the_create_application_page_in_workflow_negative_scenarios");
		}
}

@Then("tries to create application with invalid email format in workflow negative scenarios")
public void tries_to_create_application_with_invalid_email_format_in_workflow_negative_scenarios() throws IOException {
	try {
		
		Random randomGeneratorapp1 = new Random();  
	    int randomInt = randomGeneratorapp1.nextInt(1000);
	    driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("First Application"+ randomInt );
	    
		Random randomGeneratordo = new Random();  
	   int randomIntdo1 = randomGeneratordo.nextInt(1000);
	   driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.edu");
		
	    String appdes1 = RandomStringUtils.randomAlphabetic(8);
		driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(appdes1);
		
	    Random randomGenerator = new Random();  
	    int randomIntem = randomGenerator.nextInt(1000);
	    driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("invalid"+ randomIntem +"gmail.com");
	    
	   String appli1 = RandomStringUtils.randomAlphabetic(8);
	   driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);
			
	    String appterms1 = RandomStringUtils.randomAlphabetic(8);
		driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);
		
		//driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
		str= driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
		Assert.assertEquals(str,td_reader("query_limit"));
		click("query_limit");
		Thread.sleep(2000);
		browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("tries_to_create_application_with_invalid_email_format_in_workflow_negative_scenarios");
	}
}

@Then("internal developer click on the save button with an invalid email id in workflow negative scenarios")
public void internal_developer_click_on_the_save_button_with_an_invalid_email_id_in_workflow_negative_scenarios() throws IOException {
	try {
		click("create");
		Thread.sleep(3000);
		browser_wait(3000);
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_click_on_the_save_button_with_an_invalid_email_id_in_workflow_negative_scenarios");
		}
}

@When("internal developer giving valid email id in workflow negative scenarios")
public void internal_developer_giving_valid_email_id_in_workflow_negative_scenarios() throws IOException {
	try {
		backspace("app_em");
        Thread.sleep(1000);
	 Random randomGenerator = new Random();  
	    int randomIntem = randomGenerator.nextInt(1000);
	    driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("valid"+ randomIntem +"@gmail.com");
	    Thread.sleep(3000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_giving_valid_email_id_in_sandbox_negative_scenarios");
	}}

@Then("internal developer click on save button after giving the valid email id in workflow negative scenarios")
public void internal_developer_click_on_save_button_after_giving_the_valid_email_id_in_workflow_negative_scenarios() throws IOException {
	try {
		click("create");
		Thread.sleep(3000);
		browser_wait(3000);
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal developer click on save button after giving the valid email id in workflow negative scenarios");
		}
}

@Then("internal developer click on the cancel button after the application is created  in internaldeveloper")
public void internal_developer_click_on_the_cancel_button_after_the_application_is_created_in_internaldeveloper() throws IOException {
	try{
		click("xsymbol");
	
	Thread.sleep(3000);
    browser_wait(5000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_click_on_the_cancel_button_after_the_application_is_created_in_internaldeveloper");
		}
}

@When("internaldeveloper click on the pendig list in the dashboard")
public void internaldeveloper_click_on_the_pendig_list_in_the_dashboard() throws IOException {
	try {
		click("pending");
		browser_wait(1000);
		Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internaldeveloper_click_on_the_pendig_lis_in_the_dashboard");
	}
}

@When("internaldeveloper click one pending list of applicatons")
public void internaldeveloper_click_one_pending_list_of_applicatons() throws IOException {
	try {
		click("cm_third_pending_last_edit");
		browser_wait(1000);
		Thread.sleep(3000);
		
				
				}catch (Exception e) {
					e.printStackTrace();
					takeScreenShot("internaldeveloper_click_the_edit_button_of_the_last_created_applications");
			
	}
}

@Then("internaldeveloper click the edit button of the last created applications")
public void internaldeveloper_click_the_edit_button_of_the_last_created_applications() throws IOException {
	try {
		click("cm_third_pending_last_edit");
		browser_wait(1000);
		Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internaldeveloper_click_the_edit_button_of_the_last_created_applications");
	}
}

@Then("internaldeveloper tried to remove some fields in the applicatons")
public void internaldeveloper_tried_to_remove_some_fields_in_the_applicatons() throws IOException {
	try {
		backspace("app_name");
	     
			Thread.sleep(2000);
			browser_wait(1000);
		backspace("app_li");
   
		Thread.sleep(2000);
		browser_wait(1000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internaldeveloper_tried_to_remove_some_fields_in_the_applicatons");
	}
}

@Then("internaldeveloper click on the update button and check that the application is created or not")
public void internaldeveloper_click_on_the_update_button_and_check_that_the_application_is_created_or_not() throws IOException {
	try {
		click("thirdparty_negative_update");
		Thread.sleep(2000);
		browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internaldeveloper_click_on_the_update_button_and_check_that_the_application_is_created_or_not");
		}
}

@When("internaldevelopergive the valid data to edited fields after the failure of the applicaton creation")
public void internaldevelopergive_the_valid_data_to_edited_fields_after_the_failure_of_the_applicaton_creation() throws IOException {
	 try {
		 Random randomGeneratorapp1 = new Random();  
		    int randomInt = randomGeneratorapp1.nextInt(1000);
		    driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("Second Application"+ randomInt );
			
		 Random randomGeneratorappp = new Random();  
	    int randomIntapp = randomGeneratorappp.nextInt(1000);
      driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys("secondapplication"+ randomIntapp );
      Thread.sleep(2000);
		browser_wait(1000);
	 }  catch (Exception e) {
  		e.printStackTrace();
  		takeScreenShot("internaldevelopergive_the_valid_data_to_edited_fields_after_the_failure_of_the_applicaton_creation");
  	}
}

@Then("internaldeveloper click the updated button in the edit page")
public void internaldeveloper_click_the_updated_button_in_the_edit_page() throws IOException {
	try {
		click("thirdparty_negative_update");
      Thread.sleep(2000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internaldeveloper_click_the_updated_button_in_the_edit_page");
	}
}
@When("internaldeveloper click on the last created application")
public void internaldeveloper_click_on_the_last_created_application() throws IOException {
	try {
		click("internal_pending_last_delete");
		browser_wait(1000);
		Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internaldeveloper click on the last created application");
}
}
@Then("internaldeveloper click on the confirm button")
public void internaldeveloper_click_on_the_confirm_button() throws IOException {
	try {
		click("thirdparty_confirm");
		 Thread.sleep(3000);
		    browser_wait(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internaldeveloper_click_on_the_confirm_button");
}
}
@When("click on the price list in the internal developer workflow negative")
public void click_on_the_price_list_in_the_internal_developer_workflow_negative() throws IOException {
	try{
		click("internal_pricelist_negative_dash");
        Thread.sleep(3000);
        browser_wait(5000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_price_list_in_the_internal_developer_workflow_negative");
	}
}

@Then("validate navigated to the price list page list in the internal developer workflow negative")
public void validate_navigated_to_the_price_list_page_list_in_the_internal_developer_workflow_negative() throws IOException {
	try{
		str= driver.findElement(By.xpath(OR_reader("pricelist_title"))).getText();
	
    Assert.assertEquals(str,td_reader("pricelist_title"));
} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("validate_navigated_to_the_price_list_page_list_in_the_internal_developer_workflow_negative");
}
}

@When("click on the search button in the internal developer negative  workflow scenarios")
public void click_on_the_search_button_in_the_internal_developer_negative_workflow_scenarios() throws IOException {
	try{
		click("search_lobs");
		 Thread.sleep(3000);
		    browser_wait(5000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_search_button_in_the_internal_developer_negative_workflow_scenarios");
	}
}

@Then("give any invalidata for searching the internal developer negative workflow scenarios")
public void give_any_invalidata_for_searching_the_internal_developer_negative_workflow_scenarios() throws IOException {
try{
		
		driver.findElement(By.xpath(OR_reader( "search_lobs"))).sendKeys(td_reader("invalid_search_data",0));
		 Thread.sleep(3000);
		    browser_wait(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("give_any_invalidata_for_searching_the_internal_developer_negative_workflow_scenarios");
		
}
}

@When("clear the search field in the internal developer  workflow negative scenarios")
public void clear_the_search_field_in_the_internal_developer_workflow_negative_scenarios() throws IOException {
	try {
		backspace("search_lobs");
        Thread.sleep(1000);
       
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("clear_the_search_field_in_the_internal_developer_workflow_negative_scenarios");
}
}

@Then("thirdparty can give valid data for searching the internal developer workflow negative scenarios")
public void thirdparty_can_give_valid_data_for_searching_the_internal_developer_workflow_negative_scenarios() throws IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "search_lobs"))).sendKeys(td_reader("search_data",0));
		 Thread.sleep(3000);
		    browser_wait(5000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("thirdparty_can_give_valid_data_for_searching_the_internal_developer_workflow_negative_scenarios");
		}
}

@Then("click the corresponding pricelist of the internal developer workflow negative scenarios")
public void click_the_corresponding_pricelist_of_the_internal_developer_workflow_negative_scenarios() throws IOException {
	try {
		click("view_price_list");
		 Thread.sleep(3000);
		    browser_wait(5000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_the_corresponding_pricelist_of_the_internal_developer_workflow_negative_scenarios");
		}}

@Then("click the any of the prise list file in the internal developer workflow negative scenarios")
public void click_the_any_of_the_prise_list_file_in_the_internal_developer_workflow_negative_scenarios() throws IOException {
	try{
		click("any_price_list");
	    Thread.sleep(3000);
	    browser_wait(5000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_the_any_of_the_prise_list_file_in_the_internal_developer_workflow_negative_scenarios");
	}
}

@Then("click on the second download button of internal developer workflow negative scenarios")
public void click_on_the_second_download_button_of_internal_developer_workflow_negative_scenarios() throws IOException {
	try {    
		click("any_price_list2");
			
			Thread.sleep(3000);
		    browser_wait(5000);
		}  catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_the_second_download_button_of_internal_developer_workflow_negative_scenarios");
		}}

@Then("go back to the price list dashboard of the internal developer workflow workflow negative scenarios")
public void go_back_to_the_price_list_dashboard_of_the_internal_developer_workflow_workflow_negative_scenarios() throws IOException {
	try{
		click("price_list_dashboard");
	   Thread.sleep(3000);
       browser_wait(5000);
	}catch (Exception e) {
    	e.printStackTrace();
    	takeScreenShot("go_back_to_the_price_list_dashboard_of_the_internal_developer_workflow_workflow_negative_scenarios");
    }}


@When("internal developer workflow negative scenarios signout")
public void internal_developer_workflow_negative_scenarios_signout() throws IOException {
	try{
		click("so1");
		
		Thread.sleep(3000);
	    browser_wait(5000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_workflow_negative_scenarios_signout");
}
}

@Then("internal developer workflow negative scenarios logout")
public void internal_developer_workflow_negative_scenarios_logout() throws IOException {
	try{
		click("so2");
		
		Thread.sleep(3000);
	    browser_wait(5000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_developer_workflow_negative_scenarios_logout");
}
}
}


