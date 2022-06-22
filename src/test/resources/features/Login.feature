@Login
Feature: Login

  Scenario Outline: Realizar login exitoso
    Given Clockify app is displayed
    When The user logs in the application clockify with: <email>, <password>
    Then The user click in login button
    And Clockify home page is displayed

    Examples:
      | email               | password   |
      | nicojnr11@gmail.com | Academy123 |