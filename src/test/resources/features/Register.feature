@Register
Feature: Register
  As a user
  I want to register
  So I can login
@Register
  Scenario Outline: Register page
    Given I am on register page
    When I am input name "<name>"
    And I am input email "<email>"
    And I am input password "<password>"
    Then I click register button
    Examples:
    | name  |  email  |  password |
    |retiamelina|retiamelina3@gmail.com|Retiaah10|
    |retiamelina|retiamelina3@gmail.com|         |
    |retiamelina|                     |Retiaah10|
    |retiamelina|                     |         |
    |            |retiamelina3@gmail.com|Retiaah10|
    |            |retiamelina3@gmail.com|         |
    |            |                     |Retiaah10|
    |            |                     |         |
