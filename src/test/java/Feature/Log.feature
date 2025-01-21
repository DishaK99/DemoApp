Feature: validate Login Functinality for swag labs application

Scenario Outline: check the login functinality for valid data
Given user is on the login page of swag lab
When user enter <username> & <password>
And user clicks on login button
Then Login should be successful

Examples: 
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce| 
