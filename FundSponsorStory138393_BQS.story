Meta:
@storyType BQS

Narrative:
As a user
I Verify deal sponsor user selected "Fund Sponsor" are retrieved when
"Deal Sponsor>>Fund Sponsor" search is performed.

Scenario: TC 138393: Verify fund sponsor are displayed when search is performed
When I update TestCaseId 138393
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
And I click on asset experience
And I click on 'Asset Strategy' drop down field
And I portfolio acquisitions option in strategy type
Then I verify fund sponsor user is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy drop down field under project field
And I logout from RealConnex application