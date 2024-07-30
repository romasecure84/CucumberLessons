Feature: Add New Address

  Background:
    Given Navigate to Opencart
    When Enter the username and password and click login button
    Then User should login successfully

    Scenario: Add New Address
      Given Click addressBook button
      And Enter firstName "Roma" and lastName "Secure"
      And Full form and click continue button
      Then Should be added address