Meta:
@storyType BQS

Narrative:
As a user
I verify that companies of user other than "Investor" role
are not retrieved in "Investment >> Fund/Fund of Funds" search

Scenario: TC 138423 : Verify that companies other than investor role are not retrieved.
When I update TestCaseId 138423
When I update TestCaseName Search Investment Fund Company Validation
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'GO' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I click on fund of investor
And I return back to the searched page
And I click on fund of deal sponsor
And I return back to the searched page
And I click on company name of investment fund
And I return back to the searched page
And I click investing as drop down field
And I select co developer option in investing as drop down field
Then I verify 'NEPTUNE' company name of investments fund is displayed
And I verify 'Jupiter' company name of investments fund is not displayed
When I click investing as drop down field
And I clear co developer option in investing as drop down field
And I click on route to investment field
And I select intermediary option in route to investment field
Then I verify 'NEPTUNE' company name of investments fund is displayed
And I verify 'Jupiter' company name of investments fund is not displayed
When I click on route to investment field
And I clear intermediary option in route to investment field
And I click on fund strategy
And I click on asset type field
And I select solar option of asset type
Then I verify 'NEPTUNE' company name of investments fund is displayed
And I verify 'Jupiter' company name of investments fund is not displayed
When I click on asset type field
And I clear on solar option of asset type
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify 'NEPTUNE' company name of investments fund is displayed
And I verify 'Jupiter' company name of investments fund is displayed
When I click on 'RiskProfile' drop down field
And I clear core in risk profile drop down
And I click on 'RiskProfile' drop down field
And I select core plus option in risk profile
Then I verify 'NEPTUNE' company name of investments fund is not displayed
And I verify 'Jupiter' company name of investments fund is displayed
When I click on 'RiskProfile' drop down field
And I clear core plus option in risk profile
And I click on asset strategy drop down
And I select rezoning option in asset strategy
Then I verify 'NEPTUNE' company name of investments fund is displayed
And I verify 'Jupiter' company name of investments fund is not displayed
When I click on asset strategy drop down
And I clear rezoning option in asset strategy
And I check syndicators type check box
Then I verify 'NEPTUNE' company name of investments fund is displayed
And I verify 'Jupiter' company name of investments fund is not displayed
When I un check syndicators type check box
And I logout from RealConnex application






