package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompaniesOfFundSponsorPage;
import test.pages.PageFactory;

public class CompaniesOfFundSponsorSteps {
    private final CompaniesOfFundSponsorPage companiesOfFundSponsorPage;

    @Inject
    public CompaniesOfFundSponsorSteps(PageFactory thePageFactory) {
        companiesOfFundSponsorPage = thePageFactory.newCompaniesOfFundSponsorPage();
    }

    @Then("I verify company name of fund sponsor is displayed")
    public void verifyFundSponsorCompany(){
        companiesOfFundSponsorPage.verifyFundSponsorCompany(1);
    }

    @When("I select health care option in asset type drop down")
    public void selectHealthCare(){
        companiesOfFundSponsorPage.selectHealthCare();
    }

    @When("I clear health care option in project type drop down")
    public void clearHealthCare(){
        companiesOfFundSponsorPage.clearHealthCare();
    }

    @When("I click on portfolio acquisitions option in strategy field")
    public void selectPortfolioAcquations(){
        companiesOfFundSponsorPage.selectPortfolioAcquisitions();
    }

    @When("I clear portfolio acquisitions option in strategy field")
    public void clearPortfolioAcquations(){
        companiesOfFundSponsorPage.clearPortfolioAcquisitions();
    }

    @When("I select value add option in risk profile field")
    public void selectValueAdd(){
        companiesOfFundSponsorPage.selectValueAdd();
    }

    @When("I clear value add option in risk profile field")
    public void clearValueAdd(){
        companiesOfFundSponsorPage.clearValueAdd();
    }

    @When("I click on about field in fund sponsor company search")
    public void clickAboutField(){
        companiesOfFundSponsorPage.clickAboutField();
    }

    @When("I enter the project completed fields in fund sponsor search")
    public void enterProjectFieldOfFundSponsor(){
        companiesOfFundSponsorPage.enterProjectFieldOfFundSponsor(1);
    }

    @When("I clear the project completed field in fund sponsor search")
    public void clearProjectFieldOfFundSponsor(){
         companiesOfFundSponsorPage.clearProjectFieldOfFundSponsor();
    }

    @When("I enter the values for sq ft field in fund sponsor search")
    public void enterSqFtFieldOfAbout(){
        companiesOfFundSponsorPage.enterSqFtFieldOfAbout(1);
    }

    @When("I clear the values of sq ft field in fund sponsor search")
    public void clearSqFtFieldOfFundSponsor(){
        companiesOfFundSponsorPage.clearSqFtFieldOfFundSponsor();
    }

    @When("I select intermediary option in route to sponsor field")
    public void selectIntermediaryOption(){
        companiesOfFundSponsorPage.selectIntermediaryOption();
    }

    @When("I clear intermediary option in route to sponsor field")
    public void clearIntermediaryOption(){
        companiesOfFundSponsorPage.clearIntermediaryOption();
    }
}
