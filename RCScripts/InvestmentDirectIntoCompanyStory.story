Meta:
@storyType BQS

Narrative:
As a user
I verify that companies of user with deal sponsor role
are retrieved in "Investment >> Direct Into Project" search

Scenario: TC 138417 : Verify service project is retrieved when Advisor search is performed
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
When I click on investment banker company
And I click on 'Find Now' button
When I click on investment banker project
And I click on 'Find Now' button
When I click on investment banker listing
And I click on 'Find Now' button
When I enter deal size
Then I verify the company name of investment banker is displayed
When I clear deal stage field of investment banker
When I enter investment amount fields
Then I verify the company name of investment banker is displayed
When I clear investment amount field
And I click Project And Strategy Field of investment banker
And I click Asset Type of investment banker
And I select Office Asset Type in investment banker
Then I verify the company name of investment banker is displayed
When I click Asset Type of investment banker
And I clear Office Of Asset Type
And I click Strategy Field
And I select Buy Land of strategy field
Then I verify the company name of investment banker is displayed
When I click Strategy Field
And I clear Buy Land of strategy field
And I click Return Profile
And I enter Values Cash On Cash
And I close Return Profile
Then I verify the company name of investment banker is displayed
When I click Return Profile
And I clear Values Cash On Cash
And I close Return Profile
And I click Return Profile
And I enter Capital Returns
And I close Return Profile
Then I verify the company name of investment banker is displayed
When I click Return Profile
And I clear Capital Returns
And I close Return Profile
And I click Return Profile
And I enter Capital Returns ROE
And I close Return Profile
Then I verify the company name of investment banker is displayed
When I click Return Profile
And I clear Capital Returns ROE
And I close Return Profile
And I click Return Profile
And I enter CAP
And I close Return Profile
Then I verify the company name of investment banker is displayed
When I click Return Profile
And I clear CAP
And I close Return Profile
And I click Return Profile
And I enter Holding Min
And I close Return Profile
Then I verify the company name of investment banker is displayed
When I click Return Profile
And I clear Holding Min
And I close Return Profile
And I click Return Profile
And I enter Holding Max
And I close Return Profile
Then I verify the company name of investment banker is displayed
When I click Return Profile
And I clear Holding Max
And I close Return Profile
And I click Financial
When I enter hold period
Then I verify the company name of investment banker is displayed
When I clear hold period
And I click Deal Stage of Equity Type
And I select Owned of Equity Type
Then I verify the company name of investment banker is displayed
When I click Deal Stage of Equity Type
And I clear Owned of Equity Type
And I click Sponsor And Investor
And I click on We Are A field
And I click on advisor option in we are a field
Then I verify the company name of investment banker is displayed
When I click on We Are A field
And I clear advisor option in we are a field
And I click on Route to Sponsor field
And I select direct only option in route to sponsor field
Then I verify the company name of investment banker is displayed
When I click on Route to Sponsor field
And I clear direct only option in route to sponsor field
And I logout from RealConnex application