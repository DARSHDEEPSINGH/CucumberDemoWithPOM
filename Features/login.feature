Feature: Login with Valid Credentials

  @sanity @regression
  Scenario: Successful Login with Valid Credentials
    Given the user navigates to login page
    When user enters email as "darshdeepsingh99@gmail.com" and password as "Darsh@123"
    And the user clicks on the Login button
    Then the user should be redirected to the MyAccount Page

  @regression
  Scenario Outline: Login Data Driven
    #Scenario outline required when you repeat steps
    Given the user navigates to login page
    When user enters email as "<email>" and password as "<password>"
    And the user clicks on the Login button
    Then the user should be redirected to the MyAccount Page

    Examples: 
      | email                      | password  |
      | darshdeepsingh99@gmail.com | Darsh@123 |
      | pavanoltraining@gmail.com  | test@123  |
