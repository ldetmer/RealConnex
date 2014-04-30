package test.steps;


import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.Support.ReadData;
import test.pages.AdvisorSearchPage;
import test.pages.PageFactory;

public class AdvisorSearchSteps {
    private final AdvisorSearchPage advisorSearchPage;
    ReadData ReadData = new ReadData();

    @Inject
    public AdvisorSearchSteps(PageFactory thePageFactory) {
        advisorSearchPage = thePageFactory.newAdvisorSearchPage();
    }

    @Then("I should see 'Appraisal' as strategy in search option")
    public void verifyStrategy(){
        try {
            String strVerifyStrategy = ReadData.readDataExcel("RealEstateDetails", 1 , "VerifyStrategy");
            String strStrategy = advisorSearchPage.verifyStrategy(strVerifyStrategy);
            Assert.assertEquals("Expected result doesnt match with actual result",strVerifyStrategy,strStrategy);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @When("I click on Appraisal Company")
    public void clickAppraisalUser(){
        advisorSearchPage.clickAppraisalCompany(1);
    }

    @When("I click on Service User")
    public void clickServiceUser(){
        advisorSearchPage.clickServiceUser(3);
    }

    @When("I enter location of advisor in text field")
    public void enterLocation(){
        advisorSearchPage.enterLocation(1);
    }

    @When("I click on the advisor location")
    public void clickLocation(){
        advisorSearchPage.clickLocation(1);
    }

    @Then("I verify Location field of advisor")
    public void verifyLocation(){
        advisorSearchPage.verifyLocation(1);
    }

    @When("I enter project details")
    public void enterProjectSize(){
        advisorSearchPage.enterProjectSize(1);
    }

    /*@When("I clear project field")
    public void clearProject(){
        advisorSearchPage.clearProject();
    }*/

    @When("I click on 'Core Activity'")
    public void clickCoreActivity(){
        advisorSearchPage.clickCoreActivity();
    }

    @When("I select option in 'Core Activity'")
    public void selectCoreActivity(){
        advisorSearchPage.selectCoreActivity();
    }

    @Then("I verify company of '$strSideSearch' is not displayed")
    public void otherCompany(@Named("$strSideSearch") String strSideSearch){
        advisorSearchPage.otherCompany(2,strSideSearch);
    }

    @Then("I verify service of '$strSideSearch' is not displayed")
    public void otherService(@Named("$strSideSearch") String strSideSearch){
        advisorSearchPage.otherService(3,strSideSearch);
    }

    @Then("I verify company of '$strSideSearch' is displayed")
    public void verifyCompany(@Named("strSideSearch") String strSideSearch){
        advisorSearchPage.verifyCompany(2,strSideSearch);
    }

    @Then("I verify service of '$strSideSearch' is displayed")
    public void verifyService(@Named("strSideSearch") String strSideSearch){
        advisorSearchPage.verifyService(3,strSideSearch);
    }

    @Then("I verify advisor company name of all search option is displayed")
    public void companyNameOfAllSearchOption(){
        Assert.assertTrue("Searched Results are not matching", advisorSearchPage.companyNameOfAllSearchOption(2));
    }

    @Then("I verify advisor service name of all search option is displayed")
    public void serviceNameOfAllSearchOption(){
        Assert.assertTrue("Searched Results are not matching", advisorSearchPage.serviceNameOfAllSearchOption(3));
    }

    @When("I select two options in core activity field")
    public void selectOptions(){
        advisorSearchPage.selectOptions();
    }

    @When("I clear core activity field")
    public void clearCoreField(){
        advisorSearchPage.clearCoreField();
    }

    @When("I click on environmental in core activity")
     public void clickEnvironmental(){
        advisorSearchPage.clickEnvironmental();
    }

    @When("I click on owner in core activity")
    public void clickOwner(){
        advisorSearchPage.clickOwner();
    }

    @When("I click on facilities in core activity")
    public void clickFacilities(){
        advisorSearchPage.clickFacilities();
    }

    @When("I click on government in core activity")
    public void clickGovernment(){
        advisorSearchPage.clickGovernment();
    }

    @When("I click on public in core activity")
    public void clickPublic(){
        advisorSearchPage.clickPublic();
    }

    @When("I clear government field in core activity")
    public void clearGovernment(){
        advisorSearchPage.clearGovernment();
    }

    @When("I click on energy in core activity")
    public void clickEnergy(){
        advisorSearchPage.clickEnergy();
    }

    @When("I click on research in core activity")
    public void clickResearch(){
        advisorSearchPage.clickResearch();
    }

    @When("I click on valuations in core activity")
    public void clickValuations(){
        advisorSearchPage.clickValuations();
    }

    @When("I click on client in core activity")
    public void clickClient(){
        advisorSearchPage.clickClient();
    }

    @When("I click on tenant in core activity")
    public void clickTenant(){
        advisorSearchPage.clickTenant();
    }

    @When("I click value recovery in core activity")
    public void clickValueRecovery(){
        advisorSearchPage.clickValueRecovery();
    }

    @When("I click on property in core activity")
    public void clickProperty(){
        advisorSearchPage.clickProperty();
    }

    @When("I click on rezones in core activity")
    public void clickRezones(){
        advisorSearchPage.clickRezones();
    }

    @When("I click on corporate in core activity")
    public void clickCorporate(){
        advisorSearchPage.clickCorporate();
    }

    @When("I click on platform in core activity")
    public void clickPlatform(){
        advisorSearchPage.clickPlatform();
    }

    @When("I click on other in core activity")
    public void clickOther(){
        advisorSearchPage.clickOther();
    }

    @When("I clear property field in core activity")
    public void clearProperty(){
        advisorSearchPage.clearProperty();
    }

    @When("I click on servicing in core activity")
    public void clickServicing(){
        advisorSearchPage.clickServicing();
    }

    @When("I click on core other in core activity")
    public void clickCoreOther(){
        advisorSearchPage.clickCoreOther();
    }

    @When("I clear the core field")
    public void clearCore(){
        advisorSearchPage.clearCore();
    }

    @When("I click on 'Asset Experience'")
    public void clickAssetExperience(){
        advisorSearchPage.clickAssetExperience();
    }

    @When("I select option in 'Asset Experience'")
    public void selectAssetExperience(){
        advisorSearchPage.selectAssetExperience();
    }

    @When("I select two options in asset drop down")
    public void selectTwoOptions(){
        advisorSearchPage.selectTwoOptions();
    }

    @When("I clear asset field")
    public void clearAssetField(){
        advisorSearchPage.clearAssetField();
    }

    @When("I click on multi option in asset")
    public void clickMulti(){
        advisorSearchPage.clickMulti();
    }

    @When("I click on hotel option in asset")
    public void clickHotel(){
        advisorSearchPage.clickHotel();
    }

    @When("I click on sports option in asset")
    public void clickSports(){
        advisorSearchPage.clickSports();
    }

    @When("I click on health option in asset")
    public void clickHealth(){
        advisorSearchPage.clickHealth();
    }

    @When("I click on storage option in asset")
    public void clickStorage(){
        advisorSearchPage.clickStorage();
    }

    @When("I click on asset other option in asset")
    public void clickAssetOther(){
        advisorSearchPage.clickAssetOther();
    }

    @When("I click on retail option in asset")
    public void clickRetail(){
        advisorSearchPage.clickRetail();
    }

    @When("I click on industrial option in asset")
    public void clickIndustrial(){
        advisorSearchPage.clickIndustrial();
    }

    @When("I click on residential option in asset")
    public void clickResidential(){
        advisorSearchPage.clickResidential();
    }

    @When("I click on single option in asset")
    public void clickSingle(){
        advisorSearchPage.clickSingle();
    }

    @When("I click on retirement option in asset")
    public void clickRetirement(){
        advisorSearchPage.clickRetirement();
    }

    @When("I click on student option in asset")
    public void clickStudent(){
        advisorSearchPage.clickStudent();
    }

    @When("I click on residential other option in asset")
    public void clickResidentialOther(){
        advisorSearchPage.clickResidentialOther();
    }

    @When("I click on residential multi option in asset")
    public void clickResidentialMulti(){
        advisorSearchPage.clickResidentialMulti();
    }

    @When("I clear residential field in asset option")
    public void clearResidential(){
        advisorSearchPage.clearResidential();
    }

    @When("I click on mixed option in asset")
    public void clickMixed(){
        advisorSearchPage.clickMixed();
    }

    @When("I click on commercial option in asset")
    public void clickCommercial(){
        advisorSearchPage.clickCommercial();
    }

    @When("I click on solar option in asset")
    public void clickSolar(){
        advisorSearchPage.clickSolar();
    }

    @When("I clear asset options in asset drop down field")
    public void clearAsset(){
        advisorSearchPage.clearAsset();
    }

    @When("I click on 'Deal Stage'")
    public void clickDealStage(){
        advisorSearchPage.clickDealStage();
    }

    @When("I select a option in 'DealStage'")
    public void selectDealStage(){
        advisorSearchPage.selectDealStage();
    }

    @When("I select two options in deal stage drop down")
    public void twoOptions(){
        advisorSearchPage.twoOptions();
    }

    @When("I clear deal field")
    public void clearDealField(){
        advisorSearchPage.clearDealField();
    }

    @When("I click on concept option in deal stage")
    public void clickConcept(){
        advisorSearchPage.clickConcept();
    }

    @When("I click on permitted option in deal stage")
    public void clickPermitted(){
        advisorSearchPage.clickPermitted();
    }

    @When("I click on ready option in deal stage")
    public void clickReady(){
        advisorSearchPage.clickReady();
    }

    @When("I click on LOI option in deal stage")
    public void clickLOI(){
        advisorSearchPage.clickLOI();
    }

    @When("I click on under contract option in deal stage")
    public void clickUnderContract(){
        advisorSearchPage.clickUnderContract();
    }

    @When("I click on plans option in deal stage")
    public void clickPlans(){
        advisorSearchPage.clickPlans();
    }

    @When("I click on under construction option in deal stage")
    public void clickUnderConstruction(){
        advisorSearchPage.clickUnderConstruction();
    }

    @When("I click on pursuit option in deal stage")
    public void clickPursuit(){
        advisorSearchPage.clickPursuit();
    }

    @When("I click on in DD option in deal stage")
    public void clickInDD(){
        advisorSearchPage.clickInDD();
    }

    @When("I clear deal stage field")
    public void clearDealStage(){
        advisorSearchPage.clearDealStage();
    }






































  /*  @When("I click on 'Profile and Experience'")
    public void clickProfile(){
        advisorSearchPage.clickProfile();
    }

    @When("I enter 'Number of Office' in text field")
    public void numOfOffice(){
        advisorSearchPage.numOfOffice(1);
    }

    @When("I enter 'Number of Professionals' in text field")
    public void numOfProfessional(){
        advisorSearchPage.numOfProfessional(1);
    }

    @When("I click on Service User")
    public void clickServiceUser(){
        advisorSearchPage.clickServiceUser(3);
    }*/
      /* */


}
