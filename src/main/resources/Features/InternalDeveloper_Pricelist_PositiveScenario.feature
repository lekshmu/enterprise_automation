
Feature: check the working of internal developer pricelist 

 Scenario: Validate internal developer can login with the given credentials
 
      Given launches url for checking the price list
      Then  checking the priselist user able to click on the login button
      Then  lands on the login page for sandbox

Scenario: Validate internal developer enters the email id and password
       When internal developer enters valid email and password for checking the price list
       And hits login button and lands on internal page for price list
       
Scenario: Check the price list
       When click on the price list
       Then validate navigated to the price list page
     
Scenario: search the any one of the lobs 
       When click on the search button
       Then give any data for searching
       Then click the corresponding pricelist
       Then click the any of the prise list file
       Then click on the 2download button
       Then go back to the price list dashboard   