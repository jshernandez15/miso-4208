require 'calabash-android/calabash_steps'

Then /^I enter the text "([^\"]*)" into field with id "([^\"]*)"$/ do |text, id|
    enter_text("* id:'#{id}'", text)
  end