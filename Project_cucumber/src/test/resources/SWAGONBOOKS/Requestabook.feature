@tag1
Feature: Requestbooks Functionality on Bookswagon
Scenario 1: Successful Book Request Submission

Given Open browser, Enter the bookswagon "<URL>"
When user clicks on the Requestabook icon
And user fills in all the required fields in the form
And user takes a screenshot of the confirmation
And user closes the browser



Examples: 
      | URL                         | 
      | https://www.bookswagon.com/ | 


