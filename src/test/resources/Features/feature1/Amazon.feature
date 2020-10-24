
Feature: Amazon Holiday Deals

# 5 scenarios are needed


  Scenario: click Top Brands
    Given user is on events page
    When user clicks 'Top Brands' option
    Then 'Upcoming Deals' will be displayed

  Scenario: click Top Brands
    Given user is on events page
    When user clicks "Upcoming Deals" option
    Then 'Deals on Top Brands' will be displayed

  Scenario: click Home & Seasonal
    Given user is on events page
    When user clicks Home & Seasonal option
    Then 'Deals on Home and Seasonal' will be displayed

  @amazon
  Scenario: click Home & Seasonal
    Given user is on events page
    When user clicks Home & Seasonal option
    Then user should see Sort by 'Featured' dropdown button

  @amazon
  Scenario: click Home & Seasonal
    Given user is on events page
    When user clicks Home & Seasonal option
    And user clicks Sort by 'Featured' dropdown button
    Then user should see "Price - Low to High" option



