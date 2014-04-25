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

    @Then("I verify company name is displayed in list")
    public void verifyCompanyName(){
        companiesSearchPage.verifyCompanyName(1);
    }

    @When("I click on company name")
    public void openCompanyProfile(){
        companiesSearchPage.openCompanyProfile(1);
    }

    @When("I enter company name in search field")
    public void enterCompanyName(){
        companiesSearchPage.enterCompanyName(1);
    }

    @When("I enter company sub role type")
    public void enterSubroleType(){
        companiesSearchPage.enterSubroleType(1);
    }

    @Then("I should see the company name entered is displayed")
    public void searchCompany(){
            int noOfUsers = 1;
            Assert.assertTrue("Searched Results are not matching", companiesSearchPage.searchCompany(1, noOfUsers));
    }
}



