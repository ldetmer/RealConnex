Meta:
@storyType BQS

Narrative:
As a user
I Verify that only Property Service Provider users excluded from My Universe are invisible when the privacy is set to "Exclude the following from my universe" in "Me >> Privacy" page.

Scenario: 136637 : Verify that property service provider users exclude from my universe are invisible when privacy is set to exclude in ME tab
When I update TestCaseId 136637
When I update TestCaseName Verify that only Property Service Provider users excluded from My Universe are invisible when the privacy is set to "Exclude the following from my universe" in "Me >> Privacy" page.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user who set the privacy in my universe exclude
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
And I click on exclude radio button
And I select public option in drop down
And I select real estate advisor check box in my universe exclude
And I select sub role field of real estate advisor in my universe exclude
And I select advisor sub role option in my universe exclude of real estate advisor
And I set the value in deal/fund size field of real estate advisor in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of ME tab
Then I verify 'Privacy successfully saved' message is displayed
And I verify that public option is selected
And I verify real estate advisor subrole is selected
And I verify advisor subrole is selected in real estate advisor
And I verify deal/fund size of the real estate advisor i.e 11 million to 12 million is set
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with role as real estate advisor and sub role as advisor
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set profile to exclude in my universe
Then I verify user whose profile is set to exclude in my universe is not displayed
When I click on 'Find Now' button
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor with subrole corporate finance
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
And I enter real estate advisor with different deal/fund size
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
And I enter real estate advisor with different location
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

