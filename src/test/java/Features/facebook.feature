Feature: Post feature of facebook
  This will test the functionality at the user wall

  Background: This for commmon steps
    Given user should be logged in and should be present at its own wall

  Scenario: Post a message on user wall
    When I type the message as "My Post" in the text box
    And Click on the post button
    Then Message should get posted


  Scenario: Post a video on user wall
    When User supply the youtube link as "https://www.google.co.uk" in the text box
    And Click on the post button
    Then Video should be posted on the user wall
    And The video should have proper thumbnail



