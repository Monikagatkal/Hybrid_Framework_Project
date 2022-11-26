Feature: Application Login

  Scenario: Login with valid Credentials
    Given Open any Browser
    And Navigate to Login page
    When User enters username as "monika123@gmail.com" and password as "7767050633" into the fields
    And User clicks on Login button
    Then Verify user is able to successfully login 
    
