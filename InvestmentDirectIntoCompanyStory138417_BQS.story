Meta:
@storyType BQS

Narrative:
I verify that companies of user with role deal sponsor but not fund sponsor
are retrieved in "Investment >> Direct Into Project" search

Scenario: TC 138417 : Verify company of deal sponsor role is retrieved when search is performed
When I update TestCaseId 138417
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
And I select the value in deal size
Then I verify the company name of investment direct into is displayed
When I clear value in deal size
And I click on investor type field
And I select advisor option in investor type field
Then I verify the company name of investment direct into is displayed
When I click on investor type field
And I clear advisor option in investor type field
And I click route to sponsor field
And I select direct only option in route to sponsor drop down
Then I verify the company name of investment direct into is displayed
When I click route to sponsor field
And I clear direct only option in route to sponsor drop down
And I click on asset interest
And I click on asset type field of deal sponsor search
And I select office in the asset type drop down list
Then I verify the company name of investment direct into is displayed
When I click on asset type field of deal sponsor search
And I clear asset type drop down
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify the company name of investment direct into is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile field in project drop down
And I click on deal stage drop down field
And I select owned option in deal stage drop down field
Then I verify the company name of investment direct into is displayed
When I click on deal stage drop down field
And I clear owned option in deal stage drop down field
And I click on asset strategy drop down
And I select acquisition option in asset strategy field
Then I verify the company name of investment direct into is displayed
When I click on asset strategy drop down
And I clear acquisition option in asset strategy field
And I check the syndicating check field
Then I verify the company name of investment direct into is displayed
When I un check the syndicating check field
And I logout from RealConnex application