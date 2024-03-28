
Feature: To navigate into the Magicbricks website

Background:To navigate to Magibricks App
Given I am on Magic Bricks App Login
When I enter Email ID as "bonelaharipriya2001@gmail.com"
And I click on Next
And I enter password as "Priya@123"
And I click Login
And I click on Continue
Then I am Logged in Successfully

Scenario: To navigate into the Buy dropdown
Given Iam on magicbricks page
When I click on Buy dropdown
And I click on Popular Choices
And I click on Ready to move
Then ready to move flats page will be displayed

Scenario: To search details
Given Iam on magicbricks page
When I click on Buy dropdown
And I click on Popular Choices
And I click on Ready to move
And I click on Properties 
And I click on Get Info
Then I get detail information

  
Scenario: To Display new project page
Given Iam on Magic Bricks App Login Page
When I click on Buy dropdown
And I click on Popular Choices
And I click on Ready to move
And I click on New Projects
Then New project page will be displayed

Scenario: To Display Top Agent Page
Given I am on Magic Bricks App Login Page
When I click on Buy dropdown
And I click on Popular Choices
And I click on Ready to move
And I click on New Projects
Then Top agent page will be displayed

Scenario: To click on View Details
Given I am on Magic Bricks App Login Page
When I click on Buy dropdown
And I click on Popular Choices
And I click on Ready to move
And click on Top Agents
And click on view Details
Then I see the details


