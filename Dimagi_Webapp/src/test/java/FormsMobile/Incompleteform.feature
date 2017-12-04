@regression
Feature: Verify incomplete form scenario by mobile user

Scenario: Verify incomplete form scenario by mobile user


Given Mobile user Signup page
And Click on Basic form tests
And Enter some text into 'Enter a name' field
And Click on back arrow on the browser
And Click on incomplete forms
Then Verify the form appears in the list





