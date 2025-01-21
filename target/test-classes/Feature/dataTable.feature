Feature: Search Functionality

Scenario: Check the search functionality for rediff
Given user is on home page
When user gives keyword in search field
|Manipur|
|Modi|
And user cliks on search icon user 
Then Search data should be displayed

