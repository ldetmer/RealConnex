Meta:
@storyType BQS

Narrative:
As a user
I Verify Services/Companies can be searched from the search result by specifying
'Project Size'

Scenario: TC 134285: Verify Services/Companies are displayed when searched by project size
When I update TestCaseId 134285
When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button

