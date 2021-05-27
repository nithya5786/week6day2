Feature: Delete Caller in Service Now Application

Background:
Given Launch Chrome browser
When Load URL 'https://dev103117.service-now.com'
And Switch to NewFrame
And Type username as 'admin'
And Type password as 'India@123'
And Click Login Button
Then Verify Login is successful

Scenario Outline: Delete caller by filling the mandatory fields

When Enter Value in FilterNavigator for caller as <filterNav>
And Switch to NewFrame
And Search with name as <firstName>
And Click on the Name
And Click Delete
Then Print deleted

Examples:
|filterNav|firstName|
|Callers|Nithya|
