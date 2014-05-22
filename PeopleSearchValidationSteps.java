package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.PageFactory;
import test.pages.PeopleSearchValidationPage;

public class PeopleSearchValidationSteps {
    private final PeopleSearchValidationPage peopleSearchValidationPage;

    @Inject
    public PeopleSearchValidationSteps(PageFactory thePageFactory) {
        peopleSearchValidationPage = thePageFactory.newPeopleSearchValidationPage();
    }

    @Then("I verify 'Investor' user name is not displayed")
    public void verifyInvestorUser(){
        Assert.assertTrue("Searched Results are not matching",peopleSearchValidationPage.verifyInvestorUser(1));
    }

    @Then("I verify 'Lender' user name is not displayed")
    public void verifyLenderUser(){
        Assert.assertTrue("Searched Results are not matching",peopleSearchValidationPage.verifyLenderUser(1));
    }

    @Then("I verify 'Service Provider' user name is not displayed")
    public void verifyRealEstateAdvisorUser(){
        Assert.assertTrue("Searched Results are not matching",peopleSearchValidationPage.verifyRealEstateAdvisorUser(1));
    }

    @When("I enter 'Investor' user name")
    public void enterInvestorUserName(){
        peopleSearchValidationPage.enterInvestorUserName(1);
    }

    @Then("I verify 'Deal Sponsor' user name is not displayed")
    public void verifyDealSponsorUser(){
        Assert.assertTrue("Searched Results are not matching", peopleSearchValidationPage.verifyDealSponsorUser(1));
    }

    @When("I enter 'Investor' job title")
    public void enterInvestorJobTitle(){
        peopleSearchValidationPage.enterInvestorJobTitle(1);
    }

    @When("I enter 'Investor' company name")
    public void enterInvestorCompanyName(){
        peopleSearchValidationPage.enterInvestorCompanyName(1);
    }

    @Then("I should see Investor user name is displayed")
    public void verifyInvestorUserName(){
        Assert.assertTrue("Searched Results are not matching",peopleSearchValidationPage.verifyInvestorUserName(1));
    }
}
