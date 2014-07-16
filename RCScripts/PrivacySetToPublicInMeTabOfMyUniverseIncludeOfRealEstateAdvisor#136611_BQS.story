Meta:
@storyType BQS

Narrative:
As a user
I Verify that only Property Service Provider user can view Me Profile when Property Service Provider user is included in My Universe.

Scenario: 136611 : Verify that property service provider user can view ME profile when property service provider user is included in my universe
When I update TestCaseId 136611
When I update TestCaseName Privacy Set To Public In Me Tab Of My Universe Include Of Real Estate Advisor
When I launch RealConnex application
And I enter email ID of user who set the privacy in my universe include
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on ME tab
And I click on my universe radio button
And I click on include radio button
And I select real estate advisor check box
And I select sub role field of real estate advisor
And I select advisor sub role option in real estate advisor
And I set the value in deal/fund size field of real estate advisor
And I select public radio button of real estate advisor
And I click on location field
And I select the location of the user
And I click on save button in my universe page of ME tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I enter email ID of user with role as real estate advisor and sub role as advisor
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify 'Emily Hill' user name who has set privacy include in my universe is displayed
When I click 'Emily Hill' user name who has set privacy include in my universe
And I click on 'Find Now' button
And I logout RealConnex application
And I enter real estate advisor email ID where privacy is set
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I enter investor email ID for login
And I enter password of user
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I enter lender email ID for login
And I enter password of user
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I enter email ID of user who set the privacy in my universe include
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on ME tab
And I clear real estate advisor check box
And I select sub role field of real estate advisor
And I clear advisor sub role option of real estate advisor
And I clear the value in deal/fund size field of real estate advisor
And I select private radio button of real estate advisor
And I clear on location field
And I click on public button in ME tab
And I click on save button in my universe page of ME tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application