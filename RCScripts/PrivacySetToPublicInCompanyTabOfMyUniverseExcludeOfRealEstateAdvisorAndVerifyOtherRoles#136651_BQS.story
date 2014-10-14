Meta:
@storyType BQS

Narrative:
As a user
I Verify that companies of other role users except Property Service Provider can be view.

Scenario: 136651 : Verify that other role user except property service provider can view company profile
When I update TestCaseId 136651
When I update TestCaseName Verify that companies of other role users except Property Service Provider can be view.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user who set the privacy in my universe exclude
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
And I select public option in drop down
And I select real estate advisor check box in my universe exclude
And I select sub role field of real estate advisor in my universe exclude
And I select advisor sub role option in my universe exclude of real estate advisor
And I set the value in deal/fund size field of real estate advisor in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of COMPANY tab
Then I verify 'Privacy successfully saved' message is displayed
And I verify that private option is selected
And I verify real estate advisor subrole is selected
And I verify advisor subrole is selected in real estate advisor
And I verify deal/fund size of the real estate advisor i.e 11 million to 12 million is set
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to exclude in my universe
Then I verify 'EH Company' company name who has set privacy exclude in my universe is displayed
When I click 'EH Company' company name who has set privacy exclude in my universe is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to exclude in my universe
Then I verify 'EH Company' company name who has set privacy exclude in my universe is displayed
When I click 'EH Company' company name who has set privacy exclude in my universe is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to exclude in my universe
Then I verify 'EH Company' company name who has set privacy exclude in my universe is displayed
When I click 'EH Company' company name who has set privacy exclude in my universe is displayed
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to exclude in my universe
Then I verify 'EH Company' company name who has set privacy exclude in my universe is displayed
When I click 'EH Company' company name who has set privacy exclude in my universe is displayed
When I logout RealConnex application
