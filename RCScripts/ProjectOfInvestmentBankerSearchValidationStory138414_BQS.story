Meta:
@storyType BQS

Narrative:
As a user
I verify 'Service' project other than "Investment Banker" sub role
are not retrieved, when "Real Estate Advisors >> Investment Banker" search is performed

Scenario: TC 138414: Verify service project other than investment banker are  not retrieved when search is performed
When I update TestCaseId 138414
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
And I return back to the searched page
When I click on banker project name
And I return back to the searched page
And I set values of project slider
Then I verify 'Faber' service name of investment banker is displayed
And I verify 'Project advisor' service name of investment banker is not displayed
When I clear values of project slider
And I select asset experience drop down field
And I select health care option in asset experience drop down
Then I verify service name of investment banker selected 'Health Care' option is displayed
And I verify service name of investment banker selected 'Storage' option is not displayed
When I select asset experience drop down field
And I clear health care option in asset experience drop down
And I click on deal stage drop down
And I select permitted option in deal stage drop down
Then I verify service name of investment banker selected 'Banker Permitted' option is displayed
And I verify service name of investment banker selected 'Pursuit' option is not displayed
When I click on deal stage drop down
And I clear permitted option in deal stage drop down
And I click on profile and experience field
And I select number of office in profile field
Then I verify 'Faber' service name of investment banker is displayed
And I verify 'Project advisor' service name of investment banker is not displayed
When I clear number of office in profile field
And I select number of professionals in profile field
Then I verify 'Faber' service name of investment banker is displayed
And I verify 'Project advisor' service name of investment banker is not displayed
When I clear number of professionals in profile field
And I select number of transaction completed in profile field
Then I verify 'Faber' service name of investment banker is displayed
And I verify 'Project advisor' service name of investment banker is not displayed
When I clear number of transaction completed in profile field
And I logout from RealConnex application




