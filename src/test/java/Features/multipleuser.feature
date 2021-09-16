Feature: User login feature

  Scenario: user login Scenario
    When user at the login page of the application
    When user logs in with following username and password
      | user1 | pass1 |
      | user2 | pass2 |
      | user3 | pass3 |
    Then user should be able to login with correct user name and password

