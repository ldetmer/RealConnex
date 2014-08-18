Meta:
@storyType BQS

Narrative:
As a user
I Verify that companies of other role users except Investors can be viewed after permission is granted.

Scenario: 136644 : Verify that investor user exclude from my universe are invisible when privacy is set to exclude in company tab
When I update TestCaseId 136644
When I update TestCaseName Verify that companies of other role users except Investors can be viewed after permission is granted.
When I launch RealConnex application
And I enter investor email ID of user who set the privacy in my universe exclude
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on COMPANY tab
And I click on public button in COMPANY tab
And I click on save button in my universe page of COMPANY tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on my universe radio button
And I click on exclude radio button
And I select private option in drop down
And I select investor check box in my universe exclude
And I select sub role field of investor in my universe exclude
And I select advisor sub role option in my universe exclude
And I set the value in deal/fund size field of investor in my universe exclude
And I click on location field in my universe exclude
And I select the location of the user in my universe exclude
And I click on save button in my universe page of COMPANY tab
Then I verify 'Privacy successfully saved' message is displayed
And I verify that public option is selected
And I verify investor check box is selected
And I verify advisor subrole is selected
And I verify deal/fund size of the investor i.e 9 million to 10 million is set
And I verify the data in location field of my universe exclude
When I logout RealConnex application
And I enter email ID of user with role as investor and sub role as advisor
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter investor company name who has set the profile in exclude of my universe
Then I verify investor company whose profile is set private in exclude of my universe is not displayed
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' link
And I click on 'GO' button
Then I verify investor company whose profile is set private in exclude of my universe is not displayed
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I verify investor company whose profile is set private in exclude of my universe is not displayed
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Direct Into Project' link in money search
And I click on 'GO' button
Then I verify investor company whose profile is set private in exclude of my universe is not displayed
When I logout RealConnex application
And I click on Not a Member? Join Now for Free! link in registration page
And I enter investor email ID for registration
And I enter first name of user
And I enter last name of user
And I enter password in registration field
And I re enter password in registration field
And I click select role drop down field
And I select Investor option in select role drop down
Then I verify 'Investor' is selected in drop down
When I click on I certify I am an accredited investor check box
And I click register button
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
And I select bank option in I am a field
And I enter the location of the newly created user
And I click on save button in user profile page
And I click on company tab in user profile
And I enter company name
And I select same as my personal details check box in company tab
And I click on edit in investment strategy field
And I set the value of preferred deal size in user profile
And I click on save button in strategy field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter investor company name who has set the profile in exclude of my universe
Then I verify click here link of the private company is displayed in company search result
When I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter investor email ID of user who set the privacy in my universe include as private in yopmail
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I enter investor email ID of user who set the privacy in my universe exclude
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
And I enter newly created 'Investor' email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter investor company name who has set the profile in exclude of my universe
Then I verify 'Young Company' company name who has set privacy include in my universe is displayed
When I click 'Young Company' company name who has set privacy include in my universe
And I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I verify 'Young Company' company name who has set privacy to exclude in my universe is displayed
When I click 'Young Company' on company name who has set privacy to exclude in my universe is displayed
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Direct Into Project' link in money search
And I click on 'GO' button
Then I verify 'Young Company' company name who has set privacy to exclude in my universe is displayed
When I click 'Young Company' on company name who has set privacy to exclude in my universe is displayed
When I logout RealConnex application
And I enter investor email Id with different deal/fund size
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter investor company name who has set the profile in exclude of my universe
Then I verify click here link of the private company is displayed in company search result
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I verify click here link of the private company is displayed in company search result
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Direct Into Project' link in money search
And I click on 'GO' button
Then I verify click here link of the private company is displayed in company search result
When I logout RealConnex application
And I enter investor with different location
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter investor company name who has set the profile in exclude of my universe
Then I verify click here link of the private company is displayed in company search result
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I verify click here link of the private company is displayed in company search result
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Direct Into Project' link in money search
And I click on 'GO' button
Then I verify click here link of the private company is displayed in company search result
When I logout RealConnex application
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify click here link of the private company is displayed in company search result
When I click on 'Find Now' button
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I verify click here link of the private company is displayed in company search result
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Direct Into Project' link in money search
And I click on 'GO' button
Then I verify click here link of the private company is displayed in company search result
When I logout RealConnex application
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify click here link of the private company is displayed in company search result
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I verify click here link of the private company is displayed in company search result
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Direct Into Project' link in money search
And I click on 'GO' button
Then I verify click here link of the private company is displayed in company search result
When I logout RealConnex application
