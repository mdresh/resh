Feature: Amazon Product Search

  Scenario: User searches for a product
    Given the user is on the Amazon homepage
    When the user searches for "iPhone X"
    Then the search results page should display relevant products
    And the user selects the specific product
    Then the product details page should be displayed

