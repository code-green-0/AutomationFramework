Feature: Google Testing

  Scenario Outline: Open and enter text in search
    Given User is on Google Homepage
    When User enters <searchText>
    Then result is displayed

    Examples:
    |searchText|
    |toolsQA   |
