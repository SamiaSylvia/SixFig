@smokeTest
Feature: Perform a search on amazon.com

Scenario Outline: search for books 

Given I am on Amazon homepage
When I enter the search "<term>" on the search box
And I click on the search icon
Then I find the relevent search result
When I select the first link from the results 
Then I see the right title of the product 


Examples:
|term			|
|QA Books	|
|Top gun	|
