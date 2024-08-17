Feature:  Example scenario Outline

  Scenario Outline: Example scenario outline with data table
    Given Navigate to Opencart
    And User sending username and password
      | email    | <email>    |
      | password | <password> |
    And Click to DialogContent element with Data Table
    |loginButton|
    Then User should login successfully
    Examples:
      | email                     | password |
      | romaSecure55555@gmail.com | 123456   |
      | romaSecure55555@gmail.com | 123456   |
      | romaSecure55555@gmail.com | 123456   |
      | romaSecure55555@gmail.com | 123456   |
      | romaSecure55555@gmail.com | 123456   |