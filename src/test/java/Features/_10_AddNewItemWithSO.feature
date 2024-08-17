Feature: Add New Item

  Background:
    Given Navigate to Opencart
    When Enter the username and password and click login button
    Then User should login successfully

  Scenario Outline: Add New ItemWith Scenario Outline
    When Add new item with SO
      | searchBox | <newItem> |

    And Click to HeaderContent element with Data Table
      | searchButton |

    And  Click to DialogContent element with Data Table
      | addToCartButton |

    And Click to HeaderContent element with Data Table
      | shoppingCart |
      | viewCart     |

    Then Should be added new item in Shopping Cart
    Examples:
      | newItem |
      | ipod    |
      | samsung |
      | macbook |
      | iphone  |