Meta:
@storyType BQS

Narrative:
As a user
I Verify that when privacy is set to "Public" in "Me >> Privacy" page, users can view Me profile.

Scenario: 141179 : Verify that when privacy is set to "Public" in "Me" page, all users can view Me profile.
When I update TestCaseId 141179
When I launch RealConnex application
And I enter email ID of user
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on public button in ME tab
And I click on save button in me tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I enter user login details:
|Field|Value|
|EmailId|test12@yopmail.com|
|Password|test1234|
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Sophia Anna' deal sponsor user name is displayed in search result
When I click on 'Sophia Anna' deal sponsor user name in search result
And I click on 'Find Now' button
And I logout RealConnex application
And I enter user login details:
|Field|Value|
|EmailId|test13@yopmail.com|
|Password|test1234|
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Sophia Anna' deal sponsor user name is displayed in search result
When I click on 'Sophia Anna' deal sponsor user name in search result
And I click on 'Find Now' button
And I logout RealConnex application
And I enter user login details:
|Field|Value|
|EmailId|test14@yopmail.com|
|Password|test1234|
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Sophia Anna' deal sponsor user name is displayed in search result
When I click on 'Sophia Anna' deal sponsor user name in search result
And I click on 'Find Now' button
And I logout RealConnex application
And I enter user login details:
|Field|Value|
|EmailId|test15@yopmail.com|
|Password|test1234|
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Sophia Anna' deal sponsor user name is displayed in search result
When I click on 'Sophia Anna' deal sponsor user name in search result
And I click on 'Find Now' button
And I logout RealConnex application

