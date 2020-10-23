@vytrack
Feature: user should be able to go to Vehicle Odometer page
#Background - test pre-condition
#will be executed before everything even scenario in this file only

  Background: LogIn
    When user enters 'username' in username box
    And enters 'password' in password box
    Then user can log in

  Scenario:
    Given user is on Vehicles Odometers module
    Then Vehicles Odometers text should be on displayed

  Scenario:
    Given user is on Vehicles Odometers module
    When user clicks on Export Grid dropdown
    Then user should able to select CSV option

  Scenario:
    Given user is on Vehicles Odometers module
    When user clicks on Export Grid dropdown
    Then  user should able to select XLSX option

  Scenario:
    Given user is on Vehicles Odometers module
    When user selects All option in the small dropdown button
    Then all the checkboxes should be selected

  Scenario:
    Given user is on Vehicles Odometers module
    And user is on Page one
    When user right click page arrow option
    Then user should be able to go to the next page






