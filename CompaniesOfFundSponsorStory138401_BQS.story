Meta:
@storyType BQS

Narrative:
As a user
I verify companies of deal sponsor user who have selected "Fund Sponsor" are
retrieved when "Developer/Deal Sponsor>>Fund Sponsor" search is performed.

Scenario: TC 138401: Verify companies of fund sponsor are displayed when search is performed
When I update TestCaseId 138401
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I select 'Fund Sponsor' link
And I click on 'GO' button
Then I verify the sub role type
And I verify 'Fund Sponsor' user is displayed
When I click on the verified fund sponsor name
And I click on 'Find Now' button
Then I verify 'Fund Sponsor' company name is displayed
When I click on Fund Sponsor company name
And I click on 'Find Now' button
And I click on 'Route to Sponsor' drop down field
And I select intermediary option in route to developer field
Then I verify company name of fund sponsor is displayed
When I click on 'Route to Sponsor' drop down field
And I clear intermediary option in route to developer field
And I click on asset experience
And I click on asset type field of deal sponsor search
And I select health care option in asset type drop down
Then I verify company name of fund sponsor is displayed
When I click on asset type field of deal sponsor search
And I clear health care option in project type drop down
And I click on 'RiskProfile' drop down field
And I select value add option in risk profile field
Then I verify company name of fund sponsor is displayed
When I click on 'RiskProfile' drop down field
And I clear value add option in risk profile field
And I click on 'Asset Strategy' drop down field
And I click on portfolio acquisitions option in strategy field
Then I verify company name of fund sponsor is displayed
When I click on 'Asset Strategy' drop down field
And I clear portfolio acquisitions option in strategy field
And I click on Syndicate check box
Then I verify company name of fund sponsor is displayed
When I un check Syndicate check box
When I logout from RealConnex application






