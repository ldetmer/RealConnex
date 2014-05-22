package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompaniesOfDealDeveloperFundPage;
import test.pages.PageFactory;

public class CompaniesOfDealDeveloperFundSteps {
    private final CompaniesOfDealDeveloperFundPage companiesOfDealDeveloperFundPage;

    @Inject
    public CompaniesOfDealDeveloperFundSteps(PageFactory thePageFactory) {
        companiesOfDealDeveloperFundPage = thePageFactory.newCompaniesOfDealDeveloperFundPage();
    }

    @When("I click on verified deal sponsor company name")
    public void clickDealSponsorCompany(){
        companiesOfDealDeveloperFundPage.clickDealSponsorCompany(1);
    }

    @When("I click on verified developer company name")
    public void clickDeveloperCompanyName(){
        companiesOfDealDeveloperFundPage.clickDeveloperCompanyName(1);
    }

    @Then("I verify 'Fund Sponsor' company name is displayed")
    public void verifyFundSponserCompanyName(){
        companiesOfDealDeveloperFundPage.verifyFundSponserCompanyName(1);
    }

    @When("I click on verified fund sponsor company name")
    public void clickFundSponsorCompanyName(){
        companiesOfDealDeveloperFundPage.clickFundSponserCompanyName(1);
    }
}
