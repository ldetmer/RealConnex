Meta:
@storyType BQS

Narrative:
As a user
I Verify that other role users except Property Service Provider can view Me >> Profile after permission is granted.

Scenario: 136638 : Verify that other role user except property service provider can view me profile after permission is granted
When I update TestCaseId 136638
When I update TestCaseName Verify that other role users except Property Serivce Provider can view Me >> Profile after permission is granted.
When I launch RealConnex application
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
And I select private option in drop down
And I select real estate advisor check box in my universe exclude
And I select sub role field of real estate advisor in my universe exclude
And I select advisor sub role option in my universe exclude of real estate advisor
And I set the value in deal/fund size field of real estate advisor in my universe exclude
And I click on location field in my universe exclude
And I select the location of the user in my universe exclude
And I click on save button in my universe page of ME tab
Then I verify 'Privacy successfully saved' message is displayed
And I verify real estate advisor check box is selected
And I verify real estate advisor subrole is selected
And I verify deal/fund size of the real estate advisor i.e 11 million to 12 million is set
And I verify the data in location field
When I logout RealConnex application
And I enter email ID of user with role as real estate advisor and sub role as advisor
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set profile to exclude in my universe
Then I verify user whose profile is set to exclude in my universe is not displayed
When I click on 'Find Now' button
And I logout RealConnex application
And I click on Not a Member? Join Now for Free! link in registration page
And I enter deal sponsor email ID for registration
And I enter first name of user
And I enter last name of user
And I enter password in registration field
And I re enter password in registration field
And I click select role drop down field
And I select Real Estate Advisor,Broker option in select role drop down
Then I verify 'Real Estate Advisor, Broker' is selected in drop down
When I click register button
Then I verify 'Almost Done!' confirmation message is displayed
When I click on OK button
And I launch yopmail
And I enter yopmail email address of newly created user
And I click on check inbox button
And I switch to yop mail tab
And I click on real connex mail
And I click on Click here link
And I switch to RealConnex page
Then I verify RealConnex page
When I click Skip Tour button
And I click on Profile button
And I select corporate finance option in I am a field of real estate advisor profile
And I enter the location of the newly created user
And I click on save button in user profile page
And I click on company tab in user profile
And I enter company name
And I select same as my personal details check box in company tab
And I click on edit in about field
And I set the value of average transaction size in user profile
And I click on save button in about field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set profile to exclude in my universe
Then I verify click here link of the private user is displayed in search result
When I click on 'Find Now' button
And I logout RealConnex application
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify click here link of the private user is displayed in search result
When I logout RealConnex application
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify click here link of the private user is displayed in search result
When I logout RealConnex application
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify click here link of the private user is displayed in search result
When I logout RealConnex application
