Meta:
@storyType BQS

Narrative:
As a user
I verify service project of "Advisor" sub role user
are retrieved, when "Real Estate Advisors >> Advisor" search is performed

Scenario: TC 138411: Verify service project of advisor sub role is retrieved when search is performed
When I update TestCaseId 138411
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'GO' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
When I click on company of user
And I click on 'Find Now' button
And I click on service of user
And I click on 'Find Now' button
And I set the values in the slider of project size
Then I verify service project of advisor is displayed
When I clear the project size field
And I select asset experience drop down field
And I select office option in asset experience drop down
Then I verify service project of advisor is displayed
When I select asset experience drop down field
And I clear office option of asset experience drop down
And I click on deal stage drop down
And I select owned option in deal stage drop down
Then I verify service project of advisor is displayed
When I click on deal stage drop down
And I clear owned option in deal stage drop down
And I select number of offices
Then I verify service project of advisor is displayed
When I clear number of offices
And I select number of professionals
Then I verify service project of advisor is displayed
When I clear number of professionals
And I select number of value transactions completed
Then I verify service project of advisor is displayed
When I clear number of value transaction completed
And I select number of transaction completed
Then I verify service project of advisor is displayed
When I clear number of transaction completed
And I logout from RealConnex application


