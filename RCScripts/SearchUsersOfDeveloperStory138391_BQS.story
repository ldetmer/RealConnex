Meta:
@storyType BQS

Narrative:
As a user
I Verify users of "Developer" sub-role are retrieved when
"Developer/Deal Sponsor>>Developer" search is performed.

Scenario: TC 138391: Verify developer are displayed when search is performed
When I update TestCaseId 138391
When I update TestCaseName Search Users Of Developer
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
And I click on close tutorial field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Developer' link
And I click on 'GO' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Developer'
When I click on verified developer name
And I return back to the searched page
Then I verify 'Developer' company name is displayed
When I click on Developer company name
And I return back to the searched page
And I click on asset experience
And I click on 'Asset Strategy' drop down field
And I select sale and leaseback option in strategy drop down list
Then I verify 'Developer' name is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy of asset drop down
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I clear acquisition option in a strategy field of drop down list
And I click on 'Asset Strategy' drop down field
And I click on sale leaseback option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on stable income producing option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on quick flip option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on restructuring option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on recapitalization option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on land bank option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on change of use option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on development option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on platform build option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on pursuit option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on lease up option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on work out option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on restructuring corporate option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on public to private option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on rezoning option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on renovation option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on forward commitment option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on others option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on all option in strategy
Then I verify developer user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I clear all option in strategy
And I logout from RealConnex application
