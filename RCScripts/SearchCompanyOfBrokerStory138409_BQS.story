Meta:
@storyType BQS

Narrative:
As a user
I verify companies of users who have selected "Broker" option
are retrieved, when "Real Estate Advisors >> Broker" search is performed

Scenario: TC 138409: Verify companies of broker is retrieved when search is performed
When I update TestCaseId 138409
When I update TestCaseName Search Companies Of Broker
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
When I click on broker service name
And I return back to the searched page
When I click on broker company name
And I return back to the searched page
And I set the values in the slider of project size
Then I verify company name of broker is displayed
When I clear the project size field
And I select asset experience drop down field
And I click on solar option in asset experience field
Then I verify company name of broker is displayed
When I select asset experience drop down field
And I clear solar option of asset experience field
And I select asset experience drop down field
And I select office option in asset experience drop down
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I clear office option of asset experience drop down
When I select asset experience drop down field
And I click on multi family option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on hotel option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on sports option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on health option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on storage option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on asset other option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on retail option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on industrial option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on residential option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on single option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on retirement option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on student option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on residential other option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on residential multi option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I clear residential field in asset option
When I select asset experience drop down field
And I click on mixed option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on commercial option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on solar option in asset
Then I verify company name of broker selected all search option is displayed
When I select asset experience drop down field
And I clear asset options in asset drop down field
And I click on deal stage drop down
And I select in dd option in deal stage drop down
Then I verify company name of broker is displayed
When I click on deal stage drop down
And I clear in dd option in deal stage drop down
And I click on deal stage drop down
And I click on concept option in deal stage
Then I verify company name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on permitted option in deal stage
Then I verify company name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on ready option in deal stage
Then I verify company name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on LOI option in deal stage
Then I verify company name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on under contract option in deal stage
Then I verify company name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on plans option in deal stage
Then I verify company name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on under construction option in deal stage
Then I verify company name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on pursuit option in deal stage
Then I verify company name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on in DD option in deal stage
Then I verify company name of broker selected all search option is displayed
When I click on deal stage drop down
And I clear deal stage field
And I click on profile and experience field
And I select number of offices
Then I verify company name of broker is displayed
When I clear number of offices
And I select number of professionals
Then I verify company name of broker is displayed
When I clear number of professionals
And I select number of value transactions completed
Then I verify company name of broker is displayed
When I clear number of value transaction completed
And I select number of transaction completed
Then I verify company name of broker is displayed
When I clear number of transaction completed
And I logout from RealConnex application
