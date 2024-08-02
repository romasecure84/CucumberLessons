Feature: DataTable Functionality

  Background:
    Given Navigate to Opencart
    When Enter the username and password and click login button
    Then User should login successfully

  Scenario: Should be click with Data Table
    When Enter item name "ipod"
    And Click to element with Data Table
      | searchButton |
      | ipod4        |
      | shoppingCart |
      | viewCart     |
    Then Should be added new item in Shopping Cart