Meta:
@storyType BQS

Narrative:
As a user
I verify 'Service' project of users who have selected "Investment Banker" option
are retrieved, when "Real Estate Advisors >> Advisor" search is performed

Scenario: TC 134284: Verify service project is retrieved when Advisor search is performed
When I update TestCaseId 134284
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Real Estate Advisors' link
And I click on 'Investment Banker' link
And I click on 'Capital Raising' link
And I click on 'GO' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Investment Banker' as subrole in search option
And I should see 'Capital Raising' as strategy in search option
And I verify banker company name is displayed
When I click on banker company name
And I click on 'Find Now' button
And I verify banker project name is displayed
When I click on banker project name
And I click on 'Find Now' button
And I enter location of investment banker in text field
When I click on the investment banker location
Then I verify banker project name is displayed
When I clear location text field
When I click on 'Core Activity'
And I select option in core activity of investment banker
Then I verify service of 'Capital Raising' is displayed
And I verify service of 'Equity' is not displayed
And I verify service of 'Debt' is not displayed
When I click on 'Core Activity'
And I select two option in core activity
Then I verify service of 'Capital Raising' is displayed
And I verify service of 'Equity' is not displayed
And I verify service of 'Debt' is not displayed
When I click on 'Core Activity'
And I clear core activity field of banker
When I click on 'Core Activity'
And I select option in core activity of investment banker
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Core Activity'
And I select option in core activity of investment banker
When I click on 'Core Activity'
And I click equity in core activity
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Core Activity'
And I click operating companies in core activity
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Core Activity'
And I click other in core activity
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Core Activity'
And I click debt in core activity
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Core Activity'
And I click portfolio in core activity
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Core Activity'
And I click recapitalizations in core activity
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Core Activity'
And I clear core field of banker
And I click on 'Asset Experience'
And I select option in asset experience of banker
Then I verify service of 'Health Care' is displayed
And I verify service of 'Storage' is not displayed
And I verify service of 'Commercial' is not displayed
When I click on 'Asset Experience'
And I click on two options of banker in asset field
Then I verify service of 'Health Care' is displayed
And I verify service of 'Storage' is not displayed
And I verify service of 'Commercial' is not displayed
When I click on 'Asset Experience'
And I clear asset field of banker
And I click on 'Asset Experience'
And I select option in 'Asset Experience'
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I select option in 'Asset Experience'
When I click on 'Asset Experience'
And I click on multi option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on hotel option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on sports option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on health option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on storage option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on asset other option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on retail option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on industrial option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on residential option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on single option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on retirement option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on student option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on residential other option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on residential multi option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I clear residential field in asset option
When I click on 'Asset Experience'
And I click on mixed option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on commercial option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I click on solar option in asset
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Asset Experience'
And I clear asset options in asset drop down field
And I click on 'Deal Stage'
And I select option in deal stage
Then I verify service of 'Ready for Purchase' is displayed
And I verify service of 'Pursuit' is not displayed
And I verify service of 'LOI' is not displayed
When I click on 'Deal Stage'
And I select two options in deal stage of banker
Then I verify service of 'Ready for Purchase' is displayed
And I verify service of 'Pursuit' is not displayed
And I verify service of 'LOI' is not displayed
When I click on 'Deal Stage'
And I clear deal stage of banker
And I click on 'Deal Stage'
And I select a option in 'DealStage'
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Deal Stage'
And I select a option in 'DealStage'
And I click on 'Deal Stage'
And I click on concept option in deal stage
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Deal Stage'
And I click on permitted option in deal stage
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Deal Stage'
And I click on ready option in deal stage
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Deal Stage'
And I click on LOI option in deal stage
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Deal Stage'
And I click on under contract option in deal stage
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Deal Stage'
And I click on plans option in deal stage
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Deal Stage'
And I click on under construction option in deal stage
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Deal Stage'
And I click on pursuit option in deal stage
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Deal Stage'
And I click on in DD option in deal stage
Then I verify banker company name of all search option is displayed
And I verify banker service name of all search option is displayed
When I click on 'Deal Stage'
And I clear deal stage field
And I logout from RealConnex application

