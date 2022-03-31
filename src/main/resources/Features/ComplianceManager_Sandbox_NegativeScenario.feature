Feature: compliance manager workflow sandbox negative scenario


Scenario: Validate user not allowed to login when email and Password fields are blank in compliance manager sandbox negative scenario
      Given launch the url for checking the compliance manager sandbox negative scenario
      When  click on the login button for checking the compliance manager workflow  negative scenario
      When  check that the user lands on the login page for checking the compliance manager workflow negative scenario
      Then  click on the first login part of the compliance manager sandbox negative scenario
      Then  validation message is displiayed for the compliance manager sandbox negative scenario
      
Scenario: Validate that user not allowed to login with invalid email and invalid password in compliance manager sandbox negative scenario
      When enters invalid email id and invalid password in the login page in compliance manager sandbox negative scenario
      Then click on the login button after entering invalid email id and invalid password in compliance manager sandbox negative scenario
      Then check the validation msg in the compliance manager sandbox negative scenario
      
      
Scenario: Validate that user not allowed to login with valid email and invalid password in compliance manager sandbox negative scenario
      When enters valid email id and invalid password in the login page of the compliance manager sandbox negative scenario
      Then click on the login button after entering valid email id and invalid password in the compliance manager sandbox negative scenario
      And  check the validation msg after entering valid email id and invalid password in the compliance manager sandbox negative scenario
     
Scenario: Validate that user not allowed to login with invalid email and valid password in compliance manager sandbox negative scenario
      When enters invalid email id and valid password in the login page of the compliance manager sandbox negative scenario
      Then click on the login button after entering invalid email id and valid password in the compliance manager sandbox negative scenario
      And  check the validation msg after entering invalid email id and valid password in the compliance manager sandbox negative scenario
      
Scenario: Validate that user is not allowed to login with valid email and valid password in the compliance manager sandbox negative scenario
      When enters valid email id and valid password in the login page in the compliance manager sandbox negative scenario
      Then click on the login button after entering valid email id and valid password in the compliance manager sandbox negative scenario
 
 
 Scenario: compliance manager tried to acess the sandbox while giving an invalid api key for a pending application
 When complince manager click on the sanbox in the dasboard
 Then check that complince manager is sucessfully navigated to thesandbox page
 Then click on the authorize button in the sandbox dasboard in sandbox negative scenario
 Then give the invalid api key in the available authorizations page in sandbox negative scenario
 Then click the authorize button in the available authorizations page in sandbox negative scenario
 And  close the internal available authorizations page in sandbox negative scenario 

            
 Scenario: checking encounter with invalid api key
         When click on the encounter resource
         Then click on the try it out button inside the encounter resource
	       Then give any text inside the tenat field of the encounter
         Then click on the execute button inside the encounter
         
         
 Scenario: checking encounter resource with valid pending application api key and left the tenant field as blank
         When complince manager click the applications in dashboard
         Then complince manager click on the any one of the pending application
         Then get the api key for the application
         And after that close that application tab 
         
         
Scenario: check that complince manager able to give the valid api key and left the tenant field  blank
        When complince manager click on the sandbox in the dashbord for giving the valid api key
        Then complince manager click on the authorize for giving the valid api key
        Then complince manager give the valid api key
        Then complince manager click on the authorize1 after giving the valid api key
        And click on the into button after giving the valid api key
       
 Scenario: complince manager checking the encounter with valid api key and also left the tenant field as blank
         When click on the encounter after giving the valid api key
         Then click on the try it out button inside the enconter after giving the valid api key
	       Then click on the execute button of the encounter resorce and check it with out giving the tenant value  


                  
Scenario: complince manager ableto check that sandbox is working correctly after giving the valid api key and tenant value
            When complince manager click on the tenant field for giving the tenant value
            Then complince manager click the execute button of the encounter resouce  
            
            
Scenario: compliance manager checking the sandbox provider directory with invalid api key for pending applications
  When click the provider directory present in compliance manager sandbox negative scenario
  Then click authorize
  Then give the invalid api key in that field in the compliance manager sandbox negative scenario
  Then click on the authorize button after giving the invalid api key for checking the compliance manager sandbox negative scenario
  And  click on the into button after giving the invalid api key in compliance manager sandbox negative scenario

Scenario: checking internal provider directory with healthcareservices
  When click on the healthcareservices provider directory for checking the compliance manager sandbox negative scenario
  Then click on the try it out in the theprovider directory for checking the  compliance manager sandbox negative scenario
  Then give the tenant value for hitting sandbox APIs for checking the compliance manager sandbox negative scenario
  And click on the execute button in the provider directory for checking the  compliance manager sandbox negative scenario
 
Scenario: compliance manager checking the sandbox provider directory after giving the valid api key
  When click the authorize button for giving the valid api key
  Then compliance manager click on the logout button for giving the valid api key
  Then give the valid api key in that field in the compliance manager sandbox negative scenario
  Then click on the authorize button after giving the valid api key for checking the compliance manager sandbox negative scenario
  And  click on the into button after giving the valid api key in compliance manager sandbox negative scenario
  And click on the execute button in the provider directory with valid api key
   
 
                     

         
         
 Scenario: checking patient resource with valid approved applicationn api key and left the tenant field as blank
         When compliance manager click the applications in dashboard for copying the valid api key
         Then click approve
         Then compliance manager click on the any one of the pending application
         Then get the valid api key of the approved application
         And after that compliance manager close that application tab 
         
         
Scenario: check that compliance manager able to give the valid api key of a approved application and left the tenant field  blank
        When compliance manager click on the sandbox in the dashbord for giving the valid api key of the approved application
        Then compliance manager click on the authorize for giving the valid api key
        Then compliance manager give the valid approved application api key
        Then compliance manager click on the authorize1 after giving the valid api key of the approved application
        And click on the into button after giving the valid api key of the approved application
       
 Scenario: compliance manager checking the patient with valid api key and also left the tenant field as blank
         When click on the patient after giving the valid api key
         Then click on the try it out button inside the patient after giving the valid api key
	       Then click on the execute button of the patient resorce and check it with out giving the tenant value  


                  
Scenario: compliance manager able to check that sandbox is working correctly for the approved application after giving the valid api key and tenant value
            When compliance manager click on the tenant field for giving the tenant value and checking the sandbox working
            Then compliance manager click the execute button of the patient resouce
            
Scenario: compliance manager tried to logout in  compliance manager sandbox negative scenario
            When compliance manager click on the signout field in  compliance manager sandbox negative scenario
            Then compliance manager click the logout field in  compliance manager sandbox negative scenario 
              
            
              
                   