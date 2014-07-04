package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.*;
import test.pages.PageFactory;
import test.pages.PrivacySetToPublicPage;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 11:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class PrivacySetToPublicSteps {
    private final PrivacySetToPublicPage privacySetToPublicPage;

    @Inject
    public PrivacySetToPublicSteps(PageFactory thePageFactory) {
        privacySetToPublicPage = thePageFactory.newPrivacySetToPublicPage();
    }

    @Then("I should see Privacy button")
    public void verifyPrivacyButton(){
        privacySetToPublicPage.verifyPrivacyButton();
    }

    @When("I click on Privacy button")
    public void clickActivitiesButton(){
        privacySetToPublicPage.clickPrivacyButton();
    }

    @Then("I verify that privacy page is displayed")
    public void verifyPrivacyPage(){
        privacySetToPublicPage.verifyPrivacyPage();
    }

    @When("I click on public button in ME tab")
        @Aliases(values={"I click on public button in COMPANY tab",
                         "I click on public button of project of deal sponsor",
                         "I click on public button of fund of deal sponsor"})
    public void selectPublicButton(){
        privacySetToPublicPage.selectPublicButton();
    }

    @When("I click on save button in ME tab")
    public void clickSaveButton_Me(){
        privacySetToPublicPage.clickSaveButton_Me();
    }

    @When("I click on save button in COMPANY tab")
    public void clickSaveButton_Company(){
        privacySetToPublicPage.clickSaveButton_Company();
    }

    @When("I click on save button in projects tab")
    public void clickSaveButton_Project(){
        privacySetToPublicPage.clickSaveButton_Project();
    }

    @Then("I verify '$lStrMessage' message is displayed")
    public void verifyMessage(@Named("lStrMessage") String lStrMessage){
        privacySetToPublicPage.verifyMessage(lStrMessage);
    }

    @When("I click on COMPANY tab")
    public void clickCompanyTab(){
        privacySetToPublicPage.clickCompanyTab();
    }

    @When("I click on PROJECTS tab")
    public void clickProjectsTab(){
        privacySetToPublicPage.clickProjectsTab();
    }

    @When("I click on FUNDS tab")
    public void clickFundsTab(){
        privacySetToPublicPage.clickFundsTab();
    }

    @When("I click on PRODUCTS tab")
    public void clickProductsTab(){
        privacySetToPublicPage.clickProductsTab();
    }

    @When("I click on projects of the deal sponsor")
    public void clickProjectOfDealSponsor(){
        privacySetToPublicPage.clickProjectOfDealSponsor();
    }

    @When("I click on funds of the deal sponsor")
    public void clickFundOfDealSponsor(){
        privacySetToPublicPage.clickFundOfDealSponsor();
    }

    @When("I click on projects of the deal sponsor whose privacy is private")
    public void clickProjectOfDealSponsor_Private(){
        privacySetToPublicPage.clickProjectOfDealSponsor_Private();
    }

    @When("I click on funds of the deal sponsor whose privacy is private")
    public void clickFundOfDealSponsor_Private(){
        privacySetToPublicPage.clickFundOfDealSponsor_Private();
    }

    @When("I click on funds of the investor whose privacy is private")
    public void clickFundOfInvestor_Private(){
        privacySetToPublicPage.clickFundOfInvestor_Private();
    }

    @When("I click on loan of the lender whose privacy is private")
     public void clickLoanOfLender_Private(){
        privacySetToPublicPage.clickLoanOfLender_Private();
    }

    @When("I click on mezz of the lender whose privacy is private")
    public void clickMezzOfLender_Private(){
        privacySetToPublicPage.clickMezzOfLender_Private();
    }

    @When("I click on service project of the real estate advisor whose privacy is private")
    public void clickServiceProject_Private(){
        privacySetToPublicPage.clickServiceProject_Private();
    }

    @When("I click on listing project of the real estate advisor whose privacy is private")
    public void clickListingProject_Private(){
        privacySetToPublicPage.clickListingProject_Private();
    }

}
