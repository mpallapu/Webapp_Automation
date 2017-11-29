Feature: Verify functions scenario by mobile user
Scenario: Verify functions scenario by mobile user

Given Mobile user Signup page
And Select the Logic tests module
And Click on Functions form
And Enter any value otherthan 0 in first question
Then Verify the text displayed below the question
And Enter 0 in the same question
Then Verify the latest text
And Enter 14 in next question
Then Verify the text 
And Click on Submit button