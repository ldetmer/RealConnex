Meta:
@storyType BQS

Narrative:
As a user
I verify companies other than "Deal Sponsor","Developer","Fund Sponsor"
sub role are not retrieved when deal sponsor search is performed.

Scenario: TC 138404: Verify companies other than Deal Sponsor,Developer,Fund Sponsor are not displayed when search is performed
When I update TestCaseId 138404
When I update TestCaseName Perform: "Developer, Deal Sponsor >> Deal Sponsor, Developer, Fund Sponsor" search Verify that companies other than "Deal Sponsor", "Developer" and "Fund Sponsor" sub roles are not retrieved.
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I select 'Developer','DealSponsor','FundSponsor' check box
And I click on 'GO' button
Then I should see 'Developers, Deal Sponsors' as find in search option
And I should see 'Developer, Deal Sponsor, Fund Sponsor' as sub role in search option
And I should see 'Sterling' company name of deal sponsor
When I click on company name of deal sponsor
And I return back to the searched page
Then I verify the 'Developer' name is displayed
When I click on verified developer name
And I return back to the searched page
Then I verify 'Fund Sponsor' company name is displayed
When I click on Fund Sponsor company name
And I return back to the searched page
And I set value for average deal size field
Then I verify 'Camp Co' company name is displayed in search
And I verify 'Sterling' company name is not displayed in deal sponsors developers search
And I verify 'Steele' company name is not displayed in developers search
And I verify 'Prestige' company name is not displayed in fund sponsor search
When I clear value for average deal size field
And I set value for year in business field
Then I verify 'Camp Co' company name is displayed in search
And I verify 'Sterling' company name is not displayed in deal sponsors developers search
And I verify 'Steele' company name is not displayed in developers search
And I verify 'Prestige' company name is not displayed in fund sponsor search
When I clear value for year in business field
And I set value for number of professionals field
Then I verify 'Camp Co' company name is displayed in search
And I verify 'Sterling' company name is not displayed in deal sponsors developers search
And I verify 'Steele' company name is not displayed in developers search
And I verify 'Prestige' company name is not displayed in fund sponsor search
When I clear value for number of professionals field
And I set value for project completed field
Then I verify 'Camp Co' company name is displayed in search
And I verify 'Sterling' company name is not displayed in deal sponsors developers search
And I verify 'Steele' company name is not displayed in developers search
And I verify 'Prestige' company name is not displayed in fund sponsor search
When I clear value for project completed field
And I set value for sq ft developed field
Then I verify 'Camp Co' company name is displayed in search
And I verify 'Sterling' company name is not displayed in deal sponsors developers search
And I verify 'Steele' company name is not displayed in developers search
And I verify 'Prestige' company name is not displayed in fund sponsor search
When I clear value for sq ft developed field
And I set value of deals completed field
Then I verify 'Camp Co' company name is displayed in search
And I verify 'Sterling' company name is not displayed in deal sponsors developers search
And I verify 'Steele' company name is not displayed in developers search
And I verify 'Prestige' company name is not displayed in fund sponsor search
When I clear value of deals completed field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I select 'Developer','DealSponsor','FundSponsor' check box
And I click on 'GO' button
And I click on 'Route to Sponsor' drop down field
And I select direct only option in route to sponsor drop down list
Then I verify deal sponsor company selected 'Direct Only' option is displayed
And I verify deal sponsor company selected 'Intermediary' option is not displayed
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down
And I click on 'Route to Sponsor' drop down field
And I select placement agents in route to sponsor drop down
Then I verify developer company selected 'Placement Agents' option is displayed
And I verify developer company selected 'Brokers' option is not displayed
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down of search
And I click on 'Route to Sponsor' drop down field
And I select intermediary option in route to sponsor field
Then I verify company of fund sponsor selected 'intermediary' is displayed
And I verify company of fund sponsor selected 'Direct Only' is not displayed
When I click on 'Route to Sponsor' drop down field
And I clear intermediary option in route to sponsor field
And I click on asset experience
And I click on asset type field of deal sponsor search
And I select office in the asset type drop down list
Then I verify deal sponsor company selected 'Office' option is displayed
And I verify deal sponsor company selected 'Hotel' option is not displayed
When I click on asset type field of deal sponsor search
And I clear asset type drop down
And I click on asset type field of deal sponsor search
And I select solar option in the asset drop down list
Then I verify developer company selected 'Solar' option is displayed
And I verify developer company selected 'Hotel' option is not displayed
When I click on asset type field of deal sponsor search
And I clear asset option in asset type field
And I click on asset type field of deal sponsor search
And I select health care option in asset type drop down
Then I verify company of fund sponsor selected 'HealthCare' is displayed
And I verify company of fund sponsor selected 'Hotel' is not displayed
When I click on asset type field of deal sponsor search
And I clear health care option in project type drop down
And I click on 'RiskProfile' drop down field
And I select a risk profile in drop down list
Then I verify deal sponsor company selected 'Core' option is displayed
And I verify deal sponsor company selected 'Core Plus' option is not displayed
When I click on 'RiskProfile' drop down field
And I clear core in risk profile drop down
And I click on 'RiskProfile' drop down field
And I select opportunistic option in risk profile
Then I verify developer company selected 'Opportunistic' option is displayed
And I verify developer company selected 'Core Plus' option is not displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile field of developer search
And I click on 'RiskProfile' drop down field
And I select value add option in risk profile field
Then I verify company of fund sponsor selected 'ValueAdd' is displayed
And I verify company of fund sponsor selected 'Core Plus' is not displayed
When I click on 'RiskProfile' drop down field
And I clear value add option in risk profile field
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify deal sponsor company selected 'DealSponsor Acquisition' option is displayed
And I verify deal sponsor company selected 'Lease-Up' option is not displayed
When I click on 'Asset Strategy' drop down field
And I clear acquisition option in a strategy field of drop down list
And I click on 'Asset Strategy' drop down field
And I select sales and leaseback option in strategy drop down
Then I verify developer company selected 'Sales And Leaseback' option is displayed
And I verify developer company selected 'Lease-Up' option is not displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy drop down of developer
And I click on 'Asset Strategy' drop down field
And I click on land bank option in strategy type
Then I verify company of fund sponsor selected 'Land Bank' is displayed
And I verify company of fund sponsor selected 'Lease-Up' is not displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy drop down field of fund sponsor
And I click on Syndicate check box
Then I verify 'Sterling' company name is displayed in deal sponsors developers search
And I verify 'Steele' company name is displayed in developers search
And I verify 'Prestige' company name is displayed in fund sponsor search
And I verify 'Camp Co' company name is not displayed in search
When I un check Syndicate check box
And I select co-invests with partners field
Then I verify 'Sterling' company name is displayed in deal sponsors developers search
And I verify 'Steele' company name is displayed in developers search
And I verify 'Prestige' company name is displayed in fund sponsor search
And I verify 'Camp Co' company name is not displayed in search
When I clear co invests with partners field
And I logout from RealConnex application
