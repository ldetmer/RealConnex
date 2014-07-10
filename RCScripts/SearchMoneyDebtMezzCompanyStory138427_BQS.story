Meta:
@storyType BQS

Narrative:
As a user
I Verify that companies of users with "Lender" role and "Mezz" Loan type
option selected are retrieved in "Money >> Debt >> Mezz" search

Scenario: TC 138427 : Verify that companies of user with lender role and mezz loan type are retrieved
When I update TestCaseId 138427
When I update TestCaseName Search Money Debt Mezz Company
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'GO' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
When I set value of term
Then I verify 'PICTURES' company name is displayed in money debt mezz search
When I clear value of term
And I click on lender characteristics field
And I click lender profile in lender characteristics field
And I select bank option in lender characteristics
Then I verify 'PICTURES' company name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I clear bank option in lender characteristics
And I click on route to lender in lender characteristics field
And I select brokers in route to lender field
Then I verify 'PICTURES' company name is displayed in money debt mezz search
When I click on route to lender in lender characteristics field
And I clear brokers in route to lender field
