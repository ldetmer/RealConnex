Meta:
@storyType BQS

Narrative:
As a user
I verify companies of users who have selected "Broker" option
are retrieved, when "Real Estate Advisors >> Broker" search is performed

Scenario: TC 135563: Verify companies of broker is retrieved when search is performed
When I update TestCaseId 135563
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Real Estate Advisors' link
And I click on 'Broker' link
And I click on 'Residential' link
And I click on 'Acquisitions' link
And I click on 'GO' button
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Real Estate Advisors' link
And I click on 'Broker' link
And I click on 'Residential' link
And I click on 'Acquisitions' link
And I click on 'GO' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Residential Broker' as subrole in search option
And I should see 'Acquisitions' as strategy in search option
And I verify the company name in search result
When I click on verified name in search result
And I click on 'Find Now' button
Then I verify the service name in search result
When I click on verified service name in search result
And I click on 'Find Now' button
When I enter location of broker in text field
And I click on the broker location
Then I verify the service name in search result
When I clear location text field
When I click on 'Core Activity'
And I select option in Core Activity
Then I verify company of 'Acquisitions' is displayed
And I verify company of 'Investments' is not displayed
And I verify company of 'Tenant' is not displayed
When I click on 'Core Activity'
And I select two options of broker in core activity field
Then I verify company of 'Acquisitions' is displayed
And I verify company of 'Investments' is not displayed
And I verify company of 'Tenant' is not displayed
When I click on 'Core Activity'
And I clear core field
And I click on 'Core Activity'
And I click on investments option in core activity
Then I verify broker company name of all search option is displayed
When I click on 'Core Activity'
And I click on tenant option in core activity
Then I verify broker company name of all search option is displayed
When I click on 'Core Activity'
And I click on others option in core activity
Then I verify broker company name of all search option is displayed
When I click on 'Core Activity'
And I clear core activity drop down
When I click on 'Asset Experience'
And I click on solar option in asset field
Then I verify company of 'Solar' is displayed
And I verify company of 'Broker Multi Family' is not displayed
And I verify company of 'Broker Hotel' is not displayed
When I click on 'Asset Experience'
And I click on two options of broker in asset field
Then I verify company of 'Solar' is displayed
And I verify company of 'Broker Multi Family' is not displayed
And I verify company of 'Broker Hotel' is not displayed
When I click on 'Asset Experience'
And I clear asset field drop down
And I click on 'Asset Experience'
And I select option in 'Asset Experience'
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I clear office field of asset
When I click on 'Asset Experience'
And I click on multi option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on hotel option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on sports option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on health option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on storage option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on asset other option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on retail option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on industrial option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on residential option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on single option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on retirement option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on student option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on residential other option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on residential multi option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I clear residential field in asset option
When I click on 'Asset Experience'
And I click on mixed option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on commercial option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I click on solar option in asset
Then I verify broker company name of all search option is displayed
When I click on 'Asset Experience'
And I clear asset options in asset drop down field
And I click on 'Deal Stage'
And I select a option in Deal Stage
Then I verify company of 'In DD' is displayed
And I verify company of 'Owned' is not displayed
And I verify company of 'Concept' is not displayed
When I click on 'Deal Stage'
And I select two options in deal stage
Then I verify company of 'In DD' is displayed
And I verify company of 'Owned' is not displayed
And I verify company of 'Concept' is not displayed
When I click on 'Deal Stage'
And I clear deal stage drop down
And I click on 'Deal Stage'
And I select a option in 'DealStage'
Then I verify broker company name of all search option is displayed
When I click on 'Deal Stage'
And I select a option in 'DealStage'
When I click on 'Deal Stage'
And I click on concept option in deal stage
Then I verify broker company name of all search option is displayed
When I click on 'Deal Stage'
And I click on permitted option in deal stage
Then I verify broker company name of all search option is displayed
When I click on 'Deal Stage'
And I click on ready option in deal stage
Then I verify broker company name of all search option is displayed
When I click on 'Deal Stage'
And I click on LOI option in deal stage
Then I verify broker company name of all search option is displayed
When I click on 'Deal Stage'
And I click on under contract option in deal stage
Then I verify broker company name of all search option is displayed
When I click on 'Deal Stage'
And I click on plans option in deal stage
Then I verify broker company name of all search option is displayed
When I click on 'Deal Stage'
And I click on under construction option in deal stage
Then I verify broker company name of all search option is displayed
When I click on 'Deal Stage'
And I click on pursuit option in deal stage
Then I verify broker company name of all search option is displayed
When I click on 'Deal Stage'
And I click on in DD option in deal stage
Then I verify broker company name of all search option is displayed
When I click on 'Deal Stage'
And I clear deal stage field
And I logout from RealConnex application









