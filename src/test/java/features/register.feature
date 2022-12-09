Feature: As a user, I should able to register in so that i can use my account facility
@user
  Scenario: I should able to register successfully with valid credentials

    Given I am register page
    When I enter valid credentials
    And I should click on Register Button
    Then I should able to register successfully





