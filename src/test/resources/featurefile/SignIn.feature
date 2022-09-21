Feature: Sign In

  User should order clothes
  Scenario :User shouldNavigateToSingPageSuccessfully
    Given I am on HomePage
    And I click on SIgn In Link
    Then I Verify Result "AUTHENTICATION" message is displayd

    Scenario: verifyTheErrorMessageWithInValidCredentials
      Given I am On HomePage
      And I click On signIn Link
      And I enter "<email>"
      And I enter "<password>"
      And I click On Login Button
      Then I verify the Error massage "massage"

      Example:
      | username          | password     | message |
      |                   | 123456       | An email address required. |
      | abcd@gmail.com    |              | Password is required. |
      | adfdfgfg          | 123456       | Invalid email address. |
      | abcd@gmail.com    | 123456       | Authentication failed. |


    Scenario: verifyThatUserShouldLogInSuccessFullyWithValidCredentials().
      Given I am On HomePage
      And  Click on sign link
      And I Enter "<EmailId>"
      And I Enter "<Password>"
      And I Click on Sign Button
      Then Verify that "Sign out" link is displayed

    Scenario: verifyThatUserShouldLogOutSuccessFully()
      Given I am On HomePage
      And I Click on sign link
      And I Enter "<EmailId>"
      And IEnter "<Password>"
      And I Click on Sign Button
      And I Click on Sign out Link
      Then Verify that "Sign In" Link displayed


