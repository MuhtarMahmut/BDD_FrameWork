@library
Feature: As a User I should be able to add new book under the books module

    Background: login
      Given user is on the login page of library
      When user enters username in the email box
      And user enters password in the password box
      Then title should change to 'Library'

    Scenario:









