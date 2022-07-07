Feature: Add to Cart Functionality of Summer Dress

  @Smoke
  Scenario: As a user i want to verify product has been added to cart
    Given I am on Home page
    When I mouse hoover on dresses link
    And I click on summer dresses
    And I scroll down to pic
    And I mouse hoover on pic and click on Add to cart
    And I click on Proceed to checkout link
    And I click on Proceed to checkout again
    And I enter email address "pvrajesh404@gmail.com"
    And I enter password "Abcd1234"
    And I Click on sign in button
    And I click on Proceed to checkout link 3rd time
    And I click on checkbox of agree terms & condition
    And I click on Proceed to checkout again 4th time
    And I click on pay by bank wire link
    And I click on confirm my order
    Then I can see "ORDER CONFIRMATION" message

