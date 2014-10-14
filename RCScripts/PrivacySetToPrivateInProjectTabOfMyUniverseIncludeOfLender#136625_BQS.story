Meta:
@storyType BQS

Narrative:
As a user
I Verify that only Lender user can view Project after permission is granted when Lender user is included in My Universe.

Scenario: 136625 : Verify that only lender user can view project after permission is granted when lender user is included in my universe
When I update TestCaseId 136625
When I update TestCaseName Verify that only Lender user can view Project after permission is granted when Lender user is included in My Universe.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID of user who set the privacy in my universe include
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on POSTINGS tab
And I click on loan of the lender whose privacy is set in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
And I click on loan of the lender whose privacy is set in my universe include
And I click on my universe radio button
And I click on include radio button
And I select lender check box
And I select sub role field of lender
And I select family office sub role option
And I set the value in deal/fund size field of lender
And I select private radio button of lender
And I select country of the user in posting tab of my universe include
And I select regions of the user in posting tab of my universe include
And I select states of the user in posting tab of my universe include
And I select cities of the user in posting tab of my universe include
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on mezz of the lender whose privacy is set in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
When I click on mezz of the lender whose privacy is set in my universe include
And I click on my universe radio button
And I click on include radio button
And I select lender check box
And I select sub role field of lender
And I select family office sub role option
And I set the value in deal/fund size field of lender
And I select private radio button of lender
And I select country of the user in posting tab of my universe include
And I select regions of the user in posting tab of my universe include
And I select states of the user in posting tab of my universe include
And I select cities of the user in posting tab of my universe include
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on sign up for free link
And I enter lender email ID for registration
And I enter first name of user
And I enter last name of user
And I enter password in registration field
And I re enter password in registration field
And I click select role drop down field
And I select Lender option in select role drop down
Then I verify 'Lender' is selected in drop down
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
And I select family office option in I am a field
And I enter the location of the newly created user
And I click on save button in user profile page
And I click on company tab in user profile
And I click on edit in strategy field of lender profile
And I set the value of average loan amount in user profile
And I click on save button in strategy field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
When I set the value in loan amount field of lender whose privacy is set to private in my universe include
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter lender email ID of user who set the privacy in my universe include as private in yopmail
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter lender email ID of user who set the privacy in my universe include
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
And I click on Log In button in RealConnex login page
And I enter newly created 'Lender' email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
And I verify 'CY Loan' lender loan name who set privacy in my universe include is displayed
When I click on 'CY Loan' lender loan name who set privacy in my universe include
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID whose privacy set to private
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
And I verify lender loan whose privacy is set in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
And I verify lender loan whose privacy is set in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
And I verify lender loan whose privacy is set in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
And I verify lender loan whose privacy is set in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
And I verify lender loan whose privacy is set in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter newly created 'Lender' email ID
And I enter Password
And I click on login button
And I click on close tutorial field
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
When I set value in equity field of lender whose privacy is set to private in my universe include
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter lender email ID of user who set the privacy in my universe include as private in yopmail
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter lender email ID of user who set the privacy in my universe include
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
And I click on Log In button in RealConnex login page
And I enter newly created 'Lender' email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify 'CY Mezz' lender mezz name who set privacy in my universe include is displayed
When I click on 'CY Mezz' lender mezz name who set privacy in my universe include
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID whose privacy set to private
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify lender mezz whose profile is set public in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify lender mezz whose profile is set public in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify lender mezz whose profile is set public in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify lender mezz whose profile is set public in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
Then I verify lender mezz whose profile is set public in include of my universe is not displayed
When I logout RealConnex application

