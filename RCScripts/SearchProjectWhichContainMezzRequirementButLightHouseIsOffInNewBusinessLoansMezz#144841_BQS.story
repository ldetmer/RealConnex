Meta:
@storyType BQS

Narrative:
As a user
Perform "New Business >> Loans>> Mezz" search and verify that projects that has mezz requirement which matches the filters are retrieved.

Scenario: TC 144841: Verify that projects which have mezz requirement selected in new business mezz search are retrieved.
When I update TestCaseId 144841
When I update TestCaseName Perform "New Business >> Loans>> Mezz" search and verify that projects that has mezz requirement which matches the filters are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for new business search
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'New Business' link
And I click on 'Loans' link in new business search
And I click on 'Mezz' link of new business search
Then I should see 'New Business' as find in search option
And I should see 'Mezz' as loan type in search option
And I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search
When I select asset profile in new business mezz search
And I select core option in asset profile drop down in new business mezz search
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I select asset profile in new business mezz search
And I clear core option in asset profile drop down in new business mezz search
When I set loan amount slider in new business search
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I clear loan amount slider in new business search
And I select collateral drop down in new business mezz search
And I select the asset option in collateral field of new business mezz search
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I select collateral drop down in new business mezz search
And I clear the asset option in collateral field of new business mezz search
And I click on route to browser drop down
And I select direct only option in route to browser
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I click on route to browser drop down
And I clear direct only option in route to browser
And I click on asset type drop down
And I select office option in asset type drop down
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I click on asset type drop down
And I clear office option in asset type drop down
And I click on deal stage drop down in search
And I select owned option in deal stage drop down of jv partner search
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I click on deal stage drop down in search
And I clear owned option in deal stage drop down of jv partner search
And I click on current asset status drop down
And I select fully rented option in current asset status drop down
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I click on current asset status drop down
And I clear fully rented option in current asset status drop down
And I select asset strategy drop down
And I select acquisition option in asset strategy drop down
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I select asset strategy drop down
And I clear acquisition option in asset strategy drop down
And I logout RealConnex application


