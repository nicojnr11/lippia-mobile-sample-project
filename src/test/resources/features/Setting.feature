Feature: Settings

  Background: : Realizar login exitoso
    Given Clockify app is displayed
    When The user logs in the application clockify with: nicojnr11@gmail.com, Academy123
    Then The user click in login button
    And Clockify home page is displayed

  @Settings
  Scenario: Entrar a configuraciones y cambiar una de las configuraciones (Modo oscuro, notificaciones)
    Given The user go setting page
    When The user click in dark mode
    And The user click in show notification
    Then The user back to home page