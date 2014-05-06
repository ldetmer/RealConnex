Meta:
@storyType BQS

Narrative:
As a user
I Verify users of "Deal Sponsor" sub-role are retrieved when
"Developer/Deal Sponsor>>Deal Sponsor" search is performed.

Scenario: TC 134222: Verify deal sponsors are displayed when search is performed
When I update TestCaseId 134222
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
And I should see 'Deal sponsor' user name
When I click on verified deal sponsor user name
And I click on 'Find Now' button
Then I verify 'Deal Sponsor' company name is displayed
When I click on company name of deal sponsor
And I click on 'Find Now' button
And I enter location in location search option
And I select location in the drop down
Then I should see 'Deal sponsor' user name
When I clear Location
And I click on 'Project' field
And I click on 'Strategy' drop down field
And I select buy land option in a strategy field of drop down list
Then I should see 'Deal sponsor' user name
And I verify 'Deal Sponsor' company name is displayed
When I click on 'Strategy' drop down field
And I clear strategy field of project drop down
And I logout from RealConnex application















