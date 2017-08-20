$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("VehicleRegistrationTest.feature");
formatter.feature({
  "line": 3,
  "name": "Get vehicle information from DVLA",
  "description": "",
  "id": "get-vehicle-information-from-dvla",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Search dvla car register",
  "description": "",
  "id": "get-vehicle-information-from-dvla;search-dvla-car-register",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I go on \"https://www.gov.uk/get-vehicle-information-from-dvla\" home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the startnow button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see \"Enter the registration number of the vehicle\" as page tittle",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enter \"\u003cvehicleReg\u003e\" Car registration details",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see \"\u003cvehicleReg\u003e\" \"\u003cvehicleMake\u003e\" and\"\u003cvehicleColor\u003e\" for vehicle searched",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I select yes check box to continue",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see vehicle details and tax rates page",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "get-vehicle-information-from-dvla;search-dvla-car-register;",
  "rows": [
    {
      "cells": [
        "vehicleReg",
        "vehicleMake",
        "vehicleColor"
      ],
      "line": 16,
      "id": "get-vehicle-information-from-dvla;search-dvla-car-register;;1"
    },
    {
      "cells": [
        "KY65KCZ",
        "Mercedes",
        "Black"
      ],
      "line": 17,
      "id": "get-vehicle-information-from-dvla;search-dvla-car-register;;2"
    },
    {
      "cells": [
        "BV160DX",
        "Jaguar F-Pace",
        "Polaris White"
      ],
      "line": 18,
      "id": "get-vehicle-information-from-dvla;search-dvla-car-register;;3"
    },
    {
      "cells": [
        "ML02 SUH",
        "Mercedes",
        "ORANGE"
      ],
      "line": 19,
      "id": "get-vehicle-information-from-dvla;search-dvla-car-register;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Search dvla car register",
  "description": "",
  "id": "get-vehicle-information-from-dvla;search-dvla-car-register;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I go on \"https://www.gov.uk/get-vehicle-information-from-dvla\" home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the startnow button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see \"Enter the registration number of the vehicle\" as page tittle",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enter \"KY65KCZ\" Car registration details",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see \"KY65KCZ\" \"Mercedes\" and\"Black\" for vehicle searched",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I select yes check box to continue",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see vehicle details and tax rates page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.gov.uk/get-vehicle-information-from-dvla",
      "offset": 9
    }
  ],
  "location": "VehicleRegistrationTestStefDef.i_go_on_home_page(String)"
});
formatter.result({
  "duration": 32421463114894,
  "error_message": "java.lang.NullPointerException\n\tat com.vehicleidentity.test.pages.LandingPage.navigateToLandingPage(LandingPage.java:11)\n\tat com.vehicleidentity.test.pageStepDef.VehicleRegistrationTestStefDef.i_go_on_home_page(VehicleRegistrationTestStefDef.java:18)\n\tat ✽.Given I go on \"https://www.gov.uk/get-vehicle-information-from-dvla\" home page(VehicleRegistrationTest.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "VehicleRegistrationTestStefDef.i_click_on_the_startnow_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Enter the registration number of the vehicle",
      "offset": 14
    }
  ],
  "location": "VehicleRegistrationTestStefDef.i_should_see_as_page_tittle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "KY65KCZ",
      "offset": 9
    }
  ],
  "location": "VehicleRegistrationTestStefDef.i_enter_Car_registration_details(String)"
});
formatter.result({
  "status": "skipped"
});
