Meta:
@storyType BQS

Narrative:
As a user
I Select “Deal Sponsor” role and verify that only the user with Deal sponsor role can access “Company” profile after permission is granted

Scenario: 143825 : Verify that only deal sponsor user can access company profile after permission is granted in my universe include
When I update TestCaseId 143825
When I update TestCaseName Select “Deal Sponsor” role and verify that only the user with Deal sponsor role can access “Company” profile after permission is granted
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user who set the privacy in my universe exclude
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on COMPANY tab
And I click on public button in COMPANY tab
And I click on save button in COMPANY tab
And I click on my universe radio button
And I click on include radio button
And I select deal sponsor check box
And I select private radio button of deal sponsor
And I click on save button in my universe page of COMPANY tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of deal sponsor user with no filters
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify click here link of the private company is displayed in company search result
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of deal sponsor user with subrole as fund sponsor
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify click here link of the private company is displayed in company search result
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of deal sponsor user with deal/fund size
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify click here link of the private company is displayed in company search result
When I logout RealConnex application
And I click on sign up for free link
And I enter deal sponsor email ID for registration
And I enter first name of user
And I enter last name of user
And I enter password in registration field
And I re enter password in registration field
And I click select role drop down field
And I select Developer / Sponsor option in select role drop down
Then I verify 'Developer / Sponsor' is selected in drop down
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
And I select developer option in I am a field
And I click on save button in user profile page
And I click on company tab in user profile
And I enter company name
And I select same as my personal details check box in company tab
And I click on save button of company profile
And I click on edit in strategy field
And I set the value of average deal size in user profile
And I click on save button in strategy field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify click here link of the private company is displayed in company search result
When I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I launch yopmail
And I enter deal sponsor email ID of user who set the privacy in my universe exclude as private in yopmail
And I click on check inbox button
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
Then I verify access successfully updated message is displayed
And I verify the company profile notification in the header of permission granted user
When I launch yopmail
And I enter yopmail email address of newly created user
And I click on check inbox button
And I click on real connex mail
And I click on the user link who granted the permission to view the profile
And I switch to RealConnex page
Then I verify the deal sponsor company profile who set the privacy to private in exclude is displayed
And I verify the company profile notification in the header of requested user
And I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify 'EH Company' company name who has set privacy exclude in my universe is displayed
When I click 'EH Company' company name who has set privacy exclude in my universe is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify company whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify company whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify company whose profile is set to include in my universe is not displayed
When I logout RealConnex application



