Meta:
@storyType BQS

Narrative:
As a user
I Verify that when privacy is set to "Public" in "Company >> Privacy" page, users of all roles can view "Company" profile.

Scenario: 141180: Verify that when privacy is set to "Public" in "Company" page, all users can view Company profile.
When I update TestCaseId 141180
When I launch RealConnex application
And I enter email ID of user
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on COMPANY tab
And I click on public button in COMPANY tab
And I click on save button in company tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I enter user login details:
|Field|Value|
|EmailId|test12@yopmail.com|
|Password|test1234|
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Abtech' deal sponsor company name is displayed in search result
When I click on 'Abtech' deal sponsor company name in search result
And I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Deal Sponsor' link
And I click on 'GO' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Deal Sponsors'
And I verify 'Abtech' deal sponsor company name is displayed in search result
When I click on 'Abtech' deal sponsor company name in search result
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
And I verify 'Abtech' deal sponsor company name is displayed in search result
When I click on 'Abtech' deal sponsor company name in search result
And I click on 'Find Now' button
And I logout RealConnex application
And I enter user login details:
|Field|Value|
|EmailId|test13@yopmail.com|
|Password|test1234|
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Abtech' deal sponsor company name is displayed in search result
When I click on 'Abtech' deal sponsor company name in search result
And I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Deal Sponsor' link
And I click on 'GO' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Deal Sponsors'
And I verify 'Abtech' deal sponsor company name is displayed in search result
When I click on 'Abtech' deal sponsor company name in search result
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
And I verify 'Abtech' deal sponsor company name is displayed in search result
When I click on 'Abtech' deal sponsor company name in search result
And I click on 'Find Now' button
And I logout RealConnex application
And I enter user login details:
|Field|Value|
|EmailId|test14@yopmail.com|
|Password|test1234|
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Abtech' deal sponsor company name is displayed in search result
When I click on 'Abtech' deal sponsor company name in search result
And I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Deal Sponsor' link
And I click on 'GO' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Deal Sponsors'
And I verify 'Abtech' deal sponsor company name is displayed in search result
When I click on 'Abtech' deal sponsor company name in search result
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
And I verify 'Abtech' deal sponsor company name is displayed in search result
When I click on 'Abtech' deal sponsor company name in search result
And I click on 'Find Now' button
And I logout RealConnex application
And I enter user login details:
|Field|Value|
|EmailId|test15@yopmail.com|
|Password|test1234|
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Abtech' deal sponsor company name is displayed in search result
When I click on 'Abtech' deal sponsor company name in search result
And I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Deal Sponsor' link
And I click on 'GO' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Deal Sponsors'
And I verify 'Abtech' deal sponsor company name is displayed in search result
When I click on 'Abtech' deal sponsor company name in search result
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
And I verify 'Abtech' deal sponsor company name is displayed in search result
When I click on 'Abtech' deal sponsor company name in search result
And I click on 'Find Now' button
And I logout RealConnex application




