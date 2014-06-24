Meta:
@storyType BQS

Narrative:
As a user
I verify companies of users who have selected "Broker" option
are retrieved, when "Real Estate Advisors >> Broker" search is performed

Scenario: TC 138410: Verify companies of broker is retrieved when search is performed
When I update TestCaseId 138410
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'Real Estate Advisors' link
And I click on 'Broker' link
And I click on 'Residential' link
And I click on 'Acquisitions' link
And I click on 'GO' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Residential Broker' as subrole in search option
And I should see 'Acquisitions' as strategy in search option
When I click on broker company name
And I return back to the searched page
When I click on broker service name
And I return back to the searched page
And I set values of project slider
Then I verify 'Canap' company name of broker is displayed
And I verify 'Universal' company name of broker is not displayed
When I clear values of project slider
And I select asset experience drop down field
And I click on solar option in asset experience field
Then I verify broker company name of 'Broker Solar' is displayed
And I verify broker company name of 'Broker Multi Family' is not displayed
When I select asset experience drop down field
And I clear solar option of asset experience field
And I click on deal stage drop down
And I select in dd option in deal stage drop down
Then I verify broker company name of 'In DD' is displayed
And I verify broker company name of 'Broker Owned' is not displayed
When I click on deal stage drop down
And I clear in dd option in deal stage drop down
And I click on profile and experience field
And I select number of office in profile field
Then I verify 'Canap' company name of broker is displayed
And I verify 'Universal' company name of broker is not displayed
When I clear number of office in profile field
And I select number of professionals in profile field
Then I verify 'Canap' company name of broker is displayed
And I verify 'Universal' company name of broker is not displayed
When I clear number of professionals in profile field
And I select number of value transaction completed in profile field
Then I verify 'Canap' company name of broker is displayed
And I verify 'Universal' company name of broker is not displayed
When I clear number of value transaction completed in profile field
And I select number of transaction completed in profile field
Then I verify 'Canap' company name of broker is displayed
And I verify 'Universal' company name of broker is not displayed
When I clear number of transaction completed in profile field
And I logout from RealConnex application


