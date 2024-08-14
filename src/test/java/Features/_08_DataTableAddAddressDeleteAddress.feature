Feature: Add new address and than delete

  Scenario: Add and delete scenario
    Given Navigate to Opencart
    When Enter username and password with Data Table
      | email    | romasecure55555@gmail.com |
      | password | 123456                    |
    And Click to DialogContent element with Data Table
      | loginButton |
    Then User should login successfully
    And Click to DialogContent element with Data Table
      | addressBookLink  |
      | newAddressButton |
    And Enter text to webElement in address line
      | firstNameShield | Roma         |
      | lastNameShield  | Jabrayilov   |
      | addressShield   | Oxud Village |
      | cityShield      | Sheki        |
      | postCodeShield  | AZ5527       |
    And Select country and zone
      | selectCountry | United Kingdom |
      | selectState   | Angus       |
    And Click to element with Data Table
      | continueButton |
    And Should be added address
    And Click to DialogContent element with Data Table
      | deleteButton |
    Then Should be deleted new address