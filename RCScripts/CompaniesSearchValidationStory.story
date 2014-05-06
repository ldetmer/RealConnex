When I launch RealConnex application
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name in search field
Then I verify 'Deal Sponsor' company name is displayed
And I verify 'Investor' company name is not displayed
And I verify 'Lender' company name is not displayed
And I verify 'Real Estate Advisor' company name is not displayed
When I clear name field in search option
And I enter 'Investor' company name
Then I verify 'Investor' company name is displayed
And I verify 'Deal Sponsor' company name is not displayed
And I verify 'Lender' company name is not displayed
And I verify 'Real Estate Advisor' company name is not displayed
When I clear name field in search option
And I enter company type in search option
Then I verify 'Deal Sponsor' company name is displayed
And I verify 'Investor' company name is not displayed
And I verify 'Lender' company name is not displayed
And I verify 'Real Estate Advisor' company name is not displayed
When I clear type field in search option
And I enter investor company type in search option
Then I verify 'Investor' company name is displayed
And I verify 'Deal Sponsor' company name is not displayed
And I verify 'Lender' company name is not displayed
And I verify 'Real Estate Advisor' company name is not displayed
When I clear type field in search option
And I enter location in location search option
And I select location in the drop down
Then I verify 'Deal Sponsor' company name is displayed
And I verify 'Investor' company name is not displayed
And I verify 'Lender' company name is not displayed
And I verify 'Real Estate Advisor' company name is not displayed
When I clear Location
And I logout from RealConnex application




