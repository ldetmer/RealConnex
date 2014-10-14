Meta:
@storyType BQS

Narrative:
As a user
I Verify that projects of other role users except Property Service Provider can be viewed after permission is granted.

Scenario: 136662 : Verify that project can be viewed by other role user except property service provider after permission is granted
When I update TestCaseId 136662
When I update TestCaseName Verify that projects of other role users except Property Service Provider can be viewed after permission is granted.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID of user who set the privacy in my universe include in project tab
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on POSTINGS tab
And I click on service project of the real estate advisor who set privacy in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on service project of the real estate advisor who set privacy in my universe include
When I click on my universe radio button
And I click on exclude radio button
And I select public option in drop down
And I select real estate advisor check box in my universe exclude
And I select sub role field of real estate advisor in my universe exclude
And I select advisor sub role option in my universe exclude of real estate advisor
And I set the value in deal/fund size field of real estate advisor in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on service project of the real estate advisor who set privacy in my universe include
Then I verify that public option is selected
And I verify real estate advisor subrole is selected
And I verify advisor subrole is selected in real estate advisor
And I verify deal/fund size of the real estate advisor i.e 11 million to 12 million is set
When I return back to the searched page
When I click on listing project of the real estate advisor who set privacy in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on listing project of the real estate advisor who set privacy in my universe include
And I click on my universe radio button
And I click on exclude radio button
And I select public option in drop down
And I select real estate advisor check box in my universe exclude
And I select sub role field of real estate advisor in my universe exclude
And I select advisor sub role option in my universe exclude of real estate advisor
And I set the value in deal/fund size field of real estate advisor in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on listing project of the real estate advisor who set privacy in my universe include
Then I verify that public option is selected
Then I verify real estate advisor subrole is selected
And I verify advisor subrole is selected in real estate advisor
And I verify deal/fund size of the real estate advisor i.e 11 million to 12 million is set
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with role as real estate advisor and sub role as advisor
And I enter Password
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'View Search Results' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
And I verify property service provider service profile whose privacy is set to my universe include is not displayed
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
And I verify property service provider service profile whose privacy is set to my universe include is not displayed
When I logout RealConnex application
And I click on sign up for free link
And I enter real estate advisor,broker email ID for registration
And I enter first name of user
And I enter last name of user
And I enter password in registration field
And I re enter password in registration field
And I click select role drop down field
And I select Real Estate Advisor,Broker option in select role drop down
Then I verify 'Real Estate Advisor' is selected in drop down
When I click register button
Then I verify 'Almost Done!' confirmation message is displayed
When I click on close button
And I launch yopmail
And I enter yopmail email address of newly created user
And I click on check inbox button
And I switch to yop mail tab
And I click on real connex mail
And I click on Click here link
And I switch to RealConnex page
Then I verify RealConnex page
When I click Skip Tour button
And I click on Edit Profile link
And I select corporate finance option in I am a field of real estate advisor profile
And I enter the location of the newly created user
And I click on save button in user profile page
And I click on company tab in user profile
And I enter company name
And I select same as my personal details check box in company tab
And I click on save button of company profile
And I click on edit in about field
And I set the value of average transaction size in user profile
And I click on save button in about field
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'View Search Results' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
When I set the value in project size of service provider whose privacy is set to private in my universe include
And I select asset experience drop down field
And I select office option in asset experience drop down
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter real estate advisor email ID of user who set the privacy in my universe include as private in yopmail
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID of user who set the privacy in my universe include in project tab
And I enter Password
And I click on login button
Then I verify access successfully updated message is displayed
And I verify the project notification in the header of privacy
When I logout RealConnex application
And I launch yopmail
And I enter yopmail email address of newly created user
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on the user link who granted the permission to view the profile
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter newly created 'Real Estate Advisor,Broker' email ID
And I enter Password
And I click on login button
Then I verify the property service provider service profile is displayed
And I verify the project notification in the header of the requested user of privacy
And I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'View Search Results' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
When I set the value in project size of service provider whose privacy is set to private in my universe include
And I select asset experience drop down field
And I select office option in asset experience drop down
Then I verify 'Davis Service' property service provider service name who set privacy in my universe exclude is displayed
And I click on 'Davis Service' property service provider service name who set privacy in my universe include
And I click on 'Find Now' button
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'View Search Results' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
When I set the value in project size of service provider whose privacy is set to private in my universe include
And I select asset experience drop down field
And I select office option in asset experience drop down
Then I verify click here link of the service is displayed in search result
When I click on click here link of the private user
And I click on service and listing tab of user profile
And I click on services link
Then I verify the text in the service and listing user page when service or listing link is clicked
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'View Search Results' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
When I set the value in project size of service provider whose privacy is set to private in my universe include
And I select asset experience drop down field
And I select office option in asset experience drop down
Then I verify click here link of the service is displayed in search result
When I click on click here link of the private user
And I click on service and listing tab of user profile
And I click on services link
Then I verify the text in the service and listing user page when service or listing link is clicked
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'View Search Results' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
When I set the value in project size of service provider whose privacy is set to private in my universe include
And I select asset experience drop down field
And I select office option in asset experience drop down
Then I verify click here link of the service is displayed in search result
When I click on click here link of the private user
And I click on service and listing tab of user profile
And I click on services link
Then I verify the text in the service and listing user page when service or listing link is clicked
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter newly created 'Real Estate Advisor,Broker' email ID
And I enter Password
And I click on login button
And I click on close tutorial field
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I select value in investment amount slider of property service provider whose privacy is set to private in my universe include
And I click investing as drop down field
And I select general partner option in investing as drop down field
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter real estate advisor email ID of user who set the privacy in my universe include as private in yopmail
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID of user who set the privacy in my universe include in project tab
And I enter Password
And I click on login button
Then I verify access successfully updated message is displayed
And I verify the project notification in the header of privacy
When I logout RealConnex application
And I launch yopmail
And I enter yopmail email address of newly created user
And I click on check inbox button in yopmail
And I click on real connex mail
And I click on the user link who granted the permission to view the profile
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter newly created 'Real Estate Advisor,Broker' email ID
And I enter Password
And I click on login button
Then I verify the property service provider listing profile is displayed
And I verify the project notification in the header of the requested user of privacy
And I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I select value in investment amount slider of property service provider whose privacy is set to private in my universe include
And I click investing as drop down field
And I select general partner option in investing as drop down field
Then I verify 'Davis Service' property service provider listing name who set privacy in my universe exclude is displayed
And I click on 'Davis Service' property service provider listing name who set privacy in my universe include
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I select value in investment amount slider of property service provider whose privacy is set to private in my universe include
And I click investing as drop down field
And I select general partner option in investing as drop down field
Then I verify click here link of the service is displayed in search result
When I click on click here link of the private user
And I click on service and listing tab of user profile
And I click on listings link
Then I verify the text in the service and listing user page when service or listing link is clicked
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I select value in investment amount slider of property service provider whose privacy is set to private in my universe include
And I click investing as drop down field
And I select general partner option in investing as drop down field
Then I verify click here link of the service is displayed in search result
When I click on click here link of the private user
And I click on service and listing tab of user profile
And I click on listings link
Then I verify the text in the service and listing user page when service or listing link is clicked
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'Find Now' image
When I click on 'Find Now' button
And I click on search real connex marketplace link
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I select value in investment amount slider of property service provider whose privacy is set to private in my universe include
And I click investing as drop down field
And I select general partner option in investing as drop down field
Then I verify click here link of the service is displayed in search result
When I click on click here link of the private user
And I click on service and listing tab of user profile
And I click on listings link
Then I verify the text in the service and listing user page when service or listing link is clicked
When I logout RealConnex application

