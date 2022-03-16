Feature: check the working of complaince manager pricelist 

 Scenario: Validate complaine manager can login with the given credentials
 
      Given launches url for checking the price list for complaince
      Then  for checking the priselist complaince manager able to click on the login button
      Then  lands on the login page for complaince manager pricelist

Scenario: Validate complaine manager enters the email id and password
       When complaince manager enters valid email and password for checking the price list
       And hits login button and lands on icomplaince manager page for price list
       
Scenario: Check the price list in the cm page
       When click on the price list in the cm page
       Then validate navigated to the price list page of the cm
       

Scenario: search the any one of the lobs in the complaince
       When click on the search button present in the complaince manager page
       Then give any data for searching in the cm
       Then click the corresponding complaince pricelist
       Then click the any of the prise list file of the complaince manager
       Then click on the second download button
       Then go back to the price list of the cm dashboard   