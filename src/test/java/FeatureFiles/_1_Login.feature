Feature: Login Functionality

  Background:
    Given Navigate to CampusTechnoStudy

  Scenario: Login with valid username and password

    When User enters username as "hsyilmaz1979@gmail.com" and password as "Hy338" to log in
    And User clicks login button
    Then User should login successfully

  Scenario Outline: Login with one invalid pair of (username and password)

    When User enters invalid username "<UserN>" and or password "<PassW>" to log in
    And User clicks login button
    Then User should not login
    Examples:
      | UserN                  | PassW |
      | hsyilmaz1979@gmail.com | Hy300 |
      | hsy1979@yahoo.com      | Hy338 |
      | hsy79@gmail.com        | Hy350 |



