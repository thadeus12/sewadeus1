@wip
Feature: A User search for products from a drop down

  Scenario Outline: A user successfully searches for products from a category drop down
    Given I go to "https://www.etsy.com/uk/" home page
    When I hover the "<categorytab>" tab
    And I select "<productcat>" from the dropdown list
    Then I should be on the accesories page

    Examples:

      | categorytab            | productcat  |
      | Clothing & Accessories | Accessories |
