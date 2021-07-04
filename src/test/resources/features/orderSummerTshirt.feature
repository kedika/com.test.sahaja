@Regression @Order
Feature: Order Summer T shirt
  As a customer,
  I should be able add products to the cart and proceed to order history

  Background:
    Given the customer is on "Home" page

  Scenario: HomePage to Checkout journey with Guest user
    Given customer adds "Printed Chiffon Dress" summer dress to the cart
    When proceeds to the checkout and signin with existing user
    Then product details should be available in review order history
    And should be able to make the payment


