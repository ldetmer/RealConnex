Meta:
@storyType BQS

Narrative:
As a user
I verify companies other than "Advisor" sub role user
are not retrieved, when "Real Estate Advisors >> Advisor" search is performed

Scenario: TC 138406: Verify companies other than advisor sub role is not retrieved when search is performed
When I update TestCaseId 138406
When I update TestCaseName Perform: "Real Estate Advisor >> Advisor" search Verify that companies other than "Advisor" sub role users are not retrieved.
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
When I click on service of user
And I return back to the searched page
And I click on company of user
And I return back to the searched page
And I set values of project slider
Then I verify 'RC Com' company name of advisor is not displayed
When I clear values of project slider
And I select asset experience drop down field
And I select office option in asset experience drop down
Then I verify advisor company name of 'Advisor Office' is displayed
And I verify advisor company name of 'Advisor Multi Family' is not displayed
When I select asset experience drop down field
And I clear office option of asset experience drop down
And I click on deal stage drop down
And I select owned option in deal stage drop down
Then I verify advisor company name of 'Owned' is displayed
And I verify advisor company name of 'Concept' is not displayed
When I click on deal stage drop down
And I clear owned option in deal stage drop down
And I click on profile and experience field
And I select number of office in profile field
Then I verify 'RC Com' company name of advisor is not displayed
When I clear number of office in profile field
And I select number of professionals in profile field
Then I verify 'RC Com' company name of advisor is not displayed
When I clear number of professionals in profile field
And I select number of value transaction completed in profile field
Then I verify 'RC Com' company name of advisor is not displayed
When I clear number of value transaction completed in profile field
And I select number of transaction completed in profile field
Then I verify 'RC Com' company name of advisor is not displayed
When I clear number of transaction completed in profile field
And I logout from RealConnex application
