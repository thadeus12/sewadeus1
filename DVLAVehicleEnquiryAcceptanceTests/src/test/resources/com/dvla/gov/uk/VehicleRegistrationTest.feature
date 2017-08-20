@smoke-test

Feature:  Get vehicle information from DVLA

  Scenario: Search dvla car register

    Given I go on "https://www.gov.uk/get-vehicle-information-from-dvla" home page
    When I click on the startnow button
    Then I should see page tittle as "Enter the registration number of the vehicle"
    And I enter "ML02 SUH" Car registration details
    Then I should see vehicle registration details page