Feature: Create New Proposal in Service Now Application

Background:
Given Launch Chrome browser
When Load URL 'https://dev103117.service-now.com'
And Switch to NewFrame
And Type username as 'admin'
And Type password as 'India@123'
And Click Login Button
Then Verify Login is successful

Scenario Outline: Create new proposal by filling the mandatory fields

When Enter Value in FilterNavigator for proposal as <filterNav>
And Switch to NewFrame
And Click New proposal
And Get Proposal Value
And Short description as 'Testing'
And Click Change Request value 
And Clear and enter short description as 'Proposal'
And Click on submit for proposal
Then verify proposal created

Examples:
|filterNav|
|proposal|
