@regression
Feature: Verify Fixtures form scenario by mobile user

Scenario: Verify Fixtures form scenario by mobile user

Given Mobile user Signup page
And Click on Fixtures
And Answer the first question
Then Validate the error message
And Select a second response
Then Validate error message goes away
And Select a suffolk county
Then Verify the cities displayed for suffolk country
And Select a Essex county
Then Verify the cities displayed for Essex country
And Select a Middlesex county
Then Verify the cities displayed for Middlesex country
And Select a city 
And Click on Submit button