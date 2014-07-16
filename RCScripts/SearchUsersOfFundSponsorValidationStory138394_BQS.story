Meta:
@storyType BQS

Narrative:
As a user
I Verify other than "Fund Sponsor" sub role are not retrieved when
"Deal Sponsor>>Fund Sponsor" search is performed.

Scenario: TC 138394: Verify other than fund sponsor are displayed when search is performed
When I update TestCaseId 138394
When I update TestCaseName Search Users Of Fund Sponsor Validation
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I select 'Fund Sponsor' link
And I click on 'GO' button
Then I verify the sub role type
And I verify 'Fund Sponsor' user is displayed
When I click on the verified fund sponsor name
And I return back to the searched page
And I click on asset experience
And I click on 'Asset Strategy' drop down field
And I click on land bank option in strategy type
Then I verify user selected 'Land Bank' option is displayed
And I verify user selected 'Lease-Up' option is not displayed
When I click on 'Asset Strategy' drop down field
And I select land bank and lease up option in strategy drop down
Then I verify user selected 'Land Bank' option is displayed
And I verify user selected 'Lease-Up' option is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy drop down field
And I logout from RealConnex application

