package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.CompaniesSearchPage;
import test.pages.PageFactory;


public class CompaniesSearchSteps {
    private final CompaniesSearchPage companiesSearchPage;

    @Inject
    public CompaniesSearchSteps(PageFactory thePageFactory) {
        companiesSearchPage = thePageFactory.newCompaniesSearchPage();
    }

    @When("I click on company name of deal sponsor")
    public void clickDealSponsorCompanyName(){
        companiesSearchPage.clickDealSponsorCompanyName(1);
    }

    @Then("I verify company name of 'Investor' is displayed")
    public void verifyInvestorCompanyName(){
        Assert.assertTrue("Searched Results are not matching", companiesSearchPage.verifyInvestorCompanyName(1));
    }

    @When("I click on company name of investor")
    public void clickInvestorCompanyName(){
        companiesSearchPage.clickInvestorCompanyName(1);
    }

    @Then("I verify company name of 'Lender' is displayed")
    public void verifyLenderCompanyName(){
        Assert.assertTrue("Searched Results are not matching", companiesSearchPage.verifyLenderCompanyName(1));
    }

    @When("I click on company name of lender")
    public void clickLenderCompanyName(){
        companiesSearchPage.clickLenderCompanyName(1);
    }

    @Then("I verify company name of 'Real Estate Advisor' is displayed")
    public void verifyAdvisorCompanyName(){
        Assert.assertTrue("Searched Results are not matching", companiesSearchPage.verifyAdvisorCompanyName(1));
    }

    @When("I click on company of real estate advisor")
    public void clickAdvisorCompanyName(){
        companiesSearchPage.clickAdvisorCompanyName(1);
    }


    @When("I enter company name in search field")
    public void enterCompanyName(){
        companiesSearchPage.enterCompanyName(1);
    }

    @When("I enter company type in search option")
    public void enterTypeField(){
        companiesSearchPage.enterTypeField(1);
    }

    @Then("I verify 'Deal Sponsor' company name is displayed")
    public void verifyDealSponsorCompanyName(){
        Assert.assertTrue("Searched Results are not matching", companiesSearchPage.verifyDealSponsorCompanyName(1));
    }

    @When("I clear name field in search option")
    public void clearCompanyNameField(){
        companiesSearchPage.clearCompanyNameField();
    }

    @When("I clear type field in search option")
    public void clearTypeField(){
        companiesSearchPage.clearTypeField();
    }

    @Then("I verify Deal Sponsor company name is displayed")
    public void verifyDealSponsorCompany(){
        Assert.assertTrue("Searched Results are not matching",companiesSearchPage.verifyDealSponsorCompany(1));
    }

}



