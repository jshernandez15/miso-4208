Feature: Task feature

  Scenario: As an user I want to create a New Habit
    Given a logged in user "EbXV6m4t7m7k"
      And I want to create a new Habit
      And I enter the text "Tarea Calabash" into field with id "task_text_edittext"
     When I touch the "Save" text
     Then the Habit "Tarea Calabash" is listed
  
  @already_logged
  Scenario: As an user I want to create a New Daily
    Given I want to create a new Daily
      And I enter the text "Daily Calabash" into field with id "task_text_edittext"
     When I touch the "Save" text
     Then the Daily "Daily Calabash" is listed

  @already_logged
  Scenario: As an user I want to create a New To-Do
    Given I want to create a new ToDo
      And I enter the text "To-Do Calabash" into field with id "task_text_edittext"
     When I touch the "Save" text
     Then the To-Do "To-Do Calabash" is listed

  @already_logged
  Scenario: As an user I want to create a New Reward
    Given I want to create a new Reward
      And I enter the text "Reward Calabash" into field with id "task_text_edittext"
     When I touch the "Save" text
     Then the Reward "Reward Calabash" is listed