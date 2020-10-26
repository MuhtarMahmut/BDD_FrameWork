Feature: As a User I should be able to add new book under the books module


  @library
  Scenario: login
    Given user is on login page
    When user enters "username" in email adress inputBox
    And enters 'password' in password input box
    Then user can log in

  @library
  Scenario: Click Book module
  Given log in as a Test Librarian
  When I am under the books module
  Then Add Book header should be displayed.







