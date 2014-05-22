package test.steps;


import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.CompaniesSearchValidationPage;
import test.pages.PageFactory;

public class CompaniesSearchValidationSteps {
    private final CompaniesSearchValidationPage companiesSearchValidationPage;

    @Inject
    public CompaniesSearchValidationSteps(PageFactory thePageFactory) {
        companiesSearchValidationPage = thePageFactory.newCompaniesSearchValidationPage();
    }

    @Then("I verify 'Investor' company name '$strNegativeCondition' displayed")
        @Alias("I verify 'Investor' company name '$strPositiveCondition' displayed")
    public void verifyInvestorCompanyName(@Named("strCondition") String strCondition){
        boolean status = companiesSearchValidationPage.verifyInvestorCompanyName(1,strCondition);
        Assert.assertTrue("The Searched String is found in the List", status);
    }

    @Then("I verify 'Lender' company name is not displayed")
    public void verifyLenderCompanyName(){
        Assert.assertTrue("Search result does not matching",companiesSearchValidationPage.verifyLenderCompanyName(1));
    }

    @Then("I verify 'Real Estate Advisor' company name is not displayed")
    public void verifyRealEstateCompanyName(){
        Assert.assertTrue("Search result does not matching",companiesSearchValidationPage.verifyRealEstateCompanyName(1));
    }

    @Then("I verify 'Deal Sponsor' company name is not displayed")
    public void verifyDealSponsorCompanyName(){
        Assert.assertTrue("Search result does not matching",companiesSearchValidationPage.verifyDealSponsorCompanyName(1));
    }

    @When("I enter developer company type in search option")
    public void enterInvestorType(){
        companiesSearchValidationPage.enterDeveloperType(1);
    }

    @When("I enter Investor Company Title")
    public void enterInvestorCompanyTitle(){
        companiesSearchValidationPage.enterInvestorCompanyTitle(1);
    }

    @When("I clear Investor Company Title")
    public void clearInvestorCompanyTitle(){
        companiesSearchValidationPage.clearInvestorCompanyTitle();
    }

    @Then("I verify 'Developer' company name is not displayed")
    public void developerCompanyName(){
        Assert.assertTrue("The Searched String is found in the List",companiesSearchValidationPage.developerCompanyName(1));
    }

    @Then("I verify developer company name is displayed")
    public void developerCompany(){
        Assert.assertTrue("Searched Results are not matching", companiesSearchValidationPage.developerCompany(1));
    }

}
