Meta:
@storyType BQS

Narrative:
As a user
I verify companies other than "Fund Sponsor" sub role are
not retrieved when "Developer/Deal Sponsor>>Fund Sponsor" search is performed.

Scenario: TC 138402: Verify companies other than fund sponsor are not displayed when search is performed
When I update TestCaseId 138402
When I update TestCaseName Perform: "Developer, Deal Sponsor >> Fund Sponsor" search Verify that companies other than "Fund Sponsor" sub role are not retrieved.
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
And I return back to the searched page
Then I verify 'Fund Sponsor' company name is displayed
When I click on Fund Sponsor company name
And I return back to the searched page
And I set value for average deal size field
Then I verify 'Camp Co' company name is displayed in fund sponsor search
And I verify 'Prestige' company name is not displayed in fund sponsor search
When I clear value for average deal size field
And I set value for year in business field
Then I verify 'Camp Co' company name is displayed in fund sponsor search
And I verify 'Prestige' company name is not displayed in fund sponsor search
When I clear value for year in business field
And I set value for number of professionals field
Then I verify 'Camp Co' company name is displayed in fund sponsor search
And I verify 'Prestige' company name is not displayed in fund sponsor search
When I clear value for number of professionals field
And I set value for project completed field
Then I verify 'Camp Co' company name is displayed in fund sponsor search
And I verify 'Prestige' company name is not displayed in fund sponsor search
When I clear value for project completed field
And I set value for sq ft developed field
Then I verify 'Camp Co' company name is displayed in fund sponsor search
And I verify 'Prestige' company name is not displayed in fund sponsor search
When I clear value for sq ft developed field
And I set value of deals completed field
Then I verify 'Camp Co' company name is displayed in fund sponsor search
And I verify 'Prestige' company name is not displayed in fund sponsor search
When I clear value of deals completed field
And I click on 'Route to Sponsor' drop down field
And I select intermediary option in route to sponsor field
Then I verify company of fund sponsor selected 'intermediary' is displayed
And I verify company of fund sponsor selected 'Direct Only' is not displayed
When I click on 'Route to Sponsor' drop down field
And I clear intermediary option in route to sponsor field
And I click on asset experience
And I click on asset type field of deal sponsor search
And I select health care option in asset type drop down
Then I verify company of fund sponsor selected 'HealthCare' is displayed
And I verify company of fund sponsor selected 'Hotel' is not displayed
When I click on asset type field of deal sponsor search
And I clear health care option in project type drop down
And I click on 'RiskProfile' drop down field
And I select value add option in risk profile field
Then I verify company of fund sponsor selected 'ValueAdd' is displayed
And I verify company of fund sponsor selected 'Core Plus' is not displayed
When I click on 'RiskProfile' drop down field
And I clear value add option in risk profile field
And I click on 'Asset Strategy' drop down field
And I click on land bank option in strategy type
Then I verify company of fund sponsor selected 'Land Bank' is displayed
And I verify company of fund sponsor selected 'Lease-Up' is not displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy drop down field of fund sponsor
And I click on Syndicate check box
Then I verify 'Prestige' company name is displayed in fund sponsor search
And I verify 'Camp Co' company name is not displayed in deal sponsors developers search
When I un check Syndicate check box
And I select co-invests with partners field
Then I verify 'Prestige' company name is displayed in fund sponsor search
And I verify 'Camp Co' company name is not displayed in deal sponsors developers search
When I clear co invests with partners field
And I logout from RealConnex application
















