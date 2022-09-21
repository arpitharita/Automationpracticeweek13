Feature: WomanCategoryPage Test
  Navigate women category page and check product

  Scenario: verifyUserShouldNavigateToWomenCategoryPageSuccessfully
    Given I am on Home Page
    When  I click on Woman Tab
    And   Verify "WOMAN" Tab

  Scenario Outline: verifyUserShouldAddProductToTheCartSuccessfully

    Given I am on Home Page
    When  I click on Woman Tab
    And   I click on product "<product>"
    And   I change quantity "<qty>"
    And   I select size "<size>"
    And   I select colour "<color>"
    And   I click on Add to Cart Button
    Then  I close popup display
    Examples:
      | product                                | qty | size | color  |
      | Blouse                                 | 2   | M    | White  |
      | Printed Dress                          | 3   | L    | Orange |
      | Printed Chiffon Dress                  | 4   | S    | Green  |
      | Printed Summer Dress with Price $28.98 | 2   | M    | Blue   |


