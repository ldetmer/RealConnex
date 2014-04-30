package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompaniesOfDeveloperPage;
import test.pages.PageFactory;

public class CompaniesOfDeveloperSteps {
    private final CompaniesOfDeveloperPage companiesOfDeveloperPage;

    @Inject
    public CompaniesOfDeveloperSteps(PageFactory thePageFactory) {
        companiesOfDeveloperPage = thePageFactory.newCompaniesOfDeveloperPage();
    }


/*
    @Then("I verify 'Developer' company name is displayed")
    public void verifyDeveloperCompanyName(){
        companiesOfDeveloperPage.verifyDeveloperCompanyName(1);
    }

    @Then("I verify company name of developer is displayed")
    public void verifyCompanyNameDeveloper(){
        companiesOfDeveloperPage.verifyCompanyNameDeveloper(1);
    }*/
}
