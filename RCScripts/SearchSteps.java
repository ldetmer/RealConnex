package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.When;
import test.pages.PageFactory;
import test.pages.SearchPage;

public class SearchSteps {
    private final SearchPage searchPage;

    @Inject
    public SearchSteps(PageFactory thePageFactory) {
        searchPage = thePageFactory.newSearchPage();
    }

    @When("I click on 'People,companies and association' link")
    public void peopleCompaniesLinkClick(){
        searchPage.peopleCompaniesLinkClick();
    }

    @When("I click on 'People' link")
    public void peopleClick(){
        searchPage.peopleClick();
    }

    @When("I click on 'Companies/Associations' link")
    public void companiesClick(){
        searchPage.companiesClick();
    }

    @When("I click on 'Developer,Deal Sponsor' link")
    public void dealSponsorClick(){
        searchPage.dealSponsorClick();
    }

    @When("I click on 'Deal Sponsor' link")
    public void selectDealSponsor(){
        searchPage.selectDealSponsor();
    }

    @When("I click on 'GO' button")
    public void clickGo(){
        searchPage.clickGo();
    }

    @When("I click on 'Developer' link")
    public void selectDeveloper(){
        searchPage.selectDeveloper();
    }

    @When("I select 'Fund Sponsor' link")
    public void selectFundSponsor(){
        searchPage.selectFundSponsor();
    }

    @When("I select 'Developer','DealSponsor','FundSponsor' check box")
    public void clickUsers(){
        searchPage.clickUsers();
    }

    @When("I click on 'Real Estate Advisors' link")
    public void clickRealEstateLink(){
        searchPage.clickRealEstateLink();
    }

    @When("I click on 'Advisor' link")
    public void clickAdvisorLink(){
        searchPage.clickAdvisorLink();
    }

    @When("I click on 'Appraisal' link")
    public void clickAppraisalLink(){
        searchPage.clickAppraisalLink();
    }

    @When("I click on 'Broker' link")
    public void clickBroker(){
        searchPage.clickBroker();
    }

    @When("I click on 'Acquisitions' link")
    public void clickAcquisitions(){
        searchPage.clickAcquisitions();
    }
    @When("I click on 'Residential' link")
    public void clickResidential(){
        searchPage.clickResidential();
    }

    @When("I click on 'Investment Banker' link")
    public void clickInvestmentBanker(){
        searchPage.clickInvestmentBanker();
    }

    @When("I click on 'Capital Raising' link")
    public void clickCapitalRaising(){
        searchPage.clickCapitalRaising();
    }

    @When("I click on 'Investments' link")
    public void clickInvestments(){
        searchPage.clickInvestments();
    }

    @When("I click on 'Direct Into Project' link")
    public void clickDirectIntoProject(){
        searchPage.clickDirectIntoProject();
    }

    @When("I click on 'Core' link")
    public void clickCore(){
        searchPage.clickCore();
    }

    @When("I click on 'Fund' link")
    public void clickFundOfFunds(){
        searchPage.clickFund();
    }

    @When("I click on 'Core' in fund link")
    public void clickCoreOfFund(){
        searchPage.clickCoreOfFund();
    }

    @When("I click on 'Money' link")
    public void clickMoney(){
        searchPage.clickMoney();
    }

    @When("I click on 'Equity' link")
    public void clickEquity(){
        searchPage.clickEquity();
    }

    @When("I click on 'Preferred' link")
    public void clickPreferred(){
        searchPage.clickPreferred();
    }

    @When("I click on 'Fund' of money search")
    public void clickFundOfMoney(){
        searchPage.clickFundOfMoney();
    }

    @When("I click on 'Mezz' link")
    public void clickMezz(){
        searchPage.clickMezz();
    }

    @When("I click on 'Direct Into Project' link in money search")
    public void clickDirectIntoProjectLink(){
        searchPage.clickDirectIntoProjectLink();
    }

    @When("I click on 'Fund' link in money search")
    public void clickFundLink(){
        searchPage.clickFundLink();
    }

    @When("I click on 'Debt' link")
    public void clickDebt(){
        searchPage.clickDebt();
    }

    @When("I click on 'Loans' link")
    public void clickLoans() {
        searchPage.clickLoans();
    }

    @When("I click on 'Land Loan' link")
    public void clickLandLoan(){
        searchPage.clickLandLoan();
    }

    @When("I click on 'Income/Core' link")
    public void clickIncomeOrCore(){
        searchPage.clickIncomeOrCore();
    }
}
