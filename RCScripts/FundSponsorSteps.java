package test.steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.FundSponsorPage;
import test.pages.PageFactory;
import com.google.inject.Inject;


public class FundSponsorSteps {
    private final FundSponsorPage fundSponsorPage;

    @Inject
    public FundSponsorSteps(PageFactory thePageFactory) {
        fundSponsorPage = thePageFactory.newFundSponsorPage();
    }

    @Then("I verify the subrole type")
    public void verifySubrole(){
        fundSponsorPage.verifySubrole(2);
    }
    @Then("I verify 'Fund Sponsor' user is displayed")
    public void verifyUser(){
        fundSponsorPage.verifyUser(1);
    }

    @When("I click on the verified fund sponsor name")
    public void clickOnVerifyUser(){
        fundSponsorPage.clickOnVerifyUser(1);
    }

    @Then("I verify 'Fund Sponsor' company name is displayed")
    public void verifyFundSponsorCompany(){
        fundSponsorPage.verifyFundSponsorCompany(1);
    }

    @When("I click on Fund Sponsor company name")
    public void clickOnFundSponsorCompanyName(){
        fundSponsorPage.clickOnFundSponsorCompanyName(1);
    }

    @When("I enter location of fund sponsor in text field")
    public void enterLocation(){
        fundSponsorPage.enterLocation(1);
    }

    @When("I click on the location")
    public void clickLocation(){
        fundSponsorPage.clickLocation(1);
    }

    @Then("I verify Location field of fund sponsor")
    public void verifyLocation(){
        fundSponsorPage.verifyLocation(1);
    }

    @When("I select option in 'Strategy' type")
    public void selectStrategyType(){
        fundSponsorPage.selectStrategyType();
    }

    @When("I select portfolio acquisitions and operating companies strategy in drop down")
    public void selectTwoStrategyOption(){
         fundSponsorPage.selectTwoStrategyOption();
    }

    @When("I clear strategy drop down field")
    public void clearStrategy(){
        fundSponsorPage.clearStrategy();
    }

    @Then("I verify fund sponsor user of all option is displayed")
    public void companyNameOfAllSearchOption(){
        fundSponsorPage.companyNameOfAllSearchOption(1);
    }

    @Then("I verify fund sponsor company name of all search option is displayed")
    public void userOfAllSearchOption(){
        fundSponsorPage.userOfAllSearchOption(1);
    }

    @When("I clear 'Strategy' drop down field")
    public void clearStrategyField(){
        fundSponsorPage.clearStrategyField();
    }

}
