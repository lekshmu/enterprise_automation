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

public class ApplicationCreation_PositiveScenario extends Generic_function{

static int s;
static String str;
static boolean value;

/* TC_01 Verify user navigated to welcome page */
@Given("launches url")
public void launches_url() throws FileNotFoundException, IOException {

try {
browser_launch();
s= Dataiter();
browser_wait(120000);
}catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("landing_page_of_internaldeveloper_app_creation");
	
}
}
@Then("able to click on login button")
public void able_to_click_on_button() throws IOException {
try {
click("first_login");
Thread.sleep(3000);
browser_wait(1000);
} catch (Exception e) {
e.printStackTrace();
takeScreenShot("internaldeveloper_app_creation_login_button");
}

}

@Then("lands on login page")
public void lands_on_login_page_button() throws IOException{
	try {
		str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
		Assert.assertEquals(str,td_reader("login_title"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_page_of_internaldeveloper_appcreation");
			
		}  

}



/* TC_02 Validate internaldeveloper logins with valid credentials */
@When("internaldeveloper enters valid email and password")
public void internaldeveloper_enters_valid_email_and_password() throws InterruptedException, IOException {
try {
  driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("appcreation_internal_email",0));
  Thread.sleep(3000);
  } catch (IOException e) {
  e.printStackTrace();
  takeScreenShot("email_of_internaldeveloper");
  }
try {
  driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("appcreation_internal_pass",0));
  Thread.sleep(2000);
  } catch (IOException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
  takeScreenShot("password_of_internaldevelopers");
  }
  }

@When("hits login button and lands on internaldeveloper page")
public void hits_login_button_and_lands_on_internaldeveloper_page() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internadeveloper_login");
		}
		}
@Then("check internaldeveloper in the  landing page or not")
public void check_internaldeveloper_in_the_landing_page_or_not() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("internal_loginpage_first_title"))).getText();
		Assert.assertEquals(str,td_reader("internal_loginpage_first_title"));
	    
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internal_loginpage_first_title_checking");
	}
}



@When("internal developer click on create application button")
public void internal_developer_click_on_create_application_button() throws IOException {
	try {
		click("internal_create_app_button");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internadeveloper_click_create_application_button_click");
		}
}

@Then("internaldeveloper sucessfully land on the create application page")
public void internaldeveloper_sucessfully_land_on_the_create_application_page() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("internal_create_app_page"))).getText();
		Assert.assertEquals(str,td_reader("internal_create_app_page"));
	    
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internaldeveloper_sucessfully navigated_to_the_create_application_page");
	}
}

@When("we enter the all required fields")
public void we_enter_the_all_required_fields() throws IOException, InterruptedException {
	try {
	String app = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app);
	
	Random randomGenerator1 = new Random();  
    int randomInt1 = randomGenerator1.nextInt(1000);
    driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomInt1 +".cornell.edu");
	
    String app1 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(app1);
	
    Random randomGenerator = new Random();  
    int randomInt = randomGenerator.nextInt(1000);
    driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("app"+ randomInt +"@gmail.com");
    
    String app2 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(app2);
		
	String app3 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(app3);
	
	//driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
	str= driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
	Assert.assertEquals(str,td_reader("query_limit"));
	click("query_limit");
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internaldeveloper_first_application_deatails");
}
}

@Then("click on save button")
public void click_on_save_button() throws Exception {
	try {
		click("create");
		browser_wait(3000);
		Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internaldeveloper_first_app_creation_save");
}}
@When("hits on the xpath button")
public void hits_on_the_xpath_button() throws IOException, InterruptedException {
   try {
	   
  
	click("xsymbol");
	Thread.sleep(3000);
    browser_wait(5000);
}catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("internaldeveloper_first_app_creation_x_buttion");
}}
@Then("go back to the dashboard")
public void go_back_to_the_dashboard() throws IOException {
	 try {
    str= driver.findElement(By.xpath(OR_reader("internal_loginpage_first_title"))).getText();
	Assert.assertEquals(str,td_reader("internal_loginpage_first_title"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internaldeveloper_first_app_creation_and go_back_to_the_dashboard");
		}}
 @When("click on create application buttion and view the pagee")
public void click_on_create_application_buttion_and_view_the_pagee() throws IOException {
	 try {
			click("internal_create_app_button");
			Thread.sleep(3000);
			browser_wait(1000);
			} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internadeveloper_click_create_application_button_second_time");
			}
	
}
@When("we enter the all required fieldss")
public void we_enter_the_all_required_fieldss() throws IOException {
	try {
	String app11 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app11);
	
    Random randomGenerator1 = new Random();  
    int randomInt1 = randomGenerator1.nextInt(1000);
    driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomInt1 +".cornell.edu");
	
    String app12 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(app12);
	
    Random randomGenerator = new Random();  
    int randomInt = randomGenerator.nextInt(1000);
    driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("app"+ randomInt +"@gmail.com");
    
    String app13 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(app13);
		
	String app14 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(app14);
    
		//driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms1",0));
		str= driver.findElement(By.xpath(OR_reader("query_limit1"))).getText();
		Assert.assertEquals(str,td_reader("query_limit1"));
		click("query_limit1");
}catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("internaldeveloper_second_application_deatails");
}}

