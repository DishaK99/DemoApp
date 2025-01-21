Feature: validate Login Functionality for swag labs application

Scenario: check the login functionality for valid data
Given user is on the login page for swag lab
When user credentials enter username & password
|standard_user|secret_sauce|
|problem_user|secret_sauce|
And user clicks on login button
Then Login should be successful