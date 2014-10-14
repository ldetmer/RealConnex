package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.NewBusinessPage;
import test.pages.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 9/18/14
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class NewBusinessSteps {

    private final NewBusinessPage newBusinessPage;

    @Inject
    public NewBusinessSteps(PageFactory thePageFactory) {
        newBusinessPage = thePageFactory.newNewBusinessPage();
    }

    @Then("I should see 'New Business' as find in search option")
    public void verifyNewBusinessInFindOfSearch(){
        newBusinessPage.verifyFindInSearch(2);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name is displayed in new business loan search")
    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessLoanSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        newBusinessPage.verifyDealSponsorFundNameIsDisplayedNameInNewBusinessLoanSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name is not displayed in new business mezz search")
    public void verifyDealSponsorFundNameIsNotDisplayedNameInNewBusinessMezzSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        newBusinessPage.verifyDealSponsorFundNameIsNotDisplayedNameInNewBusinessMezzSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name is not displayed in new business loan search")
        @Alias("I verify '$strDealSponsorFundName' of deal sponsor fund name is not displayed in new business advisor search")
    public void verifyDealSponsorFundNameIsNotDisplayedNameInNewBusinessSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        newBusinessPage.verifyDealSponsorFundNameIsNotDisplayedNameInNewBusinessSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in new business loan search")
    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessLoanSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessLoanSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name displayed in new business loan search")
    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        newBusinessPage.verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is not displayed in new business mezz search")
    public void verifyDealSponsorProjectNameIsNotDisplayedNameInNewBusinessMezzSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyDealSponsorProjectNameIsNotDisplayedNameInNewBusinessMezzSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in new business mezz search")
    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessMezzSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessMezzSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name is displayed in new business mezz search")
    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessMezzSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        newBusinessPage.verifyDealSponsorFundNameIsDisplayedNameInNewBusinessMezzSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in new business advisor search")
    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessAdvisorSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessAdvisorSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name is displayed in new business advisor search")
    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessAdvisorSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        newBusinessPage.verifyDealSponsorFundNameIsDisplayedNameInNewBusinessAdvisorSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is not displayed in new business loan search")
    @Alias("I verify '$strDealSponsorProjectName' of deal sponsor project name is not displayed in new business advisor search")
    public void verifyDealSponsorProjectIsDisplayedNameInNewBusinessLoanSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyDealSponsorProjectIsDisplayedNameInNewBusinessLoanSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of investor fund name is displayed in new business loan search")
    public void verifyInvestorFundNameIsDisplayedNameInNewBusinessLoanSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyInvestorFundNameIsDisplayedNameInNewBusinessLoanSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is not displayed in new business loan search")
    @Alias("I verify '$strInvestorFundName' of investor fund name is not displayed in new business advisor search")
    public void verifyInvestorFundNameIsNotDisplayedNameInNewBusinessLoanSearch(@Named("strInvestorFundName") String strInvestorFundName){
        newBusinessPage.verifyInvestorFundNameIsNotDisplayedNameInNewBusinessLoanSearch(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in new business mezz search")
    public void verifyInvestorFundNameIsDisplayedNameInNewBusinessMezzSearch(@Named("strInvestorFundName") String strInvestorFundName){
        newBusinessPage.verifyInvestorFundNameIsDisplayedNameInNewBusinessMezzSearch(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is not displayed in new business mezz search")
    public void verifyInvestorFundNameIsNotDisplayedNameInNewBusinessMezzSearch(@Named("strInvestorFundName") String strInvestorFundName){
        newBusinessPage.verifyInvestorFundNameIsNotDisplayedNameInNewBusinessMezzSearch(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in new business advisor search")
    public void verifyInvestorFundNameIsNotDisplayedNameInNewBusinessAdvisorSearch(@Named("strInvestorFundName") String strInvestorFundName){
        newBusinessPage.verifyInvestorFundNameIsNotDisplayedNameInNewBusinessAdvisorSearch(strInvestorFundName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed new business loan search")
    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessLoanSearch(@Named("strLenderLoanName") String strLenderLoanName){
        newBusinessPage.verifyLenderLoanNameIsDisplayedNameInNewBusinessLoanSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is not displayed in new business loan search")
    @Alias("I verify '$strLenderLoanName' of lender loan name is not displayed in new business advisor search")
    public void verifyLenderLoanNameIsNotDisplayedNameInNewBusinessLoanSearch(@Named("strLenderLoanName") String strLenderLoanName){
        newBusinessPage.verifyLenderLoanNameIsNotDisplayedNameInNewBusinessLoanSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in new business mezz search")
    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessMezzSearch(@Named("strLenderLoanName") String strLenderLoanName){
        newBusinessPage.verifyLenderLoanNameIsDisplayedNameInNewBusinessMezzSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in new business advisor search")
    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessAdvisorSearch(@Named("strLenderLoanName") String strLenderLoanName){
        newBusinessPage.verifyLenderLoanNameIsDisplayedNameInNewBusinessAdvisorSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is not displayed in new business mezz search")
    public void verifyLenderLoanNameIsNotDisplayedNameInNewBusinessMezzSearch(@Named("strLenderLoanName") String strLenderLoanName){
        newBusinessPage.verifyLenderLoanNameIsNotDisplayedNameInNewBusinessMezzSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender Mezz name is displayed new business loan search")
    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessLoanSearch(@Named("strLenderLoanName") String strLenderLoanName){
        newBusinessPage.verifyLenderMezzNameIsDisplayedNameInNewBusinessLoanSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is not displayed in new business loan search")
    @Alias("I verify '$strLenderMezzName' of lender mezz name is not displayed in new business advisor search")
    public void verifyLenderMezzNameIsNotDisplayedNameInNewBusinessLoanSearch(@Named("strLenderMezzName") String strLenderMezzName){
        newBusinessPage.verifyLenderMezzNameIsNotDisplayedNameInNewBusinessLoanSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in new business mezz search")
    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessMezzSearch(@Named("strLenderMezzName") String strLenderMezzName){
        newBusinessPage.verifyLenderMezzNameIsDisplayedNameInNewBusinessMezzSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in new business advisor search")
    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessAdvisorSearch(@Named("strLenderMezzName") String strLenderMezzName){
        newBusinessPage.verifyLenderMezzNameIsDisplayedNameInNewBusinessAdvisorSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is not displayed in new business mezz search")
    public void verifyLenderMezzNameIsNotDisplayedNameInNewBusinessMezzSearch(@Named("strLenderMezzName") String strLenderMezzName){
        newBusinessPage.verifyLenderMezzNameIsNotDisplayedNameInNewBusinessMezzSearch(strLenderMezzName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in new business loan search")
    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessLoanSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        newBusinessPage.verifyAdvisorListingNameIsDisplayedNameInNewBusinessLoanSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is not displayed in new business loan search")
    @Alias("I verify '$strAdvisorListingName' of real estate advisor listing name is not displayed in new business advisor search")
    public void verifyAdvisorListingNameIsNotDisplayedNameInNewBusinessLoanSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        newBusinessPage.verifyAdvisorListingNameIsNotDisplayedNameInNewBusinessLoanSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in new business mezz search")
    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessMezzSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        newBusinessPage.verifyAdvisorListingNameIsDisplayedNameInNewBusinessMezzSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in new business advisor search")
    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessAdvisorSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        newBusinessPage.verifyAdvisorListingNameIsDisplayedNameInNewBusinessAdvisorSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is not displayed in new business mezz search")
    public void verifyAdvisorListingNameIsNotDisplayedNameInNewBusinessMezzSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        newBusinessPage.verifyAdvisorListingNameIsNotDisplayedNameInNewBusinessMezzSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in new business loan search")
    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessLoanSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        newBusinessPage.verifyAdvisorServiceNameIsDisplayedInNewBusinessLoanSearch(strAdvisorServiceName);
    }


    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is not displayed in new business loan search")
    @Alias("I verify '$strAdvisorServiceName' of real estate advisor service name is not displayed in new business advisor search")
    public void verifyAdvisorServiceNameIsNotDisplayedInNewBusinessLoanSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        newBusinessPage.verifyAdvisorServiceNameIsNotDisplayedInNewBusinessLoanSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in new business mezz search")
    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessMezzSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        newBusinessPage.verifyAdvisorServiceNameIsDisplayedInNewBusinessMezzSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in new business advisor search")
    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessAdvisorSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        newBusinessPage.verifyAdvisorServiceNameIsDisplayedInNewBusinessAdvisorSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is not displayed in new business mezz search")
    public void verifyAdvisorServiceNameIsNotDisplayedInNewBusinessMezzSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        newBusinessPage.verifyAdvisorServiceNameIsNotDisplayedInNewBusinessMezzSearch(strAdvisorServiceName);
    }

    @When("I click on RDavis project of deal sponsor in new business loan search")
    public void clickDSProjectNameOfNewBusinessLoanSearch(){
        newBusinessPage.clickDSProjectNameOfNewBusinessLoanSearch();
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund is displayed in new business loan result in new business loan search")
    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        newBusinessPage.verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund is not displayed in new business loan result in new business loan search")
    @Alias("I verify '$strDealSponsorFundName' of deal sponsor fund is not displayed in new business advisor result in new business advisor search")
    public void verifyFundNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        newBusinessPage.verifyFundNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund is displayed in new business loan result in new business mezz search")
    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        newBusinessPage.verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name is displayed side search of advisor in new business advisor search")
    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        newBusinessPage.verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund is not displayed in new business mezz result in new business mezz search")
    public void verifyFundNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        newBusinessPage.verifyFundNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in new business loan result in new business loan search")
    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is not displayed in new business result in new business loan search")
    @Alias("I verify '$strDealSponsorProjectName' of deal sponsor project name is not displayed in new business result in new business advisor search")
    public void verifyProjectNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyProjectNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in new business result in new business mezz search")
    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed side search of advisor in new business advisor search")
    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is not displayed in new business result in new business mezz search")
    public void verifyProjectNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyProjectNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in new business loan result in new business loan search")
    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is not displayed in new business result in new business loan search")
    @Alias("I verify '$strInvestorFundName' of investor fund name is not displayed in new business result in new business advisor search")
    public void verifyInvestorFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessLoan(@Named("strInvestorFundName") String strInvestorFundName){
        newBusinessPage.verifyInvestorFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessLoan(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in new business result in new business mezz search")
    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessMezz(@Named("strInvestorFundName") String strInvestorFundName){
        newBusinessPage.verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessMezz(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed side search of advisor in new business advisor search")
    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessAdvisor(@Named("strInvestorFundName") String strInvestorFundName){
        newBusinessPage.verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessAdvisor(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is not displayed in new business result in new business mezz search")
    public void verifyInvestorFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessMezz(@Named("strInvestorFundName") String strInvestorFundName){
        newBusinessPage.verifyInvestorFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessMezz(strInvestorFundName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in new business loan result in new business loan search")
    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is not displayed in new business result in new business loan search")
    @Alias("I verify '$strLenderLoanName' of lender loan name is not displayed in new business result in new business advisor search")
    public void verifyLenderLoanNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessLoan(@Named("strLenderLoanName") String strLenderLoanName){
        newBusinessPage.verifyLenderLoanNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessLoan(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in new business result in new business mezz search")
    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(@Named("strLenderLoanName") String strLenderLoanName){
        newBusinessPage.verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed side search of advisor in new business advisor search")
    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessAdvisor(@Named("strLenderLoanName") String strLenderLoanName){
        newBusinessPage.verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessAdvisor(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is not displayed in new business result in new business mezz search")
    public void verifyLenderLoanNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(@Named("strLenderLoanName") String strLenderLoanName){
        newBusinessPage.verifyLenderLoanNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(strLenderLoanName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in new business loan result in new business loan search")
    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is not displayed in new business result in new business loan search")
    @Alias("I verify '$strLenderMezzName' of lender mezz name is not displayed in new business result in new business advisor search")
    public void verifyLenderMezzNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessLoan(@Named("strLenderMezzName") String strLenderMezzName){
        newBusinessPage.verifyLenderMezzNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessLoan(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in new business result in new business mezz search")
    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(@Named("strLenderMezzName") String strLenderMezzName){
        newBusinessPage.verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed side search of advisor in new business advisor search")
    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessAdvisor(@Named("strLenderMezzName") String strLenderMezzName){
        newBusinessPage.verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessAdvisor(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is not displayed in new business result in new business mezz search")
    public void verifyLenderMezzNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(@Named("strLenderMezzName") String strLenderMezzName){
        newBusinessPage.verifyLenderMezzNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(strLenderMezzName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in new business loan result in new business loan search")
    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is not displayed in new business loan result in new business loan search")
    @Alias("I verify '$strAdvisorListingName' of real estate advisor listing name is not displayed in new business loan result in new business advisor search")
    public void verifyAdvisorListingNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyAdvisorListingNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in new business mezz result in new business mezz search")
    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed side search of advisor in new business advisor search")
    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is not displayed in new business mezz result in new business mezz search")
    public void verifyAdvisorListingNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyAdvisorListingNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in new business loan result in new business loan search")
    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is not displayed in new business loan result in new business loan search")
    @Alias("I verify '$strAdvisorServiceName' of real estate advisor service name is not displayed in new business loan result in new business advisor search")
    public void verifyAdvisorServiceNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyAdvisorServiceNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in new business mezz result in new business mezz search")
    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed side search of advisor in new business advisor search")
    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is not displayed in new business mezz result in new business mezz search")
    public void verifyAdvisorServiceNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        newBusinessPage.verifyAdvisorServiceNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(strDealSponsorProjectName);
    }

    @When("I enter the location in location field of new business loan search")
    public void selectLocationInNewBusinessLoanSearch(){
        newBusinessPage.selectLocationInNewBusinessLoanSearch();
    }

    @When("I set loan amount slider in new business search")
    public void setLoanAmount_NewBusinessSearch(){
        newBusinessPage.setLoanAmount_NewBusinessSearch();
    }

    @When("I set loan term slider in new business search")
    public void setLoanTerm_NewBusinessSearch(){
        newBusinessPage.setLoanTerm_NewBusinessSearch();
    }

    @When("I clear loan amount slider in new business search")
    public void clearLoanAmount_NewBusinessSearch(){
        newBusinessPage.clearLoanAmount_NewBusinessSearch();
    }

    @When("I clear loan term slider in new business search")
    public void clearLoanTerm_NewBusinessSearch(){
        newBusinessPage.clearLoanTerm_NewBusinessSearch();
    }

    @Then("I verify '$strInvestorFundName' fund name of user whose lighthouse is off are not displayed in new business search")
    public void verifyInvestorFundNameNotDisplayedInNewBusinessLoanSearch_LightHouseOff(@Named("strInvestorFundName") String strInvestorFundName){
        newBusinessPage.verifyInvestorFundNameNotDisplayedInNewBusinessLoanSearch_LightHouseOff(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' fund name of user whose lighthouse is off are not displayed in new business search when side search performed")
    public void verifyInvestorFundNameIsNotDisplayedInNewBusinessLoanSearchWhereLightHouseOff(@Named("strInvestorFundName") String strInvestorFundName){
        newBusinessPage.verifyInvestorFundNameIsNotDisplayedInNewBusinessLoanSearchWhereLightHouseOff(strInvestorFundName);
    }

    @When("I select loan use drop down list")
    public void selectLoanUse_NewBusinessSearch(){
        newBusinessPage.selectLoanUse_NewBusinessSearch();
    }

    @When("I select asset profile in new business mezz search")
    public void selectAssetProfile_NewBusinessMezz(){
        newBusinessPage.selectAssetProfile_NewBusinessMezz();
    }

    @When("I select senior or permanent option in loan use")
    public void selectSeniorOrPermanentOption(){
        newBusinessPage.selectSeniorOrPermanentOption();
    }

    @When("I select core option in asset profile drop down in new business mezz search")
    public void selectCoreInAssetProfileOfNewBusinessMezz(){
        newBusinessPage.selectCoreInAssetProfileOfNewBusinessMezz();
    }

    @When("I clear senior or permanent option in loan use")
    public void clearSeniorOrPermanentOption(){
        newBusinessPage.clearSeniorOrPermanentOption();
    }

    @When("I clear core option in asset profile drop down in new business mezz search")
    public void clearCoreInAssetProfileOfNewBusinessMezz(){
        newBusinessPage.clearCoreInAssetProfileOfNewBusinessMezz();
    }

    @When("I click on route to browser drop down")
    public void clickRouteToBrowser(){
        newBusinessPage.clickRouteToBrowser();
    }

    @When("I select direct only option in route to browser")
    public void selectDirectOnlyOptionInRouteToBrowser(){
        newBusinessPage.selectDirectOnlyOptionInRouteToBrowser();
    }

    @When("I clear direct only option in route to browser")
    public void clearDirectOnlyOptionInRouteToBrowser(){
        newBusinessPage.clearDirectOnlyOptionInRouteToBrowser();
    }

    @When("I select collateral drop down in new business mezz search")
    public void selectCollateralDropDown_NewBusinessMezz(){
        newBusinessPage.selectCollateralDropDown_NewBusinessMezz();
    }

    @When("I select the asset option in collateral field of new business mezz search")
    public void selectTheAssetOptionInCollateralField(){
        newBusinessPage.selectTheAssetOptionInCollateralField();
    }

    @When("I clear the asset option in collateral field of new business mezz search")
    public void clearTheAssetOptionInCollateralField(){
        newBusinessPage.clearTheAssetOptionInCollateralField();
    }

    @When("I select ideal customer drop down field")
    public void selectIdealCustomerDropDown(){
        newBusinessPage.selectIdealCustomerDropDown();
    }

    @When("I select deal sponsor option in ideal customer field")
    public void selectDealSponsorInIdealCustomerField(){
        newBusinessPage.selectDealSponsorInIdealCustomerField();
    }

    @When("I select developer option in ideal customer field")
    public void selectDeveloperInIdealCustomerField(){
        newBusinessPage.selectDeveloperInIdealCustomerField();
    }

    @When("I clear deal sponsor option in ideal customer field")
    public void clearDealSponsorInIdealCustomerField(){
        newBusinessPage.clearDealSponsorInIdealCustomerField();
    }

    @When("I select investor option in ideal customer field")
    public void selectInvestorInIdealCustomerField(){
        newBusinessPage.selectInvestorInIdealCustomerField();
    }

    @When("I select advisor option in ideal customer field")
    public void selectAdvisorOptionInIdealCustomerField(){
        newBusinessPage.selectAdvisorOptionInIdealCustomerField();
    }

    @When("I clear investor option in ideal customer field")
    public void clearInvestorInIdealCustomerField(){
        newBusinessPage.clearInvestorInIdealCustomerField();
    }

    @When("I select lender option in ideal customer field")
    public void selectLenderInIdealCustomerField(){
        newBusinessPage.selectLenderInIdealCustomerField();
    }

    @When("I select family office option in ideal customer field")
    public void selectFamilyOfficeOptionInIdealCustomerField(){
        newBusinessPage.selectFamilyOfficeOptionInIdealCustomerField();
    }

    @When("I clear lender option in ideal customer field")
    public void clearLenderInIdealCustomerField(){
        newBusinessPage.clearLenderInIdealCustomerField();
    }

    @When("I select real estate advisor option in ideal customer field")
    public void selectRealEstateAdvisorInIdealCustomerField(){
        newBusinessPage.selectRealEstateAdvisorInIdealCustomerField();
    }

    @When("I select advisor option of real estate advisor in ideal customer field")
    public void selectAdvisorOptionOfREAInIdealCustomerField(){
        newBusinessPage.selectAdvisorOptionOfREAInIdealCustomerField();
    }

    @When("I clear real estate advisor option in ideal customer field")
    public void clearRealEstateAdvisorInIdealCustomerField(){
        newBusinessPage.clearRealEstateAdvisorInIdealCustomerField();
    }

    @When("I click on 'Route to Sponsor' drop down field in search")
    public void clickRouteToDeveloper_NewBusiness(){
        newBusinessPage.clickRouteToSponsorOfDealSponsor_NewBusiness();
    }

    @When("I click on NorthEast region")
    public void clickNorthEast(){
        newBusinessPage.clickNorthEast();
    }

    @When("I click on New York state")
    public void clickTexasState(){
        newBusinessPage.clickNewYorkState();
    }

    @When("I enter and select Ira city")
    public void enterAndSelectIraCity(){
        newBusinessPage.enterAndSelectIraCity();
    }

    @When("I select number of professionals slider in new business advisor search")
    public void selectNoOfProfessionals(){
       newBusinessPage.selectNoOfProfessionals();
    }

    @When("I clear number of professionals slider in new business advisor search")
    public void clearNoOfProfessionals(){
        newBusinessPage.clearNoOfProfessionals();
    }
}
