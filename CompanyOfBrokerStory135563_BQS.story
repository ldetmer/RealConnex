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
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Residential Broker' as subrole in search option
And I should see 'Acquisitions' as strategy in search option
When I click on broker company name
And I click on 'Find Now' button
When I click on broker service name
And I click on 'Find Now' button
And I select asset experience drop down field
And I click on solar option in asset experience field
Then I verify company name of broker is displayed
When I select asset experience drop down field
And I clear solar option of asset experience field
And I click on deal stage drop down
And I select in dd option in deal stage drop down
Then I verify company name of broker is displayed
When I click on deal stage drop down
And I clear in dd option in deal stage drop down
