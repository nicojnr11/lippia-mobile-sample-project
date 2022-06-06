@Practica
Feature: Practica Lippia Mobile

  Scenario Outline: Realizar login exitoso
    Given Clockify app is displayed
    When The user logs in the application clockify with: <email>, <password>
    Then The user click in login button
    And Clockify home page is displayed


    Examples:
      | email               | password   |
      | nicojnr11@gmail.com | Academy123 |

  Scenario Outline: Entrada de datos exitoso (horas y minutos)
    Given Clockify app is displayed
    When The user logs in the application clockify with: <email>, <password>
    And The user click in login button
    And Clockify home page is displayed
    And The user set to manual add entry
    And The user set start time with <hoursStart> hours, <minutesStart> minutes
    And The user set end time with <hoursEnd> hours, <minutesEnd> minutes
    And The user click in save button
    And The user set <description> in working description
    And The user click in save button


    Examples:
      | email               | password   | hoursStart | minutesStart | hoursEnd | minutesEnd | description                   | any       |
      | nicojnr11@gmail.com | Academy123 | 09         | 00           | 17       | 00         | Prueba practica lippia mobile | Add entry |

  Scenario Outline: Entrada de datos exitoso (horas, minutos y fecha)
    Given Clockify app is displayed
    When The user logs in the application clockify with: <email>, <password>
    And The user click in login button
    And Clockify home page is displayed
    And The user set to manual add entry
    And The user set calendar with day: <day>, month: <month>, year: <year>
    And The user set start time with <hoursStart> hours, <minutesStart> minutes
    And The user set end time with <hoursEnd> hours, <minutesEnd> minutes
    And The user click in save button
    And The user set <description> in working description
    Then The user click in save button

    Examples:
      | email               | password   | hoursStart | minutesStart | hoursEnd | minutesEnd | description                   | day | month  | year |
      | nicojnr11@gmail.com | Academy123 | 09         | 00           | 17       | 00         | Prueba practica lippia mobile | 27  | August | 2020 |


  Scenario Outline: Generar una entrada de datos, y en lugar de guardarla, cancelar el guardado
    Given Clockify app is displayed
    When The user logs in the application clockify with: <email>, <password>
    And The user click in login button
    And Clockify home page is displayed
    And The user set to manual add entry
    And The user set calendar with day: <day>, month: <month>, year: <year>
    And The user set start time with <hoursStart> hours, <minutesStart> minutes
    And The user set end time with <hoursEnd> hours, <minutesEnd> minutes
    Then The user click in discard


    Examples:
      | email               | password   | hoursStart | minutesStart | hoursEnd | minutesEnd | day | month  | year |
      | nicojnr11@gmail.com | Academy123 | 13         | 00           | 15       | 00         | 27  | August | 2020 |


  Scenario Outline: Entrar a configuraciones y cambiar una de las configuraciones (Modo oscuro, notificaciones)
    Given Clockify app is displayed
    When The user logs in the application clockify with: <email>, <password>
    And The user click in login button
    And Clockify home page is displayed
    And The user go setting page
    And The user click in dark mode
    And The user click in show notification
    Then The user back to home page


    Examples:
      | email               | password   |
      | nicojnr11@gmail.com | Academy123 |


  Scenario Outline: Realizar un log out
    Given Clockify app is displayed
    When The user logs in the application clockify with: <email>, <password>
    And The user click in login button
    And Clockify home page is displayed
    Then The user release logout in app


    Examples:
      | email               | password   |
      | nicojnr11@gmail.com | Academy123 |