@employeeAccCreation
  Feature: Go to homepage
    Background: Employee goes to GMI Bank homepage
      Given employee goes to GMI Bank homepage
      And user click to login icon
      And user click to Sign in
      And user click to Username box and send "team21employee"
      And user click to Password box and send "team21Employee"
      And user click to Sign in button
      And user click to My Operations button
      And user click to Manage Accounts button
      And user click to Create New Account button

      @Description
      Scenario: TC001 Employee Creates Description
      And user leaves the description box blank
      Then verify the message is "This field is required."
      And user click again to Description box and send "My Account"
      Then verify the warning message is not displayed

      @Balance
      Scenario: TC002 Employee Provides Balance
        And user leaves the Balance box blank
        Then verify the message is "This field is required."

#      Scenario: Employee provides string Balance
        And user provides string Balance "A"
        Then verify the balance message is "This field should be a number"

#      Scenario: Employee provides symbol Balance
        And user provides symbol Balance "*"
        Then verify the balance message is "This field should be a number"

#      Scenario: Employee provides positive Balance
        And user provides positive Balance "1000"
        Then verify the balance warning message is not displayed

#      Scenario: Employee provides negative balance
        And user provides negative Balance "-1000"
        Then verify the wrong balance warning is "This field should not be a negative number"

      @AccountType
      Scenario: TC003 Employee Selects AccountType
      And user selects Account Type and verifies the options
      And user does not select any option and checks the warning

      @AccountStatusType
      Scenario: TC004 Employee Selects Account Status Type
      And user selects Account Status Type and verifies the options
      And user does not select any option and gets warning

      @EmployeeSelection
      Scenario: TC005 Selecting employee
      And user click to Employee box and select employee as "emrullahd"

