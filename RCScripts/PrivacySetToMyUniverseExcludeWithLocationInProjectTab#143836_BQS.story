Meta:
@storyType BQS

Narrative:
As a user
I Select “Deal Sponsor” role and verify that only the user with Deal sponsor role cannot access “Project” profile.

Scenario: 143836 : Verify that only deal sponsor user cannot access project when deal sponsor user is excluded in my universe
When I update TestCaseId 143836
When I update TestCaseName Select “Deal Sponsor” role and verify that only the user with Deal sponsor role cannot access “Project” profile.
When I launch RealConnex application
And I enter deal sponsor email ID of user who set the privacy in my universe include as public in project tab
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on PROJECTS tab
And I click on projects of the deal sponsor in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on projects of the deal sponsor in my universe include
And I click on my universe radio button
And I click on exclude radio button
And I select the location of the user in my universe exclude
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on projects of the deal sponsor in my universe include
Then I verify the data in location field of my universe exclude
When I return back to the searched page
And I click on funds of the deal sponsor in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on funds of the deal sponsor in my universe include
And I click on my universe radio button
And I click on exclude radio button
And I select the location of the user in my universe exclude
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on funds of the deal sponsor in my universe include
Then I verify the data in location field of my universe exclude
When I logout RealConnex application
And I enter email ID of user with role as deal sponsor and sub role as developer
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
Then I verify deal sponsor project whose profile is set public in include of my universe is not displayed
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
Then I verify deal sponsor fund whose profile is set public in include of my universe is not displayed
When I logout RealConnex application
And I enter deal sponsor email ID with different location
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
Then I verify 'Sharon Project' deal sponsor project name who has set privacy to public in include of my universe is displayed
When I click 'Sharon Project' deal sponsor project name who has set privacy to public in include of my universe
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
Then I verify 'Ross Fund' deal sponsor fund name who has set privacy to public in include of my universe is displayed
When I click 'Ross Fund' deal sponsor project name who has set privacy to public in include of my universe
When I logout RealConnex application
And I enter investor with different location
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
Then I verify 'Sharon Project' deal sponsor project name who has set privacy to public in include of my universe is displayed
When I click 'Sharon Project' deal sponsor project name who has set privacy to public in include of my universe
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
Then I verify 'Ross Fund' deal sponsor fund name who has set privacy to public in include of my universe is displayed
When I click 'Ross Fund' deal sponsor project name who has set privacy to public in include of my universe
When I logout RealConnex application
And I enter lender email ID with different location
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
Then I verify 'Sharon Project' deal sponsor project name who has set privacy to public in include of my universe is displayed
When I click 'Sharon Project' deal sponsor project name who has set privacy to public in include of my universe
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
Then I verify 'Ross Fund' deal sponsor fund name who has set privacy to public in include of my universe is displayed
When I click 'Ross Fund' deal sponsor project name who has set privacy to public in include of my universe
When I logout RealConnex application
And I enter real estate advisor with different location
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
Then I verify 'Sharon Project' deal sponsor project name who has set privacy to public in include of my universe is displayed
When I click 'Sharon Project' deal sponsor project name who has set privacy to public in include of my universe
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
Then I verify 'Ross Fund' deal sponsor fund name who has set privacy to public in include of my universe is displayed
When I click 'Ross Fund' deal sponsor project name who has set privacy to public in include of my universe
When I logout RealConnex application








