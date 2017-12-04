@regression
Feature: Verify Close case  scenario by mobile user

Scenario: Verify Close case  scenario by mobile user

Given Signup page for Mobile user
And Click on Basictests 
And Click on End of form navigation
And Click on Close case
And Select case created in Navigation 1
And Click on Continue
And Click on Submit button
Then Verify user is automatically navigated to Home screen form
And Click on back arrow on the browser
