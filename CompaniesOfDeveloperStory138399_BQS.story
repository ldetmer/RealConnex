Meta:
@storyType BQS

Narrative:
As a user
I verify companies of "Developer" sub role are
retrieved when "Developer/Deal Sponsor>>Developer" search is performed.

Scenario: TC 138399: Verify companies of developer sub role are displayed when search is performed
When I update TestCaseId 138399
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Developer' link
And I click on 'GO' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Developer'
And I verify the 'Developer' name is displayed
When I click on verified developer name
And I click on 'Find Now' button
Then I verify 'Developer' company name is displayed
When I click on Developer company name
And I click on 'Find Now' button
And I click on 'Route to Sponsor' drop down field
And I select placement agents in route to developer drop down
Then I verify company name of developer
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down of search
When I click on asset experience
And I click on asset type field of deal sponsor search
And I select solar option in the asset drop down list
Then I verify company name of developer
When I click on asset type field of deal sponsor search
And I clear asset option in asset type field
And I click on 'RiskProfile' drop down field
And I select opportunistic option in risk profile
Then I verify company name of developer
When I click on 'RiskProfile' drop down field
And I clear risk profile field of developer search
And I click on 'Asset Strategy' drop down field
And I select sales and leaseback option in strategy drop down
Then I verify company name of developer
When I click on 'Asset Strategy' drop down field
And I clear strategy drop down of developer
And I click on Syndicate check box
Then I verify company name of developer
When I un check Syndicate check box
And I logout from RealConnex application