Feature: Demo Example

  Scenario: Running a Full Text Quick Search
    Given I set search request "Iphone 45"
    When I perform search
    Then the term query "iPhone" should be the first in the search Result grid

  Scenario Outline:
    Given I set search request "<request>"
    When I perform search
    Then the term query "<response>" should be the first in the search Result grid
    Examples:
      | request | response |
      | Samsung Galaxy | Samsung Galaxy |
      | Motorola | Motorola |




