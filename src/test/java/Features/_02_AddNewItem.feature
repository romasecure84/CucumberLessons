Feature: New Item Add To Cart
  Scenario: Add new item
    Given Navigate to Opencart
    When Enter the username and password and click login button
    Then User should login successfully
    And Enter item name to search box and click search button
    When Add to cart check
    Then Should be added new item in Shopping Cart
