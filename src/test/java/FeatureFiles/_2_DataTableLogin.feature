Feature: Login Functionality

  Background:
    Given Navigate to CampusTechnoStudy

    @SmokeTest
  Scenario: Login with valid username and password
    When User sends username and password
      | username | hsyilmaz1979@gmail.com |
      | password | Hy338                  |

    And User press login button
      | loginButton |
      | cooky       |
    Then User should login successfully

@Regression
  Scenario Outline: Login Failure with invalid username or password
    When User sends username and password
      | username | <UserNm> |
      | password | <PassWd> |

    And User press login button
      | loginButton |
      | cooky       |

    Then User should not login

    Examples:
      | UserNm                 | PassWd |
      | hsy@yahoo.com          | Hy338  |
      | hsyilmaz1979@gmail.com | hy308  |
      | mailman@Hotmail.com    | Hy333  |


