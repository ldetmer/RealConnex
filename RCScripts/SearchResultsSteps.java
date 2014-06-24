package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.PageFactory;
import test.pages.SearchResultsPage;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 12:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class SearchResultsSteps {
    private final SearchResultsPage searchResultsPage;

    @Inject
    public SearchResultsSteps(PageFactory thePageFactory) {
        searchResultsPage = thePageFactory.newSearchResultsPage();
    }

    @Then("I verify '$lStrUserName' deal sponsor user name is displayed in search result")
    public void verifyUserName(@Named("lStrUserName") String lStrUserName){
        searchResultsPage.verifyUserName(lStrUserName);
    }

    @When("I click on '$lStrUserName' deal sponsor user name in search result")
    public void clickDealSponsorUserName(@Named("lStrUserName") String lStrUserName){
        searchResultsPage.clickDealSponsorUserName(lStrUserName);
    }

    @Then("I verify '$lStrCompanyName' deal sponsor company name is displayed in search result")
    public void verifyCompanyName(@Named("lStrCompanyName") String lStrCompanyName){
        searchResultsPage.verifyCompanyName(lStrCompanyName);
    }

    @When("I click on '$lStrUserName' deal sponsor company name in search result")
    public void clickDealSponsorCompanyName(@Named("lStrCompanyName") String lStrCompanyName){
        searchResultsPage.clickDealSponsorCompanyName(lStrCompanyName);
    }

    @Then("I verify '$lStrProjectName' deal sponsor project name is displayed in search result")
    public void verifyProjectName(@Named("lStrProjectName") String lStrProjectName){
        searchResultsPage.verifyProjectName(lStrProjectName);
    }

    @Then("I verify '$lStrFundName' deal sponsor fund name is displayed in search result")
    public void verifyFundName(@Named("lStrFundName") String lStrFundName){
        searchResultsPage.verifyFundName(lStrFundName);
    }

    @When("I click on '$lStrProjectName' deal sponsor project name in search result")
    public void clickDealSponsorProjectName(@Named("lStrProjectName") String lStrProjectName){
        searchResultsPage.clickDealSponsorProjectName(lStrProjectName);
    }

    @When("I click on '$lStrFundName' deal sponsor fund name in search result")
    public void clickDealSponsorFundName(@Named("lStrFundName") String lStrFundName){
        searchResultsPage.clickDealSponsorFundName(lStrFundName);
    }

}
