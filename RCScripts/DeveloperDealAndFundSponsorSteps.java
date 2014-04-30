package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.DeveloperDealAndFundSponsorPage;
import test.pages.PageFactory;

public class DeveloperDealAndFundSponsorSteps {
    private final DeveloperDealAndFundSponsorPage developerDealAndFundSponsorPage;

    @Inject
    public DeveloperDealAndFundSponsorSteps(PageFactory thePageFactory) {
        developerDealAndFundSponsorPage = thePageFactory.newDeveloperDealAndFundSponsorPage();
    }

    @Then("I should see 'Developers, Deal Sponsors' as find in search option")
    public void verifyFindSearch(){
        developerDealAndFundSponsorPage.verifyFindSearch(1);
    }

    @Then("I should see 'Developer, Deal Sponsor, Fund Sponsor' as subrole in search option")
    public void verifySubRoleSearch(){
        developerDealAndFundSponsorPage.verifySubRoleSearch(1);
    }

    @Then("I verify the 'Developer' name is displayed")
    public void verifyDeveloperName(){
        developerDealAndFundSponsorPage.verifyDeveloperName(1);
    }

    @When("I click on verified developer name")
    public void clickVerifyDeveloperName(){
        developerDealAndFundSponsorPage.clickVerifyDeveloperName(1);
    }

    @When("I select strategy type from dropdown list")
    public void selectStrategyForUser(){
        developerDealAndFundSponsorPage.selectStrategyForUser();
    }
}

