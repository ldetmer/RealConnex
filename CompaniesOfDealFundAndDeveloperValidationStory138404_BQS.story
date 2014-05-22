Meta:
@storyType BQS

Narrative:
As a user
I verify companies other than "Deal Sponsor","Developer","Fund Sponsor"
sub role are not retrieved when deal sponsor search is performed.

Scenario: TC 138404: Verify companies other than Deal Sponsor,Developer,Fund Sponsor are not displayed when search is performed
When I update TestCaseId 138404
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I select 'Developer','DealSponsor','FundSponsor' check box
And I click on 'GO' button
Then I should see 'Developers, Deal Sponsors' as find in search option
And I should see 'Developer, Deal Sponsor, Fund Sponsor' as sub role in search option
And I verify 'Deal Sponsor' company name is displayed
When I click on company name of deal sponsor
And I click on 'Find Now' button
Then I verify the 'Developer' name is displayed
When I click on verified developer name
And I click on 'Find Now' button
Then I verify 'Fund Sponsor' company name is displayed
When I click on Fund Sponsor company name
And I click on 'Find Now' button
And I click on 'Route to Sponsor' drop down field
And I select direct only option in route to sponsor drop down list
Then I verify deal sponsor company of 'Direct Only' is displayed
And I verify deal sponsor company of 'Intermediary' is not displayed
And I verify deal sponsor company of 'Brokers' is not displayed
When I click on 'Route to Sponsor' drop down field
And I select direct only and intermediary in route to development method
Then I verify deal sponsor company of 'Direct Only' is displayed
And I verify deal sponsor company of 'Intermediary' is displayed
And I verify deal sponsor company of 'Brokers' is not displayed
When I click on 'Route to Sponsor' drop down field
And I clear route field
And I click on 'Route to Sponsor' drop down field
And I select placement agents in route to developer drop down
Then I verify developer company of 'Placement Agents' is displayed
And I verify developer company of 'Brokers' is not displayed
And I verify developer company of 'Intermediary' is not displayed
When I click on 'Route to Sponsor' drop down field
And I select placement agents and intermediary in route to sponsor field
Then I verify developer company of 'Placement Agents' is displayed
And I verify developer company of 'Intermediary' is displayed
And I verify developer company of 'Brokers' is not displayed
When I click on 'Route to Sponsor' drop down field
And I clear options of route to sponsor
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
And I click on 'Route to Sponsor' drop down field
And I select a route to developer in drop down list
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I click on intermediary option in route to developer
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I click on brokers option in route to developer
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I click on placement agents option in route to developer
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor option
And I click on asset experience
And I click on asset type field of deal sponsor search
And I select office in the asset type drop down list
Then I verify deal sponsor company of 'Office' is displayed
And I verify deal sponsor company of 'Hotel' is not displayed
And I verify deal sponsor company of 'Multi Family' is not displayed
When I click on asset type field of deal sponsor search
And I select office and hotel in asset drop down list
Then I verify deal sponsor company of 'Hotel' is displayed
And I verify deal sponsor company of 'Office' is displayed
And I verify deal sponsor company of 'Multi Family' is not displayed
When I click on asset type field of deal sponsor search
When I clear asset type field
And I click on asset type field of deal sponsor search
And I select solar option in the asset drop down list
Then I verify developer company of 'Solar' is displayed
And I verify developer company of 'Hotel' is not displayed
And I verify developer company of 'Multi Family' is not displayed
When I click on asset type field of deal sponsor search
And I select solar and hotel option in developer search
Then I verify developer company of 'Solar' is displayed
And I verify developer company of 'Hotel' is displayed
And I verify developer company of 'Multi Family' is not displayed
When I click on asset type field of deal sponsor search
And I clear options selected in asset type
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
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on multifamily option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on hotel option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on sports option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on health care option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on storage option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on other option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on retail option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on industrial option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on residential option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on single option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on retirement option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on student option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on other housing option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on residential multi family option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I clear residential of asset field
And I click on asset type field of deal sponsor search
And I click on mixed use option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on commercial option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I click on solar option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on asset type field of deal sponsor search
And I clear asset option in asset type
And I click on 'RiskProfile' drop down field
And I select a risk profile in drop down list
Then I verify company of 'Core' is displayed
And I verify company of 'Core Plus' is not displayed
And I verify company of 'Value Add' is not displayed
When I click on 'RiskProfile' drop down field
And I select core and core plus in risk profile
Then I verify company of 'Core' is displayed
And I verify company of 'Core Plus' is displayed
And I verify company of 'Value Add' is not displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile field
And I click on 'RiskProfile' drop down field
And I select opportunistic option in risk profile
Then I verify developer company of 'Opportunistic' is displayed
And I verify developer company of 'Core Plus' is not displayed
And I verify developer company of 'Value Add' is not displayed
When I click on 'RiskProfile' drop down field
And I select opportunistic and core plus in risk profile
Then I verify developer company of 'Opportunistic' is displayed
And I verify developer company of 'Core Plus' is displayed
And I verify developer company of 'Value Add' is not displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile field in developer search
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
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on core plus risk profile type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on value add risk profile type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on development risk profile type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on opportunistic risk profile type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on other risk profile risk profile type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile
And I click on 'Asset Strategy' drop down field
And I select buy land option in a strategy field of drop down list
Then I verify deal sponsor company of 'Buy Land' is displayed
And I verify deal sponsor company of 'Operating Companies' is not displayed
And I verify deal sponsor company of 'Platform Builds' is not displayed
When I click on 'Asset Strategy' drop down field
And I select buy land and operating companies strategy in drop down
Then I verify deal sponsor company of 'Platform Builds' is not displayed
And I verify deal sponsor company of 'Buy Land' is displayed
And I verify deal sponsor company of 'Operating Companies' is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy field
And I click on 'Asset Strategy' drop down field
And I select sales and leaseback option in strategy drop down
Then I verify developer company of 'Sales And Leaseback' is displayed
And I verify developer company of 'Operating Companies' is not displayed
And I verify developer company of 'Platform Builds' is not displayed
When I click on 'Asset Strategy' drop down field
And I select sales and leaseback and operating companies strategy in drop down
Then I verify developer company of 'Sales And Leaseback' is displayed
And I verify developer company of 'Operating Companies' is displayed
And I verify developer company of 'Platform Builds' is not displayed
When I click on 'Asset Strategy' drop down field
And I clear options selected in asset strategy field
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
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on buy land strategy
When I click on 'Asset Strategy' drop down field
And I click on development strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on build strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on spec strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on development develop strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on forward strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on build and sell strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I clear development field in strategy drop down field
When I click on 'Asset Strategy' drop down field
And I click on corporate strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on land banking strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I clear corporate in strategy drop down field
And I click on 'Asset Strategy' drop down field
And I click on operating strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on portfolio strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on recapitalization strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on sales strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on asset strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on stabilized strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on repositioning strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on redevelopment strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on reo strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on flip strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on buy strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on asset other strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on lease strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I clear asset acquisitions in strategy field
When I click on 'Asset Strategy' drop down field
And I click on land strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on develop strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on land other strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on speculation strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on land develop strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on land flip strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I clear land field in strategy drop down
And I click on 'Asset Strategy' drop down field
And I click on notes strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on platform build strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on public strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on rezones strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on others strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
And I verify fund sponsor company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy field of deal sponsor
And I logout from RealConnex application



