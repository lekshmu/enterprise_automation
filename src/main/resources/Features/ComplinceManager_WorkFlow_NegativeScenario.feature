Feature: Checking the compliance manager workflow negative scenario


Scenario: Validate that not allowed to login when email and Password fields are blank in compliance manager workflow negative scenario
      Given launch the url for checking the compliance manager workflow negative scenario
      When click on the login button for checking the compliance manager workflow negative scenario
      When  check that the user lands on the login page successfully for checking the compliance manager workflow negative scenario
      Then  click on the first login part of the compliance manager workflow negative scenario
      Then  validation message is displiayed for the compliance manager workflow negative scenario
      
Scenario: Validate that not allowed to login with invalid email and invalid password in compliance manager workflow negative scenario
      When enters invalid email id and invalid password in the login page in compliance manager workflow negative scenario
      Then click on the login button after entering invalid email id and invalid password in compliance manager workflow negative scenario
      Then check the validation msg in the compliance manager workflow negative scenario
      
      
Scenario: Validate that not allowed to login with valid email and invalid password in compliance manager workflow negative scenario
      When enters valid email id and invalid password in the login page of the compliance manager workflow negative scenario
      Then click on the login button after entering valid email id and invalid password in the compliance manager workflow negative scenario
      And  check the validation msg after entering valid email id and invalid password in the compliance manager workflow negative scenario
     
Scenario: Validate that not allowed to login with invalid email and valid password in compliance manager workflow negative scenario
      When enters invalid email id and valid password in the login page of the compliance manager workflow negative scenario
      Then click on the login button after entering invalid email id and valid password in the compliance manager workflow negative scenario
      And  check the validation msg after entering invalid email id and valid password in the compliance manager workflow negative scenario
      
Scenario: Validate that cm is not allowed to login with valid email and valid password in the compliance manager workflow negative scenario
      When enters valid email id and valid password in the login page in the compliance manager workflow negative scenario
      Then click on the login button after entering valid email id and valid password in the compliance manager workflow negative scenario
       
Scenario: Validated that the compliance manager able to approve the pending application
       When complaince manager click on the pending button in the dashboard for approving
       Then able to see the applications in the pending lists 
       When click on the last created application in the pending list
       Then click on the approve button for approving the application

Scenario: Validated that the complince manager able to deny any one of the application presented in the pending list
       When complaince manager click on the pending button in the dashboard for denying 
       Then able to see the applications presented in the pending list 
       When click on the last created application in the pending list for denying 
       Then click on the deny button for denying the application
       
  Scenario: Validate that the complince manager able to revoke the approved application
       When complaince manager click on the approved field to perfome revoke acess operation 
       Then able to see the applications presented in the approved list
       When click on the last application presented in the approved list 
       Then click on the revoke acess button to cancel the approval of theapplication 
       
 Scenario: validate that the approved rejected application are updated in there list or not
       When complaince manager click on the pending field 
       Then complince manager click on the approved field
       Then complince manager click on the denied field
  
  Scenario: validate compliance manager can able to successfully login
       When complaince manager click on the logout
       Then complince manager click on the logout1
       
          