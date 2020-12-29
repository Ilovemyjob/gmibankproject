@country
Feature: read all country data
  Scenario:
    Given user go to api end point "https://www.gmibank.com/api/tp-countries"
    And read all countries and write
    Then validate countries