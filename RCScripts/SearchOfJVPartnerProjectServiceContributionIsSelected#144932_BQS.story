Meta:
@storyType BQS

Narrative:
As a user
Perform "JV Partner >> Services" search and Verify that projects which has "Services" contribution selected in JV Partner requirement are retrieved.

Scenario: TC 144932: Verify that projects which has land contribution selected in JV Partner requirement are retrieved.
When I update TestCaseId 144932
When I update TestCaseName Perform "JV Partner >> Services" search and Verify that projects which has "Services" contribution selected in JV Partner requirement are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for jv partner search
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'JV Partner' link
And I click on 'Services' link
And I click on 'View Search Results' button
Then I should see 'JV Partners' as find in search option
And I should see 'Service' as looking for in search option
And I verify 'Marten Fund' of deal sponsor fund name is displayed in jv partner service search
And I verify 'Marten Project' of deal sponsor project name is displayed in jv partner service search
And I verify 'Wilson Fund' of investor fund name is displayed in jv partner service search
And I verify 'JOne Loan' of lender loan name is displayed in jv partner service search
And I verify 'JOne Mezz' of lender mezz name is displayed in jv partner service search
And I verify 'Taylor Listing' of real estate advisor listing name is displayed in jv partner service search
And I verify 'Taylor Service' of real estate advisor service name is displayed in jv partner service search
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate user email id who has created the jv requirement
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on Activities in side pane
And I click on your postings link
And I click on laven service of real estate advisor
And I get the number of matches count
When I click on matches
Then I should see 'JV Partners' as find in search option
And I should see 'Services' as looking for in search option
When I get the number of matches in the search result
Then I verify that services is selected in your contribution drop down
And I verify 'Marten Fund' deal sponsor fund name is displayed when click on matches of jv partner service search
And I verify 'Marten Project' of deal sponsor project name is displayed when click on matches of jv partner services search
And I verify 'Wilson Fund' of investor fund name is displayed when click on matches of jv partner services search
And I verify 'JOne Loan' of lender loan name is displayed when click on matches of jv partner service search
And I verify 'JOne Mezz' of lender mezz name is displayed when click on matches of jv partner service search
And I verify 'Laven Listing' of real estate advisor listing name is displayed when click on matches of jv partner service search
And I verify 'Laven Service' of real estate advisor service name is displayed when click on matches of jv partner service search
And I verify the count of matches in search result and profile of user
When I logout RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for jv partner search
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'JV Partner' link
And I click on 'Land' link
And I click on 'View Search Results' button
Then I should see 'JV Partners' as find in search option
And I should see 'Land' as looking for in search option
When I click on route to partnership drop down
And I select principal option in route to partnership field
Then I verify 'Marten Fund' of deal sponsor fund is displayed in jv partner result in jv partner service search
And I verify 'Marten Project' of deal sponsor project name is displayed in jv partner result in jv partner service search
And I verify 'Wilson Fund' of investor fund name is displayed in jv partner result in jv partner service search
And I verify 'JOne Loan' of lender loan name is displayed in jv partner result in jv partner service search
And I verify 'JOne Mezz' of lender mezz name is displayed in jv partner result in jv partner service search
And I verify 'Laven Listing' of real estate advisor listing name is displayed in jv partner result in jv partner service search
And I verify 'Laven Service' of real estate advisor service name is displayed in jv partner result in jv partner service search
When I click on route to partnership drop down
And I clear principal option in route to partnership field
And I click on your contribution drop down
And I select service option in your contribution field
Then I verify 'Marten Fund' of deal sponsor fund is displayed in jv partner result in jv partner service search
And I verify 'Marten Project' of deal sponsor project name is displayed in jv partner result in jv partner service search
And I verify 'Wilson Fund' of investor fund name is displayed in jv partner result in jv partner service search
And I verify 'JOne Loan' of lender loan name is displayed in jv partner result in jv partner service search
And I verify 'JOne Mezz' of lender mezz name is displayed in jv partner result in jv partner service search
And I verify 'Laven Listing' of real estate advisor listing name is displayed in jv partner result in jv partner service search
And I verify 'Laven Service' of real estate advisor service name is displayed in jv partner result in jv partner service search
When I click on your contribution drop down
And I clear service option in your contribution field
And I click on asset type drop down
And I select health care option in asset type drop down
Then I verify 'Marten Fund' of deal sponsor fund is displayed in jv partner result in jv partner service search
And I verify 'Marten Project' of deal sponsor project name is displayed in jv partner result in jv partner service search
And I verify 'Wilson Fund' of investor fund name is displayed in jv partner result in jv partner service search
And I verify 'JOne Loan' of lender loan name is displayed in jv partner result in jv partner service search
And I verify 'JOne Mezz' of lender mezz name is displayed in jv partner result in jv partner service search
And I verify 'Laven Listing' of real estate advisor listing name is displayed in jv partner result in jv partner service search
And I verify 'Laven Service' of real estate advisor service name is displayed in jv partner result in jv partner service search
When I click on asset type drop down
And I clear health care option in asset type drop down
And I click on risk profile drop down
And I select development option in risk profile drop down field
Then I verify 'Marten Fund' of deal sponsor fund is displayed in jv partner result in jv partner service search
And I verify 'Marten Project' of deal sponsor project name is displayed in jv partner result in jv partner service search
And I verify 'Wilson Fund' of investor fund name is displayed in jv partner result in jv partner service search
And I verify 'JOne Loan' of lender loan name is displayed in jv partner result in jv partner service search
And I verify 'JOne Mezz' of lender mezz name is displayed in jv partner result in jv partner service search
And I verify 'Laven Listing' of real estate advisor listing name is displayed in jv partner result in jv partner service search
And I verify 'Laven Service' of real estate advisor service name is displayed in jv partner result in jv partner service search
When I click on risk profile drop down
And I clear development option in risk profile drop down field
And I click on deal stage drop down in search
And I select plans approved option in deal stage drop down of jv partner search
Then I verify 'Marten Fund' of deal sponsor fund is displayed in jv partner result in jv partner service search
And I verify 'Marten Project' of deal sponsor project name is displayed in jv partner result in jv partner service search
And I verify 'Wilson Fund' of investor fund name is displayed in jv partner result in jv partner service search
And I verify 'JOne Loan' of lender loan name is displayed in jv partner result in jv partner service search
And I verify 'JOne Mezz' of lender mezz name is displayed in jv partner result in jv partner service search
And I verify 'Laven Listing' of real estate advisor listing name is displayed in jv partner result in jv partner service search
And I verify 'Laven Service' of real estate advisor service name is displayed in jv partner result in jv partner service search
When I click on deal stage drop down in search
And I clear plans approved option in deal stage drop down of jv partner search
And I click on current asset status drop down
And I select vacant structure option in current asset status drop down
Then I verify 'Marten Fund' of deal sponsor fund is displayed in jv partner result in jv partner service search
And I verify 'Marten Project' of deal sponsor project name is displayed in jv partner result in jv partner service search
And I verify 'Wilson Fund' of investor fund name is displayed in jv partner result in jv partner service search
And I verify 'JOne Loan' of lender loan name is displayed in jv partner result in jv partner service search
And I verify 'JOne Mezz' of lender mezz name is displayed in jv partner result in jv partner service search
And I verify 'Laven Listing' of real estate advisor listing name is displayed in jv partner result in jv partner service search
And I verify 'Laven Service' of real estate advisor service name is displayed in jv partner result in jv partner service search
When I click on current asset status drop down
And I clear vacant structure option in current asset status drop down
And I select asset strategy drop down
And I select pursuit option in asset strategy drop down
Then I verify 'Marten Fund' of deal sponsor fund is displayed in jv partner result in jv partner service search
And I verify 'Marten Project' of deal sponsor project name is displayed in jv partner result in jv partner service search
And I verify 'Wilson Fund' of investor fund name is displayed in jv partner result in jv partner service search
And I verify 'JOne Loan' of lender loan name is displayed in jv partner result in jv partner service search
And I verify 'JOne Mezz' of lender mezz name is displayed in jv partner result in jv partner service search
And I verify 'Laven Listing' of real estate advisor listing name is displayed in jv partner result in jv partner service search
And I verify 'Laven Service' of real estate advisor service name is displayed in jv partner result in jv partner service search
When I select asset strategy drop down
And I clear pursuit option in asset strategy drop down
And I logout RealConnex application


