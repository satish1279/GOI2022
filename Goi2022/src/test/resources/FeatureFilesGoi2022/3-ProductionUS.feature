@USProduction
Feature: To test all the pages on Goi Production-US environment

  Scenario: To test all the pages on Goi Production-US environment
    Given User is on Login page wrt US_Production
    When User is logged in after entering the correct credentials wrt US_Production
    And Clicks on Recognize link wrt US_Production
    #When Clicks on Skill Insight link wrt US_Production
    And Clicks on Wellness link wrt US_Production
    When Clicks on Survey link wrt US_Production
    And Clicks on My Summary link wrt US_Production
    When Clicks on Redeem link wrt US_Production
    And Clicks on Dashboard link wrt US_Production
    When Clicks on Reports tab wrt US_Production
    And Clicks on Budget Head Report option from Select Report dropdown wrt US_Production
    When Clicks on Recognitions Report option from Select Report dropdown wrt US_Production
    And Clicks on Redemption Report option from Select Report dropdown wrt US_Production
    When Clicks on User Login Report option from Select Report dropdown wrt US_Production
    And Clicks on Data Visualization tab wrt US_Production
    When Clicks on Admin Console link wrt US_Production
    And Clicks on LogOut link wrt US_Production
    Then User is navigated to login page wrt US_Production
