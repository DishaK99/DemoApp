Feature: Registration Functionality

Scenario: Check the registration functionality for Rediff
Given user is on home page
When user clicks on create account button
And user gives uname & uid
|Disha|
|Kale|
And user clicks on create my account button 
Then Account should be created
