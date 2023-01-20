Feature: To test checkout functionality

  Scenario: To check whether user is able to checkout
    Given User is logged in
    When user adds item to the cart
    And user clicks the cart
    And user clicks on checkout
    And User enters first name last name and zip code
    And user clicks on continue
    And user clicks on finish
    Then User validates order page