@Then("click on save buttonn")
public void click_on_save_buttonn() throws Exception {
	try {
		click("create");
		browser_wait(3000);
		Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internaldeveloper_second_app_creation_save");
}}

@When("hits on the xpath buttonn")
public void hits_on_the_xpath_buttonn() throws IOException, InterruptedException {
try {
	click("xsymbol");
	Thread.sleep(5000);
    browser_wait(7000);
}catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("internaldeveloper_second_app_creation_x_buttion");
}}


@Then("go back to the dashboardd")
public void go_back_to_the_dashboardd() throws IOException {
	 try {
		    str= driver.findElement(By.xpath(OR_reader("internal_loginpage_first_title"))).getText();
			Assert.assertEquals(str,td_reader("internal_loginpage_first_title"));
				}catch (Exception e) {
					e.printStackTrace();
					takeScreenShot("internaldeveloper_second_app_creation_and go_back_to_the_dashboard");
				}}



@When("click on create application buttion and view the pageee")
public void click_on_create_application_buttion_and_view_the_pageee() throws IOException {
	try {
		click("internal_create_app_button");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internadeveloper_click_create_application_button_click_third");
		}
}

@When("we enter the all required fieldsss")
public void we_enter_the_all_required_fieldsss() throws IOException {
	try {
	String app21 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app21);
	
    Random randomGenerator1 = new Random();  
    int randomInt1 = randomGenerator1.nextInt(1000);
    driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomInt1 +".cornell.edu");
	
    String app22 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(app22);
	
    Random randomGenerator = new Random();  
    int randomInt = randomGenerator.nextInt(1000);
    driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("app"+ randomInt +"@gmail.com");
    
    String app23 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(app23);
		
	String app24 = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(app24);
    
	str= driver.findElement(By.xpath(OR_reader("query_limit1"))).getText();
	Assert.assertEquals(str,td_reader("query_limit1"));
	click("query_limit1");
    //throw new io.cucumber.java.PendingException();
}catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("internaldeveloper_second_application_deatails");
}}


@Then("click on save buttonnn")
public void click_on_save_buttonnn() throws IOException, InterruptedException {

		try {
			click("create");
			browser_wait(3000);
			Thread.sleep(5000);
			}catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("internaldeveloper_third_app_creation_save");
	}}

@When("hits on the xpath buttonnn")
public void hits_on_the_xpath_buttonnn() throws IOException, InterruptedException {
	 try {
		   
		  
			click("xsymbol");
			Thread.sleep(5000);
		    browser_wait(7000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("internaldeveloper_third_app_creation_x_buttion");
		}}


@Then("go back to the dashboarddd")
public void go_back_to_the_dashboarddd1() throws IOException {
	try {
	    str= driver.findElement(By.xpath(OR_reader("internal_loginpage_first_title"))).getText();
		Assert.assertEquals(str,td_reader("internal_loginpage_first_title"));
			}catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("internaldeveloper_third_app_creation_and go_back_to_the_dashboard");
			}}

