@ignore
Feature: As a Shoop customer I should be able to Login


  Scenario Outline: As shoop customer I should be able to Search for Merchants
   Given I go to shoop home page"
    When I enter merchant name as "<MerchantName>"into search
    Then I should see name of "<MerchantName>" and own  best rates displayed

   Examples:
   | MerchantName       |
   |My Jolie candle     |
   | 1-2-3              |
   | Access Moto        |
   | M&MS               |


