Meta:
@storyType BQS

Narrative:
As a user
I search for list of people in RealConnex application

Scenario: TC 138204: Verify desired list of people are retrieved from search result
When I update TestCaseId 138204
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I should see 'Deal sponsor' user name
When I click on verified deal sponsor user name
And I click on 'Find Now' button
Then I should see 'Investor' user name is displayed
When I click on verified investor user name
And I click on 'Find Now' button
Then I should see 'Lender' user name is displayed
When I click on verified lender user name
And I click on 'Find Now' button
Then I verify 'Property Service Provider' user name is displayed
When I click on verified property service provider user name
And I click on 'Find Now' button
And I enter user title in name search option
Then I should see 'Deal sponsor' user name in search results
When I clear title field in search option
And I enter user job title in title search option
Then I should see 'Deal sponsor' user name in search results
When I clear job title field in search option
And I enter user company name in company search option
Then I should see 'Deal sponsor' user name in search results
When I clear Company Field
And I logout from RealConnex application

