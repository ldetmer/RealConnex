Meta:
@storyType BQS

Narrative:
As a user
I Verify that only Property Service Provider user can view Me Profile after permission is granted when Property Service Provider user is included in My Universe.

Scenario: 136612  : Verify that property service provider user can view ME profile after permission is granted when property service provider user is included in my universe
When I update TestCaseId 136612
When I update TestCaseName Privacy Set To Private In Me Tab Of My Universe Include Of Real Estate Advisor
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID of user who set the privacy in my universe include as private in me tab
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on ME tab
And I click on public button in ME tab
And I click on save button in my universe page of ME tab
And I click on my universe radio button
And I click on include radio button
And I select real estate advisor check box
And I select sub role field of real estate advisor
And I select advisor sub role option in real estate advisor
And I set the value in deal/fund size field of real estate advisor
And I select private radio button of real estate advisor
And I select country of the user in me tab of my universe include
And I select regions of the user in me tab of my universe include
And I select states of the user in me tab of my universe include
And I select cities of the user in me tab of my universe include
And I click on save button in my universe page of ME tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on sign up for free link
And I enter real estate advisor,broker email ID for registration
And I enter first name of user
And I enter last name of user
And I enter password in registration field
And I re enter password in registration field
And I click select role drop down field
And I select Real Estate Advisor,Broker option in select role drop down
Then I verify 'Real Estate Advisor' is selected in drop down
When I click register button
Then I verify 'Almost Done!' confirmation message is displayed
When I click on close button
And I launch yopmail
And I enter yopmail email address of newly created user
And I click on check inbox button
And I switch to yop mail tab
And I click on real connex mail
And I click on Click here link
And I switch to RealConnex page
Then I verify RealConnex page
When I click Skip Tour button
And I click on Edit Profile link
And I select advisor option in I am a field of real estate advisor profile
And I enter the location of the newly created user
And I click on save button in user profile page
And I click on company tab in user profile
And I click on edit in about field
And I set the value of average transaction size in user profile
And I click on save button in about field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter lender user name who has set the me profile to private in include of my universe
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter lender email ID of user who set the privacy in my universe include as private in yopmail
And I click on check inbox button
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter lender email ID of user who set the privacy in my universe include as private in me tab
And I enter Password
And I click on login button
Then I verify access successfully updated message is displayed
When I logout RealConnex application
And I launch yopmail
And I enter yopmail email address of newly created user
And I click on check inbox button
And I click on real connex mail
And I click on the user link who granted the permission to view the profile
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter newly created 'Real Estate Advisor,Broker' email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter lender user name who has set the me profile to private in include of my universe
Then I verify 'Carol Young' user name who has set privacy include in my universe is displayed
When I click 'Carol Young' user name who has set privacy include in my universe
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID where privacy is set
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter lender user name who has set the me profile to private in include of my universe
Then I verify lender user whose profile is set to private in me tab of include in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter lender user name who has set the me profile to private in include of my universe
Then I verify lender user whose profile is set to private in me tab of include in my universe is not displayed
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
When I enter lender user name who has set the me profile to private in include of my universe
Then I verify lender user whose profile is set to private in me tab of include in my universe is not displayed
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
When I enter lender user name who has set the me profile to private in include of my universe
Then I verify lender user whose profile is set to private in me tab of include in my universe is not displayed
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
When I enter lender user name who has set the me profile to private in include of my universe
Then I verify lender user whose profile is set to private in me tab of include in my universe is not displayed
When I launch RealConnex application


