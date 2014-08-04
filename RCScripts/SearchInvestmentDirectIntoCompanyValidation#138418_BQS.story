Meta:
@storyType BQS

Narrative:
As a user
I Verify that companies of users other than "Deal Sponsor" role but not "Fund Sponsor" sub-role
are not retrieved when "Investment >> Direct Into Project" search

Scenario: TC 138418: Verify companies of user other than deal sponsor role are not retrieved
When I update TestCaseId 138418
When I update TestCaseName Perform: "Investment >> Direct Into Project" search Verify that companies of users other than "Deal Sponsor" role but not "Fund Sponsor" sub-role are not retrieved.
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
When I select the value in deal size
Then I verify 'MARS' company name of investments is displayed
And I verify 'Patric' company name of investments is not displayed
When I clear value in deal size
And I click on investor type field
And I select advisor option in investor type field
Then I verify investments company name of 'Advisor' option is displayed
And I verify investments company name of 'Family Office' option is not displayed
When I click on investor type field
And I clear advisor option in investor type field
And I click route to sponsor field
And I select direct only option in route to sponsor drop down
Then I verify investments company name of 'Direct Only' option is displayed
And I verify investments company name of 'Brokers' option is not displayed
When I click route to sponsor field
And I clear direct only option in route to sponsor drop down
And I click on asset interest
And I click on asset type field
And I select office in the asset type drop down list
Then I verify investments company name of 'Office' option is displayed
And I verify investments company name of 'Mixed Use' option is not displayed
When I click on asset type field of deal sponsor search
And I clear asset type drop down
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify investments company name of 'Core' option is displayed
And I verify investments company name of 'CorePlus' option is displayed
When I click on 'RiskProfile' drop down field
And I clear core in risk profile drop down
And I click on 'RiskProfile' drop down field
And I select core plus option in risk profile
Then I verify investments company name of 'CorePlus' option is displayed
And I verify investments company name of 'Core' option is not displayed
When I click on 'RiskProfile' drop down field
And I clear core plus option in risk profile
And I click on deal stage drop down field
And I select owned option in deal stage drop down field
Then I verify investments company name of 'Owned' option is displayed
And I verify investments company name of 'Ready for Purchase' option is not displayed
When I click on deal stage drop down field
And I clear owned option in deal stage drop down field
And I click on asset strategy drop down
And I select acquisition option in asset strategy field
Then I verify investments company name of 'Acquisition' option is displayed
And I verify investments company name of 'Sale Leaseback' option is not displayed
When I click on asset strategy drop down
And I clear acquisition option in asset strategy field
And I logout from RealConnex application


