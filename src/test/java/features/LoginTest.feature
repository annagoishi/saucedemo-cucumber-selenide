Feature: Login

  @success_login
  Scenario: Success login with valid data
    Given I open Saucedemo Login page
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory

  @invalid_password
  Scenario: Login with invalid password
    Given I open Saucedemo Login page
    When I input "standard_user" to username field
    And input "secret" to password field
    When I push the Login button
    Then I see the "Epic sadface: Username and password do not match any user in this service" error message

  @locked_out_user
  Scenario: Locked out user
    Given I open Saucedemo Login page
    When I input "locked_out_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I see the "Epic sadface: Sorry, this user has been locked out." error message

  @invalid_username
  Scenario: Invalid user
    Given I open Saucedemo Login page
    When I input "standard_userr" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I see the "Username and password do not match any user in this service" error message

  @empty_username
  Scenario: Username is empty
    Given I open Saucedemo Login page
    And input "secret_sauce" to password field
    When I push the Login button
    Then I see the "Username is required" error message

  @empty_password
  Scenario: Password is empty
    Given I open Saucedemo Login page
    When I input "standard_userr" to username field
    When I push the Login button
    Then I see the "Password is required" error message

  @empty_creds
  Scenario: Creds are empty
    Given I open Saucedemo Login page
    When I push the Login button
    Then I see the "Username is required" error message


