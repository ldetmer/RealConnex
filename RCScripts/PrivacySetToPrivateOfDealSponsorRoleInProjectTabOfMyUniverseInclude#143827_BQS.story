Meta:
@storyType BQS

Narrative:
As a user
I Select “Deal Sponsor” role and verify that only the user with Deal sponsor role can access “Project” profile after permission is granted

Scenario: 143827 : Verify that project can be viewed by deal sponsor after permission is granted
When I update TestCaseId 143827
When I update TestCaseName Select “Deal Sponsor” role and verify that only the user with Deal sponsor role can access “Project” profile after permission is granted
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID of user who set the privacy in my universe include as private in project tab
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on POSTINGS tab
And I click on projects of the deal sponsor in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on projects of the deal sponsor in my universe include
And I click on my universe radio button
And I click on include radio button
And I select deal sponsor check box
And I select private radio button of deal sponsor
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on funds of the deal sponsor in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on funds of the deal sponsor in my universe include
And I click on my universe radio button
And I click on include radio button
And I select deal sponsor check box
And I select private radio button of deal sponsor
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
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
And I select deal sponsor option in I am a field
And I enter the location of the newly created user
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
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I click investing as drop down field
And I select limited partner option in investing as drop down field
And I select value in investment amount slider of deal sponsor whose privacy is set to private
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter deal sponsor email ID of user who set the privacy in my universe include as private in yopmail
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID of user who set the privacy in my universe include as private in project tab
And I enter Password
And I click on login button
Then I verify access successfully updated message is displayed
And I verify the project notification in the header of privacy
When I logout RealConnex application
And I launch yopmail
And I enter yopmail email address of newly created user
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on the user link who granted the permission to view the profile
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter newly created 'Deal Sponsor' email ID
And I enter Password
And I click on login button
Then I verify the deal sponsor project who has set privacy to private in my universe include profile is displayed
And I verify the project notification in the header of the requested user of privacy
And I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I click investing as drop down field
And I select limited partner option in investing as drop down field
And I select value in investment amount slider of deal sponsor whose privacy is set to private
Then I verify 'Sharon Project' of deal sponsor project name who has set privacy to public in exclude of my universe is displayed
When I click 'Sharon Project' of deal sponsor project name who has set privacy to public in exclude of my universe
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email id of user with deal sponsor role and developer subrole
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I click investing as drop down field
And I select limited partner option in investing as drop down field
And I select value in investment amount slider of deal sponsor whose privacy is set to private
Then I verify click here link of the fund is displayed in search result
When I click on click here link of the private user
And I click on fund and projects tab of user profile
And I click on funds link
Then I verify the text in the fund and project user page when fund or project link is clicked
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of deal sponsor user with no filters
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I click investing as drop down field
And I select limited partner option in investing as drop down field
And I select value in investment amount slider of deal sponsor whose privacy is set to private
Then I verify click here link of the fund is displayed in search result
When I click on click here link of the private user
And I click on fund and projects tab of user profile
And I click on funds link
Then I verify the text in the fund and project user page when fund or project link is clicked
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of deal sponsor user with deal/fund size
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I click investing as drop down field
And I select limited partner option in investing as drop down field
And I select value in investment amount slider of deal sponsor whose privacy is set to private
Then I verify click here link of the fund is displayed in search result
When I click on click here link of the private user
And I click on fund and projects tab of user profile
And I click on funds link
Then I verify the text in the fund and project user page when fund or project link is clicked
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of deal sponsor user with no filters
And I enter Password
And I enter newly created 'Deal Sponsor' email ID
And I enter Password
And I click on login button
And I click on close tutorial field
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter deal sponsor email ID of user who set the privacy in my universe include as private in yopmail
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID of user who set the privacy in my universe include as private in project tab
And I enter Password
And I click on login button
Then I verify access successfully updated message is displayed
And I verify the project notification in the header of privacy
When I logout RealConnex application
And I launch yopmail
And I enter yopmail email address of newly created user
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on the user link who granted the permission to view the profile
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter newly created 'Deal Sponsor' email ID
And I enter Password
And I click on login button
Then I verify the deal sponsor fund who has set privacy to private in my universe include profile is displayed
And I verify the project notification in the header of the requested user of privacy
And I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
Then I verify 'Ross Fund' of deal sponsor fund name who has set privacy to public in exclude of my universe is displayed
When I click 'Ross Fund' of deal sponsor project name who has set privacy to public in exclude of my universe
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of deal sponsor user with no filters
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
Then I verify click here link of the service is displayed in search result
When I click on click here link of the private user
And I click on fund and projects tab of user profile
And I click on projects link
Then I verify the text in the fund and project user page when fund or project link is clicked
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of deal sponsor user with deal/fund size
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
Then I verify click here link of the service is displayed in search result
When I click on click here link of the private user
And I click on fund and projects tab of user profile
And I click on projects link
Then I verify the text in the fund and project user page when fund or project link is clicked
When I logout RealConnex application

