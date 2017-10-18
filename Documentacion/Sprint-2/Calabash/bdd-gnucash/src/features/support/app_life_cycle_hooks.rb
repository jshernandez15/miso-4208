require 'calabash-android/management/adb'
require 'calabash-android/operations'

Before do |scenario|
  start_test_server_in_background
end

Before("@feature_start") do |scenario|
  touch("* id:'btn_save'")
  touch("* id:'btn_save'")
  touch("* id:'btn_save'")
  wait_for_element_exists("* text:'Disable crash reports'", :timeout => 2)
  touch("* text:'Disable crash reports'")
  touch("* id:'btn_save'")
  touch("* id:'btn_save'")
  touch("* text:'Dismiss'")
end

After do |scenario|
  if scenario.failed?
    screenshot_embed
  end
  shutdown_test_server
end
