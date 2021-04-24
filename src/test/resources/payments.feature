Feature: Payments
  I want to make payments

  Scenario: payment to existing user
    Given user in the home page
    When I make payment to existing user
    Then I verify the balance
