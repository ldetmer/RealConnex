Meta:
@storyType BQS

Narrative:
As a user
Select “Deal Sponsor” role and "Sub-Role" and verify that only the user with Deal sponsor role and Specified Sub-role can access “Me” profile.

Scenario: 147638 : Verify that only deal sponsor and developer subrole user access me profile in my universe include
When I update TestCaseId 147638
When I update TestCaseName Select “Deal Sponsor” role and "Sub-Role" and verify that only the user with Deal sponsor role and Specified Sub-role can access “Me” profile.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user who set the privacy in my universe include
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on ME tab
And I click on public button in ME tab
And I click on save button in my universe page of ME tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on my universe radio button
And I click on include radio button
And I select deal sponsor check box
And I select sub role field of deal sponsor
And I select developer sub role option
And I set the value in deal/fund size field of deal sponsor
And I select public radio button of deal sponsor
And I click on save button in my universe page of ME tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with role as deal sponsor and sub role as developer with deal/fund size
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify 'Emily Hill' user name who has set privacy exclude in my universe is displayed
When I click 'Emily Hill' user name who has set privacy exclude in my universe
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with deal sponsor and developer role and deal/fund size of 20 to 30
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to include in my universe is not displayed
When I logout RealConnex application



