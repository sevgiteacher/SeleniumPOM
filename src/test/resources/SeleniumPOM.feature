Feature: CyclosBank login page

  Scenario: The user logs in with a valid username and password
    Given the user navigates to "https://demo.cyclos.org/#login"
    When the user enters username "demo"
    And the user enters password "1234"
    And the user clicks sign in button
    Then the user views "Welcome to the Cyclos4 Demo"


  Scenario Outline: The user cannot login with an invalid username and/or password
    Given the user navigates to "https://demo.cyclos.org/#login"
    When the user enters username "<username>"
    And the user enters password "<password>"
    And the user clicks sign in button
    Then the user views errorMessage "<errorMessage>"
    Examples:
      | username | password | errorMessage                                               |
      | demo     | 12345    | The given name / password are incorrect. Please, try again |
      | demooo   | 1234     | The given name / password are incorrect. Please, try again |
      | demo     |          | Password is required                                       |
      |          | 1234     | Login name is required                                     |
      |          |          | Login name is required\nPassword is required               |

