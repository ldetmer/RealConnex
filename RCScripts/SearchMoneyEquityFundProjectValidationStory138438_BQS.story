Meta:
@storyType BQS

Narrative:
As a user
I Verify that other than Deal Sponsor "Fund" and Investor "Fund" projects
are retrieved when "Money >> Equity" search

Scenario: TC 138438 : Verify that other than Deal Sponsor "Fund" and Investor "Fund" projects are not retrieved
When I update TestCaseId 138438
When I update TestCaseName Search Money Equity Fund Project Validation
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
Then I should see 'Money' in find of money search
And I should see 'Preferred Equity' in type of money search
And I should see 'Fund' in kind of money search
When I set value for fund size field
Then I verify 'Gibb FUND' project of investor is displayed
And I verify 'MAZE' project of deal sponsor is displayed
And I verify 'NICK FUND' project of investor is not displayed
And I verify 'Sheryl FUND' project of deal sponsor is not displayed
When I clear value for fund size field
And I set the value of investment amount
Then I verify 'Gibb FUND' project of investor is displayed
And I verify 'MAZE' project of deal sponsor is displayed
And I verify 'NICK FUND' project of investor is not displayed
And I verify 'Sheryl FUND' project of deal sponsor is not displayed
When I clear the value of investment amount
And I set the value for fund term field
Then I verify 'Gibb FUND' project of investor is displayed
And I verify 'NICK FUND' project of investor is not displayed
When I clear the value for fund term field
And I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Preferred' link
And I click on 'Fund' of money search
And I click on 'GO' button
When I click on fund strategy
And I click on asset type field
And I select office in the asset type drop down list
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
And I verify 'Gibb FUND' project of investor is not displayed
And I verify 'MAZE' project of deal sponsor is not displayed
When I click on asset type field
And I clear asset type drop down
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
And I verify 'Gibb FUND' project of investor is not displayed
And I verify 'MAZE' project of deal sponsor is not displayed
When I click on 'RiskProfile' drop down field
And I select core and core plus in risk profile
Then I verify 'Gibb FUND' project of investor is displayed
And I verify 'MAZE' project of deal sponsor is displayed
And I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile field
And I check the syndicating check field
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Gibb FUND' project of investor is not displayed
When I un check the syndicating check field
And I click on target return
And I select COC percent value in return profile field
Then I verify 'Gibb FUND' project of investor is displayed
And I verify 'MAZE' project of deal sponsor is displayed
And I verify 'NICK FUND' project of investor is not displayed
And I verify 'Sheryl FUND' project of deal sponsor is not displayed
When I clear COC percent value in return profile field
And I select IRR percent in return profile
Then I verify 'Gibb FUND' project of investor is displayed
And I verify 'MAZE' project of deal sponsor is displayed
And I verify 'NICK FUND' project of investor is not displayed
And I verify 'Sheryl FUND' project of deal sponsor is not displayed
When I clear IRR percent in return profile
And I select ROE percent in return profile
Then I verify 'Gibb FUND' project of investor is displayed
And I verify 'MAZE' project of deal sponsor is displayed
And I verify 'NICK FUND' project of investor is not displayed
And I verify 'Sheryl FUND' project of deal sponsor is not displayed
When I clear ROE percent in return profile
And I select CAP percent in return profile
Then I verify 'Gibb FUND' project of investor is displayed
And I verify 'MAZE' project of deal sponsor is displayed
And I verify 'NICK FUND' project of investor is not displayed
And I verify 'Sheryl FUND' project of deal sponsor is not displayed
When I clear CAP percent in return profile
And I select holding min in return profile
Then I verify 'Gibb FUND' project of investor is displayed
And I verify 'MAZE' project of deal sponsor is displayed
And I verify 'NICK FUND' project of investor is not displayed
And I verify 'Sheryl FUND' project of deal sponsor is not displayed
When I clear holding min in return profile
And I select holding max in return profile
Then I verify 'Gibb FUND' project of investor is displayed
And I verify 'MAZE' project of deal sponsor is displayed
And I verify 'NICK FUND' project of investor is not displayed
And I verify 'Sheryl FUND' project of deal sponsor is not displayed
When I clear holding max in return profile
And I click on investor characteristics field
And I click on investor type field in investor characteristics
And I select advisor option in investor type drop down
Then I verify 'Sheryl FUND' project of deal sponsor is displayed
And I verify 'MAZE' project of deal sponsor is not displayed
When I click on investor type field in investor characteristics
And I clear advisor option in investor type drop down
When I click on investment status field
And I select general partner option in investment status
Then I verify 'Sheryl FUND' project of deal sponsor is displayed
And I verify 'MAZE' project of deal sponsor is not displayed
When I click on investment status field
And I clear general partner option in investment status
And I click route to investor field
And I select direct only option in route to investor
Then I verify 'Sheryl FUND' project of deal sponsor is displayed
And I verify 'MAZE' project of deal sponsor is not displayed
When I click route to investor field
And I clear direct only option in route to investor
And I logout from RealConnex application