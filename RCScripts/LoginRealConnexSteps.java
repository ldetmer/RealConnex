package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Aliases;
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
    public void enterPassword() throws Exception {
        loginRealConnexPage.enterPassword(1);
    }

    @When("I click on login button")
    public void clickLogin(){
        loginRealConnexPage.clickLogIn();
    }

    @When("I enter deal sponsor email ID for privacy set to public")
        @Alias("I enter deal sponsor email ID with subrole as deal sponsor")
    public void enterEmailId_Public() {
        loginRealConnexPage.enterEmailId(2);
    }

    @When("I enter deal sponsor email ID with different deal/fund size")
    public void enterEmailIdOfDealSponsorWithDealFundSize(){
        loginRealConnexPage.enterEmailId(20);
    }

    @When("I enter investor email Id with different deal/fund size")
    public void enterEmailIdOfInvestorWithDealFundSize(){
        loginRealConnexPage.enterEmailId(24);
    }

    @When("I enter investor with different location")
    public void enterEmailIdOfInvestorWithLocation(){
        loginRealConnexPage.enterEmailId(25);
    }

    @When("I enter deal sponsor email ID with different location")
    public void enterEmailIdOfDealSponsorWithLocation(){
        loginRealConnexPage.enterEmailId(21);
    }

    @When("I enter deal sponsor email ID with subrole as all")
    public void enterEmailIdOfDealSponsorWithAllSubRole(){
        loginRealConnexPage.enterEmailId(22);
    }

    @When("I enter investor email ID with subrole bank")
    public void enterEmailIdOfInvestorWithSubRoleBank() {
        loginRealConnexPage.enterEmailId(23);
    }

    @When("I enter lender email ID with subrole private lender")
    public void enterEmailIdOfLenderWithSubRolePrivateLender(){
        loginRealConnexPage.enterEmailId(26);
    }

    @When("I enter lender email ID with different deal/fund size")
    public void enterLenderEmailIdWithDealFundSize(){
        loginRealConnexPage.enterEmailId(27);
    }

    @When("I enter lender email ID with different location")
    public void enterLenderEmailIdWithLocation(){
        loginRealConnexPage.enterEmailId(28);
    }

    @When("I enter real estate advisor with subrole corporate finance")
    public void enterRealEstateAdvisorWithSubRoleCorporateFinance(){
        loginRealConnexPage.enterEmailId(29);
    }

    @When("I enter real estate advisor with different deal/fund size")
    public void enterRealEstateAdvisorWithDealFundSize(){
        loginRealConnexPage.enterEmailId(30);
    }

    @When("I enter real estate advisor with different location")
    public void enterRealEstateAdvisorWithLocation(){
        loginRealConnexPage.enterEmailId(31);
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
    public void enterEmailIdOfDealSponsor() {
        loginRealConnexPage.enterEmailIdOfUsers(7);
    }

    @When("I enter lender email ID for login")
    public void enterEmailIdOfLender() {
        loginRealConnexPage.enterEmailIdOfUsers(5);
    }

    @When("I enter real estate advisor email ID for login")
    public void enterEmailIdOfRealEstateAdvisor() {
        loginRealConnexPage.enterEmailIdOfUsers(6);
    }


    @When("I enter email ID of user who set the privacy in my universe include")
        @Alias("I enter email ID of user who set the privacy in my universe exclude")
    public void enterEmailIdOfUserMyUniverseInclude() {
        loginRealConnexPage.enterEmailIdOfUsers(11);
    }

    @When("I enter investor email ID of user who set the privacy in my universe include as private in me tab")
        @Aliases(values = {"I enter investor email ID of user who set the privacy in my universe include in project tab",
                "I enter investor email ID of user who set the privacy in my universe exclude"})
    public void enterEmailIdOfInvestorUserMyUniverseIncludePrivate() {
        loginRealConnexPage.enterEmailIdOfUsers(16);
    }

    @When("I enter deal sponsor email ID of user who set the privacy in my universe include as private in me tab")
        @Aliases( values = {"I enter deal sponsor email ID of user who set the privacy in my universe include as public in project tab",
                "I enter deal sponsor email ID of user who set the privacy in my universe include as private in project tab",
                "I enter deal sponsor email ID of user who set the privacy in my universe exclude"})
    public void enterEmailIdOfDealSponsorUserMyUniverseIncludePrivate()  {
        loginRealConnexPage.enterEmailIdOfUsers(17);
    }

    @When("I enter real estate advisor email ID of user who set the privacy in my universe include as private in me tab")
        @Alias("I enter real estate advisor email ID of user who set the privacy in my universe include in project tab")
    public void enterEmailIdOfRealEstateAdvisorUserMyUniverseIncludePrivate()  {
        loginRealConnexPage.enterEmailIdOfUsers(18);
    }

    @When("I enter lender email ID of user who set the privacy in my universe include as private in me tab")
         @Alias("I enter lender email ID of user who set the privacy in my universe include")
    public void enterEmailIdOfLenderUserMyUniverseIncludePrivate()  {
        loginRealConnexPage.enterEmailIdOfUsers(19);
    }

    @When("I enter email ID of user with role as deal sponsor and sub role as developer")
    public void enterEmailIdOfDealSponsorDeveloperSubRole() {
        loginRealConnexPage.enterEmailIdOfUsers(12);
    }

    @When("I enter email ID of deal sponsor user with no filters")
    public void enterEmailIdOfDealSponsorWithNoFilters() {
        loginRealConnexPage.enterEmailId(32);
    }

    @When("I enter email ID of deal sponsor user with subrole as fund sponsor")
    public void enterEmailIdOfDealSponsorWithFundSponsor() {
        loginRealConnexPage.enterEmailId(33);
    }

    @When("I enter email ID of deal sponsor user with deal/fund size")
    public void enterEmailIdOfDealSponsorWithDealOrFundSize() {
        loginRealConnexPage.enterEmailId(34);
    }

    @When("I enter email ID of user with role as investor and sub role as advisor")
    public void enterEmailIdOfInvestorAdvisorSubRole(){
        loginRealConnexPage.enterEmailIdOfUsers(13);
    }

    @When("I enter email ID of user with role as lender and sub role as family office")
    public void enterEmailIdOfLenderFamilyOfficeSubRole() {
        loginRealConnexPage.enterEmailIdOfUsers(14);
    }

    @When("I enter email ID of user with role as real estate advisor and sub role as advisor")
    public void enterEmailIdOfRealEstateAdvisorAdvisorSubRole() {
        loginRealConnexPage.enterEmailIdOfUsers(15);
    }

    @When("I enter password of user")
    public void enterPasswordOfUser() throws Exception {
       loginRealConnexPage.enterPasswordOfUser(2);
    }
}
