
  Feature: Login page should accessible with valid credentials
    Background: User enters home page
      Given User enters homepage

      Scenario: TC_01 There should be a valid username and password validating the success message to login
        When user clicks account icon
        When user clicks signin
        And user enters a valid user name "team21user"
        And user enters a valid password "team21User"
        And user clicks sign in
        And user clicks account icon
        Then user verifies the signout displayed

        Scenario: TC_02 There should be an option to cancel login
          When user clicks account icon
          When user clicks signin
          And user enters a valid user name "team21user"
          And user enters a valid password "team21User"
          Then user verifies the clickability of cancel button







