Feature: Checking the internal developer pricelist negative scenarios


Scenario: Validate that the internal developer is not allowed to login when email and Password fields are blank
      Given launch the url for checking the internal developer negative login 
      When click on the login button for checking internal developer negative login
      When  check that the user lands on the login page successfully for checking the internal developer negative login
      Then  click on the first login part in internal developer negative login
      Then  validation message is displiayed for the internal developer negative login
      
Scenario: Validate internal developer is not allowed to login with invalid email and invalid password
      When internal developer enters invalid email id and invalid password in the login page
      Then internal developer click on the login button after entering invalid email id and invalid password
      And  internal developer negative login check the validation msg is displayed or not
     
Scenario: Validate that the internal developer is not allowed to login with valid email and invalid password
      When internal developer negative logins enters valid email id and invalid password in the login page
      Then internal developer click on the login button after entering valid email id and invalid password
      And internal developer check the validation msg is displayed or not after entering valid email id and invalid password
     
Scenario: Validate that the internal developer is not allowed to login with invalid email and valid password
      When internal developer enters invalid email id and valid password in the login page
      Then internal developer click on the login button after entering invalid email id and valid password
      And  internal developer check the validation msg is displayed or not after entering invalid email id and valid password 
      
Scenario: Validate that internal developer is not allowed to login with valid email and valid password thirdparty negative
      When internal developer enters valid email id and valid password in the login page thirdparty negative
      Then internal developer click on the login button after entering valid email id and valid password thirdparty negative
     # And check the validation msg is displayed or not after entering valid email id and valid password thirdparty negative
     
Scenario: perfome the search operation using invalid data in the lobs
        When click on the price list in the internal developer negative 
        Then validate navigated to the price list page list in the internal developer negative
       When click on the search button in the internal developer negative scenarios
       Then give any invalidata for searching the internal developer negative scenarios
       
Scenario: giving valid data in the search field of the internal developer negative scenarios
       When clear the search field in the internal developer negative scenarios
       Then thirdparty can give valid data for searching the internal developer negative scenarios
       Then click the corresponding pricelist of the internal developer negative scenarios
       Then click the any of the prise list file in the internal developer negative scenarios
       Then click on the second download button of internal developer negative scenarios
       Then go back to the price list dashboard of the internal developer negative scenarios         
         
Scenario: internal developer negative scenarios user logout
       When internal developer negative scenarios signout
       Then internal developer negative scenarios logout     