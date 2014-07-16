Meta:
@storyType BQS

Narrative:
As a user
I Verify deal sponsor user selected "Fund Sponsor" are retrieved when
"Deal Sponsor>>Fund Sponsor" search is performed.

Scenario: TC 138393: Verify fund sponsor are displayed when search is performed
When I update TestCaseId 138393
When I update TestCaseName Search Users Of Fund Sponsor
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I select 'Fund Sponsor' link
And I click on 'GO' button
Then I verify the sub role type
And I verify 'Fund Sponsor' user is displayed
When I click on the verified fund sponsor name
And I return back to the searched page
Then I verify 'Fund Sponsor' company name is displayed
When I click on Fund Sponsor company name
And I return back to the searched page
And I click on asset experience
And I click on 'Asset Strategy' drop down field
And I click on land bank option in strategy type
Then I verify fund sponsor user is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy drop down field of fund sponsor
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I clear acquisition option in a strategy field of drop down list
And I click on 'Asset Strategy' drop down field
And I click on sale leaseback option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on stable income producing option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on quick flip option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on restructuring option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on recapitalization option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on land bank option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on change of use option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on development option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on platform build option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on pursuit option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on lease up option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on work out option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on restructuring corporate option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on public to private option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on rezoning option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on renovation option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on forward commitment option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on others option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on all option in strategy
Then I verify fund sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I clear all option in strategy
And I logout from RealConnex application