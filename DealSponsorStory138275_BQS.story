Meta:
@storyType BQS

Narrative:
As a user
I Verify users of "Deal Sponsor" sub-role are retrieved when
"Developer/Deal Sponsor>>Deal Sponsor" search is performed.

Scenario: TC 138275: Verify deal sponsors are displayed when search is performed
When I update TestCaseId 138275
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
Then I should see 'Deal sponsor' user name
When I click on verified deal sponsor user name
And I click on 'Find Now' button
Then I verify 'Deal Sponsor' company name is displayed
When I click on company name of deal sponsor
And I click on 'Find Now' button
And I click on asset experience
And I click on 'Asset Strategy' drop down field
And I select buy land option in a strategy field of drop down list
Then I should see 'Deal sponsor' user name
When I click on 'Asset Strategy' drop down field
And I clear strategy field of project drop down
And I logout from RealConnex application















