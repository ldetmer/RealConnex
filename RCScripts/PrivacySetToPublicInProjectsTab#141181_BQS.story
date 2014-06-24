Meta:
@storyType BQS

Narrative:
As a user
I Verify that when privacy is set to "Public" for a project in "Project" page, users of all roles can view "Project" profile.

Scenario: 141181 : Verify that when privacy is set to "Public" for project in "Project" page, all users can view Project profile.
When I update TestCaseId 141181
When I launch RealConnex application
And I enter email ID of user
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on PROJECTS tab
And I click on projects of the deal sponsor
And I click on public button of project of deal sponsor
And I click on save button in projects tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on funds of the deal sponsor
And I click on public button of fund of deal sponsor
And I click on save button in projects tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I enter user login details:
|Field|Value|
|EmailId|test12@yopmail.com|
|Password|test1234|
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
And I verify 'Tech Project' deal sponsor project name is displayed in search result
When I click on 'Tech Project' deal sponsor project name in search result
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify 'Tech Fund' deal sponsor fund name is displayed in search result
When I click on 'Tech Fund' deal sponsor fund name in search result
And I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
And I verify 'Tech Fund' deal sponsor fund name is displayed in search result
When I click on 'Tech Fund' deal sponsor fund name in search result
And I click on 'Find Now' button
When I logout RealConnex application
And I enter user login details:
|Field|Value|
|EmailId|test13@yopmail.com|
|Password|test1234|
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
And I verify 'Tech Project' deal sponsor project name is displayed in search result
When I click on 'Tech Project' deal sponsor project name in search result
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify 'Tech Fund' deal sponsor fund name is displayed in search result
When I click on 'Tech Fund' deal sponsor fund name in search result
And I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
And I verify 'Tech Fund' deal sponsor fund name is displayed in search result
When I click on 'Tech Fund' deal sponsor fund name in search result
And I click on 'Find Now' button
When I logout RealConnex application
And I enter user login details:
|Field|Value|
|EmailId|test14@yopmail.com|
|Password|test1234|
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
And I verify 'Tech Project' deal sponsor project name is displayed in search result
When I click on 'Tech Project' deal sponsor project name in search result
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify 'Tech Fund' deal sponsor fund name is displayed in search result
When I click on 'Tech Fund' deal sponsor fund name in search result
And I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
And I verify 'Tech Fund' deal sponsor fund name is displayed in search result
When I click on 'Tech Fund' deal sponsor fund name in search result
And I click on 'Find Now' button
When I logout RealConnex application
And I enter user login details:
|Field|Value|
|EmailId|test15@yopmail.com|
|Password|test1234|
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
And I verify 'Tech Project' deal sponsor project name is displayed in search result
When I click on 'Tech Project' deal sponsor project name in search result
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify 'Tech Fund' deal sponsor fund name is displayed in search result
When I click on 'Tech Fund' deal sponsor fund name in search result
And I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
And I verify 'Tech Fund' deal sponsor fund name is displayed in search result
When I click on 'Tech Fund' deal sponsor fund name in search result
And I click on 'Find Now' button
When I logout RealConnex application

