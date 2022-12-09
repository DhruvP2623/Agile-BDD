Feature: Category

  @regression
  Scenario Outline: As a user i should able to navigate to computers category pae successfully

    When I click on "<category_page>" link
    Then I should able to navigate to related "<category_link>" page successfully

    Examples:
      | category_page     | category_link     |
      | Computers         | computers         |
      | Electronics       | electronics       |
      | Apparel           | apparel           |
      | Digital downloads | digital-downloads |
      | Books             | books             |
      | Jewelry           | jewelry           |
      | Gift Cards        | gift-cards        |

