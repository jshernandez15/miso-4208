require 'calabash-android/management/adb'
require 'calabash-android/operations'

Before do |scenario|
  start_test_server_in_background
  wait_for_element_exists("* id:'skipButton'", :timeout => 2)
  press_back_button
  touch(query("* id:'skipButton'"))
  wait_for_element_exists("* id:'show_login_button'", :timeout => 2)
  touch(query("* id:'show_login_button'"))
end

After do |scenario|
  if scenario.failed?
    screenshot_embed
  end
  shutdown_test_server
end
