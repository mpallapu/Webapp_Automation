Feature: Verify incomplete form scenario by mobile user
Scenario: Verify incomplete form scenario by mobile user


Given Mobile user Signup page
And Click on Basic form tests
And Enter some text into 'Enter a name' field
And Click on back arrow on the browser
And Click on incomplete forms
Then Verify the form appears in the list
#And Alter the Text in the field
#And Click on Submit button
#Given WebUser Signin
#And Click on Reports dropdown
#And Click on view All
#And Click on Submit history
#And Select Basic tests-->Basic form tests-->Basis forms from Filter forms dropdowns
#And Click on Apply
#Then Verify the form was received




