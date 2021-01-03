@country_update
Feature: US_26 System should allow to update countries using api end point
  "https://www.gmibank.com/api/tp-countries"

  @TC_2601
  Scenario Outline: TC_2601 User can just update each country 1 by 1
    Given Use api end point  "https://www.gmibank.com/api/tp-countries/"
    And   User finds out the size of the country list
    And  User send a Put request endpoint "https://www.gmibank.com/api/tp-countries/" as "<newCoutry>" - "<newCoutryID>" for upddate NewCountry

    Then User verify the contry was updated as "<newCoutry>" - "<newCoutryID>"
    Examples:
      | newCoutry | newCoutryID |
      | USA       | 22322       |
      | USA   | 22324       |
      | USA     | 22329       |


#    "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
#  "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"