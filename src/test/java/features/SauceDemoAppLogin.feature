#Author: gurumohanreddy@tcs.com
#Keywords Summary : Testing the login functionality of saucedemo application

@tag
Feature: Login page Automation of Sauce Demo Application

  @smoke
  Scenario: check login is successfully with Valid credentails
    Given user on login page of the application
    When  user enter valid "standard_user" and "secret_sauce"
    And   user click on login button
    Then  user is navigated to home page
    And   user close the browser

  @login
  Scenario Outline: check login is successfull with multiple valid credentails
    Given user on login page of the application
    When  user enter valid "<username>" and "<password>"
    And user click on login button
    Then user is navigated to home page
    And user close the browser
    

    Examples: 
      | username        | password    | 
      | locked_out_user |secret_sauce | 
      | problem_user    |secret_sauce | 
      
      

    
