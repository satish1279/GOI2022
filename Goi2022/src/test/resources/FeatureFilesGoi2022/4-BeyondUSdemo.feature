@USdemo
Feature: To test all the pages on Beyond USdemo environment

  Scenario: To test all the pages on Beyond USdemo environment
    Given User is on Login page wrt USdemo
    When User is logged in after entering the correct credentials wrt USdemo
    And Clicks on Recognize link wrt USdemo
    And Clicks on Wellness link wrt USdemo
    When Clicks on Survey link wrt USdemo
    And Clicks on My Summary link wrt USdemo
    When Clicks on Redeem link wrt USdemo
    And Clicks on Dashboard link wrt USdemo
    When Clicks on Reports tab wrt USdemo
    And Clicks on Budget Head Report option from Select Report dropdown wrt USdemo
    When Clicks on Recognitions Report option from Select Report dropdown wrt USdemo
    And Clicks on Redemption Report option from Select Report dropdown wrt USdemo
    When Clicks on User Login Report option from Select Report dropdown wrt USdemo
    And Clicks on Data Visualization tab wrt USdemo
    #When Clicks on Admin Console link wrt USdemo
    And Clicks on LogOut link wrt USdemo
    Then User is navigated to login page wrt USdemo
