@regression
Feature: Verify Constraints Fail  scenario by mobile user

Scenario: Verify Constraints Fail  scenario by mobile user

Given Mobile user Signup page
And Select the Logic tests module
And Select the constraints form
And Answer test for the second question
Then Validate the error message:Fails to submit.
