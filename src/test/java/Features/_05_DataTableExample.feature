Feature: Search item with data table

  Background:
    Given Navigate to Opencart
    When Enter the username and password and click login button
    Then User should login successfully

    Scenario: Add item with parameters
      When Enter item name as DataTable
      |ipod|
      |samsung|
      |macbook|
      |iphone|

      Then Should be added new item in Shopping Cart