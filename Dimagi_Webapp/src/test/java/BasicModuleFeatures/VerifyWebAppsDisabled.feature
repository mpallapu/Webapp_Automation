@regression @login @basictestcases
Feature: Verify by disabling webapp ccqa4

Scenario: Verify by disabling webapp ccqa4

Given Webuser Signuppage
And click on CCQA4 project settings gear icon
Then verify user is navigated to settings page
And click on Advanced settings Tab
And Deselecting webapp checkbox to deploy new version 
And click on Save button
And click on Cloudcare release page
Then verify is user is navigated to Cloudcare release page
And click on MakeNewVersion
Then verify new Version is created
And click on Released button
Given Mobileworker Signin
Then verify user is navigated Webapps page
Then verify Cloudcare Title
#And click on cloudcare
