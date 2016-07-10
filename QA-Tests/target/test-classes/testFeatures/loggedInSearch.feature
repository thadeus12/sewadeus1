@smoke-test
Feature:  user merchant search
    Scenario Outline:  search merchant

    Given I go to shoop home page"
    When I enter merchant name as "<MerchantName>"into search
    Then I should see name of "<MerchantName>" and own  best rates displayed

    Examples:
      | MerchantName       |
      |My Jolie candle     |
      | shopty             |
      | Access Moto        |
      | M&MS               |
      |SOSwit              |
      |GiFi                |
      |AsdeCarreaux        |

