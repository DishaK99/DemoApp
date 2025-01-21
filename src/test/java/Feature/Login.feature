Feature: validate Login Functinality for swag labs application

Scenario: check the login functinality for valid data
Given user is on the login page of swag lab
When user enter uname & password
And user clicks on login button
Then Login should be successful