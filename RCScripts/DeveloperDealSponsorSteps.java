package test.steps;


import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.DeveloperDealSponsorPage;
import test.pages.PageFactory;

import javax.inject.Inject;

public class DeveloperDealSponsorSteps {
    public final DeveloperDealSponsorPage developerDealSponsorPage;

    @Inject
    public DeveloperDealSponsorSteps(PageFactory thePageFactory) {
        developerDealSponsorPage = thePageFactory.newDeveloperDealSponsorPage();
    }

    @Then("I verify subrole is displayed as $nameOSubrole")
    public void verifySearchOption(@Named("nameOSubrole") String strSubrole){
        String lStrSubRole = developerDealSponsorPage.verifySearchOption();
        Assert.assertTrue(strSubrole.contains(lStrSubRole));
    }

    @Then("I verify 'Deal Sponsor' name is displayed")
    public void verifyDealSponsorName(){
        developerDealSponsorPage.verifyDealSponsorName(1);
    }

    @When("I click on retrieved Deal Sponsor name")
    public void clickSearchedDealSponsor(){
        developerDealSponsorPage.clickSearchedDealSponsor(1);
    }

    @When("I click on Deal Sponsor company name")
    public void clickDealSponsorCompany(){
        developerDealSponsorPage.clickDealSponsorCompany(1);
    }

    @When("I enter location in text field")
    public void enterLocation(){
        developerDealSponsorPage.enterLocation(1);
    }

    @Then("I verify Location field in side search")
    public void verifyLocation(){
        developerDealSponsorPage.verifyLocation(1);
    }

    @When("I clear location text field")
    public void clearLocation(){
        developerDealSponsorPage.clearLocation();
    }

    @When("I click on 'Project' field")
    public void clickProject(){
        developerDealSponsorPage.clickProject();
    }

    @Then("I verify company of '$strSideSearch' is not displayed")
    public void otherCompany(@Named("$strSideSearch") String strSideSearch){
        developerDealSponsorPage.otherCompany(2,strSideSearch);
    }

    @Then("I verify user of '$strSideSearch' is not displayed")
    public void otherUser(@Named("$strSideSearch") String strSideSearch){
        developerDealSponsorPage.otherUsers(1,strSideSearch);
    }


    @When("I select buy land and operating companies strategy in drop down")
    public void selectSecondStrategy(){
        developerDealSponsorPage.selectSecondStrategy();
    }

    @Then("I verify company of '$strSideSearch' is displayed")
    public void verifyCompany(@Named("strSideSearch") String strSideSearch){
        developerDealSponsorPage.verifyCompany(2,strSideSearch);
    }

    @Then("I verify user of '$strSideSearch' is displayed")
    public void verifyUser(@Named("strSideSearch") String strSideSearch){
        developerDealSponsorPage.verifyUser(1,strSideSearch);
    }

    @Then("I should see desired company name of deal sponsor")
    public void searchedCompany(){
        Assert.assertTrue("Searched Results are not matching", developerDealSponsorPage.searchedCompany(1));
    }

    @Then("I verify company name of all search option is displayed")
    public void companyNameOfAllSearchOption(){
        Assert.assertTrue("Searched Results are not matching", developerDealSponsorPage.companyNameOfAllSearchOption(1));
    }

    @When("I click on 'Strategy' drop down field")
    public void clickStrategy(){
        developerDealSponsorPage.clickStrategy();
    }

    @When("I select a strategy in drop down list")
    public void selectStrategy(){
        developerDealSponsorPage.selectStrategy();
    }

    @Then("I verify user of all option is displayed")
    public void userOfAllSearchOption(){
        Assert.assertTrue("Searched Results are not matching", developerDealSponsorPage.userOfAllSearchOption(1));
    }

    @When("I click on development strategy")
    public void clickDevelopment(){
        developerDealSponsorPage.clickDevelopment();
    }

    @When("I click on build strategy")
    public void clickBuild(){
        developerDealSponsorPage.clickBuild();
    }

    @When("I click on spec strategy")
    public void clickSpec(){
        developerDealSponsorPage.clickSpec();
    }

    @When("I click on development develop strategy")
    public void clickDevelopmentDevelop(){
        developerDealSponsorPage.clickDevelopmentDevelop();
    }

