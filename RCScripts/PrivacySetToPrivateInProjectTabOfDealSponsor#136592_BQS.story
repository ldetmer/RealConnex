Meta:
@storyType BQS

Narrative:
As a user
I Verify that when "Deal Sponsor" user sets privacy to "Private" for a project in "Project" page, only users have been granted permission can view Project.

Scenario: 136592 : Verify that deal sponsor user privacy is set to "Private" in "Project" page can be viewed to user who have permission
When I update TestCaseId 136592
When I launch RealConnex application
And I enter deal sponsor email ID whose privacy set to private
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on PROJECTS tab
And I click on projects of the deal sponsor whose privacy is private
And I select private radio button
And I click on save button in projects tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on funds of the deal sponsor whose privacy is private
And I select private radio button
And I click on save button in projects tab
Then I verify 'Privacy successfully saved' message is displayed
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
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Opportunistic' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
When I select value in investment amount slider of deal sponsor whose privacy is set to private
And I click investing as drop down field
And I select co gp option in investing drop down
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter deal sponsor email ID whose privacy set to private in yopmail
And I click on check inbox button
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I enter deal sponsor email ID whose privacy set to private
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
And I enter newly created 'Investor' email ID
And I enter Password
And I click on login button
Then I verify the deal sponsor project profile is displayed
And I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Opportunistic' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify 'JS Project' deal sponsor project name is displayed in search result
When I click on 'JS Project' deal sponsor project name in search result
And I click on 'Find Now' button
And I logout RealConnex application
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Opportunistic' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify deal sponsor project profile is set to private is not displayed
When I click on 'Find Now' button
And I logout RealConnex application
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Opportunistic' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify deal sponsor project profile is set to private is not displayed
When I click on 'Find Now' button
And I logout RealConnex application
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Opportunistic' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify deal sponsor project profile is set to private is not displayed
When I click on 'Find Now' button
And I logout RealConnex application
And I enter newly created 'Investor' email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter deal sponsor email ID whose privacy set to private in yopmail
And I click on check inbox button
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I enter deal sponsor email ID whose privacy set to private
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
And I enter newly created 'Investor' email ID
And I enter Password
And I click on login button
Then I verify the deal sponsor fund profile is displayed
And I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify 'JS Fund' deal sponsor fund name is displayed in search result
When I click on 'JS Fund' deal sponsor fund name in search result
And I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Direct Into Project' link in money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I verify 'JS Fund' deal sponsor fund name is displayed in search result
When I click on 'JS Fund' deal sponsor fund name in search result
And I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
And I verify 'JS Fund' deal sponsor fund name is displayed in search result
When I click on 'JS Fund' deal sponsor fund name in search result
And I click on 'Find Now' button
And I logout RealConnex application
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify deal sponsor fund profile is set to private is not displayed
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Direct Into Project' link in money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I verify deal sponsor fund profile is set to private is not displayed
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
And I verify deal sponsor fund profile is set to private is not displayed
When I click on 'Find Now' button
And I logout RealConnex application
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify deal sponsor fund profile is set to private is not displayed
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Direct Into Project' link in money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I verify deal sponsor fund profile is set to private is not displayed
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
And I verify deal sponsor fund profile is set to private is not displayed
When I click on 'Find Now' button
And I logout RealConnex application
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify deal sponsor fund profile is set to private is not displayed
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Direct Into Project' link in money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I verify deal sponsor fund profile is set to private is not displayed
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
And I verify deal sponsor fund profile is set to private is not displayed
When I click on 'Find Now' button
And I logout RealConnex application

