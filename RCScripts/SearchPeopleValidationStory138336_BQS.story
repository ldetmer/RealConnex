Meta:
@storyType BQS

Narrative:
As a user
I verify users other than desired user are not retrieved in people search

Scenario: TC 138336: Verify desired list of people are retrieved from search result
When I update TestCaseId 138336
When I update TestCaseName Search People Validation
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user title in name search option
Then I verify 'Marylin Joe' deal sponsor user name is displayed
And I verify 'Jiah Marten' investor user name is not displayed
When I clear title field in search option
And I enter 'Investor' user name
Then I verify 'Jiah Marten' investor user name is displayed
And I verify 'Marylin Joe' deal sponsor user name is not displayed
When I clear title field in search option
And I enter user job title in title search option
Then I verify 'Marylin Joe' deal sponsor user name is displayed
And I verify 'Jiah Marten' investor user name is not displayed
When I clear job title field in search option
And I enter 'Investor' job title
Then I verify 'Jiah Marten' investor user name is displayed
And I verify 'Marylin Joe' deal sponsor user name is not displayed
When I clear job title field in search option
And I enter user company name in company search option
Then I verify 'Marylin Joe' deal sponsor user name is displayed
And I verify 'Jiah Marten' investor user name is not displayed
When I clear Company Field
And I enter 'Investor' company name
Then I verify 'Jiah Marten' investor user name is displayed
And I verify 'Marylin Joe' deal sponsor user name is not displayed
When I clear Company Field
And I logout from RealConnex application


