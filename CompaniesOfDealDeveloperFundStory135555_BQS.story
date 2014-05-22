Meta:
@storyType BQS

Narrative:
As a user
I verify companies of deal sponsor user who have selected "Deal Sponsor","Developer',"Fund Sponsor"
are retrieved when deal sponsor search is performed.

Scenario: TC 135555: Verify companies of Deal Sponsor,Developer,Fund Sponsor are displayed when search is performed
When I update TestCaseId 135555
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I select 'Developer','DealSponsor','FundSponsor' check box
And I click on 'GO' button
Then I should see 'Developers, Deal Sponsors' as find in search option
And I should see 'Developer, Deal Sponsor, Fund Sponsor' as sub role in search option
And I verify 'Deal Sponsor' company name is displayed
When I click on company name of deal sponsor
And I click on 'Find Now' button
Then I verify the 'Developer' name is displayed
When I click on verified developer name
And I click on 'Find Now' button
Then I verify 'Fund Sponsor' company name is displayed
When I click on Fund Sponsor company name
And I click on 'Find Now' button
And I click on 'Route to Sponsor' drop down field
And I select direct only option in route to sponsor drop down list
Then I verify Deal Sponsor company name is displayed
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down
And I click on 'Route to Sponsor' drop down field
And I select placement agents in route to developer drop down
Then I verify company name of developer
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down of search
And I click on 'Route to Sponsor' drop down field
And I select intermediary option in route to developer field
Then I verify company name of fund sponsor is displayed
When I click on 'Route to Sponsor' drop down field
And I clear intermediary option in route to developer field
And I click on asset experience
And I click on asset type field of deal sponsor search
And I select office in the asset type drop down list
Then I verify Deal Sponsor company name is displayed
When I click on asset type field of deal sponsor search
And I clear asset type drop down
And I click on asset type field of deal sponsor search
And I select solar option in the asset drop down list
Then I verify company name of developer
When I click on asset type field of deal sponsor search
And I clear asset option in asset type field
And I click on asset type field of deal sponsor search
And I select health care option in asset type drop down
Then I verify company name of fund sponsor is displayed
When I click on asset type field of deal sponsor search
And I clear health care option in project type drop down
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify Deal Sponsor company name is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile field in project drop down
And I click on 'RiskProfile' drop down field
And I select opportunistic option in risk profile
Then I verify company name of developer
When I click on 'RiskProfile' drop down field
And I clear risk profile field of developer search
And I click on 'RiskProfile' drop down field
And I select value add option in risk profile field
Then I verify company name of fund sponsor is displayed
When I click on 'RiskProfile' drop down field
And I clear value add option in risk profile field
And I click on 'Asset Strategy' drop down field
And I select buy land option in a strategy field of drop down list
Then I verify Deal Sponsor company name is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy field of project drop down
And I click on 'Asset Strategy' drop down field
And I select sales and leaseback option in strategy drop down
Then I verify company name of developer
When I click on 'Asset Strategy' drop down field
And I clear strategy drop down of developer
And I click on 'Asset Strategy' drop down field
And I click on portfolio acquisitions option in strategy field
Then I verify company name of fund sponsor is displayed
When I click on 'Asset Strategy' drop down field
And I clear portfolio acquisitions option in strategy field
And I click on Syndicate check box
Then I verify Deal Sponsor company name is displayed
And I verify company name of developer
And I verify company name of fund sponsor is displayed
When I un check Syndicate check box
And I logout from RealConnex application


