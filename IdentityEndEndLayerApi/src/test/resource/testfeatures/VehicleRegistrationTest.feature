@wip

Feature:  Get vehicle information from DVLA

  Scenario Outline: Search dvla car register

    Given I go on "https://www.gov.uk/get-vehicle-information-from-dvla" home page
    When I click on the startnow button
    Then I should see "Enter the registration number of the vehicle" as page tittle
    And I enter "<vehicleReg>" Car registration details
    And I click on the continue button
    Then I should see "<vehicleReg>" "<vehicleMake>" and"<vehicleColor>" for vehicle searched
    And I select yes check box to continue
    Then I should see vehicle details and tax rates page
    Examples:
      | vehicleReg | vehicleMake   | vehicleColor  |
      | KY65KCZ    | Mercedes      | Black         |
      | BV160DX    | Jaguar F-Pace | Polaris White |
      | ML02 SUH   | Mercedes      | ORANGE        |