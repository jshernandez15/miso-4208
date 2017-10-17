Feature: Login feature

  Scenario: As a valid user I can log into my app
    Given I enter the text "EbXV6m4t7m7k" into field with id "username"
      And I enter the text "EbXV6m4t7m7k" into field with id "password"
    When  I touch the "Login" text