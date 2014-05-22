Meta:
@storyType BQS

Narrative:
As a user
I verify companies of "Investment Banker" sub role are retrieved,
when "Real Estate Advisors >> Investment Banker" search is performed

Scenario: TC 138407: Verify companies of investment banker is retrieved when search is performed
When I update TestCaseId 138407
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Real Estate Advisors' link
And I click on 'Investment Banker' link
And I click on 'Capital Raising' link
And I click on 'GO' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Investment Banker' as subrole in search option
And I should see 'Capital Raising' as strategy in search option
When I click on banker company name
And I click on 'Find Now' button
When I click on banker project name
And I click on 'Find Now' button
And I set the values in the slider of project size
Then I verify company name of investment banker is displayed
When I clear the project size field
And I select asset experience drop down field
And I select health care option in asset experience drop down
Then I verify company name of investment banker is displayed
When I select asset experience drop down field
And I clear health care option in asset experience drop down
And I click on deal stage drop down
And I select permitted option in deal stage drop down
Then I verify company name of investment banker is displayed
When I click on deal stage drop down
And I clear permitted option in deal stage drop down
And I click on profile and experience field
And I select number of offices
Then I verify company name of investment banker is displayed
When I clear number of offices
And I select number of professionals
Then I verify company name of investment banker is displayed
When I clear number of professionals
And I select number of value transactions completed
Then I verify company name of investment banker is displayed
When I clear number of value transaction completed
And I select number of transaction completed
Then I verify company name of investment banker is displayed
When I clear number of transaction completed
And I logout from RealConnex application
