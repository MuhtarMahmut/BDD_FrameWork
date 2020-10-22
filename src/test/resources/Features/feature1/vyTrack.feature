@vytrack
Feature: vYTrack
#Background - test pre-condition
#will be executed before everything even scenario in this file only

  Background: LogIn
    When user enters 'username' in username box
    And enters 'password' in password box
    Then user can log in


  Scenario:
    When user click on Fleet module
    And click on Vehicle Odometer
    Then user should be able to go to Vehicle Odometer page

  Scenario:
    Given user is on Vehicles Odometers module
    Then Vehicles Odometers text should be on displayed

  Scenario:
    Given user is on Vehicles Odometers module
    When user clicks on Create Vehicle Odometer link
    Then user should able to Create Vehicle Odometer

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
    When user selects None option in the small dropdown button
    Then all the checkboxes should be de-selected

  Scenario:
    Given user is on Vehicles Odometers module
    And user is on Page1
    When user right click page arrow option
    Then user should be able to go to the next page

  Scenario:
    Given user is on Vehicles Odometers module
    And user is on Page2
    When user left click page arrow option
    Then user should be able to go back to the previous page

   Scenario:
    Given user is on Vehicles Odometers module
    When user clicks on the page input box
    Then user should be able to insert page numbers