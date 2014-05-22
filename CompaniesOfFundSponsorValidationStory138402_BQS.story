Meta:
@storyType BQS

Narrative:
As a user
I verify companies other than "Fund Sponsor" sub role are
not retrieved when "Developer/Deal Sponsor>>Fund Sponsor" search is performed.

Scenario: TC 138402: Verify companies other than fund sponsor are not displayed when search is performed
When I update TestCaseId 138402
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
And I click on 'Route to Sponsor' drop down field
And I select intermediary option in route to developer field
Then I verify company name of fund sponsor is displayed
And I verify company of fund sponsor selected 'Direct Only' is not displayed
And I verify company of fund sponsor selected 'Brokers' is not displayed
When I click on 'Route to Sponsor' drop down field
And I select brokers and intermediary in route to sponsor method
Then I verify company of fund sponsor selected 'Brokers' is displayed
And I verify company name of fund sponsor is displayed
And I verify company of fund sponsor selected 'Direct Only' is not displayed
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor option in fund sponsor search
When I click on 'Route to Sponsor' drop down field
And I select a route to developer in drop down list
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I click on intermediary option in route to developer
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I click on brokers option in route to developer
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I click on placement agents option in route to developer
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down of search
And I click on asset experience
And I click on asset type field of deal sponsor search
And I select health care option in asset type drop down
Then I verify company name of fund sponsor is displayed
And I verify company of fund sponsor selected 'Hotel' is not displayed
And I verify company of fund sponsor selected 'Multi family' is not displayed
When I click on asset type field of deal sponsor search
And I select health care and hotel option in fund sponsor search
Then I verify company name of fund sponsor is displayed
And I verify company of fund sponsor selected 'Hotel' is displayed
And I verify company of fund sponsor selected 'Multi family' is not displayed
When I click on asset type field of deal sponsor search
And I clear health care and hotel option in fund sponsor search
And I click on asset type field of deal sponsor search
And I select a asset type office in drop down list
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on multifamily option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on hotel option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on sports option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on health care option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on storage option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on other option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on retail option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on industrial option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on residential option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on single option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on retirement option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on student option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on other housing option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on residential multi family option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I clear residential of asset field
And I click on asset type field of deal sponsor search
And I click on mixed use option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on commercial option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on solar option in asset type
Then I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I clear asset option in asset type
And I click on 'RiskProfile' drop down field
And I select value add option in risk profile field
Then I verify company name of fund sponsor is displayed
And I verify company of fund sponsor selected 'Core Plus' is not displayed
And I verify company of fund sponsor selected 'Core' is not displayed
When I click on 'RiskProfile' drop down field
And I select value add and core plus in risk profile
Then I verify company name of fund sponsor is displayed
And I verify company of fund sponsor selected 'Core Plus' is displayed
And I verify company of fund sponsor selected 'Core' is not displayed
When I click on 'RiskProfile' drop down field
And I clear value add and core plus options
And I click on 'RiskProfile' drop down field
And I select a risk profile in drop down list
Then I verify fund sponsor company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on core plus risk profile type
Then I verify fund sponsor company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on value add risk profile type
Then I verify fund sponsor company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on development risk profile type
Then I verify fund sponsor company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on opportunistic risk profile type
Then I verify fund sponsor company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on other risk profile risk profile type
Then I verify fund sponsor company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile
And I click on 'Asset Strategy' drop down field
And I click on portfolio acquisitions option in strategy field
Then I verify company name of fund sponsor is displayed
And I verify company of fund sponsor selected 'Operating Companies' is not displayed
And I verify company of fund sponsor selected 'Platform Builds' is not displayed
When I click on 'Asset Strategy' drop down field
And I select portfolio acquisitions and operating companies strategy in drop down
Then I verify company name of fund sponsor is displayed
And I verify company of fund sponsor selected 'Operating Companies' is displayed
And I verify company of fund sponsor selected 'Platform Builds' is not displayed
When I click on 'Asset Strategy' drop down field
And I clear portfolio acquisition and operating companies options
When I click on 'Asset Strategy' drop down field
And I click on buy land strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on buy land strategy
When I click on 'Asset Strategy' drop down field
And I click on development strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on build strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on spec strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on development develop strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on forward strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on build and sell strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I clear development field in strategy drop down field
When I click on 'Asset Strategy' drop down field
And I click on corporate strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on land banking strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I clear corporate in strategy drop down field
When I click on 'Asset Strategy' drop down field
And I click on operating strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on portfolio strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on recapitalization strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on sales strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on asset strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on stabilized strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on repositioning strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on redevelopment strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on reo strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on flip strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on buy strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on asset other strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on asset option
And I click on lease strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I clear asset acquisitions in strategy field
When I click on 'Asset Strategy' drop down field
And I click on land strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on develop strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on land other strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on speculation strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on land develop strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on land flip strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I clear land field in strategy drop down
When I click on 'Asset Strategy' drop down field
And I click on notes strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on platform build strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on public strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on rezones strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on others strategy
Then I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy field of deal sponsor
When I logout from RealConnex application
















