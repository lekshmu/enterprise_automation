Feature: Checking the thirdparty negative scenarios


Scenario: Validate that the user is not allowed to login when email and Password fields are blank
      Given launch the url for checking the thirdparty logins 
      When click on the login button for checking third party loginn
      When  check that the user lands on the login page successfully for checking third party loginn
      Then  click on the first login part
      Then validation message is displiayedd
      
Scenario: Validate third party user is allowed to login with valid email id and valid password
      When third party enters valid email id and valid password in the login page
      Then click on the login button after entering valid email id and valid password
      
Scenario: Validate third party fill all the necessary fileds and and try to cancel that application
       When third party click on the created application button for cancelling
       Then giving all the data in the given format
       And try to click the cross button for cancelling that application 
             
Scenario: validate third party not able to create application while not filling the mandatory fields
       When click on the create application button in third party negative
       #Then lands on the create application page in third party negative
       And able to fill the fiels and left some fields blank
       Then click on the create aoolication third third party negative
       Then click on the cancel button
        
 Scenario: validate third party not able to create application while giving the invalid email
       When click on the create application button in third party negative for create application
       #Then lands on the create application page in third party negative
       And able to fill the fields and give invalid email id
       Then click on the create application after givin invalid email id third third party negative
       
Scenario: Validate third party able to create application by giving valid email format
       When third party clear the email id fields
       And try to click the create application filed 
       Then try to close after the application is sucessfully created
       
Scenario: third party tried to edit any of the applications in the pending list
  When third party tried to click on the edit button in the pending list
  Then third party edit some fields and left that field as blank
  And clicking on the create button after editing the applications in the pending list     