Feature: internal developer sandbox working positive scenarios

Scenario: Validate the welcome page of the internal developer
      Given launches urll
      Then able to click on login buttonn for checking sandbox
      Then lands on login pagee for sandbox
 
     
 Scenario: Validate internaldeveloper logins with valid credentials for checking the sandbox
       When Superadmin enters valid email and password for sandbox
       And hits login button and lands on superadmin page for sandbox

Scenario: Validate internal developer can create application for sandbox       
       When click on the create application button
       Then login to the page
       
Scenario: Validate internal developer can create the application by click on it
       When enter the valid data field
       Then click on the create button
       Then click on the xbutton
Scenario: click on the pending list
	     #When hits on the pending button for sandbox 
	     Then go back to the pending application page for sandbox
	     
Scenario: click on the a  application to check the sandbox   
	     When click on the first application
	     Then get the api key
	     Then hits on the xsymboll
	     
Scenario: give the api key
       When click on the sandbox
       Then click on the authorize
       Then give the value
       Then click on the authorize1
       Then click on the into button
       
Scenario: checking
         When click on the patient
        Then click on the try it out for patient acess
	      Then give any text in tenat
        Then click on the execute button and check it
        
Scenario:  checking procedure api
         When click on the procedure
        Then click on the try it out for procedure
	      Then give text in  procedure tenat
        Then click on the procedure execute button and check it 
        
 Scenario: checking the internal sandbox provider directory
When click on the sandbox internal provider directory
Then click on the authorize internal provider directory
Then give the value internal provider directory
Then click on the authorize1 internal provider directory
Then click on the into button internal provider directory

Scenario: checking internal provider directory with insuranceplan
  When click on the insurance internal provider directory
  Then click on the try it out internal provider directory
  #And click on the tenat cm provider directory
  Then give the text provider directory for internal
  Then click on the execute internal provider directory              
        
Scenario: go back dashboard and check for  approved applications
        When click on the Applications for internal
        Then click on the approved applications internal
        Then click application for  internal developer
        Then copy the token internal
        Then close it internal
        
Scenario: sandbox working
       When click on the sandbox internal
       Then click on the authorize internal
       Then give the value internal
       Then click on the authorize1 internal
       Then click on the into button internal
       
Scenario: checking the any of the patient acess patient acess
         When click on the device
        Then click on the try it out for device acess
	      Then give any text in device tenat
        Then click on the device execute button and check it
        
Scenario:  checking medicationknowledge api
         When click on the medicationknowledge
        Then click on the try it out for medicationknowledge
	      Then give text in medicationknowledge tenat
        Then click on the medi execute button and check it          
        
 Scenario: checking the internal sandbox provider directory for approved applications
       When click on the sandbox internal ap provider directory
       Then click on the authorize internal ap provider directory
       Then give the value internal ap provider directory
       Then click on the authorize1 internal ap provider directory
       Then click on the into button internal ap provider directory
 
 Scenario: checking internal provider directory with location
         When click on the location internal ap provider directory 
         Then click on the try it out internal ap provider location
         #And click on the tenat cm provider directory
         Then give the text to the location
         Then click on the execute internal ap provider directory location 
         Then goback to the dashbord for internal developer 
             