Feature: InternalDeveloper Negative Workflow 


Scenario: Validate that internaldeveloper user is not allowed to login when email and Password fields are blank
      Given launch the url for checking the internaldeveloper login criteria
      When  click on the login button for checking the internaldeveloper login criteria
      Then  check that the user lands on the login page successfully for checking the internaldeveloper login criteria
      Then  click on the first login part for internaldeveloper login criteria
      And  checking the validation msg after entering the invalid credentials
      
Scenario: Validate that internaldeveloper user is not allowed to login with invalid email and invalid password
      When internaldeveloper enters invalid email id and invalid password in the login page
      Then internaldeveloper click on the login button after entering invalid email id and invalid password
      And  check that internaldeveloper gets a validation msg 
     
Scenario: Validate that internaldeveloper user is not allowed to login with valid email and invalid passworddd
      When internaldeveloper enters valid email id and invalid password in the login page
      Then internaldeveloper click on the login button after entering valid email id and invalid password
      And  internaldeveloper check the validation msg 
     
Scenario: Validate internaldeveloper user is not allowed to login with invalid email and valid password
      When internaldeveloper enters invalid email id and valid password in the login page
      Then internaldeveloper then click on the login button after entering invalid email id and valid password
      And checkthat internal developer get validation msg after entering invalid email id and valid password 
      
Scenario: Validate that the internaldeveloper user is not allowed to login with valid email and valid password 
      When internaldeveloper enters valid email id and valid password in the login page
      Then internaldeveloper click on the login button after entering valid email id and valid password 
      
  
Scenario: Validate that internal developer not able to create application using only the application name
       When click on the create application button in internaldeveloper Negative Workflow 
       Then lands on the create application page in internaldeveloper Negative Workflow 
       And giving only the app name 
       Then click on the create application button after giving the application name
       
Scenario: After the failure of app creation internal developer tried to fill all fields
        When internal developer fill all mandatory fields
        Then click on application ceation in the internaldeveloper Negative Workflow 
        Then close the window presented in the application creation in internaldeveloper Negative Workflow
        
        
 Scenario: Validate that internal developer is not able to create applications without filling all nessessary fields in internaldeveloper workflow negative
   When click on the create application button in internal developer workflow negative scenarios
   Then lands on the create application page in  internal developer workflow negative scenarios
   And able to fill some fiels and left some fields are blank in internal developer workflow negative scenarios
   Then click on the create application button in the internal developer workflow negative scenario
           
Scenario: After the failure of app creation internal developer  tried to fill all the mandatory fields in internal developer workflow negative scenarios
        When internal developer fill all mandatory fields in workflow negative scenarios
        Then click on application ceation in the workflow negative scenarios
        #Then tries to create application with invalid email format
        Then close the window presented in the application creation in workflow negative scenarios
 
 
 
           
Scenario: validate internaldeveloper not able to create application while giving the invalid email in workflow negative scenarios
       When click on the create application button to check that with an invalid email id application is created or not in workflow negative scenarios
       Then lands on the create application page in workflow negative scenarios
       Then tries to create application with invalid email format in workflow negative scenarios
       Then internal developer click on the save button with an invalid email id in workflow negative scenarios  
       
  Scenario: internal developer tries to create application with valid email id in workflow negative scenarios
   When internal developer giving valid email id in workflow negative scenarios
   Then internal developer click on save button after giving the valid email id in workflow negative scenarios
   Then internal developer click on the cancel button after the application is created  in internaldeveloper 
   
   
   
 Scenario: internaldeveloper tries to edit  any one one of the applications
 When internaldeveloper click on the pendig list in the dashboard
  When internaldeveloper click one pending list of applicatons
  Then internaldeveloper click the edit button of the last created applications
  Then internaldeveloper tried to remove some fields in the applicatons
  Then internaldeveloper click on the update button and check that the application is created or not

  Scenario: internaldeveloper click on the update button after entering all fields
  When internaldevelopergive the valid data to edited fields after the failure of the applicaton creation
  Then internaldeveloper click the updated button in the edit page  
  
  Scenario: Validate that internaldeveloper perfome the delete operation sn pending application
    When internaldeveloper click on the last created application
   #Then internaldeveloper click on the deleted button
   Then internaldeveloper click on the confirm button
               
Scenario: perfome the search operation using invalid data in the lobs in internaldeveloper workflow negative scenario
        When click on the price list in the internal developer workflow negative 
        Then validate navigated to the price list page list in the internal developer workflow negative
       When click on the search button in the internal developer negative  workflow scenarios
       Then give any invalidata for searching the internal developer negative workflow scenarios
       
Scenario: giving valid data in the search field of the internal developer  workflow negative scenarios
       When clear the search field in the internal developer  workflow negative scenarios
       Then thirdparty can give valid data for searching the internal developer workflow negative scenarios
       Then click the corresponding pricelist of the internal developer workflow negative scenarios
       Then click the any of the prise list file in the internal developer workflow negative scenarios
       Then click on the second download button of internal developer workflow negative scenarios
       Then go back to the price list dashboard of the internal developer workflow workflow negative scenarios         
         
Scenario: internal developer workflow negative scenarios user logout
       When internal developer workflow negative scenarios signout
       Then internal developer workflow negative scenarios logout  