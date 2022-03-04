Feature: Free CRM Login Feature

Scenario: Free CRM Login Test Scenario

  Given user is already on login page
  When title of login page is CRMPRO
  Then user enters username
  And user enters password
  Then user clicks on Login button
  And user is on home page
