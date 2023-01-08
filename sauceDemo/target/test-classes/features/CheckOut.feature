@CheckOut
Feature: Feature check out

  Scenario: user can be check out
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    And User select "Name (Z to A)" to Filter Product
    And User pick item Sauce Labs Onesie and T-shirt Red
    And User click cart button
    And User remove item T-shirt Red on Cart Page
    And User click Check Out Button on Cart Page
    When User input "Nesa" as userName, input "Andestra" as password and "13740" as postal code
    And User click Continue Button
    And User click Finish Button