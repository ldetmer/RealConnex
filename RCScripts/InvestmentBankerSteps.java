package test.steps;


import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.InvestmentBankerPage;
import test.pages.PageFactory;

import javax.inject.Inject;

public class InvestmentBankerSteps {
    private final InvestmentBankerPage investmentBankerPage;

    @Inject
    public InvestmentBankerSteps(PageFactory thePageFactory) {
        investmentBankerPage = thePageFactory.newInvestmentBankerPage();
    }

    @Then("I should see 'Investment Banker' as subrole in search option")
    public void verifySubRoleOfBanker(){
        investmentBankerPage.verifySubRoleOfBanker(2);
    }

    @Then("I should see 'Capital Raising' as strategy in search option")
    public void verifyStrategyOfBanker(){
        investmentBankerPage.verifyStrategyOfBanker(3);
    }

    @Then("I verify banker company name is displayed")
    public void verifyCompany(){
        investmentBankerPage.verifyCompany(2);
    }

    @When("I click on banker company name")
    public void clickOnCompanyName(){
        investmentBankerPage.clickOnCompanyName(2);
    }

    @Then("I verify banker project name is displayed")
    public void verifyProject(){
        investmentBankerPage.verifyProject(2);
    }

    @When("I click on banker project name")
    public void clickOnProject(){
        investmentBankerPage.clickOnProject(2);
    }

    @Then("I verify banker company name of all search option is displayed")
    public void companyNameOfAllSearchOption(){
        Assert.assertTrue("Searched Results are not matching", investmentBankerPage.companyNameOfAllSearchOption(2));
    }

    @Then("I verify banker service name of all search option is displayed")
    public void serviceNameOfAllSearchOption(){
        Assert.assertTrue("Searched Results are not matching", investmentBankerPage.serviceNameOfAllSearchOption(3));
    }

    @When("I enter location of investment banker in text field")
    public void enterLocation(){
        investmentBankerPage.enterLocation(1);
    }

    @When("I click on the investment banker location")
    public void clickLocation(){
        investmentBankerPage.clickLocation(1);
    }

    @When("I select option in core activity")
    public void selectActivity(){
        investmentBankerPage.selectActivity();
    }

    @When("I click equity in core activity")
    public void clickEquity(){
        investmentBankerPage.clickEquity();
    }

    @When("I click operating companies in core activity")
    public void clickOperatingCompanies(){
        investmentBankerPage.clickOperatingCompanies();
    }

    @When("I click other in core activity")
    public void clickOther(){
        investmentBankerPage.clickOther();
    }

    @When("I click debt in core activity")
    public void clickDebt(){
        investmentBankerPage.clickDebt();
    }

    @When("I click portfolio in core activity")
    public void clickPortfolio(){
        investmentBankerPage.clickPortfolio();
    }

    @When("I click recapitalizations in core activity")
    public void clickRecapitalizations(){
        investmentBankerPage.clickRecapitalizations();
    }

    @When("I clear core activity field")
    public void clearCoreActivity(){
        investmentBankerPage.clearCoreActivity();
    }








    @When("I select option in asset experience")
    public void selectAsset(){
        investmentBankerPage.selectAsset();
    }



    @When("I select option in deal stage")
    public void selectDeal(){
        investmentBankerPage.selectDeal();
    }



}
