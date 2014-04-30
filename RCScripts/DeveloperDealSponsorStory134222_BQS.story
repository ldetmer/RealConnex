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
Then I verify subrole is displayed as 'Developers, Deal Sponsors'
And I verify 'Deal Sponsor' name is displayed
When I click on retrieved Deal Sponsor name
And I click on 'Find Now' button
Then I should see desired company name of deal sponsor
When I click on Deal Sponsor company name
And I click on 'Find Now' button
And I enter location in text field
Then I verify Location field in side search
When I clear location text field
And I click on 'Project' field
And I click on 'Strategy' drop down field
And I select a strategy in drop down list
Then I verify company of 'Buy Land' is displayed
And I verify user of 'Buy Land' is displayed
And I verify company of 'Operating Companies' is not displayed
And I verify user of 'Operating Companies' is not displayed
And I verify company of 'Platform Builds' is not displayed
And I verify user of 'Platform Builds' is not displayed
And I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I select buy land and operating companies strategy in drop down
Then I verify company of 'Platform Builds' is not displayed
And I verify user of 'Platform Builds' is not displayed
And I verify company of 'Buy Land' is displayed
And I verify user of 'Buy Land' is displayed
And I verify company of 'Operating Companies' is displayed
And I verify user of 'Operating Companies' is displayed
When I click on 'Strategy' drop down field
And I clear strategy field
And I click on 'Strategy' drop down field
And I click on development strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on build strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on spec strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on development develop strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on forward strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on build and sell strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I clear development field in strategy drop down field
And I click on 'Strategy' drop down field
And I click on corporate strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on land banking strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I clear corporate in strategy drop down field
And I click on 'Strategy' drop down field
And I click on operating strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on portfolio strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on recapitalization strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on sales strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on asset strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on stabilized strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on repositioning strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on redevelopment strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on reo strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on flip strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on buy strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on asset other strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on lease strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I clear asset acquisitions in strategy field
And I click on 'Strategy' drop down field
And I click on land strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on develop strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on land other strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on speculation strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on land develop strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on land flip strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I clear land field in strategy drop down
And I click on 'Strategy' drop down field
And I click on notes strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on platform build strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on public strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on rezones strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on others strategy
Then I verify user of all option is displayed
And I verify company name of all search option is displayed
When I click on 'Strategy' drop down field
And I clear strategy field of deal sponsor
And I logout from RealConnex application










