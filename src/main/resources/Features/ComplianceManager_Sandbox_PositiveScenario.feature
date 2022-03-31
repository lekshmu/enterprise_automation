Feature: complaince manager sandbox working positive scenarios

Scenario: launching  the url
   When launch the url for complaince manager cmm
   Then complaince manager can click on the login button cmm
   Then lands on the complaince manager login page cmm
   
Scenario: sucessfull login cm
  When   cm enters the login id and password cmm
  Then   hits on the login button foe com and check the sucessfull login cmm
  
Scenario: sandbox for pending applications
   When click on pending applications cmm
   Then click on the first application for cmm
   Then get the api key cmm
   Then close the applications cmm
   
Scenario: get the tha api key for cm
       When click on the sandbox cm
       Then click on the authorize cm
       Then give the value cm
       Then click on the authorize1 cm
       Then click on the into button cm
       
Scenario: checking cm
         When click on the encounter cm
         Then click on the try it out cm
         Then give the text cm
         Then click on the execute cm 
         
Scenario: checking another api
         When click on the immunization cm
         Then click on the try it out immunization cm
         Then give the text immunization cm
         Then click on the execute immunization cm
         
Scenario: checking the complaince sandbox provider directory
       When click on the sandbox cm provider directory
       Then click on the authorize cm provider directory
       Then give the value cm provider directory
       Then click on the authorize1 cm provider directory
       Then click on the into button cm provider directory
 
 Scenario: checking cm provider directory with endpoints
         When click on the endpoints cm provider directory
         Then click on the try it out cm provider directory
         #And click on the tenat cm provider directory
         Then give the text provider directory
         Then click on the execute cm provider directory         
                  
Scenario: go back to the application approve and then check thesandbox
       When click on the application cmsa
       Then click on the approved application cmsa
       Then click on the first applications cmsa
       Then get the api key cmm second
       Then close the applications cmm scecond
       
Scenario: Scenario: get the tha api key for cm scecond
       When click on the sandbox cm scecond
       Then click on the authorize cm scecond
       Then give the value cm scecond
       Then click on the authorize1 cm scecond
       Then click on the into button cm scecond
 

 Scenario: checking cm scecond
         When click on the encounter cm scecond
         Then click on the try it out cm scecond
         Then give the text cm scecond
         Then click on the execute cm  scecond
              
       
 Scenario: checking another patient cm api
         When click on the patient cm api
         Then click on the try it out patient cm
         Then give the text patient cm
         Then click on the execute patient cm
 
 Scenario: checking the complaince sandbox provider directory for approved applications
       When click on the sandbox cm ap provider directory
       Then click on the authorize cm ap provider directory
       Then give the value cm ap provider directory
       Then click on the authorize1 cm ap provider directory
       Then click on the into button cm ap provider directory
 
 Scenario: checking cm provider directory with healthcareservice
         When click on the endpoints cm ap provider directory healthcareservice
         Then click on the try it out cm ap provider directory healthcareservice
         #And click on the tenat cm provider directory
         Then give the text provider cm ap directory healthcareservice
         Then click on the execute cm ap provider directory healthcareservice 
         Then go back to the dashobard complaince secondd                    