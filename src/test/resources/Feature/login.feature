Feature: Login

  Background:
    Given I am on the login page

  Scenario: Successful login
    When I fill in the login form with valid details
    And I submit the login form
    Then I should be connected

  Scenario Outline: Unsuccessful login
    When I fill in the login form with "<username>" and "<password>"
    And I submit the login form
    Then I should not be connected

    Examples:
      | username  | password  |
      | wronguser | bug       |
      | bee       | wrongpass |
      | wronguser | wrongpass |

  Scenario: Logout after successful login
    When I fill in the login form with valid details
    And I submit the login form
    And I click on logout and accept
    Then I should be redirected to the login page

