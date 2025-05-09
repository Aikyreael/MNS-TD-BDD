Feature: Password change

  Background:
    Given I am on the login page
    When I fill in the login form with valid details
    And I submit the login form
    Then I should be connected

  Scenario: Change password successfully
    And I navigate to the password change page
    And I change my password from "bug" to "newbug"
    Then I should see a confirmation message