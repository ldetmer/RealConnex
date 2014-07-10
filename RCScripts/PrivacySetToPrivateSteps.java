package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.PageFactory;
import test.pages.PrivacySetToPrivatePage;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/24/14
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrivacySetToPrivateSteps {
    private final PrivacySetToPrivatePage privacySetToPrivatePage;

    @Inject
    public PrivacySetToPrivateSteps(PageFactory thePageFactory) {
        privacySetToPrivatePage = thePageFactory.newPrivacySetToPrivatePage();
    }

    @When("I click on ME tab")
    public void clickMeTab(){
        privacySetToPrivatePage.clickMeTab();
    }

    @When("I select private radio button")
    public void selectPrivateButton(){
        privacySetToPrivatePage.selectPrivateButton();
    }

    @When("I enter investor user name in the name text field")
    public void enterInvestorUserName() throws Exception {
        privacySetToPrivatePage.enterUserName(2);
    }

    @When("I enter deal sponsor user name in the name text field")
    public void enterDealSponsorUserName() throws Exception {
        privacySetToPrivatePage.enterUserName(1);
    }

    @When("I enter lender user name in the name text field")
    public void enterLenderUserName()throws Exception {
        privacySetToPrivatePage.enterUserName(3);
    }

    @When("I enter real estate advisor,broker user name in the name text field")
    public void enterRealEstateAdvisorBrokerUserName()throws Exception {
        privacySetToPrivatePage.enterUserName(4);
    }

    @When("I click on click here link of the private user")
    public void clickHereOfPrivateUser(){
        privacySetToPrivatePage.clickHereOfPrivateUser();
    }

    @When("I click on request a viewing link")
    public void clickRequestAView(){
        privacySetToPrivatePage.clickRequestAView();
    }

    @Then("I verify message displayed after clicking on request a view")
    public void verifyMessageDisplayedForClickOnRequestAView(){
        privacySetToPrivatePage.verifyMessageDisplayedForClickOnRequestAView();
    }

    @When("I enter deal sponsor email ID whose privacy set to private in yopmail")
    public void enterYopMailId_DealSponsor() throws Exception {
        privacySetToPrivatePage.enterYopMailId(3);
    }

    @When("I enter investor email ID whose privacy set to private in yopmail")
    public void enterYopMailId_Investor() throws Exception {
        privacySetToPrivatePage.enterYopMailId(8);
    }

    @When("I enter lender email ID whose privacy set to private in yopmail")
    public void enterYopMailId_Lender() throws Exception {
        privacySetToPrivatePage.enterYopMailId(9);
    }

    @When("I enter real estate advisor,broker email ID whose privacy set to private in yopmail")
    public void enterYopMailId_RealEstateAdvisorBroker() throws Exception {
        privacySetToPrivatePage.enterYopMailId(10);
    }

    @When("I enter investor email ID of user who set the privacy in my universe include as private in yopmail")
    public void enterYopMailIdOfInvestorPrivacySetToPrivateInMyUniverse_DealSponsor() throws Exception{
        privacySetToPrivatePage.enterYopMailId(16);
    }

    @When("I enter deal sponsor email ID of user who set the privacy in my universe include as private in yopmail")
    public void enterYopMailIdOfDealSponsorPrivacySetToPrivateInMyUniverse_Investor() throws Exception{
        privacySetToPrivatePage.enterYopMailId(17);
    }

    @When("I enter real estate advisor email ID of user who set the privacy in my universe include as private in yopmail")
    public void enterYopMailIdOfRealEstateAdvisorPrivacySetToPrivateInMyUniverse_Lender() throws Exception{
        privacySetToPrivatePage.enterYopMailId(18);
    }

    @When("I enter lender email ID of user who set the privacy in my universe include as private in yopmail")
    public void enterYopMailIdOfLenderPrivacySetToPrivateInMyUniverse_RealEstateAdvisor() throws Exception{
        privacySetToPrivatePage.enterYopMailId(19);
    }

    @When("I click on Accept link")
    public void clickAcceptLink(){
        privacySetToPrivatePage.clickAcceptLink();
    }

    @Then("I verify accepted message to view the profile of private user")
    public void verifyMessage(){
        privacySetToPrivatePage.verifyMessage();
    }

    @When("I enter deal sponsor company name")
    public void enterDealSponsorCompanyName() throws Exception {
        privacySetToPrivatePage.enterCompanyName(1);
    }

    @When("I enter investor company name")
    public void enterInvestorCompanyName() throws Exception {
        privacySetToPrivatePage.enterCompanyName(2);
    }

    @When("I enter lender company name")
      public void enterLenderCompanyName() throws Exception {
        privacySetToPrivatePage.enterCompanyName(3);
    }

    @When("I enter real estate advisor company name")
    public void enterRealEstateAdvisorCompanyName() throws Exception {
        privacySetToPrivatePage.enterCompanyName(4);
    }

    @When("I select value in investment amount slider of deal sponsor whose privacy is set to private")
    public void selectInvestmentAmountValue(){
        privacySetToPrivatePage.selectSliderValue();
    }

    @When("I select value in investment amount slider of property service provider whose privacy is set to private")
    public void selectInvestmentAmountValueForListingProject(){
        privacySetToPrivatePage.selectInvestmentAmountValueForListingProject();
    }

    @When("I select value in investment amount slider of deal sponsor fund whose privacy is set to private")
    public void setInvestmentAmount_Private(){
        privacySetToPrivatePage.setInvestmentAmount_Private();
    }

    @When("I select value in investment amount slider of investor fund whose privacy is set to private")
    public void setInvestmentAmountOfInvestor_Private(){
        privacySetToPrivatePage.setInvestmentAmountOfInvestor_Private();
    }

    @When("I click on the user link who granted the permission to view the profile")
    public void clickLink(){
        privacySetToPrivatePage.clickGrantedPermissionLink();
    }

    @Then("I verify access successfully updated message is displayed")
    public void verifyAccessUpdatedMessage(){
        privacySetToPrivatePage.verifyAccessUpdatedMessage();
    }

    @Then("I verify the deal sponsor profile is displayed")
    public void verifyDealSponsorPrivateUserName() throws Exception {
        privacySetToPrivatePage.verifyPrivateUserName(1);
    }

    @Then("I verify the investor profile is displayed")
    public void verifyInvestorPrivateUserName() throws Exception {
        privacySetToPrivatePage.verifyPrivateUserName(2);
    }

    @Then("I verify the lender profile is displayed")
    public void verifyLenderPrivateUserName() throws Exception {
        privacySetToPrivatePage.verifyPrivateUserName(3);
    }

    @Then("I verify the real estate advisor profile is displayed")
    public void verifyRealEstateAdvisorPrivateUserName() throws Exception {
        privacySetToPrivatePage.verifyPrivateUserName(4);
    }

    @Then("I verify the deal sponsor company profile is displayed")
    public void verifyDealSponsorPrivateCompanyProfile() throws Exception {
        privacySetToPrivatePage.verifyPrivateCompanyName(1);
    }

    @Then("I verify the investor company profile is displayed")
    public void verifyInvestorPrivateCompanyProfile() throws Exception {
        privacySetToPrivatePage.verifyPrivateCompanyName(2);
    }

    @Then("I verify the lender company profile is displayed")
    public void verifyLenderPrivateCompanyProfile() throws Exception {
        privacySetToPrivatePage.verifyPrivateCompanyName(3);
    }

    @Then("I verify the real estate advisor company profile is displayed")
    public void verifyRealEstateAdvisorPrivateCompanyProfile() throws Exception {
        privacySetToPrivatePage.verifyPrivateCompanyName(4);
    }

    @Then("I verify the deal sponsor project profile is displayed")
    public void verifyDealSponsorPrivateProjectProfile() throws Exception {
        privacySetToPrivatePage.verifyPrivateProjectName(1);
    }

    @Then("I verify the deal sponsor fund profile is displayed")
    public void verifyDealSponsorPrivateFundProfile() throws Exception {
        privacySetToPrivatePage.verifyPrivateFundName(1);
    }

    @Then("I verify the investor fund profile is displayed")
    public void verifyInvestorPrivateFundProfile() throws Exception {
        privacySetToPrivatePage.verifyPrivateFundName(2);
    }

    @Then("I verify the lender loan profile is displayed")
    public void verifyLenderPrivateLoanProfile() throws Exception {
        privacySetToPrivatePage.verifyPrivateLoanName(1);
    }

    @Then("I verify the lender mezz profile is displayed")
    public void verifyLenderPrivateMezzProfile() throws Exception {
        privacySetToPrivatePage.verifyPrivateMezzName(1);
    }

    @When("I set the value in loan amount field of lender whose privacy is set to private")
    public void setLoanAmount_Private(){
        privacySetToPrivatePage.setLoanAmount_Private();
    }

    @When("I set value in equity field of lender whose privacy is set to private")
    public void setEquity_Private(){
        privacySetToPrivatePage.setEquity_Private();
    }

    @When("I set the value in project size of service provider whose privacy is set to private")
    public void setProjectSize_Private(){
        privacySetToPrivatePage.setProjectSize_Private();
    }

    @Then("I verify the property service provider service profile is displayed")
    public void verifyPropertyServiceProviderServiceProfile() throws Exception {
        privacySetToPrivatePage.verifyPropertyServiceProviderServiceProfile(1);
    }

    @Then("I verify the property service provider listing profile is displayed")
    public void verifyPropertyServiceProviderListingProfile() throws Exception {
        privacySetToPrivatePage.verifyPropertyServiceProviderListingProfile(1);
    }

    @When("I enter user name who has set the profile to include in my universe")
    public void enterIncludeUserName() throws Exception {
        privacySetToPrivatePage.enterUserName(5);
    }

    @When("I enter company name who has set the profile to include in my universe")
    public void enterIncludeCompanyName() throws Exception {
        privacySetToPrivatePage.enterCompanyName(5);
    }

    @When("I enter user name who has set the profile to private in include of my universe")
    public void enterPrivateIncludeUserName() throws Exception {
        privacySetToPrivatePage.enterUserName(6);
    }

    @When("I enter deal sponsor user name who has set the me profile to private in include of my universe")
    public void enterPrivateIncludeDealSponsorUserName() throws Exception {
        privacySetToPrivatePage.enterUserName(7);
    }

    @When("I enter real estate advisor user name who has set the me profile to private in include of my universe")
    public void enterPrivateIncludeRealEstateAdvisorUserName() throws Exception {
        privacySetToPrivatePage.enterUserName(8);
    }

    @When("I enter lender user name who has set the me profile to private in include of my universe")
    public void enterPrivateIncludeLenderUserName() throws Exception {
        privacySetToPrivatePage.enterUserName(9);
    }
}
