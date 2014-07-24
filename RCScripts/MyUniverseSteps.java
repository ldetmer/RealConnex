package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.*;
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

    @When("I click on close tutorial field")
    public void clickCloseTutorialField(){
        myUniversePage.clickCloseTutorialField();
    }

    @When("I click on my universe radio button")
    public void clickMyUniverseRadioButton(){
        myUniversePage.clickMyUniverseRadioButton();
    }

    @When("I click on include radio button")
    public void clickIncludeRadioButton(){
       myUniversePage.clickIncludeRadioButton();
    }

    @When("I click on exclude radio button")
    public void clickExcludeRadioButton(){
        myUniversePage.clickExcludeRadioButton();
    }

    @When("I select deal sponsor check box")
    public void selectDealSponsorCheckBox(){
        myUniversePage.selectDealSponsorCheckBox();
    }

    @When("I select deal sponsor check box in my universe exclude")
    public void selectDealSponsorCheckBoxInExclude(){
        myUniversePage.selectDealSponsorCheckBoxInExclude();
    }

    @When("I select investor check box in my universe exclude")
    public void selectInvestorCheckBoxInExclude(){
        myUniversePage.selectInvestorCheckBoxInExclude();
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

    @When("I select sub role field of deal sponsor in my universe exclude")
    public void selectSubRoleField_DealSponsorInMyUniverseExclude(){
        myUniversePage.selectSubRoleField_DealSponsorInMyUniverseExclude();
    }

    @When("I select sub role field of investor in my universe exclude")
    public void selectSubRoleField_InvestorInMyUniverseExclude(){
        myUniversePage.selectSubRoleField_InvestorInMyUniverseExclude();
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

    @When("I select developer sub role option in my universe exclude")
    public void selectDeveloperOptionInMyUniverseExclude(){
        myUniversePage.selectDeveloperOptionInMyUniverseExclude();
    }

    @When("I select advisor sub role option in my universe exclude")
    public void selectAdvisorOptionInMyUniverseExclude(){
        myUniversePage.selectAdvisorOptionInMyUniverseExclude();
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

    @When("I set the value in deal/fund size field of deal sponsor in my universe exclude")
    public void setDealFundSize_DealSponsorInMyUniverseExclude(){
        myUniversePage.setDealFundSize_DealSponsorInMyUniverseExclude();
    }

    @When("I set the value in deal/fund size field of investor in my universe exclude")
    public void setDealFundSize_InvestorInMyUniverseExclude(){
        myUniversePage.setDealFundSize_InvestorInMyUniverseExclude();
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

    @When("I select public option in drop down")
    public void selectPublicOption(){
        myUniversePage.selectPublicOption();
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

    @When("I click on save button in my universe page of PROJECT tab")
    public void clickSaveButton_Project(){
        myUniversePage.clickSaveButton_Project();
    }

    @Then("I verify '$lStrUserName' user name who has set privacy include in my universe is displayed")
        @Alias("I verify '$lStrUserName' user name who has set privacy exclude in my universe is displayed")
    public void verifyUserName_Universe(@Named("lStrUserName") String lStrUserName){
        myUniversePage.verifyUserName_Universe(lStrUserName);
    }

    @Then("I verify '$lStrCompanyName' company name who has set privacy include in my universe is displayed")
    public void verifyCompanyName_Universe(@Named("lStrCompanyName") String lStrCompanyName){
        myUniversePage.verifyCompanyName_Universe(lStrCompanyName);
    }

    @Then("I verify '$lStrProjectName' deal sponsor project name who has set privacy to public in include of my universe is displayed")
        @Aliases(values = {"I verify '$lStrFundName' deal sponsor fund name who has set privacy to public in include of my universe is displayed",
                            "I verify '$lStrFundName' investor fund name who has set privacy in include of my universe is displayed"})
    public void verifyProjectName_Universe(@Named("lStrCompanyName") String lStrCompanyName){
        myUniversePage.verifyProjectName_Universe(lStrCompanyName);
    }

    @Then("I verify '$lStrLoanName' lender loan name who has set privacy in include of my universe is displayed")
    @Alias("I verify '$lStrLoanName' lender mezz name who has set privacy in include of my universe is displayed")
    public void verifyLoanName_Universe(@Named("lStrLoanName") String lStrLoanName){
        myUniversePage.verifyLoanName_Universe(lStrLoanName);
    }

    @When("I click '$lStrUserName' user name who has set privacy include in my universe")
        @Alias("I click '$lStrUserName' user name who has set privacy exclude in my universe")
    public void clickUserName_Universe(@Named("lStrUserName")String lStrUserName){
        myUniversePage.clickUserName_Universe(lStrUserName);
    }

    @When("I click '$lStrCompanyName' company name who has set privacy include in my universe")
    public void clickCompanyName_Universe(@Named("lStrCompanyName")String lStrCompanyName){
        myUniversePage.clickCompanyName_Universe(lStrCompanyName);
    }

    @When("I click '$lStrProjectName' deal sponsor project name who has set privacy to public in include of my universe")
        @Aliases(values = {"I click '$lStrFundName' deal sponsor fund name who has set privacy to public in include of my universe",
                            "I click '$lStrFundName' investor fund name who has set privacy in include of my universe"})
    public void clickProjectName_Universe(@Named("lStrUserName")String lStrUserName){
        myUniversePage.clickProjectName_Universe(lStrUserName);
    }

    @When("I click '$lStrLoanName' lender loan name who has set privacy in include of my universe")
        @Alias("I click '$lStrLoanName' lender mezz name who has set privacy in include of my universe")
    public void clickLoanName_Universe(@Named("lStrLoanName") String lStrLoanName){
        myUniversePage.clickLoanName_Universe(lStrLoanName);
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

    @When("I click on edit company field")
    public void clickOnEditCompanyField(){
        myUniversePage.clickOnEditCompanyField();
    }

    @When("I enter company name")
    public void enterCompanyName(){
        myUniversePage.enterCompanyName();
    }

    @When("I select developer option in We are a field")
    public void selectDeveloperInWeAreAField(){
        myUniversePage.selectDeveloperInWeAreAField();
    }

    @When("I select advisor option in We are a field")
    public void selectAdvisorInWeAreAField(){
        myUniversePage.selectAdvisorInWeAreAField();
    }

    @When("I select family office option in We are a field")
    public void selectFamilyOfficeInWeAreAField(){
        myUniversePage.selectFamilyOfficeInWeAreAField();
    }

    @When("I select advisor option in We are a field of real estate advisor profile")
    public void selectAdvisorOfRealEstateAdvisorProfileInWeAreAField(){
        myUniversePage.selectAdvisorOfRealEstateAdvisorProfileInWeAreAField();
    }

    @When("I click on save button of company profile")
    public void clickSaveButtonOfCompanyProfile(){
        myUniversePage.clickSaveButtonOfCompanyProfile();
    }

    @When("I select value in investment amount slider of investor fund whose privacy is set to private in my universe include")
    public void setInvestmentAmountOfInvestor_Private(){
        myUniversePage.setInvestmentAmountOfInvestorProjectIsSetToPrivate();
    }

    @When("I click on loan of the lender whose privacy is set in my universe include")
    public void clickLoanOfLenderMyUniverse(){
        myUniversePage.clickLoanOfLenderMyUniverse();
    }

    @When("I click on mezz of the lender whose privacy is set in my universe include")
    public void clickMezzOfLenderMyUniverse(){
        myUniversePage.clickMezzOfLenderMyUniverse();
    }

    @When("I click on service project of the real estate advisor who set privacy in my universe include")
    public void clickServiceProjectMyUniverseInclude(){
        myUniversePage.clickServiceProjectMyUniverseInclude();
    }

    @When("I click on listing project of the real estate advisor who set privacy in my universe include")
    public void clickListingProjectMyUniverseInclude(){
        myUniversePage.clickListingProjectMyUniverseInclude();
    }

    @Then("I verify '$lStrProjectOfServiceProviderName' property service provider service name who set privacy in my universe include is displayed")
        @Alias("I verify '$lStrProjectOfServiceProviderName' property service provider listing name who set privacy in my universe include is displayed")
    public void verifyProjectOfServiceProviderNameMyUniverseInclude(@Named("$lStrProjectOfServiceProviderName") String lStrProjectOfServiceProviderName){
        myUniversePage.verifyProjectOfServiceProviderNameMyUniverseInclude(lStrProjectOfServiceProviderName);
    }

    @When("I click on '$lStrLoanName' property service provider service name who set privacy in my universe include")
    @Alias("I click on '$lStrLoanName' property service provider listing name who set privacy in my universe include")
    public void clickProjectOfServiceProviderNameInMyUniverse(@Named("lStrLoanName") String lStrLoanName){
        myUniversePage.clickProjectOfServiceProviderNameInMyUniverse(lStrLoanName);
    }

    @Then("I verify '$lStrProjectOfLender' lender loan name who set privacy in my universe include is displayed")
    @Alias("I verify '$lStrProjectOfLender' lender mezz name who set privacy in my universe include is displayed")
    public void verifyProjectOfLenderNameMyUniverseInclude(@Named("$lStrProjectOfLender") String lStrProjectOfLender){
        myUniversePage.verifyProjectOfLenderNameMyUniverseInclude(lStrProjectOfLender);
    }

    @When("I click on '$lStrProjectOfLender' lender loan name who set privacy in my universe include")
    @Alias("I click on '$lStrProjectOfLender' lender mezz name who set privacy in my universe include")
    public void clickProjectOfLenderNameInMyUniverse(@Named("lStrProjectOfLender") String lStrProjectOfLender){
        myUniversePage.clickProjectOfLenderNameInMyUniverse(lStrProjectOfLender);
    }

}
