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
Then I verify subrole is displayed as 'Developers, Deal Sponsors'
And I verify the 'Developer' name is displayed
When I click on verified developer name
And I click on 'Find Now' button
Then I should see desired company name of developer
When I click on Developer company name
And I click on 'Find Now' button
And I enter location in text field
Then I verify Location field in side search
When I clear location text field
And I click on 'Project' field
And I click on 'Project Type' drop down field
And I select a project in drop down list
Then I verify company of 'Office' is displayed
And I verify company of 'Hotel' is not displayed
And I verify company of 'Multi Family' is not displayed
When I click on 'Project Type' drop down field
And I select office and hotel in project drop down list
Then I verify company of 'Hotel' is displayed
And I verify company of 'Office' is displayed
And I verify company of 'Multi Family' is not displayed
When I click on 'Project Type' drop down field
When I clear project field
And I click on 'Project Type' drop down field
And I select a project in drop down list
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on multifamily option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on hotel option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on sports option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on health care option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on storage option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on other option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on retail option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on industrial option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on residential option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on single option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on retirement option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on student option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on other housing option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on residential multi family option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I clear residential of project field
And I click on 'Project Type' drop down field
And I click on mixed use option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on commercial option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I click on solar option in project type
Then I verify developer company name of all search option is displayed
When I click on 'Project Type' drop down field
And I clear project option in project type
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
When I click on 'Strategy' drop down field
And I click on buy land strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on buy land strategy
When I click on 'Strategy' drop down field
And I click on development strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on build strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on spec strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on development develop strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on forward strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on build and sell strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I clear development field in strategy drop down field
When I click on 'Strategy' drop down field
And I click on corporate strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on land banking strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I clear corporate in strategy drop down field
When I click on 'Strategy' drop down field
And I click on operating strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on portfolio strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on recapitalization strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on sales strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on asset strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on stabilized strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on repositioning strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on redevelopment strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on reo strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on flip strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on buy strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on asset other strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on lease strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I clear asset acquisitions in strategy field
When I click on 'Strategy' drop down field
And I click on land strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on develop strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on land other strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on speculation strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on land develop strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on land flip strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I clear land field in strategy drop down
When I click on 'Strategy' drop down field
And I click on notes strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on platform build strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on public strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on rezones strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I click on others strategy
Then I verify developer user of all option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Strategy' drop down field
And I clear strategy field of deal sponsor
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
And I select a risk profile in drop down list
Then I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on core plus risk profile type
Then I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on value add risk profile type
Then I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on development risk profile type
Then I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on opportunistic risk profile type
Then I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on other risk profile risk profile type
Then I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile
And I click on 'Investor and Sponsor' drop down field
And I click on 'Investment Method' drop down field
And I select a investment method in drop down list
Then I verify company of 'Advisor' is displayed
And I verify company of 'Crowd Funded' is not displayed
And I verify company of 'Family Office' is not displayed
When I click on 'Investment Method' drop down field
And I select advisor and crowd fund in investment method
Then I verify company of 'Advisor' is displayed
And I verify company of 'Crowd Funded' is displayed
And I verify company of 'Family Office' is not displayed
When I clear Investment field
And I click on 'Investment Method' drop down field
And I select a investment method in drop down list
Then I verify developer company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click on EB5 option in investment method
Then I verify developer company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click on crowd funded option in investment method
Then I verify developer company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click on single investor option in investment method
Then I verify developer company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click on family office option in investment method
Then I verify developer company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click on institution option in investment method
Then I verify developer company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click on asset manager option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click broker or intermediary option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click consultant option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click construction option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click endowment option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click fund of funds option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click government agency in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click hedge fund in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click high net in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click individual investor in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click insurance company in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click other institutional investor in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click owner operator in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click NCREIF option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click senior lender option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click mezzanine option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click junior lender option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click private equity option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click private REIT option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click public REIT option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click sovereign option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I click special option in institute of investment method
Then I verify company name of all search option is displayed
When I click on 'Investment Method' drop down field
And I clear investment method option
And I click on 'Route to Developer' drop down field
And I select a route to developer in drop down list
Then I verify company of 'Direct Only' is displayed
And I verify company of 'Intermediary' is not displayed
And I verify company of 'Brokers' is not displayed
When I click on 'Route to Developer' drop down field
And I select direct only and intermediary in route to development method
Then I verify company of 'Direct Only' is displayed
And I verify company of 'Intermediary' is displayed
And I verify company of 'Brokers' is not displayed
When I clear route field
And I click on 'Route to Developer' drop down field
And I select a route to developer in drop down list
Then I verify developer company name of all search option is displayed
When I click on 'Route to Developer' drop down field
And I click on intermediary option in route to developer
Then I verify developer company name of all search option is displayed
When I click on 'Route to Developer' drop down field
And I click on brokers option in route to developer
Then I verify developer company name of all search option is displayed
When I click on 'Route to Developer' drop down field
And I click on placement agents option in route to developer
Then I verify developer company name of all search option is displayed
When I click on 'Route to Developer' drop down field
And I clear route to developer option
And I click on Syndicate type
Then I verify company of 'Hotel' is displayed
And I verify company of 'Multi Family' is not displayed
And I verify company of 'Solar' is not displayed
When I logout from RealConnex application