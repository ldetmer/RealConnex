Meta:
@storyType BQS

Narrative:
As a user
I verify companies of users who have selected "Investment Banker" option
are retrieved, when "Real Estate Advisors >> Investment Banker" search is performed

Scenario: TC 135564: Verify companies of investment banker is retrieved search is performed
When I update TestCaseId 135564
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
When I click on 'Core Activity'
And I select option in core activity
And I click on 'Asset Experience'
And I select option in asset experience
And I click on 'Deal Stage'
And I select option in deal stage
And I click on 'Profile and Experience'
And I enter Number of Office in text field
And I enter Number of Professionals in text field
Then I verify company name of service provider is displayed
When I click on company name of service provider
And I click on 'Find Now' button