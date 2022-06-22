@Logout
Feature: Logout

  Background:
    Given Clockify app is displayed
    When The user logs in the application clockify with: nicojnr11@gmail.com, Academy123
    Then The user click in login button
    And Clockify home page is displayed

  @Logout
  Scenario: Realizar un log out
    Then The user release logout in app