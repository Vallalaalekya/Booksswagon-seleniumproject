
@tag
Feature: Search functionality

  @tag1
  Scenario: To verify the search functionality
    Given Open browser, Enter the bookswagon "<URL>"
    And enter the "<Book name>"    
    And click on the search button
    And Refine By the price
    And Refine By the source
    And Refine By the binding
    When click on the searched book
    And Click on the Add to cart button
    And Search the "<second Book name>" click on search button 
		And Refine the scond book by the price
    And Refine the scond book by the source
    And click on the second searched book
    And click on Add to cart 
    Then Assert customer review
    And again give invalid input 
    And take a screenshot
    And close the browser 
    
    Examples: 
      | URL                         | Book name     | second Book name | 
      | https://www.bookswagon.com/ | Wings of Fire | The Hidden Hindu |
