Feature: Login Functionality

  Background:
    Given Navigate to CampusTechnoStudy
 @SmokeTest
  Scenario: Login with valid username and password

    When User enters username and password to log in
    And User clicks login button
    Then User should login successfully


  Scenario Outline: Login with one invalid pair of (username and password)

    When User enters invalid username "<UserN>" and or password "<PassW>" to log in
    And User clicks login button
    Then User should not login

    Examples:
      | UserN                | PassW |
      | yilmaz79@gmail.com    | Hy500 |
      | hsy1979@yahoo.com    | Yh338 |
      | hsy79@gmail.com      | Hy350 |



