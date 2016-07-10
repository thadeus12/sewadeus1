$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loggedInSearch.feature");
formatter.feature({
  "line": 2,
  "name": "user merchant search",
  "description": "",
  "id": "user-merchant-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "search merchant",
  "description": "",
  "id": "user-merchant-search;search-merchant",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I go to shoop home page\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter merchant name as \"\u003cMerchantName\u003e\"into search",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see name of \"\u003cMerchantName\u003e\" and own  best rates displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "user-merchant-search;search-merchant;",
  "rows": [
    {
      "cells": [
        "MerchantName"
      ],
      "line": 10,
      "id": "user-merchant-search;search-merchant;;1"
    },
    {
      "cells": [
        "My Jolie candle"
      ],
      "line": 11,
      "id": "user-merchant-search;search-merchant;;2"
    },
    {
      "cells": [
        "shopty"
      ],
      "line": 12,
      "id": "user-merchant-search;search-merchant;;3"
    },
    {
      "cells": [
        "Access Moto"
      ],
      "line": 13,
      "id": "user-merchant-search;search-merchant;;4"
    },
    {
      "cells": [
        "M\u0026MS"
      ],
      "line": 14,
      "id": "user-merchant-search;search-merchant;;5"
    },
    {
      "cells": [
        "SOSwit"
      ],
      "line": 15,
      "id": "user-merchant-search;search-merchant;;6"
    },
    {
      "cells": [
        "GiFi"
      ],
      "line": 16,
      "id": "user-merchant-search;search-merchant;;7"
    },
    {
      "cells": [
        "AsdeCarreaux"
      ],
      "line": 17,
      "id": "user-merchant-search;search-merchant;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "search merchant",
  "description": "",
  "id": "user-merchant-search;search-merchant;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to shoop home page\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter merchant name as \"My Jolie candle\"into search",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see name of \"My Jolie candle\" and own  best rates displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Common_sd.i_go_to_shoop_home_page()"
});
formatter.result({
  "duration": 6365111105,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Jolie candle",
      "offset": 26
    }
  ],
  "location": "Common_sd.i_enter_merchant_name_as_into_search(String)"
});
formatter.result({
  "duration": 306073658,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Jolie candle",
      "offset": 22
    }
  ],
  "location": "Common_sd.i_should_see_name_of_and_own_best_rates_displayed(String)"
});
formatter.result({
  "duration": 3260252954,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "search merchant",
  "description": "",
  "id": "user-merchant-search;search-merchant;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to shoop home page\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter merchant name as \"shopty\"into search",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see name of \"shopty\" and own  best rates displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Common_sd.i_go_to_shoop_home_page()"
});
formatter.result({
  "duration": 2464540014,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shopty",
      "offset": 26
    }
  ],
  "location": "Common_sd.i_enter_merchant_name_as_into_search(String)"
});
formatter.result({
  "duration": 233679774,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shopty",
      "offset": 22
    }
  ],
  "location": "Common_sd.i_should_see_name_of_and_own_best_rates_displayed(String)"
});
formatter.result({
  "duration": 3244933392,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "search merchant",
  "description": "",
  "id": "user-merchant-search;search-merchant;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to shoop home page\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter merchant name as \"Access Moto\"into search",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see name of \"Access Moto\" and own  best rates displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Common_sd.i_go_to_shoop_home_page()"
});
formatter.result({
  "duration": 1926732602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Access Moto",
      "offset": 26
    }
  ],
  "location": "Common_sd.i_enter_merchant_name_as_into_search(String)"
});
formatter.result({
  "duration": 228153602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Access Moto",
      "offset": 22
    }
  ],
  "location": "Common_sd.i_should_see_name_of_and_own_best_rates_displayed(String)"
});
formatter.result({
  "duration": 3250110045,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "search merchant",
  "description": "",
  "id": "user-merchant-search;search-merchant;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to shoop home page\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter merchant name as \"M\u0026MS\"into search",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see name of \"M\u0026MS\" and own  best rates displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Common_sd.i_go_to_shoop_home_page()"
});
formatter.result({
  "duration": 1414337487,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M\u0026MS",
      "offset": 26
    }
  ],
  "location": "Common_sd.i_enter_merchant_name_as_into_search(String)"
});
formatter.result({
  "duration": 358413785,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M\u0026MS",
      "offset": 22
    }
  ],
  "location": "Common_sd.i_should_see_name_of_and_own_best_rates_displayed(String)"
});
formatter.result({
  "duration": 3199109267,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "search merchant",
  "description": "",
  "id": "user-merchant-search;search-merchant;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to shoop home page\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter merchant name as \"SOSwit\"into search",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see name of \"SOSwit\" and own  best rates displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Common_sd.i_go_to_shoop_home_page()"
});
formatter.result({
  "duration": 1297178300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SOSwit",
      "offset": 26
    }
  ],
  "location": "Common_sd.i_enter_merchant_name_as_into_search(String)"
});
formatter.result({
  "duration": 173255652,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SOSwit",
      "offset": 22
    }
  ],
  "location": "Common_sd.i_should_see_name_of_and_own_best_rates_displayed(String)"
});
formatter.result({
  "duration": 3214628962,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "search merchant",
  "description": "",
  "id": "user-merchant-search;search-merchant;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to shoop home page\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter merchant name as \"GiFi\"into search",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see name of \"GiFi\" and own  best rates displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Common_sd.i_go_to_shoop_home_page()"
});
formatter.result({
  "duration": 1266953695,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GiFi",
      "offset": 26
    }
  ],
  "location": "Common_sd.i_enter_merchant_name_as_into_search(String)"
});
formatter.result({
  "duration": 273855138,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GiFi",
      "offset": 22
    }
  ],
  "location": "Common_sd.i_should_see_name_of_and_own_best_rates_displayed(String)"
});
formatter.result({
  "duration": 3242279210,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "search merchant",
  "description": "",
  "id": "user-merchant-search;search-merchant;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to shoop home page\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter merchant name as \"AsdeCarreaux\"into search",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see name of \"AsdeCarreaux\" and own  best rates displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Common_sd.i_go_to_shoop_home_page()"
});
formatter.result({
  "duration": 1634301610,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AsdeCarreaux",
      "offset": 26
    }
  ],
  "location": "Common_sd.i_enter_merchant_name_as_into_search(String)"
});
formatter.result({
  "duration": 224938363,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AsdeCarreaux",
      "offset": 22
    }
  ],
  "location": "Common_sd.i_should_see_name_of_and_own_best_rates_displayed(String)"
});
formatter.result({
  "duration": 3280682458,
  "status": "passed"
});
});