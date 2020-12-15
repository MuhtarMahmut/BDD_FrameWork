@Zohra
Feature: Search On google

  Background: Environment is ready
    Given user is already on google website

  Scenario: Search Zohra and Patigul
    When user enters 'Zohra' and 'Patigul' in search box
    Then Title of google will change


    # When, And, Then, But, *