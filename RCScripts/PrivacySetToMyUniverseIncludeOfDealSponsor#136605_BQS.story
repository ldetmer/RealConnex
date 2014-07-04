Meta:
@storyType BQS

Narrative:
As a user
I Verify that only Deal Sponsor user can view Me Profile when Deal Sponsor user is included in My Universe.

Scenario: 136605 : Verify that deal sponsor user can view ME profile when deal sponsor user is included in my universe
When I update TestCaseId 136605
When I launch RealConnex application
And I enter email ID of user who set the privacy in my universe include
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on ME tab
And I click on my universe radio button
And I click on include radio button
And I select deal sponsor check box
And I select sub role field
And I select developer sub role option
And I set the value in deal/fund size field
And I select public radio button
And I click on location field
And I select the location of the user
And I click on save button in my universe page of ME tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I enter email ID of user with role as deal sponsor and sub role as developer
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify 'Emily Hill' user name who has set privacy include in my universe is displayed
When I logout RealConnex application
And I enter deal sponsor email ID where privacy is set
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify deal sponsor user whose profile is set private is not displayed
When I logout RealConnex application
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify deal sponsor user whose profile is set private is not displayed
When I logout RealConnex application
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify deal sponsor user whose profile is set private is not displayed
When I logout RealConnex application
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify deal sponsor user whose profile is set private is not displayed
When I logout RealConnex application
When I launch RealConnex application
And I enter email ID of user who set the privacy in my universe include
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on ME tab
And I clear deal sponsor check box
And I select sub role field
And I clear developer sub role option
And I clear the value in deal/fund size field
And I select public radio button
And I clear on location field
And I click on save button in my universe page of ME tab
When I logout RealConnex application