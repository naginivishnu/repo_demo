Feature: Login
Scenario Outline: Login Validation
Given User is on Home Page
When User clicks on Sign in Link
Then User sees Login Page
When User enters "<uname>" and "<passwd>" clicks on Submit
Then User sees User Account
Examples: 
|uname | passwd |
|jack | jack123 |
|roopa | roopa123 |