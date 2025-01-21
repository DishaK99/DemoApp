@login
Feature: validate Login Functionality for swag labs application

Background:
Given user is on the login page for swag lab

@validData
Scenario: check the login functionality for valid data
When user credentials enter username & password
And user clicks on login button
Then Login should be successful

@invalidData
Scenario: check the login functionality for invalid data
When user enter invalid username & password
And user clicks on login button
Then Error message should be displayed