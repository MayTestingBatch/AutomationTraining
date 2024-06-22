#Author: your.email@your.domain.com
#Keywords Summary :

@tag
Feature: Check add to cart product fucntionality

Background:
    Given user on login page of the application
    When  user enter valid "standard_user" and "secret_sauce"
    And   user click on login button
    Then  user is navigated to home page 

   @homepage
   Scenario: check order of product fucntionality
   And user select "Price (low to high)" option from sortdropdown
   
   @homepage
   Scenario: check add to cart functionality
    And   user select product from list

   @homepage
   Scenario: check user able to navigate to dashboard menu
    And  user click on dashboard menu
    Then user click on About option from menu
    
    
    @homepage @testlogout
   Scenario: check user able to logout an application
    And  user click on dashboard menu
    Then user click on logout button