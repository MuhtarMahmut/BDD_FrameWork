@amazon
Feature: Amazon

  # runs before each scenarios only within this feature file
  Background: go to website
    When user goes to 'https://www.amazon.com' website

# 5 scenarios are needed

  Scenario: search Apple product
    And Enters "MacBook" in the search box
    Then MacBook will be displayed

  Scenario:


# 1.13