@When("hits on the pending button")
public void hits_on_the_pending_button() throws IOException, InterruptedException {
    
    try {
		   click("pending");
		Thread.sleep(5000);
	    browser_wait(7000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internaldeveloper_check_the_pendinglist_at_the_first_time");
	}}

@Then("go back to the pending application page")
public void go_back_to_the_pending_application_page() throws IOException {
	try {
	str= driver.findElement(By.xpath(OR_reader("internal_check_pending_first"))).getText();
	Assert.assertEquals(str,td_reader("internal_check_pending_first"));
    //throw new io.cucumber.java.PendingException();s
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internaldeveloper_check_the_pendinglist_at_the_first_time_sucessfull");
	}}
//sign out
@When("sign out")
public void sign_out() throws IOException {
	try{
		click("so1");
		
		Thread.sleep(3000);
	    browser_wait(5000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_signout");
}}
@Then("log out")
public void log_out() throws IOException {
	try{
		click("so2");
		Thread.sleep(3000);
	    browser_wait(5000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("internal_logout");
}}
@When("able to click on login buttonn")
public void able_to_click_on_login_buttonn() throws IOException { 
	try {
		click("first_login");
		Thread.sleep(3000);
		browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_on_login_button_for_approving_the_internaldeveloper_applicationss");
			
		}
}

@Then("lands on login pagee")
public void lands_on_login_pagee() throws IOException {
	try {
		
		str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
		Assert.assertEquals(str,td_reader("login_title"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("lands_on_login_page_for_approving_the_internaldeveloper_applicationss");
			
		}
}
@When("complaince manager valid email and password")
public void complaince_manager_valid_email_and_password() throws InterruptedException, IOException {
	try {
		driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("appcreation_complaince_email",0));
		Thread.sleep(3000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("email_of_cm_internal");
		}
		try {
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("appcreation_complaince_pass",0));
		Thread.sleep(2000);
		} catch (IOException e) {
		e.printStackTrace();
		takeScreenShot("password_of_cm_internal");
		}
}

@When("hits login button and lands on complaince Manager page")
public void hits_login_button_and_lands_on_complaince_manage_page() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot(" hits_login_button_and_lands_on_complaince_manager_page_for_approving_internaldeveloper_applicationss");
		
		}
	
}
@When("complaince manager click on the pending button")
public void complaince_manager_click_on_the_pending_button() throws IOException, InterruptedException {
	try {
	click("pending");
    Thread.sleep(5000);
    browser_wait(7000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("complaince_manager_check_the_pending_list_for_approving_internaldeveloper_applicationss");
		
		}
  
}

@Then("able to see the applications in the pending list")
public void able_to_see_the_applications_in_the_pending_list() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("cm_third_first_app_dash"))).getText();
		Assert.assertEquals(str,td_reader("cm_third_first_app_dash"));
	    
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("able_to_see_the_applications_in_the_pending_list_for_approving_the_internaldeveloper_applicationss");
	}
}
@When("click on the created applications")
public void click_on_the_created_applications() throws IOException, InterruptedException {
	try {
	//click("checking1");
		click("last_appli");
	Thread.sleep(5000);
    browser_wait(7000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("click_on_the_internal_created_applications");
}}

//@Then("approve the applications")
//public void approve_the_applications() throws IOException, InterruptedException {
//	click("approve");
//	JavascriptExecutor js3 = (JavascriptExecutor) driver;
	//js3.executeScript("window.scrollBy");
 //   Thread.sleep(5000);
  //  browser_wait(7000);
   

   // throw new io.cucumber.java.PendingException();
//}

@Then("approve the applications")
public void approve_the_applications1() throws IOException {
	try {

	WebElement approve= driver.findElement(By.xpath("//*[contains(text(),'Approve Request')]"));
	//click("approve");
	approve.click();
    throw new io.cucumber.java.PendingException();
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("approve_the_internal_created_applications");
		
		}
}






@When("click on the Approve list")
public void click_on_the_Approve_list() throws IOException, InterruptedException {
	try {
	click("approved");
    Thread.sleep(5000);
    browser_wait(7000);
   
	} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("approve_the_internal_created_applications");
	
	}
}
//@Then("view the approved application")
//public void view_the_approved_application() {
       
    @When("click on the pending listt")
    public void click_on_the_pending_listt() throws IOException, InterruptedException {
    	try {
    	click("pending2");
        Thread.sleep(5000);
        browser_wait(7000);
        
    
	} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("deny_the_internal_created_applications");
	
	}}

   // @Then("click on the any pending application")
   // public void click_on_the_any_pending_application() throws IOException, InterruptedException {
    	  // click("checking1");
    	    //Thread.sleep(5000);
    	    //browser_wait(7000);
    	    //throw new io.cucumb
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
   // }
    @Then("click pending application for denying")
    public void click_pending_application_for_denying() throws IOException, InterruptedException {
    	try{
    		//click("checking1");
    		click("last_appli");
    		Thread.sleep(5000);
            browser_wait(7000);
    	} catch (Exception e) {
    		e.printStackTrace();
    		takeScreenShot("click_pending_application_for_denying_the_internal_applications");
    		
    		}
        
        //throw new io.cucumber.java.PendingException();
    }


    
    
    
   

    @Then("deny the application")
    public void deny_the_application() throws InterruptedException, IOException {
    	try{
    		click("deny");
    	
        Thread.sleep(5000);
        browser_wait(7000);
       // throw new io.cucumber.java.PendingException();
    } catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("denying_the_internal_created_applications");
		
		}}
 
    @When("click on the approve buttonnnn")
    public void click_on_the_approve_buttonnnn() throws IOException, InterruptedException {

    	
    	try {
    	click("approve1");
    	Thread.sleep(3000);
    	browser_wait(1000);
    	
    	} catch (Exception e) {
    	e.printStackTrace();
    	takeScreenShot("cm_internal_check_approve");

    	//str= driver.findElement(By.xpath(OR_reader("org_title"))).getText();
    	//Assert.assertEquals(str,td_reader("org_title"));
    	}

    }
    @Then("click on the deny buttonnnn")
    public void click_on_the_deny_buttonn() throws IOException, InterruptedException {
    	
    	try{
    		click("deny1");
    	Thread.sleep(5000);
        browser_wait(7000);
       
    } catch (Exception e) {
    	e.printStackTrace();
    	takeScreenShot("cm_internal_check_deny");

    	}}
    @Then("click on the dashboard of complaincee")
    public void click_on_the_dashboard_of_complaincee() throws IOException, InterruptedException {
    	try {
    		
    	
    	click("dashboardd");
    	Thread.sleep(5000);
        browser_wait(7000);
    	  } catch (Exception e) {
    	    	e.printStackTrace();
    	    	takeScreenShot("cm_internal_check__approval_deny_go_back_dashboard");

    	    	}}
        
   

@When("cm sign logout")
public void cm_sign_logout() throws IOException {
	try{
		click("so1");
		
		Thread.sleep(3000);
	    browser_wait(5000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("cm_internal_signout");
}}


@Then("cm log out")
public void cm_log_out() throws IOException {
	try{
		click("so2");
		
		Thread.sleep(3000);
	    browser_wait(5000);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("cm_internal_logout");
}}
@When("able to click on login buttonnn")
public void able_to_click_on_login_buttonnn() throws IOException { 
	try {
		click("first_login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("second_internaldeveloper_app_creation_login_button");
		}

		}
		

@Then("lands on login pageee")
public void lands_on_login_pageee() throws IOException {
	try {
		str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
		Assert.assertEquals(str,td_reader("login_title"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("second_login_page_of_internaldeveloper_appcreation");
			
		}  
}
@When("given the valid email and password")
public void given_the_valid_email_and_password() throws InterruptedException, IOException {
	try {
		  driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("appcreation_internal_email",0));
		  Thread.sleep(3000);
		  } catch (IOException e) {
		  e.printStackTrace();
		  takeScreenShot("secondtime_email_of_internaldeveloper");
		  }
		try {
		  driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("appcreation_internal_pass",0));
		  Thread.sleep(2000);
		  } catch (IOException e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
		  takeScreenShot("second_time_password_of_internaldevelopers");
		  }
		}
    

@When("hits login button and lands on superadmin pagee")
public void hits_login_button_and_lands_on_superadmin_pagee() throws IOException {
	try {
		click("login");
		Thread.sleep(3000);
		browser_wait(1000);
		} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("second_internadeveloper_login");
		}

		}
@When("click on the pending button")
public void click_on_the_pending_button() throws IOException, InterruptedException {
	try{
		click("pending");
	
    Thread.sleep(5000);
    browser_wait(7000);
	} catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("second_internadeveloper_pending_checking");
		}
   
}

@When("click on the approve button")
public void click_on_the_approve_button() throws IOException, InterruptedException {

	
	try {
	click("approve1");
	Thread.sleep(3000);
	browser_wait(1000);
	
	} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("second_time_internal_approve_checking");

	
	}

}
@Then("click on the deny button")
public void click_on_the_deny_button() throws IOException, InterruptedException {
	try{
		click("deny1");
	
	Thread.sleep(5000);
    browser_wait(7000);
    //throw new io.cucumber.java.PendingException();
} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("second_time_internal_deny_checking");

	
	}}
@Then("click on the dashboard of complaince")
public void click_on_the_dashboard_of_complaince() throws IOException, InterruptedException {
	try {
	click("dashboardd");
	Thread.sleep(5000);
    browser_wait(7000);
    //throw new io.cucumber.java.PendingException();
} catch (Exception e) {
	e.printStackTrace();
	takeScreenShot("second_time_goback_to_the_dashboard");

	
	}}
}
   


    