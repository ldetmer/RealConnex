Meta:
@storyType BQS

Narrative:
As a user
I verify 'Service' project of users who have selected "Advisor" option
are retrieved, when "Real Estate Advisors >> Advisor" search is performed

Scenario: TC 134248: Verify service project is retrieved when Advisor search is performed
When I update TestCaseId 134248
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
Then I should see 'Appraisal' as strategy in search option
When I click on Appraisal Company
When I click on 'Find Now' button
And I click on Service User
And I click on 'Find Now' button
And I enter location of advisor in text field
And I click on the advisor location
Then I verify Location field of advisor
When I clear location text field
And I click on 'Core Activity'
And I select option in 'Core Activity'
Then I verify service of 'Appraisals' is displayed
And I verify service of 'Owner' is not displayed
And I verify service of 'Tenant' is not displayed
When I click on 'Core Activity'
And I select two options in core activity field
Then I verify service of 'Appraisals' is displayed
And I verify service of 'Owner' is not displayed
And I verify service of 'Tenant' is not displayed
When I click on 'Core Activity'
And I clear core activity field
When I click on 'Core Activity'
And I click on environmental in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on owner in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on facilities in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on government in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on public in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I clear government field in core activity
When I click on 'Core Activity'
And I click on energy in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on research in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on valuations in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on client in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on tenant in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click value recovery in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on property in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on rezones in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on corporate in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on platform in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on other in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I clear property field in core activity
When I click on 'Core Activity'
And I click on servicing in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I click on core other in core activity
Then I verify advisor service name of all search option is displayed
When I click on 'Core Activity'
And I clear the core field
And I click on 'Asset Experience'
And I select option in 'Asset Experience'
Then I verify service of 'Advisor Office' is displayed
And I verify service of 'Advisor Multi Family' is not displayed
And I verify service of 'Advisor Hotel' is not displayed
When I click on 'Asset Experience'
And I select two options in asset drop down
Then I verify service of 'Advisor Office' is displayed
And I verify service of 'Advisor Multi Family' is not displayed
And I verify service of 'Advisor Hotel' is not displayed
When I click on 'Asset Experience'
And I clear asset field
When I click on 'Asset Experience'
And I click on multi option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on hotel option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on sports option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on health option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on storage option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on asset other option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on retail option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on industrial option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on residential option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on single option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on retirement option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on student option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on residential other option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on residential multi option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I clear residential field in asset option
When I click on 'Asset Experience'
And I click on mixed option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on commercial option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I click on solar option in asset
Then I verify advisor service name of all search option is displayed
When I click on 'Asset Experience'
And I clear asset options in asset drop down field
And I click on 'Deal Stage'
And I select a option in 'DealStage'
Then I verify service of 'Owned' is displayed
And I verify service of 'Concept' is not displayed
And I verify service of 'Permitted' is not displayed
When I click on 'Deal Stage'
And I select two options in deal stage drop down
Then I verify service of 'Owned' is displayed
And I verify service of 'Concept' is not displayed
And I verify service of 'Permitted' is not displayed
When I click on 'Deal Stage'
And I clear deal field
When I click on 'Deal Stage'
And I click on concept option in deal stage
Then I verify advisor service name of all search option is displayed
When I click on 'Deal Stage'
And I click on permitted option in deal stage
Then I verify advisor service name of all search option is displayed
When I click on 'Deal Stage'
And I click on ready option in deal stage
Then I verify advisor service name of all search option is displayed
When I click on 'Deal Stage'
And I click on LOI option in deal stage
Then I verify advisor service name of all search option is displayed
When I click on 'Deal Stage'
And I click on under contract option in deal stage
Then I verify advisor service name of all search option is displayed
When I click on 'Deal Stage'
And I click on plans option in deal stage
Then I verify advisor service name of all search option is displayed
When I click on 'Deal Stage'
And I click on under construction option in deal stage
Then I verify advisor service name of all search option is displayed
When I click on 'Deal Stage'
And I click on pursuit option in deal stage
Then I verify advisor service name of all search option is displayed
When I click on 'Deal Stage'
And I click on in DD option in deal stage
Then I verify advisor service name of all search option is displayed
When I click on 'Deal Stage'
And I clear deal stage field
And I logout from RealConnex application