Feature: Add New Item With Parameter
  Background:
    Given Navigate to Opencart
    When Enter the username and password and click login button
    Then User should login successfully

    Scenario: Add new item with parameter

      When Enter itemName "ipod"
      And Add to cart check
      Then Should be added new item in Shopping Cart