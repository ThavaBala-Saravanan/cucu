
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario
   Given   want to Launch the Browser
    And want to enter the URL
    Then Click on the Signin button
    And Enter the username "<username>"
    And Enter the password "<password>"
    Then Click on the login button

 Examples:
      | username     |     password     | 
      | AlexUser     |     Alex@123     | 
     