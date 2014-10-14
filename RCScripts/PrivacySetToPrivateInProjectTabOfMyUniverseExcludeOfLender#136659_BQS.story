Meta:
@storyType BQS

Narrative:
As a user
I Verify that projects of other role users except Lenders can be viewed after permission is granted.

Scenario: 136659 : Verify that project can be viewed by other role user except lender after permission is granted
When I update TestCaseId 136659
When I update TestCaseName Verify that projects of other role users except Lenders can be viewed after permission is granted.
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
Then I verify 'Privacy successfully saved' message is displayed
When I click on loan of the lender whose privacy is set in my universe include
When I click on my universe radio button
And I click on exclude radio button
And I select private option in drop down
And I select lender check box in my universe exclude
And I select sub role field of lender in my universe exclude
And I select family office sub role option in my universe exclude
And I set the value in deal/fund size field of lender in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on loan of the lender whose privacy is set in my universe include
Then I verify that private option is selected
And I verify lender check box is selected
And I verify family office subrole is selected
And I verify deal/fund size of the lender i.e 10 million to 11 million is set
When I return back to the searched page
And I click on mezz of the lender whose privacy is set in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on mezz of the lender whose privacy is set in my universe include
And I click on my universe radio button
And I click on exclude radio button
And I select private option in drop down
And I select lender check box in my universe exclude
And I select sub role field of lender in my universe exclude
And I select family office sub role option in my universe exclude
And I set the value in deal/fund size field of lender in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on mezz of the lender whose privacy is set in my universe include
Then I verify that private option is selected
And I verify lender check box is selected
And I verify family office subrole is selected
And I verify deal/fund size of the lender i.e 10 million to 11 million is set
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with role as lender and sub role as family office
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
When I set the value in loan amount field of lender whose privacy is set to private in my universe include
Then I verify lender loan whose profile is set my universe is not displayed
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
Then I verify lender mezz whose profile is set in my universe is not displayed
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
And I select private lender option in I am a field
And I enter the location of the newly created user
And I click on save button in user profile page
And I click on company tab in user profile
And I enter company name
And I select same as my personal details check box in company tab
And I click on save button of company profile
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
Then I verify click here link of the loan is displayed in search result
When I click on click here link of the private user
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
And I verify the project notification in the header of privacy
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
Then I verify the lender loan name is displayed
And I verify the project notification in the header of the requested user of privacy
And I should see 'Find Now' image
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
And I click on 'Find Now' button
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
When I set the value in loan amount field of lender whose privacy is set to private in my universe include
Then I verify click here link of the loan is displayed in search result
When I click on click here link of the private user
And I click on product tab of user profile
And I click on loan link
Then I verify the text in the loan user page when loan link is clicked
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
When I set the value in loan amount field of lender whose privacy is set to private in my universe include
Then I verify click here link of the loan is displayed in search result
When I click on click here link of the private user
And I click on product tab of user profile
And I click on loan link
Then I verify the text in the loan user page when loan link is clicked
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
When I set the value in loan amount field of lender whose privacy is set to private in my universe include
Then I verify click here link of the loan is displayed in search result
When I click on click here link of the private user
And I click on product tab of user profile
And I click on loan link
Then I verify the text in the loan user page when loan link is clicked
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
Then I verify click here link of the mezz is displayed in search result
When I click on click here link of the private user
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
And I verify the project notification in the header of privacy
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
Then I verify the lender mezz name is displayed
And I verify the project notification in the header of the requested user of privacy
And I should see 'Find Now' image
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
And I click on 'Find Now' button
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
When I set value in equity field of lender whose privacy is set to private in my universe include
Then I verify click here link of the mezz is displayed in search result
When I click on click here link of the private user
And I click on product tab of user profile
And I click on mezz link
Then I verify the text in the loan user page when loan link is clicked
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
When I set value in equity field of lender whose privacy is set to private in my universe include
Then I verify click here link of the mezz is displayed in search result
When I click on click here link of the private user
And I click on product tab of user profile
And I click on mezz link
Then I verify the text in the loan user page when loan link is clicked
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
When I set value in equity field of lender whose privacy is set to private in my universe include
Then I verify click here link of the mezz is displayed in search result
When I click on click here link of the private user
And I click on product tab of user profile
And I click on mezz link
Then I verify the text in the loan user page when loan link is clicked
When I logout RealConnex application

