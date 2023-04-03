@shopping
Feature: Success Shopping

  Background:
    Given go to web page
    When the user enters user name "standard_user" and password "secret_sauce" and clicks login button

  Scenario: The User Chooses Produnts And Adds To Cart
    Given the user sorts products from high to low
    And the user chooses three products and adds to cart
    Then verify that shopping cart shows "3" chosen products

  Scenario: Cart Assertion
    Given the user sorts products from high to low
    And the user chooses three products and adds to cart
    And navigate to your cart page
    Then verify that the user is on the Your Cart "Your Cart" page
    Then verify that right products are in the shopping cart
      | Sauce Labs Fleece Jacket |
      | Sauce Labs Backpack      |
      | Sauce Labs Bolt T-Shirt  |

  Scenario: Verify Prices

    Given the user sorts products from high to low
    And the user chooses three products and adds to cart
    And navigate to your cart page
    When the user clciks checkout button
    Then verify that the user is on the Checkout "Checkout: Your Information" page

  Scenario: Fill The Form

    Given the user sorts products from high to low
    And the user chooses three products and adds to cart
    And navigate to your cart page
    And the user clciks checkout button
    When the user fills the form with first name "Mustafa" last name "Murat" and cip code "123"
    And the user clicks continue button
    Then verify that the user is on the Description "Description" page

  Scenario: Verify That Prices Are Equals

    Given the user sorts products from high to low
    And the user chooses three products and adds to cart
    And navigate to your cart page
    And the user clciks checkout button
    When the user fills the form with first name "Mustafa" last name "Murat" and cip code "123"
    And the user clicks continue button
    Then verify that sum of produts' prices and total price are equal


  Scenario: Verify That Prices Are Equals

    Given the user sorts products from high to low
    And the user chooses three products and adds to cart
    And navigate to your cart page
    And the user clciks checkout button
    When the user fills the form with first name "Mustafa" last name "Murat" and cip code "123"
    And the user clicks continue button
    And the user clicks finish button
    Then verify that the user is on the Checkout Complete "Checkout: Complete!" page
