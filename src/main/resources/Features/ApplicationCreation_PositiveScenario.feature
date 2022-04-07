Feature: Internal Developer application creation and approval Positive Scenario

Scenario: Validate the welcome page of internal developer page in Application creation positive scenario
      Given launches url for checking the internal developer work flow
      When  Verify thirdparty successfully navigated to the welcome page
      Then  able to click on login button for cheking the third party workflow
      And  check that internal developer lands on the login page successfully 
      
Scenario: Validate internaldeveloper logins with valid credentials
       When internaldeveloper enters valid email and password
       And  hits login button and lands on internaldeveloper page
       Then check internaldeveloper in the  landing page or not
       
Scenario: Internal developer able to click on the create application button and successfully navigated to the page		
	     When internal developer click on create application button 
	     Then internaldeveloper sucessfully land on the create application page
	     
 Scenario: Validate that internal developer able to create the application for the first time by filling all requied fields
	     When we enter the all required fields
	     Then click on save button
	     
Scenario: Validate after creating the application user able to go back to the dashboard
	     When hits on the xpath button 
	     Then go back to the dashboard
	     
Scenario: click on create application buttion and view the pagee
	     When click on create application buttion and view the pagee
	     	     
Scenario: Validate able to create application second
	     When we enter the all required fieldss
	     Then click on save buttonn
	     
Scenario: Validate after creating go back to the dashboardd
	     When hits on the xpath buttonn 
	     Then go back to the dashboardd
	     
Scenario: click on create application buttion and view the pageee
	     When click on create application buttion and view the pageee
	     	     
Scenario: Validate able to create application third
	     When we enter the all required fieldsss
	     Then click on save buttonnn
	     
Scenario: Validate after creating go back to the dashboarddd
	     When hits on the xpath buttonnn 
	     Then go back to the dashboarddd	     
	     
Scenario: Validate the created applications is in the pending list
	     When hits on the pending button 
	     Then go back to the pending application page
	     
Scenario: validate user can signout after creationd an application
       When sign out
       Then log out 
       
       
 Scenario: validate Complaince manager can be login
       When able to click on login buttonn
      Then lands on login pagee
      
      
Scenario: validate complance manger able to login
   	   When complaince manager valid email and password
   	   Then hits login button and lands on complaince Manager page  
   	   
Scenario: Validated the created applications presented in the pemnding list of complaince manager

       When complaince manager click on the pending button
       Then able to see the applications in the pending list 
       
Scenario: Validate cm can approve the pending applications
       When click on the created applications
       Then approve the applications
       
Scenario: After approving the applications it will be presented in the approving list of cm
      When click on the Approve list
      #Then view the approved application

Scenario: cm able to deny the application and view in the deny list
      When click on the pending listt
      Then click pending application for denying
      #Then click on any  of the application
      Then deny the application 
      When click on the approve buttonnnn
      Then click on the deny buttonnnn
       
Scenario: validate user can after approving the application  
       When cm sign logout
        Then cm log out
    
Scenario: validate Complaince manager can be login
       When able to click on login buttonnn
      Then lands on login pageee      
       
Scenario: login as an an internal developer
        When given the valid email and password
       And hits login button and lands on superadmin pagee
       
Scenario: check that the applications
         When click on the pending button
         When click on the approve button
         Then click on the deny button
         Then click on the dashboard of complaince
         
         
         
         

