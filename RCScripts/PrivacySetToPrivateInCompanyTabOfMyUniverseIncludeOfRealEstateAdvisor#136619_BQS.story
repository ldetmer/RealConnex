Meta:
@storyType BQS

Narrative:
As a user
I Verify that only Lender user can view Company Profile after permission is granted when Lender user is included in My Universe.

Scenario: 136619 : Verify that lender user can view company profile after permission is granted when lender user is included in my universe
When I update TestCaseId 136619
When I update TestCaseName Verify that only Property Service Provider user can view Company Profile after permission is granted when Property Service Provider user is included in My Universe.
When I launch RealConnex application
And I enter lender email ID of user who set the privacy in my universe include as private in me tab
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on COMPANY tab
And I click on my universe radio button
And I click on include radio button
And I select real estate advisor check box
And I select sub role field of real estate advisor
And I select advisor sub role option in real estate advisor
And I set the value in deal/fund size field of real estate advisor
And I select private radio button of real estate advisor
And I click on save button in my universe page of COMPANY tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on Not a Member? Join Now for Free! link in registration page
And I enter real estate advisor,broker email ID for registration
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
When I click on close tutorial field
And I click on Profile button
And I select advisor option in I am a field of real estate advisor profile
And I click on save button in user profile page
And I click on company tab in user profile
And I enter company name
And I select advisor option in We are a field of real estate advisor profile
And I click on save button of company profile
And I click on edit in about field
And I set the value of average transaction size in user profile
And I click on save button in strategy field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter lender company name who has set the profile to private in include of my universe
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter real estate advisor email ID of user who set the privacy in my universe include as private in yopmail
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I enter real estate advisor email ID of user who set the privacy in my universe include as private in me tab
And I enter Password
And I click on login button
Then I verify access successfully updated message is displayed
When I logout RealConnex application
And I launch yopmail
And I enter yopmail email address of newly created user
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on the user link who granted the permission to view the profile
And I switch to RealConnex page
And I enter newly created 'Real Estate Advisor,Broker' email ID
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter lender company name who has set the profile to private in include of my universe
Then I verify 'Carol Company' company name who has set privacy include in my universe is displayed
When I click 'Carol Company' company name who has set privacy include in my universe
And I click on 'Find Now' button
And I logout RealConnex application
And I enter lender email ID where privacy is set
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter lender company name who has set the profile to private in include of my universe
Then I verify lender company whose profile is set private in include of my universe is not displayed
When I logout RealConnex application
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter lender company name who has set the profile to private in include of my universe
Then I verify lender company whose profile is set private in include of my universe is not displayed
When I logout RealConnex application
And I enter investor email ID for login
And I enter password of user
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter lender company name who has set the profile to private in include of my universe
Then I verify lender company whose profile is set private in include of my universe is not displayed
When I logout RealConnex application
And I enter lender email ID for login
And I enter password of user
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter lender company name who has set the profile to private in include of my universe
Then I verify lender company whose profile is set private in include of my universe is not displayed
When I logout RealConnex application
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter lender company name who has set the profile to private in include of my universe
Then I verify lender company whose profile is set private in include of my universe is not displayed
When I logout RealConnex application
And I enter email ID of user who set the privacy in my universe include
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on COMPANY tab
And I clear real estate advisor check box
And I select sub role field of real estate advisor
And I clear advisor sub role option of real estate advisor
And I clear the value in deal/fund size field of real estate advisor
And I click on save button in COMPANY tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application