package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompaniesOfFundSponsor;
import test.pages.PageFactory;

public class CompaniesOfFundSponsorSteps {
    private final CompaniesOfFundSponsor companiesOfFundSponsor;

    @Inject
    public CompaniesOfFundSponsorSteps(PageFactory thePageFactory) {
        companiesOfFundSponsor = thePageFactory.newCompaniesOfFundSponsor();
    }

    @Then("I verify company name of fund sponsor is displayed")
    public void verifyFundSponsorCompany(){
        companiesOfFundSponsor.verifyFundSponsorCompany(1);
    }
}
