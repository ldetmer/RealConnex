Meta:
@storyType BQS

Narrative:
As a user
I Verify that only Investor user can view Project after permission is granted when Investor user is included in My Universe.

Scenario: 136623 : Verify that only investor user can view project after permission is granted when investor user is included in my universe
When I update TestCaseId 136623
When I update TestCaseName Verify that only Investor user can view Project after permission is granted when Investor user is included in My Universe.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID of user who set the privacy in my universe include in project tab
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on POSTINGS tab
And I click on funds of the investor in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
And I click on funds of the investor in my universe include
And I click on my universe radio button
And I click on include radio button
And I select investor check box
And I select sub role field of investor
And I select advisor sub role option
And I set the value in deal/fund size field of investor
And I select private radio button of investor
And I select country of the user in posting tab of my universe include
And I select regions of the user in posting tab of my universe include
And I select states of the user in posting tab of my universe include
And I select cities of the user in posting tab of my universe include
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on sign up for free link
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
And I select advisor option in I am a field
And I enter the location of the newly created user
And I click on save button in user profile page
And I click on company tab in user profile
And I click on edit in investment strategy field
And I set the value of preferred deal size in user profile
And I click on save button in strategy field
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
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter investor email ID of user who set the privacy in my universe include as private in yopmail
And I click on check inbox button
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter investor email ID of user who set the privacy in my universe include in project tab
And I enter Password
And I click on login button
Then I verify access successfully updated message is displayed
And I verify the notification in the header
When I logout RealConnex application
And I launch yopmail
And I enter yopmail email address of newly created user
And I click on check inbox button
And I click on real connex mail
And I click on the user link who granted the permission to view the profile
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter newly created 'Investor' email ID
And I enter Password
And I click on login button
Then I verify the investor project who has set privacy to private in my universe include profile is displayed
And I verify the notification in the header of the requested user
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
And I verify 'LY Fund' investor fund name who has set privacy in include of my universe is displayed
When I click 'LY Fund' investor fund name who has set privacy in include of my universe
And I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
And I verify 'LY Fund' investor fund name who has set privacy in include of my universe is displayed
When I click 'LY Fund' investor fund name who has set privacy in include of my universe
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID where privacy is set
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
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify investor fund whose profile privacy is set to private in include of my universe is not displayed
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify investor fund whose profile privacy is set to private in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for login
And I enter password of user
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
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify investor fund whose profile privacy is set to private in include of my universe is not displayed
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify investor fund whose profile privacy is set to private in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
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
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify investor fund whose profile privacy is set to private in include of my universe is not displayed
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify investor fund whose profile privacy is set to private in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID for login
And I enter password of user
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
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify investor fund whose profile privacy is set to private in include of my universe is not displayed
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify investor fund whose profile privacy is set to private in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
And I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify investor fund whose profile privacy is set to private in include of my universe is not displayed
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify investor fund whose profile privacy is set to private in include of my universe is not displayed
When I logout RealConnex application

