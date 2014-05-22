package test.steps;



import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.DealSponsorValidationPage;
import test.pages.PageFactory;

import javax.inject.Inject;

public class DealSponsorValidationSteps {
    public final DealSponsorValidationPage dealSponsorValidationPage;

    @Inject
    public DealSponsorValidationSteps(PageFactory thePageFactory) {
        dealSponsorValidationPage = thePageFactory.newDealSponsorValidationPage();
    }

    @Then("I verify user of '$strSideSearch' is displayed")
    public void verifyUser(@Named("strSideSearch") String strSideSearch){
        Assert.assertTrue("Search Result are not matching",dealSponsorValidationPage.verifyUser(1,strSideSearch));
    }

    @Then("I verify user of '$strSideSearch' is not displayed")
    public void otherUser(@Named("$strSideSearch") String strSideSearch){
        Assert.assertTrue("Searching failed",dealSponsorValidationPage.otherUsers(1,strSideSearch));
    }

    @Then("I verify user of all option is displayed")
    public void userOfAllSearchOption(){
        Assert.assertTrue("Searched Results are not matching", dealSponsorValidationPage.userOfAllSearchOption(1));
    }

    @When("I select buy land and operating companies strategy in drop down")
    public void selectSecondStrategy(){
        dealSponsorValidationPage.selectSecondStrategy();
    }

    @When("I clear strategy field")
    public void clearStrategy(){
        dealSponsorValidationPage.clearStrategy();
    }

    @When("I click on development strategy")
    public void clickDevelopment(){
        dealSponsorValidationPage.clickDevelopment();
    }

    @When("I click on build strategy")
    public void clickBuild(){
        dealSponsorValidationPage.clickBuild();
    }

    @When("I click on spec strategy")
    public void clickSpec(){
        dealSponsorValidationPage.clickSpec();
    }

    @When("I click on development develop strategy")
    public void clickDevelopmentDevelop(){
        dealSponsorValidationPage.clickDevelopmentDevelop();
    }

    @When("I click on forward strategy")
    public void clickForward(){
        dealSponsorValidationPage.clickForward();
    }

    @When("I click on build and sell strategy")
    public void clickBuildAndSell(){
        dealSponsorValidationPage.clickBuildAndSell();
    }

    @When("I clear development field in strategy drop down field")
    public void clearDevelopmentField(){
        dealSponsorValidationPage.clearDevelopmentField();
    }

    @When("I click on corporate strategy")
    public void clickCorporate(){
        dealSponsorValidationPage.clickCorporate();
    }

    @When("I click on land banking strategy")
    public void clickLandBanking(){
        dealSponsorValidationPage.clickLandBanking();
    }

    @When("I clear corporate in strategy drop down field")
    public void clearCorporate(){
        dealSponsorValidationPage.clearCorporate();
    }

    @When("I click on operating strategy")
    public void clickOperating(){
        dealSponsorValidationPage.clickOperating();
    }

    @When("I click on portfolio strategy")
    public void clickPortfolio(){
        dealSponsorValidationPage.clickPortfolio();
    }

    @When("I click on recapitalization strategy")
    public void clickRecapitalizations(){
        dealSponsorValidationPage.clickRecapitalizations();
    }

    @When("I click on sales strategy")
    public void clickSales(){
        dealSponsorValidationPage.clickSales();
    }

    @When("I click on asset strategy")
    public void clickAsset(){
        dealSponsorValidationPage.clickAsset();
    }

    @When("I click on stabilized strategy")
    public void clickStabilized(){
        dealSponsorValidationPage.clickStabilized();
    }

    @When("I click on repositioning strategy")
    public void clickRepositioning(){
        dealSponsorValidationPage.clickRepositioning();
    }

    @When("I click on redevelopment strategy")
    public void clickRedevelopment(){
        dealSponsorValidationPage.clickRedevelopment();
    }

    @When("I click on reo strategy")
    public void clickREO(){
        dealSponsorValidationPage.clickREO();
    }

    @When("I click on flip strategy")
    public void clickFlip(){
        dealSponsorValidationPage.clickFlip();
    }

    @When("I click on buy strategy")
    public void clickBuy(){
        dealSponsorValidationPage.clickBuy();
    }

    @When("I click on asset other strategy")
    public void clickAssetOther(){
        dealSponsorValidationPage.clickAssetOther();
    }

    @When("I click on lease strategy")
    public void clickLease(){
        dealSponsorValidationPage.clickLease();
    }

    @When("I clear asset acquisitions in strategy field")
    public void clearAssetAcquisitions(){
        dealSponsorValidationPage.clearAssetAcquisitions();
    }

    @When("I click on land strategy")
    public void clickLand(){
        dealSponsorValidationPage.clickLand();
    }

    @When("I click on develop strategy")
    public void clickDevelop(){
        dealSponsorValidationPage.clickDevelop();
    }

    @When("I click on land other strategy")
    public void clickLandOther(){
        dealSponsorValidationPage.clickLandOther();
    }

    @When("I click on speculation strategy")
    public void clickSpeculation(){
        dealSponsorValidationPage.clickSpeculation();
    }
    @When("I click on land develop strategy")
    public void clickLandDevelop(){
        dealSponsorValidationPage.clickLandDevelop();
    }

    @When("I click on land flip strategy")
    public void clickLandFlip(){
        dealSponsorValidationPage.clickLandFlip();
    }

    @When("I clear land field in strategy drop down")
    public void clearLand(){
        dealSponsorValidationPage.clearLand();
    }

    @When("I click on notes strategy")
    public void clickNotes(){
        dealSponsorValidationPage.clickNotes();
    }

    @When("I click on platform build strategy")
    public void clickPlatformBuild(){
        dealSponsorValidationPage.clickPlatformBuild();
    }

    @When("I click on public strategy")
    public void clickPublic(){
        dealSponsorValidationPage.clickPublic();
    }

    @When("I click on rezones strategy")
    public void clickRezones(){
        dealSponsorValidationPage.clickRezones();
    }

    @When("I click on others strategy")
    public void clickOther(){
        dealSponsorValidationPage.clickOther();
    }

    @When("I clear strategy field of deal sponsor")
    public void clearStrategyField(){
        dealSponsorValidationPage.clearStrategyField();
    }

    @When("I click on asset option")
    public void clickAssetOption(){
        dealSponsorValidationPage.clickAssetOption();
    }

}
