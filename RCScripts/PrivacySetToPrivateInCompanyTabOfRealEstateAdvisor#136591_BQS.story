Meta:
@storyType BQS

Narrative:
As a user
I Verify that when "Property Service Provider" user sets privacy to "Private" in "Company >> Privacy" page, only users who have been granted permission can view Company profile.

Scenario: 136591 : Verify that property service provider user privacy is set to "Private" in "Company" page can be viewed to user who have permission
When I update TestCaseId 136591
When I update TestCaseName Privacy Set To Private In Company Tab Of Real Estate Advisor
When I launch RealConnex application
And I enter real estate advisor email ID whose privacy set to private
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on COMPANY tab
And I select private radio button
And I click on save button in COMPANY tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on Not a Member? Join Now for Free! link in registration page
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
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter real estate advisor company name
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter real estate advisor,broker email ID whose privacy set to private in yopmail
And I click on check inbox button
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I enter real estate advisor email ID whose privacy set to private
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
And I enter newly created 'Lender' email ID
And I enter Password
And I click on login button
Then I verify the real estate advisor company profile is displayed
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'ELee Company' real estate advisor company name is displayed in search result
When I click on 'ELee Company' real estate advisor company name in search result
And I click on 'Find Now' button
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'GO' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
And I verify 'ELee Company' real estate advisor company name is displayed in search result
When I click on 'ELee Company' real estate advisor company name in search result
And I click on 'Find Now' button
And I logout RealConnex application
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify real estate advisor company whose profile is set private is not displayed
When I click on 'Find Now' button
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'GO' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
And I verify real estate advisor company whose profile is set private is not displayed
When I click on 'Find Now' button
And I logout RealConnex application
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify real estate advisor company whose profile is set private is not displayed
When I click on 'Find Now' button
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'GO' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
And I verify real estate advisor company whose profile is set private is not displayed
When I click on 'Find Now' button
And I logout RealConnex application
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify real estate advisor company whose profile is set private is not displayed
When I click on 'Find Now' button
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'GO' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
And I verify real estate advisor company whose profile is set private is not displayed
When I click on 'Find Now' button
And I logout RealConnex application




