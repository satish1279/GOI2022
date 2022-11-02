@Staging
Feature: To test all the pages on Goi Staging environment

  Scenario: To test all the pages on Goi Staging environment
    Given User is on Login page wrt Staging
    When User is logged in after entering the correct credentials wrt Staging
    And Clicks on Recognize link wrt Staging
    #When Clicks on Skill Insight link wrt Staging
    And Clicks on Wellness link wrt Staging
    When Clicks on Survey link wrt Staging
    And Clicks on My Summary link wrt Staging
    When Clicks on Redeem link wrt Staging
    And Clicks on Dashboard link wrt Staging
    When Clicks on Reports tab wrt Staging
    And Clicks on Budget Head Report option from Select Report dropdown wrt Staging
    When Clicks on Recognitions Report option from Select Report dropdown wrt Staging
    And Clicks on Redemption Report option from Select Report dropdown wrt Staging
    When Clicks on User Login Report option from Select Report dropdown wrt Staging
    And Clicks on Data Visualization tab wrt Staging
    #When Clicks on Admin Console link wrt Staging
    And Clicks on LogOut link wrt Staging
    Then User is navigated to login page wrt Staging
