Meta:
@storyType BQS

Narrative:
As a user
I verify companies other than "Advisor" sub role user
are not retrieved, when "Real Estate Advisors >> Advisor" search is performed

Scenario: TC 138406: Verify companies other than advisor sub role is not retrieved when search is performed
When I update TestCaseId 138406
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
When I click on 'Find Now' button
And I click on service of user
And I click on 'Find Now' button
And I select asset experience drop down field
And I select office option in asset experience drop down
Then I verify advisor company name of 'Advisor Office' is displayed
And I verify advisor company name of 'Advisor Multi Family' is not displayed
And I verify advisor company name of 'Advisor Hotel' is not displayed
When I select asset experience drop down field
And I select office and multi family option in asset experience drop down
Then I verify advisor company name of 'Advisor Office' is displayed
And I verify advisor company name of 'Advisor Multi Family' is displayed
And I verify advisor company name of 'Advisor Hotel' is not displayed
When I select asset experience drop down field
And I clear office and multi family options in asset experience drop down
And I select asset experience drop down field
And I click on multi family option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on hotel option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on sports option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on health option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on storage option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on asset other option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on retail option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on industrial option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on residential option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on single option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on retirement option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on student option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on residential other option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on residential multi option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I clear residential field in asset option
When I select asset experience drop down field
And I click on mixed option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on commercial option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I click on solar option in asset
Then I verify company name of advisor selected all search option is displayed
When I select asset experience drop down field
And I clear asset options in asset drop down field
And I click on deal stage drop down
And I select owned option in deal stage drop down
Then I verify advisor company name of 'Owned' is displayed
And I verify advisor company name of 'Concept' is not displayed
And I verify advisor company name of 'Permitted' is not displayed
When I click on deal stage drop down
And I select owned and concept option in deal stage drop down
Then I verify advisor company name of 'Owned' is displayed
And I verify advisor company name of 'Concept' is displayed
And I verify advisor company name of 'Permitted' is not displayed
When I click on deal stage drop down
And I clear owned and concept options in deal stage drop down
And I click on deal stage drop down
And I click on concept option in deal stage
Then I verify company name of advisor selected all search option is displayed
When I click on deal stage drop down
And I click on permitted option in deal stage
Then I verify company name of advisor selected all search option is displayed
When I click on deal stage drop down
And I click on ready option in deal stage
Then I verify company name of advisor selected all search option is displayed
When I click on deal stage drop down
And I click on LOI option in deal stage
Then I verify company name of advisor selected all search option is displayed
When I click on deal stage drop down
And I click on under contract option in deal stage
Then I verify company name of advisor selected all search option is displayed
When I click on deal stage drop down
And I click on plans option in deal stage
Then I verify company name of advisor selected all search option is displayed
When I click on deal stage drop down
And I click on under construction option in deal stage
Then I verify company name of advisor selected all search option is displayed
When I click on deal stage drop down
And I click on pursuit option in deal stage
Then I verify company name of advisor selected all search option is displayed
When I click on deal stage drop down
And I click on in DD option in deal stage
Then I verify company name of advisor selected all search option is displayed
When I click on deal stage drop down
And I clear deal stage field
And I logout from RealConnex application
