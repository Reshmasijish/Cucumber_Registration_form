Feature: Registration Form

  Scenario: Verification of the user registration form
    Given Open a registration form
    When Enter the valid name in the registration form by the user
    And Enter the valid address in the registration form by the user
    And Select the Gender as female
    And Select Hobbies as travelling and music
    And Select country as Australia
    And Select city as Melbourne
    And Select the correct date of birth
    And Click the submit button
    Then Close the current window
