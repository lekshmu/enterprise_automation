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

public class thirdparty_negative extends Generic_function{
static int s;
static String str;
static boolean value;

@Given("launch the url for checking the thirdparty logins")
public void launch_the_url_for_checking_the_thirdparty_logins() throws IOException {
	try {
		browser_launch();
		s= Dataiter();
		browser_wait(120000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("landing_page_of_thirdparty_negative");
			
		}
}

@When("click on the login button for checking third party loginn")
public void click_on_the_login_button_for_checking_third_party_loginn() throws IOException {
	try {
		click("first_login");
		Thread.sleep(3000);
		browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_login_button_of_thirdparty_negative");
		}

}

@When("check that the user lands on the login page successfully for checking third party loginn")
public void check_that_the_user_lands_on_the_login_page_successfully_for_checking_third_party_loginn() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
		Assert.assertEquals(str,td_reader("login_title"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_page_of_thirdparty_negative");
			
		}
}

@Then("click on the login buttion for checking the thirdparty loginn")
public void click_on_the_login_buttion_for_checking_the_thirdparty_loginn() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("thirdparty_negative_login");
		
		}

}

@Then("validation message is displiayedd")
public void validation_message_is_displiayedd() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("third_party_negative_login_validation_msg"))).getText();
		Assert.assertEquals(str,td_reader("third_party_negative_login_validation_msg"));
	    
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("thirdparty_validation_msg_after_entering_blank_fields");
	}
}




@When("third party enters valid email id and valid password in the login page")
public void third_party_enters_valid_email_id_and_valid_password_in_the_login_page() throws IOException, InterruptedException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("sir_third",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("email_of_thirdparty_negative_scenario");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("password_of_thirdparty_negative_scenario");
		}
}

@Then("click on the login button after entering valid email id and valid password")
public void click_on_the_login_button_after_entering_valid_email_id_and_valid_password() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("thirdparty_negative_scenario_login");
		
		}
}
@When("third party click on the created application button for cancelling")
public void third_party_click_on_the_created_application_button_for_cancelling() throws IOException {
	try {
		click("create_app");
		Thread.sleep(2000);
		browser_wait(1000);
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("thirdparty_click_creation_for cancelling_the_application");

		str= driver.findElement(By.xpath(OR_reader("create_apph"))).getText();
		Assert.assertEquals(str,td_reader("create_apph"));
		}
}

@Then("giving all the data in the given format")
public void giving_all_the_data_in_the_given_format() throws IOException {
	try {
		//String app = RandomStringUtils.randomAlphabetic(8);
		//driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app);
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
	    driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("first"+ randomIntem +"@gmail.com");
	    
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
			takeScreenShot("thirdparty_application_deatails_for_cancel_the_application");
	}
	}

	

@Then("try to click the cross button for cancelling that application")
public void try_to_click_the_cross_button_for_cancelling_that_application() throws IOException {
	try {
		click("application_cancel_cross_button");
		browser_wait(1000);
		Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("thirdparty_negative_click_cancel");
	}
}
@When("click on the create application button in third party negative")
public void click_on_the_create_application_button_in_third_party_negative() throws IOException {
	try {
		click("create_app");
		Thread.sleep(2000);
		browser_wait(1000);
		//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
		//Assert.assertEquals(true,value);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("thirdparty_first_app_creation");

		str= driver.findElement(By.xpath(OR_reader("create_apph"))).getText();
		Assert.assertEquals(str,td_reader("create_apph"));
		}
}


@Then("able to fill the fiels and left some fields blank")
public void able_to_fill_the_fiels_and_left_some_fields_blank() throws IOException {
	try 
	{
	//String app = RandomStringUtils.randomAlphabetic(8);
			//driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app);
			Random randomGeneratorapp1 = new Random();  
		    int randomInt = randomGeneratorapp1.nextInt(1000);
		    driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("New Application"+ randomInt );
		    
			//Random randomGeneratordo = new Random();  
		    //int randomIntdo1 = randomGeneratordo.nextInt(1000);
		    //driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.edu");
			
		    //String appdes1 = RandomStringUtils.randomAlphabetic(8);
			//driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(appdes1);
			
		    Random randomGenerator = new Random();  
		    int randomIntem = randomGenerator.nextInt(1000);
		    driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("app"+ randomIntem +"@gmail.com");
		    
		    //String appli1 = RandomStringUtils.randomAlphabetic(8);
			//driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);
				
			String appterms1 = RandomStringUtils.randomAlphabetic(8);
			driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);
			
			//driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
			//str= driver.findElement(By.xpath(OR_reader("query_limit1"))).getText();
			//Assert.assertEquals(str,td_reader("query_limit1"));
			//click("query_limit1");
			}catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("thirdparty_create_application_without_filling_necessary_fields");
		}
}

