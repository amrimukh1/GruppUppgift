Feature: To test login functionality

  Scenario: Check login is sucessful using the valid credentials
    Given User is on login page
    When user enters username and password
    And clicks on login buttons
    Then User is navigated to home page

    