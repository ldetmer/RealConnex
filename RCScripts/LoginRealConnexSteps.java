package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import test.pages.LoginRealConnexPage;
import test.pages.PageFactory;
import java.io.IOException;

public class LoginRealConnexSteps {
    private final LoginRealConnexPage loginRealConnexPage;

    @Inject
    public LoginRealConnexSteps(PageFactory thePageFactory) {
        loginRealConnexPage = thePageFactory.newLoginRealConnexPage();
    }

    @When("I launch RealConnex application")
    public void launchRealConnexPage()throws IOException {
        loginRealConnexPage.launchRealConnexPage();
    }

    @When("I enter user email ID")
    public void enterEmailId()throws Exception{
        loginRealConnexPage.enterEmailId(1);
    }

    @When("I enter Password")
    public void enterPassword(){
        loginRealConnexPage.enterPassword(1);
    }

    @When("I click on login button")
    public void clickLogin(){
        loginRealConnexPage.clickLogIn();
    }

    @When("I enter deal sponsor email ID for privacy set to public")
    public void enterEmailId_Public() throws Exception {
        loginRealConnexPage.enterEmailId(2);
    }

    @When("I enter deal sponsor email ID whose privacy set to private")
        @Alias("I enter deal sponsor email ID where privacy is set")
    public void enterEmailId_DealSponsorPrivate() throws Exception {
        loginRealConnexPage.enterEmailId(3);
    }

    @When("I enter investor email ID whose privacy set to private")
        @Alias("I enter investor email ID where privacy is set")
    public void enterEmailId_InvestorPrivate() throws Exception {
        loginRealConnexPage.enterEmailId(8);
    }

    @When("I enter lender email ID whose privacy set to private")
        @Alias("I enter lender email ID where privacy is set")
    public void enterEmailId_LenderPrivate() throws Exception {
        loginRealConnexPage.enterEmailId(9);
    }

    @When("I enter real estate advisor email ID whose privacy set to private")
        @Alias("I enter real estate advisor email ID where privacy is set")
    public void enterEmailId_RealEstateAdvisorPrivate() throws Exception {
        loginRealConnexPage.enterEmailId(10);
    }

    @When("I enter user login details:$LoginDetailsTable")
    public void enterLoginDetails(ExamplesTable LoginDetailsTable){
        loginRealConnexPage.enterLoginDetails(LoginDetailsTable);
    }

    @When("I enter investor email ID for login")
    public void enterEmailIdOfInvestor() throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(4);
    }

    @When("I enter deal sponsor email ID for login")
    public void enterEmailIdOfDealSponsor() throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(7);
    }

    @When("I enter lender email ID for login")
    public void enterEmailIdOfLender() throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(5);
    }

    @When("I enter real estate advisor email ID for login")
    public void enterEmailIdOfRealEstateAdvisor() throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(6);
    }

    @When("I enter email ID of user who set the privacy in my universe include")
    public void enterEmailIdOfUserMyUniverseInclude() throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(11);
    }

    @When("I enter investor email ID of user who set the privacy in my universe include as private in me tab")
    public void enterEmailIdOfInvestorUserMyUniverseIncludePrivate() throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(16);
    }

    @When("I enter deal sponsor email ID of user who set the privacy in my universe include as private in me tab")
    public void enterEmailIdOfDealSponsorUserMyUniverseIncludePrivate() throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(17);
    }

    @When("I enter real estate advisor email ID of user who set the privacy in my universe include as private in me tab")
    public void enterEmailIdOfRealEstateAdvisorUserMyUniverseIncludePrivate() throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(18);
    }

    @When("I enter lender email ID of user who set the privacy in my universe include as private in me tab")
    public void enterEmailIdOfLenderUserMyUniverseIncludePrivate() throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(19);
    }

    @When("I enter email ID of user with role as deal sponsor and sub role as developer")
    public void enterEmailIdOfDealSponsorDeveloperSubRole()throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(12);
    }

    @When("I enter email ID of user with role as investor and sub role as advisor")
    public void enterEmailIdOfInvestorAdvisorSubRole()throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(13);
    }

    @When("I enter email ID of user with role as lender and sub role as family office")
    public void enterEmailIdOfLenderFamilyOfficeSubRole()throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(14);
    }

    @When("I enter email ID of user with role as real estate advisor and sub role as advisor")
    public void enterEmailIdOfRealEstateAdvisorAdvisorSubRole()throws Exception {
        loginRealConnexPage.enterEmailIdOfUsers(15);
    }

    @When("I enter password of user")
    public void enterPasswordOfUser() throws Exception {
       loginRealConnexPage.enterPasswordOfUser(2);
    }
}
