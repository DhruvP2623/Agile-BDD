Feature:buying product
  @product
  Scenario: verify register user should be able to buy a product successfully
    Given I am on register page
    When I registered successfully
    And I select cell phone from electronics category
    And I select NokiaLumia Product
    And I add product to cart
    And I enter personal details for checkout
    And I enter valid card details
    Then I should be able to buy a product successfully
