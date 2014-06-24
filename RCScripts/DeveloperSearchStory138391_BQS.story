Meta:
@storyType BQS

Narrative:
As a user
I Verify users of "Developer" sub-role are retrieved when
"Developer/Deal Sponsor>>Developer" search is performed.

Scenario: TC 138391: Verify developer are displayed when search is performed
When I update TestCaseId 138391
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
When I click on verified developer name
And I return back to the searched page
Then I verify 'Developer' company name is displayed
When I click on Developer company name
And I return back to the searched page
And I click on asset experience
And I click on 'Asset Strategy' drop down field
And I select sale and leaseback option in strategy drop down list
Then I verify 'Developer' name is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy of asset drop down
And I logout from RealConnex application
