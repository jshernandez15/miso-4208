require 'calabash-android/management/adb'
require 'calabash-android/operations'

Before do |scenario|
  start_test_server_in_background
end

Before("not @already_logged") do |scenario|
  wait_for_element_exists("* id:'message'", :timeout => 20)
  press_back_button
  wait_for_element_exists("* id:'skipButton'", :timeout => 2)
  touch("* id:'skipButton'")
  wait_for_element_exists("* id:'show_login_button'", :timeout => 2)
  touch("* id:'show_login_button'")
end

After do |scenario|
  if scenario.failed?
    screenshot_embed
  end
  shutdown_test_server
end