@userInfoPositiveTest
  Feature: User Info Page Test
    Background: Entrance of the page
      Given user is on the home page
      And sign in as "user"
      And Click on user name and click on User info
      @function
    Scenario: testing the page functionalities
      Then Verify that "First Name", "Last Name", "Email", and "Language" textboxes is on the page
    @drop
    Scenario: testing Language drop down menu
      Then Verify that "English" and "Türkçe" are in the dropbox
     @firstname
    Scenario Outline: Testing Update first name functionality
      And Type "<firstname>" in first name textbox
      And Click on save button
      Then Verify the success message is "Settings saved!"
       Examples:
       |firstname |
       |team21    |
       |team21new |
    @last
    Scenario Outline: Testing Update last name functionality
      And Type "<lastname>" in last name textbox
      And Click on save button
      Then Verify the success message is "Settings saved!"
      Examples:
      |lastname   |
      |newlastname|
      |user       |

      @email
    Scenario: Testing Update email functionality
      And Type "team210@gmail.com" in email textbox
      And Click on save button
        Then Verify the success message is "Settings saved!"
    @userInfoNegativeTest
    @NegativeEmail
    Scenario Outline: Testing Update email functionality
      And Type "<email>" in email textbox
      And Click on save button
      Then Verify the error message is "This field is invalid"
      Examples: Negative cases for email
        |email          |
        |44321          |
        |usergmail.com  |
        |user@.com      |
        |user@gmailcom  |
        |.com@          |
        |212.com@       |

    @langtest
    Scenario: Testing language options
      Then Verify that "English" and "Türkçe" are only options in the drop box