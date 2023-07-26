Feature: feature to test google search functionality


  Scenario Outline: Validate google search is working
    Given browser is open
    And user is google search page
    When user enters a <txt> in search box
    And hits enter
    Then user is navigated to search results

    Examples:
   |txt|
   |Images|
