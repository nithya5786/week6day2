Feature: Delete Incident in Service Now Application

Background:
Given Launch Chrome browser
When Load URL 'https://dev103117.service-now.com'
And Switch to NewFrame
And Type username as 'admin'
And Type password as 'India@123'
And Click Login Button
Then Verify Login is successful

Scenario Outline: Delete incident by filling the mandatory fields

When Enter Value in FilterNavigator for incident as <filterNav>
And Switch to NewFrame
And Search incident number as <inciNumber>
And Click on the incident number
And Click on Delete incident
Then Verify the deleted incident

Examples:
|filterNav|inciNumber|
|Incident|INC0011591|
