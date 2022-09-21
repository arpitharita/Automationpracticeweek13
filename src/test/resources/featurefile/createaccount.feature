Feature: AccountPage

  User should Enter details

  Scenario: verifyThatUserShouldCreateAccountSuccessfully
    Given I am on HomePage
    And I click on SIgn In Link
    And I enter "<email id>"
    And I enter "<password>"
    And I click On Create an account button
    And I click On Register Button
    Then Verify message"<My Account>"
