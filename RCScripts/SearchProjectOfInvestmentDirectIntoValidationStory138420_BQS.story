Meta:
@storyType BQS

Narrative:
As a user
I verify that projects other than "Project" and "Listing" project
are not retrieved in "Investment >> Direct Into Project" search

Scenario: TC 138420: Verify projects other than project and listing are not retrieved in search
When I update TestCaseId 138420
When I update TestCaseName Search Project Of Investment Direct Into Validation
When I launch RealConnex application
And I enter user email ID
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
When I click on investment direct into service project
And I return back to the searched page
When I click on investment direct into listing project
And I return back to the searched page
When I click on investment direct into company
And I return back to the searched page
And I select value in investment amount slider field
Then I verify 'ProjectD' and 'ProjectL1' of investments is displayed
And I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear value in investment amount slider field
And I select the value of deal size field
Then I verify 'ProjectD' and 'ProjectL1' of investments is displayed
And I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear the value of deal size field
And I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'GO' button
And I click investing as drop down field
And I select general partner option in investing as drop down field
Then I verify 'Project Deal' and 'List Project' of investments is displayed
And I verify 'ProjectD' and 'ProjectL1' of investments is not displayed
When I click investing as drop down field
And I clear general partner option in investing as drop down field
And I click on asset interest
And I click on asset type field
And I select office in the asset type drop down list
Then I verify 'Project Deal' and 'List Project' of investments is displayed
And I verify 'ProjectD' and 'ProjectL1' of investments is not displayed
When I click on asset type field
And I clear asset type drop down
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify 'Project Deal' and 'List Project' of investments is displayed
And I verify 'ProjectD' and 'ProjectL1' of investments is displayed
When I click on 'RiskProfile' drop down field
And I clear core in risk profile drop down
And I click on 'RiskProfile' drop down field
And I select core plus option in risk profile
Then I verify 'Project Deal' and 'List Project' of investments is not displayed
And I verify 'ProjectD' and 'ProjectL1' of investments is displayed
When I click on 'RiskProfile' drop down field
And I clear core plus option in risk profile
And I click on deal stage drop down field
And I select owned option in deal stage drop down field
Then I verify 'Project Deal' and 'List Project' of investments is displayed
And I verify 'ProjectD' and 'ProjectL1' of investments is not displayed
When I click on deal stage drop down field
And I clear owned option in deal stage drop down field
And I click on current asset status drop down field
And I select fully rented option in current asset status field
Then I verify 'Project Deal' and 'List Project' of investments is displayed
And I verify 'ProjectD' and 'ProjectL1' of investments is not displayed
When I click on current asset status drop down field
And I clear fully rented option in current asset status field
And I click on asset strategy drop down
And I select acquisition option in asset strategy field
Then I verify 'Project Deal' and 'List Project' of investments is displayed
And I verify 'ProjectD' and 'ProjectL1' of investments is not displayed
When I click on asset strategy drop down
And I clear acquisition option in asset strategy field
And I click on return profile
And I select COC percent value in return profile field
Then I verify 'ProjectD' and 'ProjectL1' of investments is displayed
And I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear COC percent value in return profile field
And I select IRR percent in return profile
Then I verify 'ProjectD' and 'ProjectL1' of investments is displayed
And I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear IRR percent in return profile
And I select ROE percent in return profile
Then I verify 'ProjectD' and 'ProjectL1' of investments is displayed
And I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear ROE percent in return profile
And I select CAP percent in return profile
Then I verify 'ProjectD' and 'ProjectL1' of investments is displayed
And I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear CAP percent in return profile
And I select holding min in return profile
Then I verify 'ProjectD' and 'ProjectL1' of investments is displayed
And I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear holding min in return profile
And I select holding max in return profile
Then I verify 'ProjectD' and 'ProjectL1' of investments is displayed
And I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear holding max in return profile
And I logout from RealConnex application








