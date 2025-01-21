Feature: validate Login Functionality for swag labs application

Scenario: check the login functionality for valid data
Given user is on the login page for swag lab
When user opens an excel sheet and read the values
And user credentials enter username & password
And user clicks on login button
Then Login should be successful