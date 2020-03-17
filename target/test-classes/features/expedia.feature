Feature: Flights Search

  Scenario: Find flights from Chicago to Miami
    Given User is on the main page
    When the user enters Chicago to from
    And the user enters Miami as destination
    And the user enters departing and return dates
    And the user clicks search button
    Then the new tab with flight results should open