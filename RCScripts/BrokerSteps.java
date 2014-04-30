package test.steps;


import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.BrokerPage;
import test.pages.PageFactory;

import javax.inject.Inject;

public class BrokerSteps {
    private final BrokerPage brokerPage;

    @Inject
    public BrokerSteps(PageFactory thePageFactory) {
        brokerPage = thePageFactory.newBrokerPage();
    }

    @Then("I should see 'Real Estate Advisors' as find in search option")
    public void verifyFindSearch(){
        brokerPage.verifyFindSearch(1);
    }

    @Then("I should see 'Residential Broker' as subrole in search option")
    public void verifySubRoleOfBroker(){
        brokerPage.verifySubRoleOfBroker(1);
    }

    @Then("I should see 'Acquisitions' as strategy in search option")
    public void verifyStrategy(){
        brokerPage.verifyStrategy(2);
    }

    @When("I enter location of broker in text field")
    public void enterLocation(){
        brokerPage.enterLocation(1);
    }

    @When("I click on the broker location")
    public void clickLocation(){
        brokerPage.clickLocation(1);
    }

    @When("I select option in Core Activity")
    public void selectCoreActivity(){
        brokerPage.selectCoreActivity();
    }

    @Then("I verify company of '$strSideSearch' is not displayed")
    public void otherCompany(@Named("$strSideSearch") String strSideSearch){
        brokerPage.otherCompany(2,strSideSearch);
    }

    @Then("I verify service of '$strSideSearch' is not displayed")
    public void otherService(@Named("$strSideSearch") String strSideSearch){
        brokerPage.otherService(3,strSideSearch);
    }

    @Then("I verify company of '$strSideSearch' is displayed")
    public void verifyCompany(@Named("strSideSearch") String strSideSearch){
        brokerPage.verifyCompany(2,strSideSearch);
    }

    @Then("I verify service of '$strSideSearch' is displayed")
    public void verifyService(@Named("strSideSearch") String strSideSearch){
        brokerPage.verifyService(3,strSideSearch);
    }

    @Then("I verify broker company name of all search option is displayed")
    public void companyNameOfAllSearchOption(){
        Assert.assertTrue("Searched Results are not matching", brokerPage.companyNameOfAllSearchOption(2));
    }

    @Then("I verify broker service name of all search option is displayed")
    public void serviceNameOfAllSearchOption(){
        Assert.assertTrue("Searched Results are not matching", brokerPage.serviceNameOfAllSearchOption(3));
    }

    @When("I click on solar option in asset field")
    public void selectSolar(){
        brokerPage.selectSolar();
    }

    @When("I select two options of broker in core activity field")
    public void twoOptions(){
        brokerPage.twoOptions();
    }

    @When("I clear core field")
    public void clearCoreField(){
        brokerPage.clearCore();
    }

    @When("I clear office field of asset")
    public void selectOffice(){
        brokerPage.clearOffice();
    }

    @When("I click on two options of broker in asset field")
    public void twoOptionOfAsset(){
        brokerPage.twoOptionOfAsset();
    }

    @When("I clear asset field drop down")
    public void clearAsset(){
        brokerPage.clearAsset();
    }

    @When("I click on investments option in core activity")
    public void clickInvestments(){
        brokerPage.clickInvestments();
    }

    @When("I click on tenant option in core activity")
    public void clickTenant(){
        brokerPage.clickTenant();
    }

    @When("I click on others option in core activity")
    public void clickOthers(){
        brokerPage.clickOthers();
    }

    @When("I clear core activity drop down")
    public void clearCoreActivity(){
        brokerPage.clearCoreActivity();
    }

    /*@When("I select option in Asset Experience")
    public void selectAsset(){
        brokerPage.selectAsset();
    }*/

    @When("I select a option in Deal Stage")
    public void selectDealStage(){
        brokerPage.selectDealStage();
    }

    @When("I select two options in deal stage")
    public void twoOptionsInDealStage(){
       brokerPage.twoOptionsInDealStage();
    }

    @When("I clear deal stage drop down")
    public void clearDealStage(){
        brokerPage.clearDealStage();
    }

    @Then("I verify the company name in search result")
    public void verifyCompanyName(){
        brokerPage.verifyCompanyName(1);
    }

    @When("I click on verified name in search result")
    public void clickCompanyName(){
        brokerPage.clickCompanyName(1);
    }

    @Then("I verify the service name in search result")
    public void verifyServiceProject(){
        brokerPage.verifyServiceProject(1);
    }

    @When("I click on verified service name in search result")
    public void clickServiceProject(){
        brokerPage.clickServiceProject(1);
    }

















    @When("I enter Number of Office in text field")
    public void numOfOffice(){
        brokerPage.numOfOffice(1);
    }

    @When("I enter Number of Professionals in text field")
    public void numOfProfessional(){
        brokerPage.numOfProfessional(1);
    }
}
