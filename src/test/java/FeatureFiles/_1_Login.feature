Feature: Login Functionality

  Background:
    Given Navigate to CampusTechnoStudy

  Scenario: Login with valid username and password

    When User enters username as "hsyilmaz1979@gmail.com" and password as "Hy338" to log in
    And User clicks login button
    Then User should login successfully

  Scenario Outline: Login with one invalid value for the pair of (username and password)

    When User enters invalid username "<USERN>" and or password "<PASSW>" to log in
    And User clicks login button
    Then User should not login
    Examples:
      | USERN                  | PASSW |
      | hsyilmaz1979@gmail.com | Hy300 |
      | hsy1979                | Hy338 |
      | hsy79@                 | Hy350 |



