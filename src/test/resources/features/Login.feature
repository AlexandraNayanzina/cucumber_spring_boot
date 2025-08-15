Feature: LoginFeature
  Login functionality

  Scenario: Login with correct username and password
    Given I click login in Home Page
    And I enter the following for login
    | username | password |
    | admin | password |

    Then I should see the userform page