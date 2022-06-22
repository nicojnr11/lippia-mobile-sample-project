Feature: Practica Lippia Mobile

  Background:
    Given Clockify app is displayed
    When The user logs in the application clockify with: nicojnr11@gmail.com, Academy123
    Then The user click in login button
    And Clockify home page is displayed

  @AddTimeEntry
  Scenario Outline: Entrada de datos exitoso (horas y minutos)
    Given The user set to manual add entry
    When The user set start time with <hoursStart> hours, <minutesStart> minutes
    And The user set end time with <hoursEnd> hours, <minutesEnd> minutes
    And The user click in save button
    And The user set <description> in working description
    Then The user click in save button

    Examples:
      | hoursStart | minutesStart | hoursEnd | minutesEnd | description                   | any       |
      | 09         | 00           | 17       | 00         | Prueba practica lippia mobile | Add entry |

  @AddTimeEntry
  Scenario Outline: Entrada de datos exitoso (horas, minutos y fecha)
    Given The user set to manual add entry
    When The user set calendar with day: <day>, month: <month>, year: <year>
    And The user set start time with <hoursStart> hours, <minutesStart> minutes
    And The user set end time with <hoursEnd> hours, <minutesEnd> minutes
    And The user click in save button
    And The user set <description> in working description
    Then The user click in save button

    Examples:
      | hoursStart | minutesStart | hoursEnd | minutesEnd | description                   | day | month  | year |
      | 09         | 00           | 17       | 00         | Prueba practica lippia mobile | 27  | August | 2020 |

  @AddTimeEntry
  Scenario Outline: Generar una entrada de datos, y en lugar de guardarla, cancelar el guardado
    Given The user set to manual add entry
    When The user set calendar with day: <day>, month: <month>, year: <year>
    And The user set start time with <hoursStart> hours, <minutesStart> minutes
    And The user set end time with <hoursEnd> hours, <minutesEnd> minutes
    Then The user click in discard

    Examples:
      | hoursStart | minutesStart | hoursEnd | minutesEnd | day | month  | year |
      | 13         | 00           | 15       | 00         | 27  | August | 2020 |