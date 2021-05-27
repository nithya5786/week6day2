Feature: Create New Caller in Service Now Application

Background:
Given Launch Chrome browser
When Load URL 'https://dev103117.service-now.com'
And Switch to NewFrame
And Type username as 'admin'
And Type password as 'India@123'
And Click Login Button
Then Verify Login is successful

Scenario Outline: Create new caller by filling the mandatory fields

When Enter Value in FilterNavigator for caller as <filterNav>
And Switch to NewFrame
And Click New Caller
And Type firstname as <firstName>
And Type lastname as <lastName>
And Click on Submit
Then Print caller is created

Examples:
|filterNav|firstName|lastName|
|Callers|Nithya|RaviShankar|
