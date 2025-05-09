Feature: Change security level

  Background:
    Given I am on the login page
    When I fill in the login form with valid details
    And I submit the login form
    Then I should be connected

  Scenario Outline: Change security level
    And I change the security level to "<level>"
    Then the security level should be "<level>"

    Examples:
      | level  |
      | medium |
      | high |
      | low |