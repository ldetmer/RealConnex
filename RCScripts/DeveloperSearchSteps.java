package test.steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.DeveloperSearchPage;
import test.pages.PageFactory;
import javax.inject.Inject;

public class DeveloperSearchSteps {
    public final DeveloperSearchPage developerSearchPage;

    @Inject
    public DeveloperSearchSteps(PageFactory thePageFactory) {
        developerSearchPage = thePageFactory.newDeveloperSearchPage();
    }

    @Then("I verify the 'Developer' name is displayed")
    public void verifyDeveloperName(){
        developerSearchPage.verifyDeveloperName(1);
    }

    @When("I click on verified developer name")
    public void clickOnVerifiedUser(){
        developerSearchPage.clickOnVerifiedUser(1);
    }

    @When("I click on Developer company name")
    public void clickOnDeveloperCompany(){
        developerSearchPage.clickOnDeveloperCompany(1);
    }

    @When("I select a option in 'Strategy' drop down list")
    public void selectStrategy(){
        developerSearchPage.selectStrategy();
    }

    @When("I select sale and leaseback and operating companies strategy in drop down")
    public void selectStrategyType(){
        developerSearchPage.selectStrategyType();
    }

    @When("I click on buy land strategy")
    public void clickBuyLand(){
       developerSearchPage.clickBuyLand();
    }

    @When("I clear strategy field drop down")
    public void clearStrategy(){
        developerSearchPage.clearStrategy();
    }

    @Then("I verify developer company name of all search option is displayed")
    public void companyNameOfAllSearchOption(){
        Assert.assertTrue("Searched Results are not matching", developerSearchPage.companyNameOfAllSearchOption(1));
    }

    @Then("I verify developer user of all option is displayed")
    public void userOfAllSearchOption(){
        Assert.assertTrue("Searched Results are not matching", developerSearchPage.userOfAllSearchOption(1));
    }

    @Then("I should see desired company name of developer")
    public void searchedCompany(){
        Assert.assertTrue("Searched Results are not matching", developerSearchPage.searchedDeveloperCompany(1));
    }

    @When("I clear strategy field of developer search")
    public void clearStrategyField(){
        developerSearchPage.clearStrategyField();
    }
}
