Feature: Manage Transaction

  @feature_start
  Scenario: As a user i dont want to create a new transaction without amount
    Given I go to my wallet
      And I press the New Transaction Floating Button
      And I enter the text "Calabash Transaction" into field with id "input_transaction_name"
     When I touch the "Save" text
     #Then I should see "Enter an ammount to save the transaction"