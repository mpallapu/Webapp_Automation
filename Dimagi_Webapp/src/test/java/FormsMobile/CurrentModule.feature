@regression
Feature: Verify CurrentModule form scenario by mobile user

Scenario: Verify CurrentModule form scenario by mobile user

Given Signup page for Mobile user
And Click on Basictests 
And Click on End of form navigation
And Click on Current Module
And Enter any data in CurrentModule question
And Click on Submit button
Then Verify user is navigated to the EOF navigation form

