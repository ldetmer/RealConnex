Meta:
@storyType BQS

Narrative:
As a user
I verify companies of deal sponsor user who have selected "Developer" are
retrieved when "Developer/Deal Sponsor>>Developer" search is performed.

Scenario: TC 135553: Verify developer are displayed when search is performed
When I update TestCaseId 135553
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Developer' link
And I click on 'GO' button
Then I verify sub role is displayed as 'Developers, Deal Sponsors'
And I verify the 'Developer' name is displayed
When I click on verified developer name
And I click on 'Find Now' button
Then I verify 'Developer' company name is displayed
When I click on Developer company name
And I click on 'Find Now' button
And I click on 'Project' field
And I click on 'Project Type' drop down field
And I select solar option in the project drop down list
Then I verify 'Developer' company name is displayed
When I click on 'Project Type' drop down field
And I clear project option in project type
And I click on 'Strategy' drop down field
And I select sales and leaseback option in strategy drop down
Then I verify 'Developer' company name is displayed
When I click on 'Strategy' drop down field
And I clear strategy drop down of developer
And I click on 'RiskProfile' drop down field
And I select opportunistic option in risk profile
Then I verify 'Developer' company name is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile field of developer search
And I click on 'Investor and Sponsor' drop down field
And I click on 'Investment Method' drop down field
And I select family office option in investment method drop down
Then I verify 'Developer' company name is displayed
When I clear investment method field
And I click on 'Route to Developer' drop down field
And I select placement agents in route to developer drop down
Then I verify 'Developer' company name is displayed
When I clear route to developer drop down
And I logout from RealConnex application