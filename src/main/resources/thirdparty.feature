Feature: Third Party Work flow

Scenario: Validate the welcome page
      
      Given launches url for third party
     #Then navigate to welcome page
      When able to click on login button for third party
      Then lands on login page for third party
     
   Scenario: Validate Third party logins with valid credentials
       When Third party enters valid email and password
       And hits login button and lands on third party dashboard
       
  	
	Scenario: click on create application button in the the third party
	     When click on create application button in the third party and view the page
	     
  Scenario: Validate that third party user can create application first
	     When enter all the fiels in the first application
	     Then click on save button for creationg the first application
	     
Scenario: Validate that after creating  the first application go back to the dashboard
	     When after the creation of first application hits on the xpath button 
	     Then go back to the dashboard after the creation of first application 
	     
Scenario: click on create application button for creating the second application
	     When click on create application button for creating the second application
	     	     
Scenario: Validate that third party can create the  application second
	     When we enter the all required fields for creating the second application
	     Then click on save button for creating the second application
	     
Scenario: Validate after creating second application third party can go back to the dashboard
	     When hits on the xpath button after creating the second application 
	     Then go back to the dashboard after creating the second application
	     
Scenario: click on create application for creating the third application
	     When click on create application button for creating the third application
	     	     
Scenario: Validate able to create the third application 
	     When we enter the all required fieldss for creating the third application
	     Then click on save button after creating the third application
	     
Scenario: Validate after creating the third application go back to the dashboard
	     When hits on the xpath button after creating the third application 
	     Then go back to the dashboard after creating the third application	
	     
Scenario: click on create application for creating the fourth application
	     When click on create application button for creating the fourth application
	     	     
Scenario: Validate able to create the fourth application 
	     When we enter the all required fieldss for creating the fourth application
	     Then click on save button after creating the fourth application
	     
Scenario: Validate after creating the fourth application go back to the dashboard
	     When hits on the xpath button after creating the fourth application 
	     Then go back to the dashboard after creating the fourth application
	     
Scenario: Validate third party created applications is in the pending list
	     When third party hits on the pending buttion 
	     Then third party can view the pending list of applications	 

Scenario: Validate third party can able to delete the applications
         When click on the deleted button
        And click on the confirm button
        Then the application deleted sucessfully  
        
Scenario: Validate third party can able to edit the the applications
        When click on the edited button
        Then sucessfully navigated to the edited page
        Then third party able to edited the application
        #Then third party edit the domain
        Then click on the updated button
        Then sucessfully navigated to the pending list of the third party   
        
Scenario: Third party can check on the list
        When thirdparty click on the approved list
        Then navigated to the approved page
        And click on the denied list
        Then navigated to the denied page    
        
Scenario: Back to the dashboard and click on the priselist
         When click on the thirdparty dashboard
         Then sucessfully navigated to the thirdparty dashboard
         Then click on the thirdparty pricelist 
         And sucessfully navigated to the third party pricelist
         
Scenario: search the any one of the lobs in the tirdparty
       When click on the search button in the third party
       Then thirdparty can give any data for searching
       Then click the corresponding pricelist of the thirdparty
       Then click the any of the prise list file in the thirdparty
       Then click on the second download button of pricelist
       Then go back to the price list dashboard of the third party          
         
Scenario: thirdparty user logout
       When third party signout
       Then thirdparty logout
                
Scenario: validate Complaince manager can be login for  approving the third paty applications
      
       When able to click on login button for  approving denying the third paty applications
       Then lands on login page for  approving the third paty applications
      
      
Scenario: validate complance manger able to login for  approving the third paty applications
   	   When complaince manager give valid email and password for approving denying the third paty applications
   	   Then hits login button and lands on complaince Manager page for  approving denying the third paty applications 
   	   
Scenario: Validated that thirdparty user created applications presented in the pending list of complaince manager
       When complaince manager click on the pending button for  approving the third paty applications for consideration
       Then able to see the applications in the pending list for  approving the third paty applications
       
Scenario: Validate cm can approve the third party created pending applications 
       When click on the thirdparty created applications
       Then approve the  third party created applications
       
#Scenario: After approving the thirdparty created applications it will be presented in the approving list of cm
 #     When click on the Approve list for checking the third party created applications
  ##    Then view the thirdparty created approved application

Scenario: cm able to deny the thirdparty created application and view in the deny list
      When cm click on the pending list for denying the third party created applications
      Then click pending application for denying the thirdparty cm applications
      #Then click on any  of the application
      Then deny the thirdparty cm created application 
      When click on the approve button for denying
      Then click on the cm deny button for third party created applications
      Then check cm dashboard
       
Scenario: validate cm can logout after considering the third party applications  
       When cm sign out after considering the third party applications
        Then cm log out after considering approving denying the third party applications
       
Scenario: validate thirdparty can again login
       When thirdparty can again  click on login button
      Then thirdparty can again lands on login page      
       
Scenario: thirdparty can again login as an internal developer
        When thirdparty again given the valid email and password
       And thirdparty again  hits login button and lands on superadmin page
       
Scenario: Thirdparty then check the applications
         When thirdparty check the pending button
         When thirdparty check the approve button
         Then thirdparty cm check the deny button
         Then then thirdparty go back to the dashboard         
         
         