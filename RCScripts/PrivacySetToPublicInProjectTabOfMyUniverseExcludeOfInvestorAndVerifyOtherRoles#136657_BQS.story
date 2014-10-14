Meta:
@storyType BQS

Narrative:
As a user
I Verify that projects of other role users except Investors can be viewed.

Scenario: 136657 : Verify that other role user except investor can view project profile
When I update TestCaseId 136657
When I update TestCaseName Verify that projects of other role users except Investors can be viewed.
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
And I click on exclude radio button
And I select public option in drop down
And I select investor check box in my universe exclude
And I select sub role field of investor in my universe exclude
And I select advisor sub role option in my universe exclude
And I set the value in deal/fund size field of investor in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on funds of the investor in my universe include
Then I verify that public option is selected
And I verify investor check box is selected
And I verify advisor subrole is selected
And I verify deal/fund size of the investor i.e 9 million to 10 million is set
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with role as investor and sub role as advisor
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find field of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify investor fund whose profile privacy is set to exclude of my universe is not displayed
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
Then I verify investor fund whose profile privacy is set to exclude of my universe is not displayed
When I click on 'Find Now' button
And I logout RealConnex application
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
Then I should see 'Investments' in find field of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify 'LY Fund' of investor fund name who has set privacy in exclude of my universe is displayed
When I click 'LY Fund' of investor fund name who has set privacy in exclude of my universe
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
Then I verify 'LY Fund' of investor fund name who has set privacy in exclude of my universe is displayed
When I click 'LY Fund' of investor fund name who has set privacy in exclude of my universe
When I click on 'Find Now' button
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find field of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify 'LY Fund' of investor fund name who has set privacy in exclude of my universe is displayed
When I click 'LY Fund' of investor fund name who has set privacy in exclude of my universe
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
Then I verify 'LY Fund' of investor fund name who has set privacy in exclude of my universe is displayed
When I click 'LY Fund' of investor fund name who has set privacy in exclude of my universe
When I click on 'Find Now' button
And I logout RealConnex application
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
Then I should see 'Investments' in find field of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of investor fund whose privacy is set to private in my universe include
Then I verify 'LY Fund' of investor fund name who has set privacy in exclude of my universe is displayed
When I click 'LY Fund' of investor fund name who has set privacy in exclude of my universe
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
Then I verify 'LY Fund' of investor fund name who has set privacy in exclude of my universe is displayed
When I click 'LY Fund' of investor fund name who has set privacy in exclude of my universe
When I click on 'Find Now' button
And I logout RealConnex application

