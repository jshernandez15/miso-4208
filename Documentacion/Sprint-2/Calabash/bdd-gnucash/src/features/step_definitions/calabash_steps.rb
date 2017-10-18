require 'calabash-android/calabash_steps'

Then /^I enter the text "([^\"]*)" into field with id "([^\"]*)"$/ do |text, id|
    enter_text("* id:'#{id}'", text)
  end

Given "I'm at the create account screen" do
    touch("* id:'fab_create_account'")
end

Given "I select the option \"Bank\" from \"input_account_type_spinner\"" do
    touch("* id:'input_account_type_spinner'")
    touch("* text:'BANK'")
end

Given "the account \"Calabash Account\" is listed" do
    check_element_exists("* text:'Calabash Account'")
end

Given "I press the New Transaction Floating Button" do
    touch("* id:'fab_create_transaction'") 
end

Given "I go to my wallet" do
    touch("* text:'Assets'")
    touch("* text:'Current Assets'")
    touch("* text:'Cash in Wallet'")
end
