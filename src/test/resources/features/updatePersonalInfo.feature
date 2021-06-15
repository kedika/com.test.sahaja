@Regression @PersonalInfo
Feature: Update personal information in my account
  As a signed up user,
  I should be able to update personal information successfully

  Background:
    Given the user is on "Home" page

  Scenario: Update firstname in my personal information
    Given the user has logged in with "TestUser"
    When the user update "firstName"
    Then should be able to update with success message
    And the updated "firstName" should appear in personal info page