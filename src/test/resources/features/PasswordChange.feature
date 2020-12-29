@PasswordStrength1
Feature: Password Strength
  Background: Entrance of the page
    Given user is on the home page
    And sign in as "user"
    And Click on user icon and click on Password
    And Enter "team21User" to the current password textbox.
    @edit
  Scenario: Edit Password
    Given Enter "team21User" to the New password textbox.
    And Enter "team21User" to the New confirmation password textbox.
    And Click on the save button.
    Then There should be a Error Message
  Scenario Outline: Password should include at least a lowercase.
    Given User send "<passwordUpdatesData>" into the New Password textbox.
    Then Verify the password strength is increased.
    Examples:
      |passwordUpdatesData|
      | aAAAAAA   |
      | aAAAA111  |
      | aaaa525   |
  Scenario Outline: Password should include at least a uppercase.
    Given User send "<passwordUpdatesData>" into the New Password textbox.
    Then Verify the password strength is increased.
    Examples:
      |passwordUpdatesData|
      |Aaaaaaa            |
      |Aaaa..aa12         |
      |Aaaavgvgvy         |
  Scenario Outline: Password should include at least a digit.
    Given User send "<passwordUpdatesData>" into the New Password textbox.
    Then Verify the password strength is increased.
    Examples:
      |passwordUpdatesData|
      | 1aaaaaa           |
      | Aaaaaaa12         |
      | Aaaa..aa12        |
      | Aaddfdsa          |
  Scenario Outline: Password should include at least a special char.
    Given User send "<passwordUpdatesData>" into the New Password textbox.
    Then Verify the password strength is increased.
    Examples:
      |passwordUpdatesData|
      | 1aaaaaa           |
      | .aaaaaa           |
      | Aaaaaaa12         |
      | Aaaa..aa12        |
      | Aadddsaaa         |
  Scenario Outline: Password should include at least 7 chars.
    Given User send "<passwordUpdatesData>" into the New Password textbox.
    Then Verify the password strength is increased.
    Examples:
      | passwordUpdatesData |
      | Aaaaaaa             |
      | Aaaa12              |
      | Aaaa..aa12          |
      | Aaddasdsa           |