@Then("click on the create aoolication third third party negative")
public void click_on_the_create_aoolication_third_third_party_negative() throws IOException {
	try {
		click("create");
		browser_wait(3000);
		Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("thirdparty_negative_click_create_filling_necessary_fields");
}}
	@Then("click on the cancel button")
	public void click_on_the_cancel_button() throws IOException {
		try {
			click("third_party_cancel");
			browser_wait(3000);
			Thread.sleep(5000);
			}catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("thirdparty_click_cancel_button");
	}
	}

	@When("click on the create application button in third party negative for create application")
	public void click_on_the_create_application_button_in_third_party_negative_for_create_application() throws IOException {
		try {
			click("create_app");
			Thread.sleep(2000);
			browser_wait(1000);
			//value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
			//Assert.assertEquals(true,value);
			} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("thirdparty_negative_click_create_appli_with_giving_invalid_email");

			str= driver.findElement(By.xpath(OR_reader("create_apph"))).getText();
			Assert.assertEquals(str,td_reader("create_apph"));
			}
	}

	@When("able to fill the fields and give invalid email id")
	public void able_to_fill_the_fields_and_give_invalid_email_id() throws IOException {
		//String app = RandomStringUtils.randomAlphabetic(8);
			//driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app);
		try {
				Random randomGeneratorapp1 = new Random();  
			    int randomInt = randomGeneratorapp1.nextInt(1000);
			    driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("Time Application"+ randomInt );
			    
				Random randomGeneratordo = new Random();  
			    int randomIntdo1 = randomGeneratordo.nextInt(1000);
			    driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.edu");
				
			    String appdes1 = RandomStringUtils.randomAlphabetic(8);
				driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(appdes1);
				
			    Random randomGenerator = new Random();  
			    int randomIntem = randomGenerator.nextInt(1000);
			    driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("app"+ randomIntem +"gmail.com");
			    
			    String appli1 = RandomStringUtils.randomAlphabetic(8);
				driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);
					
				String appterms1 = RandomStringUtils.randomAlphabetic(8);
				driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);
				
				//driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
				str= driver.findElement(By.xpath(OR_reader("query_limit1"))).getText();
				Assert.assertEquals(str,td_reader("query_limit1"));
				click("query_limit1");
				}catch (Exception e) {
					e.printStackTrace();
					takeScreenShot("thirdparty_negative_invalid_email_enters");
	}}

	@Then("click on the create application after givin invalid email id third third party negative")
	public void click_on_the_create_application_after_givin_invalid_email_id_third_third_party_negative() throws IOException {
		try {
			click("create");
			browser_wait(3000);
			Thread.sleep(5000);
			}catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("thirdparty_negative_click_create_giving_invalid_email_format");
	}

}
	@When("third party clear the email id fields")
	public void third_party_clear_the_email_id_fields() throws IOException, InterruptedException {
		try {
			backspace("app_em");
	        Thread.sleep(1000);
		 Random randomGenerator = new Random();  
		    int randomIntem = randomGenerator.nextInt(1000);
		    driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("new"+ randomIntem +"@gmail.com");
		    Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("thirdparty_negative_try_to_give_valid_email_id");
	}}

	@Then("try to click the create application filed")
	public void try_to_click_the_create_application_filed() throws IOException {
		try {
			click("create");
			browser_wait(3000);
			Thread.sleep(5000);
			}catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("thirdparty_negative_click_create_after_giving_valid_email_id");
	}
	}	
	@Then("try to close after the application is sucessfully created")
	public void try_to_close_after_the_application_is_sucessfully_created() throws IOException {
		try {
			click("xsymbol");
			Thread.sleep(3000);
		    browser_wait(5000);
			}catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("thirdparty_negative_app_creation_into_button");
		
	    //throw new io.cucumber.java.PendingException();
			}
	}
	@When("third party click on the pending list in thirdparty negative scenario")
	public void third_party_click_on_the_pending_list_in_thirdparty_negative_scenario() throws IOException {
		try {
			click("thirdparty_negative_pending");
			browser_wait(3000);
			Thread.sleep(5000);
			}catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("thirdparty_negative_pending_dashboard");
	}
	}

	

	@When("third party tried to click on the edit button in the pending list")
	public void third_party_tried_to_click_on_the_edit_button_in_the_pending_list() throws IOException {
		try {
			click("cm_third_pending_last_edit");
			browser_wait(1000);
			Thread.sleep(3000);
			}catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("thirdparty_negative_application_edition");
	}
	}

	@Then("third party edit some fields and left that field as blank")
	public void third_party_edit_some_fields_and_left_that_field_as_blank() throws IOException {
		try {
			backspace("app_name");
	        Thread.sleep(1000);
	      
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("thirdparty_edited_application_terms_and_left_as_blank");
	}
	}

	@Then("clicking on the create button after editing the applications in the pending list")
	public void clicking_on_the_create_button_after_editing_the_applications_in_the_pending_list() throws IOException {
		try {
			click("thirdparty_negative_update");
			browser_wait(3000);
			Thread.sleep(5000);
			}catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("thirdparty_negative_click_update_edited_application_name_and_left_as_blank");
	}
	}

}