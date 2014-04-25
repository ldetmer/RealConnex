package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.PageFactory;
import test.pages.PeopleSearchPage;

public class PeopleSearchSteps {
    private final PeopleSearchPage peopleSearchPage;

    @Inject
    public PeopleSearchSteps(PageFactory thePageFactory) {
        peopleSearchPage = thePageFactory.newPeopleSearchPage();
    }

    @Then("I should see 'People, Companies & Associations' as find in search option")
    public void verifyFind(){
        peopleSearchPage.verifyFind(1);
    }

    @Then("I verify 'Deal Sponsor' user name is displayed")
    public void verifyDealSponsor(){
        peopleSearchPage.verifyDealSponsor(1);
    }

    @When("I click on verified deal sponsor user name")
    public void clickVerifiedDealSponsorUser(){
        peopleSearchPage.clickVerifiedDealSponsorUser(1);
    }

    @Then("I should see 'Investor' user name is displayed")
    public void verifyInvestorUser(){
        peopleSearchPage.verifyInvestorUser(1);
    }

    @When("I click on verified investor user name")
    public void clickVerifiedInvestorUser(){
        peopleSearchPage.clickVerifiedInvestorUser(1);
    }

    @Then("I should see 'Lender' user name is displayed")
    public void verifyLenderUser(){
        peopleSearchPage.verifyLenderUser(1);
    }

    @When("I click on verified lender user name")
    public void clickVerifiedLenderUser(){
        peopleSearchPage.clickVerifiedLenderUser(1);
    }

    @Then("I verify 'Property Service Provider' user name is displayed")
    public void verifyServiceProvider(){
        peopleSearchPage.verifyServiceProvider(1);
    }

    @When("I click on verified property service provider user name")
    public void clickVerifiedServiceProvider(){
        peopleSearchPage.clickVerifiedServiceProvider(1);
    }

    @When("I enter user title in name search option")
    public void enterUserTitle() {
        peopleSearchPage.enterUserTitle(1);
    }

    @When("I enter user job title in title search option")
    public void enterUserJobTitle(){
        peopleSearchPage.enterUserJobTitle(1);
    }

    @When("I enter location in location search option")
    public void enterLocation(){
        peopleSearchPage.enterLocation(1);
    }

    @When("I enter user company name in company search option")
    public void enterCompanyName(){
        peopleSearchPage.enterCompanyName(1);
    }

    @Then("I should see searched user name")
    public void searchedUser(){
        int noOfUsers = 1;
        Assert.assertTrue("Searched Results are not matching", peopleSearchPage.searchedUser(1, noOfUsers));
    }
}
