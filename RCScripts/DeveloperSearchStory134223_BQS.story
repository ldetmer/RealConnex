Meta:
@storyType BQS

Narrative:
As a user
I Verify users of "Deal Sponsor" sub-role are retrieved when
"Developer/Deal Sponsor>>Developer" search is performed.

Scenario: TC 134223: Verify developer are displayed when search is performed
When I update TestCaseId 134223
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
And I click on verified developer name
And I click on 'Find Now' button
Then I verify 'Developer' company name is displayed
When I click on Developer company name
And I click on 'Find Now' button
And I click on 'Project' field
And I click on 'Strategy' drop down field
And I select sale and leaseback option in strategy drop down list
Then I verify the 'Developer' name is displayed
When I click on 'Strategy' drop down field
And I clear strategy of project drop down
And I logout from RealConnex application
