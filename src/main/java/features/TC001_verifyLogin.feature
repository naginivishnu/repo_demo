Feature: Login Action
Scenario: Validate Login with valid inputs and display successful if expected.
Given user is on home page
When user clicks on Sign in link check next page title
When user enters username and password clicks on Submit button
Then validate user and display a Successful message 
Then Logout and close Application

Scenario: Validate Login with invalid inputs and display error message
Given user is on home page
When user clicks on Sign in link check next page title
When user enters invalid username and valid password clicks on Submit button
Then validate for error message 
When user enters valid username and invalid password clicks on submit button
Then validate for error message