Meta:
@storyType BQS

Narrative:
As a deal sponsor user
I Verify that users "Deal Sponsor", "Developer" and "Fund Sponsor"
sub roles are retrieved when "Developer, Deal Sponsor >> Deal Sponsor, Developer, Fund Sponsor" search is performed.

Scenario: TC 138395: Verify deal sponsor,developer and fund sponsor are displayed when search is performed
When I update TestCaseId 138395
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
And I verify the 'Developer' name is displayed
When I click on verified developer name
And I click on 'Find Now' button
Then I verify 'Developer' company name is displayed
When I click on Developer company name
And I click on 'Find Now' button
Then I should see 'Deal sponsor' user name
When I click on verified deal sponsor user name
And I click on 'Find Now' button
Then I verify 'Deal Sponsor' company name is displayed
When I click on company name of deal sponsor
And I click on 'Find Now' button
Then I verify 'Fund Sponsor' user is displayed
When I click on the verified fund sponsor name
And I click on 'Find Now' button
Then I verify 'Fund Sponsor' company name is displayed
When I click on Fund Sponsor company name
And I click on 'Find Now' button
And I click on asset experience
And I click on 'Asset Strategy' drop down field
And I select buy land option in a strategy field of drop down list
Then I should see 'Deal sponsor' user name in search results
When I click on 'Asset Strategy' drop down field
And I clear strategy field of project drop down
And I click on 'Asset Strategy' drop down field
And I select sale and leaseback option in strategy drop down list
Then I verify the developer name is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy of project drop down
And I click on 'Asset Strategy' drop down field
And I portfolio acquisitions option in strategy type
Then I verify fund sponsor user is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy drop down field under project field
And I logout from RealConnex application


