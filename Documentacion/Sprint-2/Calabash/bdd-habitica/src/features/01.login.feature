Feature: Login feature

  Scenario: As an unregistered user I can't log into habitica
    Given I enter the text "fakeuser" into field with id "username"
      And I enter the text "fakeuser" into field with id "password"
     When I touch the "Login" text
     #Then I should see "Uh-oh - your username or password is incorrect"

  Scenario: As an user I can't log into habitica if i forgot to fill the password
    Given I enter the text "fakeuser" into field with id "username"
     When I touch the "Login" text
     Then I should see "You have to fill out all fields"

  Scenario: As a valid user I can log into habitica
    Given I enter the text "EbXV6m4t7m7k" into field with id "username"
      And I enter the text "EbXV6m4t7m7k" into field with id "password"
     When I touch the "Login" text
     Then I should see "Health"
     Then I should see "EbXV6m4t7m7k"