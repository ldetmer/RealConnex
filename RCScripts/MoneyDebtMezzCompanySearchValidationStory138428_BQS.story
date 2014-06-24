Meta:
@storyType BQS

Narrative:
As a user
I Verify that companies other than users with "Lender" role and "Mezz" Loan type
option selected are retrieved in "Money >> Debt >> Mezz" search

Scenario: TC 138428 : Verify that companies other than user with lender role and mezz loan type are retrieved
When I update TestCaseId 138428
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
And I verify 'MAKC' company name is not displayed in money debt mezz search
When I clear value of term
And I set value of term field
Then I verify 'PICTURES' company name is displayed in money debt mezz search
And I verify 'MAKC' company name is not displayed in money debt mezz search
When I clear value of term field
And I click on lender characteristics field
And I click lender profile in lender characteristics field
And I select bank option in lender characteristics
Then I verify 'PICTURES' company name is displayed in money debt mezz search
And I verify 'MAKC' company name is not displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select bank and family option in lender characteristics
Then I verify 'PICTURES' company name is displayed in money debt mezz search
And I verify 'MAKC' company name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I clear bank and family option in lender characteristics
And I click on route to lender in lender characteristics field
And I select brokers in route to lender field
Then I verify 'PICTURES' company name is displayed in money debt mezz search
And I verify 'MAKC' company name is not displayed in money debt mezz search
When I click on route to lender in lender characteristics field
And I select brokers and intermediary in route to lender field
Then I verify 'PICTURES' company name is displayed in money debt mezz search
And I verify 'MAKC' company name is displayed in money debt mezz search
When I click on route to lender in lender characteristics field
And I clear brokers and intermediary in route to lender field