    @When("I click on forward strategy")
    public void clickForward(){
        developerDealSponsorPage.clickForward();
    }

    @When("I click on build and sell strategy")
    public void clickBuildAndSell(){
        developerDealSponsorPage.clickBuildAndSell();
    }

    @When("I clear development field in strategy drop down field")
    public void clearDevelopmentField(){
        developerDealSponsorPage.clearDevelopmentField();
    }

    @When("I click on corporate strategy")
    public void clickCorporate(){
        developerDealSponsorPage.clickCorporate();
    }

    @When("I click on land banking strategy")
    public void clickLandBanking(){
        developerDealSponsorPage.clickLandBanking();
    }

    @When("I clear corporate in strategy drop down field")
    public void clearCorporate(){
        developerDealSponsorPage.clearCorporate();
    }

    @When("I click on operating strategy")
    public void clickOperating(){
        developerDealSponsorPage.clickOperating();
    }

    @When("I click on portfolio strategy")
    public void clickPortfolio(){
        developerDealSponsorPage .clickPortfolio();
    }

    @When("I click on recapitalization strategy")
    public void clickRecapitalizations(){
        developerDealSponsorPage .clickRecapitalizations();
    }

    @When("I click on sales strategy")
    public void clickSales(){
        developerDealSponsorPage .clickSales();
    }

    @When("I click on asset strategy")
    public void clickAsset(){
        developerDealSponsorPage .clickAsset();
    }

    @When("I click on stabilized strategy")
    public void clickStabilized(){
        developerDealSponsorPage .clickStabilized();
    }

    @When("I click on repositioning strategy")
    public void clickRepositioning(){
        developerDealSponsorPage .clickRepositioning();
    }

    @When("I click on redevelopment strategy")
    public void clickRedevelopment(){
        developerDealSponsorPage .clickRedevelopment();
    }

    @When("I click on reo strategy")
    public void clickREO(){
        developerDealSponsorPage .clickREO();
    }

    @When("I click on flip strategy")
    public void clickFlip(){
        developerDealSponsorPage .clickFlip();
    }

    @When("I click on buy strategy")
    public void clickBuy(){
        developerDealSponsorPage .clickBuy();
    }

    @When("I click on asset other strategy")
    public void clickAssetOther(){
        developerDealSponsorPage .clickAssetOther();
    }

    @When("I click on lease strategy")
    public void clickLease(){
        developerDealSponsorPage .clickLease();
    }

    @When("I clear asset acquisitions in strategy field")
    public void clearAssetAcquisitions(){
        developerDealSponsorPage.clearAssetAcquisitions();
    }

    @When("I click on land strategy")
    public void clickLand(){
        developerDealSponsorPage .clickLand();
    }

    @When("I click on develop strategy")
    public void clickDevelop(){
        developerDealSponsorPage .clickDevelop();
    }

    @When("I click on land other strategy")
    public void clickLandOther(){
        developerDealSponsorPage .clickLandOther();
    }

    @When("I click on speculation strategy")
    public void clickSpeculation(){
        developerDealSponsorPage .clickSpeculation();
    }
    @When("I click on land develop strategy")
    public void clickLandDevelop(){
        developerDealSponsorPage .clickLandDevelop();
    }

    @When("I click on land flip strategy")
    public void clickLandFlip(){
        developerDealSponsorPage .clickLandFlip();
    }

    @When("I clear land field in strategy drop down")
    public void clearLand(){
        developerDealSponsorPage.clearLand();
    }

    @When("I click on notes strategy")
    public void clickNotes(){
        developerDealSponsorPage .clickNotes();
    }

    @When("I click on platform build strategy")
    public void clickPlatformBuild(){
        developerDealSponsorPage .clickPlatformBuild();
    }

    @When("I click on public strategy")
    public void clickPublic(){
        developerDealSponsorPage .clickPublic();
    }

    @When("I click on rezones strategy")
    public void clickRezones(){
        developerDealSponsorPage .clickRezones();
    }

    @When("I click on others strategy")
    public void clickOther(){
        developerDealSponsorPage .clickOther();
    }

    @When("I clear strategy field")
    public void clearStrategy(){
        developerDealSponsorPage.clearStrategy();
    }

    @When("I clear strategy field of deal sponsor")
    public void clearStrategyField(){
        developerDealSponsorPage.clearStrategyField();
    }
}

