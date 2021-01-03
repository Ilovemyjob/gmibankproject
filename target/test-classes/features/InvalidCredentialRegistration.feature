

  Feature: Sigin with invalid credentials
    Background: User goes to GMI homepage
      Given user goes to  homepage

      Scenario: TC_01 Any field on the registration page should not be left blank
        When user clicks user icon
        When user clicks register button
        And user clicks register
        Then user verifies SSN message
        Then user verifies firstname message
        Then user verifies lastname message
        Then user verifies username message
        Then user verifies email message
        Then user verifies new password message
        Then user verifies confirmation password message
        Then And user verifies the visibility of message


      Scenario Outline: TC_02 SSN number cannot be of any chars nor spec chars except "-"
        When user clicks user icon
        When user clicks register button
        And User enters SSN number "<ssnNumber>"
        And user enters firstname "<firstname>"
        And user enters lastname "<lastname>"
        And user enters address "<address>"
        And user enters mobile phone "<mobilePhone>"
        And user enters username "<username>"
        And user enters email "<email>"
        And user enters new password "<password>"
        And user enters new password confirmation "<password>"
        And user clicks register
        Then User verifies the SSN invalid message

        Examples:  Data for TC_02

          | ssnNumber | firstname | lastname  | address      | mobilePhone    | username  | email        | password |
          |1585-7854  | Thomas    | Ziegler   |Mainstreet 55 | 123-456-7890   | thozie    | jokl@gmx.de  | 123456   |

      Scenario: TC_03 Mobilephone number cannot be of any chars nor spec chars except "-"
        When  When user clicks user icon
        When user clicks register button
        And User enters SSN number
        And user enters firstname
        And user enters lastname
        And user enters address
        And user enters mobile phone
        And user enters username
        And user enters email
        And user enters new password
        And user enters new password confirmation
        And user clicks register
        Then user verifies the message


        Scenario: TC_04 Email id cannot be created without "@" sign and ".com" extension
          When  When user clicks user icon
          When user clicks register button
          And User enters SSN Number
          And user enters Firstname
          And user enters Lastname
          And user enters Address
          And user enters Mobile phone
          And user enters Username
          And user enters Email
          And user enters New password
          And user enters New password confirmation
          And user clicks register
          Then user verifies the mail message







