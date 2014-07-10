package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.MyUniversePage;
import test.pages.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 7/3/14
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyUniverseSteps {
    private final MyUniversePage myUniversePage;

    @Inject
    public MyUniverseSteps(PageFactory thePageFactory) {
        myUniversePage = thePageFactory.newMyUniversePage();
    }

    @When("I click on my universe radio button")
    public void clickMyUniverseRadioButton(){
        myUniversePage.clickMyUniverseRadioButton();
    }

    @When("I click on include radio button")
    public void clickIncludeRadioButton(){
       myUniversePage.clickIncludeRadioButton();
    }

    @When("I select deal sponsor check box")
    public void selectDealSponsorCheckBox(){
        myUniversePage.selectDealSponsorCheckBox();
    }

    @When("I select investor check box")
    public void selectInvestorCheckBox(){
        myUniversePage.selectInvestorCheckBox();
    }

    @When("I select lender check box")
    public void selectLenderCheckBox(){
        myUniversePage.selectLenderCheckBox();
    }

    @When("I select real estate advisor check box")
    public void selectRealEstateAdvisorCheckBox(){
        myUniversePage.selectRealEstateAdvisorCheckBox();
    }

    @When("I clear deal sponsor check box")
    public void clearDealSponsorCheckBox(){
        myUniversePage.clearDealSponsorCheckBox();
    }

    @When("I clear investor check box")
    public void clearInvestorCheckBox(){
        myUniversePage.clearInvestorCheckBox();
    }

    @When("I clear lender check box")
    public void clearLenderCheckBox(){
        myUniversePage.clearLenderCheckBox();
    }

    @When("I clear real estate advisor check box")
    public void clearRealEstateAdvisorCheckBox(){
        myUniversePage.clearRealEstateAdvisorCheckBox();
    }

    @When("I select sub role field of deal sponsor")
    public void selectSubRoleField_DealSponsor(){
        myUniversePage.selectSubRoleField_DealSponsor();
    }

    @When("I select sub role field of investor")
    public void selectSubRoleField_Investor(){
        myUniversePage.selectSubRoleField_Investor();
    }

    @When("I select sub role field of lender")
    public void selectSubRoleField_Lender(){
        myUniversePage.selectSubRoleField_Lender();
    }

    @When("I select sub role field of real estate advisor")
    public void selectSubRoleField_RealEstateAdvisor(){
        myUniversePage.selectSubRoleField_RealEstateAdvisor();
    }

    @When("I select developer sub role option")
    public void selectDeveloperOption(){
        myUniversePage.selectDeveloperOption();
    }

    @When("I select advisor sub role option")
    public void selectAdvisorOption(){
        myUniversePage.selectAdvisorOption();
    }

    @When("I select family office sub role option")
    public void selectFamilyOfficeOption(){
        myUniversePage.selectFamilyOfficeOption();
    }

    @When("I select advisor sub role option in real estate advisor")
    public void selectAdvisorOption_RealEstateAdvisor(){
        myUniversePage.selectAdvisorOption_RealEstateAdvisor();
    }

    @When("I clear advisor sub role option")
    public void clearAdvisorOption(){
        myUniversePage.clearAdvisorOption();
    }

    @When("I clear family office sub role option")
    public void clearFamilyOfficeOption(){
        myUniversePage.clearFamilyOfficeOption();
    }

    @When("I clear advisor sub role option of real estate advisor")
    public void clearRealEstateAdvisorAdvisorOption(){
        myUniversePage.clearRealEstateAdvisorAdvisorOption();
    }

    @When("I clear developer sub role option")
    public void clearDeveloperOption(){
        myUniversePage.clearDeveloperOption();
    }

    @When("I set the value in deal/fund size field of deal sponsor")
    public void setDealFundSize_DealSponsor(){
        myUniversePage.setDealFundSize_DealSponsor();
    }

    @When("I set the value in deal/fund size field of investor")
    public void setDealFundSize_Investor(){
        myUniversePage.setDealFundSize_Investor();
    }

    @When("I set the value in deal/fund size field of lender")
    public void setDealFundSize_Lender(){
        myUniversePage.setDealFundSize_Lender();
    }

    @When("I set the value in deal/fund size field of real estate advisor")
    public void setDealFundSize_RealEstateAdvisor(){
        myUniversePage.setDealFundSize_RealEstateAdvisor();
    }

    @When("I clear the value in deal/fund size field of deal sponsor")
    public void clearDealFundSize(){
        myUniversePage.clearDealFundSize_DealSponsor();
    }

    @When("I clear the value in deal/fund size field of investor")
    public void clearDealFundSize_Investor(){
        myUniversePage.clearDealFundSize_Investor();
    }

    @When("I clear the value in deal/fund size field of lender")
    public void clearDealFundSize_Lender(){
        myUniversePage.clearDealFundSize_Lender();
    }

    @When("I clear the value in deal/fund size field of real estate advisor")
    public void clearDealFundSize_RealEstateAdvisor(){
        myUniversePage.clearDealFundSize_RealEstateAdvisor();
    }


    @When("I select public radio button of deal sponsor")
    public void selectPublicRadioButton_DealSponsor(){
        myUniversePage.selectPublicRadioButton_DealSponsor();
    }

    @When("I select public radio button of investor")
    public void selectPublicRadioButton_Investor(){
        myUniversePage.selectPublicRadioButton_Investor();
    }

    @When("I select public radio button of lender")
    public void selectPublicRadioButton_Lender(){
        myUniversePage.selectPublicRadioButton_Lender();
    }

    @When("I select public radio button of real estate advisor")
    public void selectPublicRadioButton_RealEstateAdvisor(){
        myUniversePage.selectPublicRadioButton_RealEstateAdvisor();
    }

    @When("I select private radio button of deal sponsor")
    public void selectPrivateRadioButton_DealSponsor(){
        myUniversePage.selectPrivateRadioButton_DealSponsor();
    }

    @When("I select private radio button of investor")
    public void selectPrivateRadioButton_Investor(){
        myUniversePage.selectPrivateRadioButton_Investor();
    }

    @When("I select private radio button of lender")
    public void selectPrivateRadioButton_Lender(){
        myUniversePage.selectPrivateRadioButton_Lender();
    }

    @When("I select private radio button of real estate advisor")
    public void selectPrivateRadioButton_RealEstateAdvisor(){
        myUniversePage.selectPrivateRadioButton_RealEstateAdvisor();
    }

    @When("I click on location field")
    public void clickLocationField(){
        myUniversePage.clickLocationField();
    }

    @When("I clear on location field")
    public void clearLocationField(){
        myUniversePage.clearLocationField();
    }

    @When("I select the location of the user")
    public void selectLocation(){
        myUniversePage.selectLocation();
    }

    @When("I click on save button in my universe page of ME tab")
    public void clickSaveButton(){
        myUniversePage.clickSaveButton();
    }

    @When("I click on save button in my universe page of COMPANY tab")
    public void clickSaveButton_Company(){
        myUniversePage.clickSaveButton_Company();
    }

    @Then("I verify '$lStrUserName' user name who has set privacy include in my universe is displayed")
      public void verifyUserName_Universe(@Named("lStrUserName") String lStrUserName){
        myUniversePage.verifyUserName_Universe(lStrUserName);
    }

    @Then("I verify '$lStrCompanyName' company name who has set privacy include in my universe is displayed")
    public void verifyCompanyName_Universe(@Named("lStrCompanyName") String lStrCompanyName){
        myUniversePage.verifyCompanyName_Universe(lStrCompanyName);
    }

    @When("I click '$lStrUserName' user name who has set privacy include in my universe")
    public void clickUserName_Universe(@Named("lStrUserName")String lStrUserName){
        myUniversePage.clickUserName_Universe(lStrUserName);
    }

    @When("I click '$lStrCompanyName' company name who has set privacy include in my universe")
    public void clickCompanyName_Universe(@Named("lStrCompanyName")String lStrCompanyName){
        myUniversePage.clickCompanyName_Universe(lStrCompanyName);
    }

    @When("I click on Profile button")
    public void clickProfileButton(){
        myUniversePage.clickProfileButton();
    }

    @When("I click on edit button of the profile")
    public void clickEditButton(){
        myUniversePage.clickEditButton();
    }

    @When("I select developer option in I am a field")
    public void selectDeveloperOptionInIAmAField(){
        myUniversePage.selectDeveloperOptionInIAmAField();
    }

    @When("I select advisor option in I am a field")
    public void selectAdvisorOptionInIAmAField(){
        myUniversePage.selectAdvisorOptionInIAmAField();
    }

    @When("I select family office option in I am a field")
    public void selectFamilyOfficeOptionInIAmAField(){
        myUniversePage.selectFamilyOfficeOptionInIAmAField();
    }

    @When("I select advisor option in I am a field of real estate advisor profile")
    public void selectAdvisorOptionInIAmAField_RealEstateAdvisor(){
        myUniversePage.selectAdvisorOptionInIAmAField_RealEstateAdvisor();
    }

    @When("I click on save button in user profile page")
    public void clickOnSaveButtonInUserProfilePage(){
        myUniversePage.clickOnSaveButtonInUserProfilePage();
    }

    @When("I click on company tab in user profile")
    public void clickCompanyTabInUserProfile(){
        myUniversePage.clickCompanyTabInUserProfile();
    }

    @When("I click on edit in strategy field")
    public void clickEditOfStrategyField(){
        myUniversePage.clickEditOfStrategyField();
    }

    @When("I click on edit in investment strategy field")
    public void clickEditOfInvestmentStrategyField(){
        myUniversePage.clickEditOfInvestmentStrategyField();
    }

    @When("I click on edit in strategy field of lender profile")
    public void clickEditOfInvestmentStrategyField_Lender(){
        myUniversePage.clickEditOfInvestmentStrategyField_Lender();
    }

    @When("I click on edit in about field")
    public void clickEditOfAboutField(){
        myUniversePage.clickEditOfAboutField();
    }

    @When("I set the value of average deal size in user profile")
    public void setValueOfAverageDealSizeInUserProfile(){
        myUniversePage.setValueOfAverageDealSizeInUserProfile();
    }

    @When("I set the value of preferred deal size in user profile")
    public void setValueOfPreferredDealSizeInUserProfile(){
        myUniversePage.setValueOfPreferredDealSizeInUserProfile();
    }

    @When("I set the value of average loan amount in user profile")
    public void setValueOfAverageLoanAmount(){
        myUniversePage.setValueOfAverageLoanAmount();
    }

    @When("I set the value of average transaction size in user profile")
    public void setValueOfAverageTransactionSize(){
        myUniversePage.setValueOfAverageTransactionSize();
    }

    @When("I click on save button in strategy field")
    public void clickSaveButtonInStrategyField(){
        myUniversePage.clickSaveButtonInStrategyField();
    }

    @When("I click on save button in about field")
    public void clickSaveButtonInAboutField(){
        myUniversePage.clickSaveButtonInAboutField();
    }


   /* @Then("I verify user whose profile is set to include in my universe is not displayed")
    public void verifyIncludeProfileUserNameNotDisplayed() throws Exception {
        myUniversePage.verifyIncludeProfileUserNameNotDisplayed(5);
    }*/

}
