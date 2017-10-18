require 'calabash-android/calabash_steps'


Then /^I enter the text "([^\"]*)" into field with id "([^\"]*)"$/ do |text, id|
    enter_text("* id:'#{id}'", text)
  end

Given /^a logged in user "([^\"]*)"$/ do |text|
  enter_text("* id:'username'", text)
  enter_text("* id:'password'", text)
  tap_when_element_exists("* {text CONTAINS[c] 'Login'}")
end

Given /^I want to create a new ([\w-]+)$/ do |type|
  wait_for_element_exists("com.github.clans.fab.FloatingActionButton", :timeout => 2)
  touch("com.github.clans.fab.FloatingActionButton")
  wait_for_element_exists("* id:'fab.new.#{type.downcase}'", :timeout => 2)
  touch("* id:'fab.new.#{type.downcase}'")
end

Given /^the ([\w-]+) "([^\"]*)" is listed$/ do |type, value|
  section = ""
  case type
  when "Habit" 
    section = "Habits"
  when "Dailiy"
    section = "Dailies"
  when "To-Do"
    section = "To-Dos"
  when "Reward"
    section = "Rewards"
  end
  wait_for_element_exists("* text:'#{section}'", :timeout => 2)
  touch ("* text:'#{section}'")
  check_element_exists("* text:'#{value}'")
end