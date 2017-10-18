Feature: Manage Account

  @feature_start
  Scenario: As a user i want to create a new account with a type
    Given I'm at the create account screen
      And I enter the text "Calabash Account" into field with id "input_account_name"
      And I select the option "Bank" from "input_account_type_spinner"
     When I touch the "Save" text
     Then the account "Calabash Account" is listed