Feature: Create New incident in Service Now Application

Background:
Given Launch Chrome browser
When Load URL 'https://dev103117.service-now.com'
And Switch to NewFrame
And Type username as 'admin'
And Type password as 'India@123'
And Click Login Button
Then Verify Login is successful

Scenario Outline: Create new caller by filling the mandatory fields

When Enter Value in FilterNavigator for incident as <filterNav>
And Switch to NewFrame
And Click New Incident
And Get Incident Number
And Type Short Description as 'Testing'
And Click on Submit button
Then Verify Incident Created

Examples:
|filterNav|
|Incident|
