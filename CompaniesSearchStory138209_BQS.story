Meta:
@storyType BQS

Narrative:
As a user
I search for list of companies in Real Connex application

Scenario: TC 138209: Verify desired list of companies are retrieved from search result
When I update TestCaseId 138209
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Deal Sponsor' company name is displayed
When I click on company name of deal sponsor
And I click on 'Find Now' button
Then I verify company name of 'Investor' is displayed
When I click on company name of investor
And I click on 'Find Now' button
Then I verify company name of 'Lender' is displayed
When I click on company name of lender
And I click on 'Find Now' button
Then I verify company name of 'Real Estate Advisor' is displayed
When I click on company of real estate advisor
And I click on 'Find Now' button
And I enter company name in search field
Then I verify Deal Sponsor company name is displayed
When I clear name field in search option
And I enter company type in search option
Then I verify Deal Sponsor company name is displayed
When I clear type field in search option
And I logout from RealConnex application
