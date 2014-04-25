Meta:
@storyType BQS

Narrative:
As a user
I search for list of companies in Real Connex application

Scenario: TC 134218: Verify desired list of companies are retrieved from search result
When I update TestCaseId 134218
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
When I click on company name
And I click on 'Find Now' button
And I enter company name in search field
Then I should see the company name entered is displayed
When I enter company sub role type
Then I should see the company name entered is displayed
When I enter location in location search option
Then I should see the company name entered is displayed
When I logout from RealConnex application
