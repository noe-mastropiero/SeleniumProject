Feature: Dashboard page

  Background:
    Given I launch Chrome browser
    And I open the page "https://admin-demo.nopcommerce.com/login"
    And I type my user as "admin@yourstore.com" and password as "admin"
    Then I click LOGIN button


  Scenario: Validate critical elements in dashboard page are displayed

