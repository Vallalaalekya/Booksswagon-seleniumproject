Feature: Boxsets Functionality on Bookswagon

  @tag1
  Scenario: Adding a Boxset to Add to cart
    Given Open browser, Enter the bookswagon "<URL>"
    When user clicks on the Boxsets category
    And user selects a specific boxset book
    And user clicks on Addto cart
    And user click on See more details
    And user clicks on Read more
    And user then assert the customerreview
    And user takes a screenshot 
    And user closes the browser
   Examples: 
      | URL                         | 
      | https://www.bookswagon.com/ | 
  