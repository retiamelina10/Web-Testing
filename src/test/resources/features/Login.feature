@Login
Feature: Login
  As a user
  I want to login
  So I can access the app
@Login
  Scenario Outline: Login page
    Given I am on login page
    When I am input my email "<email>"
    And I am input my password "<password>"
    And I click login button
    Then I can login
    Examples:
    | email | password|
    |retiamelina@gmail.com|Retiaah10|
    |retiamelina@gmail.com|         |
    |                     |Retiaah10|
    |retiamelina@gmail.com|Retiaaah10|
    |rmelina@gmail.com    |Retiaah10 |
    |rmelina@gmail.com    |Retiaaah10 |
    |                     |           |
