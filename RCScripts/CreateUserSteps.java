package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.*;
import test.pages.CreateUserPage;
import test.pages.PageFactory;

import java.awt.*;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/25/14
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateUserSteps {
    private final CreateUserPage createUserPage;

    @Inject
    public CreateUserSteps(PageFactory thePageFactory) {
        createUserPage = thePageFactory.newCreateUserPage();
    }

    @When("I click on Not a Member? Join Now for Free! link in registration page")
    public void clickNotAMemberLink(){
        createUserPage.clickNotAMemberLink();
    }

    @When("I enter investor email ID for registration")
    public void enterInvestorEmailId(){
        createUserPage.enterEmailIdOfUserRoles();
    }

    @When("I enter deal sponsor email ID for registration")
    public void enterDealSponsorEmailId(){
        createUserPage.enterEmailIdOfUserRoles();
    }

    @When("I enter real estate advisor,broker email ID for registration")
    public void enterRealEstateAdvisorBrokerEmailId(){
        createUserPage.enterEmailIdOfUserRoles();
    }

    @When("I enter lender email ID for registration")
    public void enterLenderEmailId(){
        createUserPage.enterEmailIdOfUserRoles();
    }

    @When("I enter first name of user")
    public void enterFirstName(){
        createUserPage.enterFirstName();
    }

    @When("I enter last name of user")
    public void enterLastName(){
        createUserPage.enterLastName();
    }

    @When("I enter password in registration field")
    public void enterPassword() throws Exception {
        createUserPage.enterPassword(1);
    }

    @When("I re enter password in registration field")
    public void reEnterPassword() throws Exception {
        createUserPage.reEnterPassword(1);
    }

    @When("I click select role drop down field")
    public void clickSelectRoleDropDown(){
        createUserPage.clickSelectRoleDropDown();
    }

    @When("I select Investor option in select role drop down")
    public void selectInvestorOption(){
        createUserPage.selectInvestorOption();
    }

    @Then("I verify '$lStrSelectedOptionInDropDown' is selected in drop down")
    public void verifyRoleSelected(@Named("lStrSelectedOptionInDropDown") String lStrSelectedOptionInDropDown){
        createUserPage.verifyTextInRoleSelectedDropDown(lStrSelectedOptionInDropDown);
    }

    @When("I click on I certify I am an accredited investor check box")
    public void clickCertifyAccreditedInvestorCheckBox(){
        createUserPage.clickCertifyAccreditedInvestorCheckBox();
    }

    @When("I select Deal Sponsor,Developer And Fund Manger option in select role drop down")
    public void selectDealSponsorDeveloperAndFundMangerOption(){
        createUserPage.selectDealSponsorDeveloperAndFundMangerOption();
    }

    @When("I select Real Estate Advisor,Broker option in select role drop down")
    public void selectRealEstateAdvisorBrokerOption(){
        createUserPage.selectRealEstateAdvisorBrokerOption();
    }

    @When("I select Lender option in select role drop down")
    public void selectLenderOption(){
        createUserPage.selectLenderOption();
    }

    @When("I click register button")
    public void clickRegisterButton(){
        createUserPage.clickRegisterButton();
    }

    @Then("I verify '$lStrConfirmationMessage' confirmation message is displayed")
    public void verifyConfirmationMessage(@Named("lStrConfirmationMessage") String lStrConfirmationMessage){
        createUserPage.verifyConfirmationMessage(lStrConfirmationMessage);
    }

    @When("I click on OK button")
    public void clickOk(){
        createUserPage.clickOk();
    }

    @When("I launch yopmail")
    public void launchYopMail(){
        createUserPage.launchYopMail();
    }

    @When("I enter yopmail email address of newly created user")
    public void enterYopMailId(){
        createUserPage.enterYopMailId();
    }

    @When("I enter newly created 'Deal Sponsor' email ID")
        @Aliases(values = {"I enter newly created 'Investor' email ID",
                           "I enter newly created 'Real Estate Advisor,Broker' email ID",
                            "I enter newly created 'Lender' email ID"})
    public void enterCreatedEmailId()throws IOException{
        createUserPage.enterCreatedEmailId();
    }

    @When("I click on check inbox button")
    public void clickCheckInboxButton() throws IOException {
        createUserPage.clickCheckInboxButton();
    }

    @When("I click on check inbox button in yopmail")
    public void clickCheckInboxButtonInYopmail(){
        createUserPage.clickCheckInboxButtonInYopmail();
    }

    @When("I switch to yop mail tab")
    public void switchToYopMailTab(){
        createUserPage.switchToYopMailTab();
    }

    @When("I click on real connex mail")
    public void clickRealConnexMail(){
        createUserPage.clickRealConnexMail();
    }

    @When("I click on Click here link")
    public void clickOnClickHereLink(){
        createUserPage.clickOnClickHereLink();
    }

    @When("I switch to RealConnex page")
    public void switchToRealConnexTab(){
        createUserPage.switchToRealConnexTab();
    }

    @Then("I verify RealConnex page")
    public void verifyRealConnexPage(){
        createUserPage.verifyRealConnexPage();
    }

    @When("I click Skip Tour button")
    public void clickSkipTour(){
        createUserPage.clickSkipTour();
    }

    @When("I launch mailinator")
    public void launchMailInator(){
        createUserPage.launchMailInator();
    }

    @When("I enter mailinator email address of newly created user")
    public void enterMailInatorId()  {
        createUserPage.enterMailInatorId();
    }

    @When("I click on check it button")
    public void clickCheckItButton() throws IOException {
        createUserPage.clickCheckItButton();
    }

    @When("I click on RealConnex mail in the inbox")
    public void clickRealConnexMailInMailinator(){
        createUserPage.clickRealConnexMailInMailinator();
    }

    @When("I click on Click here link in the inbox")
    public void clickClickHereLinkInInbox(){
        createUserPage.clickClickHereLinkInInbox();
    }
}
