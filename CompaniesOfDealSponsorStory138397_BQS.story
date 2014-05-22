Meta:
@storyType BQS

Narrative:
As a user
I verify companies of deal sponsor user who have selected "Deal Sponsor" are
retrieved when "Developer/Deal Sponsor>>Deal Sponsor" search is performed.

Scenario:TC 138397: Verify companies of deal sponsor are displayed when search is performed
When I update TestCaseId 138397
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Deal Sponsor' link
And I click on 'GO' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Deal Sponsors'
And I verify 'Deal Sponsor' company name is displayed
When I click on company name of deal sponsor
And I click on 'Find Now' button
And I click on 'Route to Sponsor' drop down field
And I select direct only option in route to sponsor drop down list
Then I verify Deal Sponsor company name is displayed
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down
And I click on asset experience
And I click on asset type field of deal sponsor search
And I select office in the asset type drop down list
Then I verify Deal Sponsor company name is displayed
When I click on asset type field of deal sponsor search
And I clear asset type drop down
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify Deal Sponsor company name is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile field in project drop down
And I click on 'Asset Strategy' drop down field
And I select buy land option in a strategy field of drop down list
Then I verify Deal Sponsor company name is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy field of project drop down
And I click on Syndicate check box
Then I verify Deal Sponsor company name is displayed
When I un check Syndicate check box
And I logout from RealConnex application





