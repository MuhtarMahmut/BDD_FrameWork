@google
Feature: Google Search

  #test steps: Given, When, And, But, *, Then
  # cucumber annotations: @Given, @When, @Then, @Before, @After
  # in order to do parameterize, we use '' or ""

  @somke
  Scenario: Search Hazel on google
    Given Environment is ready
    When user enters 'Muhtar' in search box
    And user also enters "Mahmut" in search box
    Then Title of page changes


  Scenario: Search Cats on google
    Given Environment is ready
    When user enters 'Cat' in search box
    Then Cat will be displayed

  @smoke
  Scenario: Click Image
    Given Environment is ready
    When user clicks Image link
    Then google image will be displayed

