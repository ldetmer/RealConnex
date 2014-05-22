Meta:
@storyType BQS

Narrative:
As a user
I verify that project type of "Project" and "Listing" projects
are retrieved in "Investment >> Direct Into Project" search

Scenario: TC 138419: Verify service project is retrieved when Advisor search is performed
When I update TestCaseId 138419
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
When I click on investment direct into company
And I click on 'Find Now' button
When I click on investment direct into service project
And I click on 'Find Now' button
When I click on investment direct into listing project
And I click on 'Find Now' button
And I select value in investment amount slider
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear value in investment amount slider
And I select the value of deal size
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear the value of deal size
And I click investing as drop down field
And I select general partner option in investing as drop down field
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I click investing as drop down field
And I clear general partner option in investing as drop down field
And I click on investor type field
And I select advisor option in investor type field
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I click on investor type field
And I clear advisor option in investor type field
And I click on asset interest
And I click on asset type field of deal sponsor search
And I select office in the asset type drop down list
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I click on asset type field of deal sponsor search
And I clear asset type drop down
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile field in project drop down
And I click on current asset status drop down field
And I select fully rented option in current asset status field
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I click on current asset status drop down field
And I clear fully rented option in current asset status field
And I click on asset strategy drop down
And I select acquisition option in asset strategy field
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I click on asset strategy drop down
And I clear acquisition option in asset strategy field
And I check the syndicating check field
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I un check the syndicating check field
And I click on return profile
And I select COC Percent value in return profile
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear COC Percent value in return profile
And I click Leveraged check box
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear Leveraged check box
And I select IRR Percent value in return profile
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear IRR Percent value in return profile
And I select ROE Percent value in return profile
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear ROE Percent value in return profile
And I click Actual check box
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear Actual check box
And I select CAP Percent value in return profile
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear CAP Percent value in return profile
And I click Pro Forma check box
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear Pro Forma check box
And I select holding min value in return profile
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear holding min value in return profile
And I select holding max value in return profile
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear holding max value in return profile
And I logout from RealConnex application