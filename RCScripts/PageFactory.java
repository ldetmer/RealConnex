package test.pages;

import com.google.inject.Inject;
import org.jbehave.web.selenium.WebDriverProvider;


public class PageFactory {

    private final WebDriverProvider webDriverProvider;

    @Inject
    public PageFactory(WebDriverProvider webDriverProvider) {
        this.webDriverProvider = webDriverProvider;
    }

    public WindowHandling newWindowHandling() {
        return new WindowHandling(webDriverProvider);
    }

   /* public  BrowserPage newBrowserPage() {
        return new BrowserPage(webDriverProvider);
    }*/

    public UserAsDealSponsorPage newUserAsDealSponsorPage() {
        return new UserAsDealSponsorPage(webDriverProvider);
    }

    public LoginRealConnexPage newLoginRealConnexPage () {
        return new LoginRealConnexPage(webDriverProvider);
    }

    public UserProfilePage newUserProfilePage () {
        return new UserProfilePage(webDriverProvider);
    }

    public SearchPage newSearchPage () {
        return new SearchPage(webDriverProvider);
    }

    public PeopleSearchPage newPeopleSearchPage () {
        return new PeopleSearchPage(webDriverProvider);
    }

    public PeopleSearchValidationPage newPeopleSearchValidationPage(){
        return new PeopleSearchValidationPage(webDriverProvider);
    }

    public ResultHandlingPage newResultHandlingPage () {
        return new ResultHandlingPage(webDriverProvider);
    }

    public CompaniesSearchPage newCompaniesSearchPage () {
        return new CompaniesSearchPage(webDriverProvider);
    }

    public CompaniesSearchValidationPage newCompaniesSearchValidationPage(){
        return new CompaniesSearchValidationPage(webDriverProvider);
    }

    public DealSponsorPage newDealSponsorPage(){
        return new DealSponsorPage(webDriverProvider);
    }

    public DealSponsorValidationPage newDealSponsorValidationPage(){
        return new DealSponsorValidationPage(webDriverProvider);
    }
    public DeveloperSearchPage newDeveloperSearchPage(){
        return new DeveloperSearchPage(webDriverProvider);
    }

    public DeveloperSearchValidationPage newDeveloperSearchValidationPage(){
        return new DeveloperSearchValidationPage(webDriverProvider);
    }

    public FundSponsorPage newFundSponsorPage(){
        return new FundSponsorPage(webDriverProvider);
    }

    public FundSponsorValidationPage newFundSponsorValidationPage(){
        return new FundSponsorValidationPage(webDriverProvider);
    }

    public DeveloperDealAndFundSponsorPage newDeveloperDealAndFundSponsorPage(){
        return new DeveloperDealAndFundSponsorPage(webDriverProvider);
    }

    public CombinationOfDealSponsorValidationPage newCombinationOfDealSponsorValidationPage(){
        return new CombinationOfDealSponsorValidationPage(webDriverProvider);
    }

    public CompaniesOfDealSponsorPage newCompaniesOfDealSponsorPage(){
        return new CompaniesOfDealSponsorPage(webDriverProvider);
    }

    public CompaniesOfDealSponsorValidationPage newCompaniesOfDealSponsorValidationPage(){
        return new CompaniesOfDealSponsorValidationPage(webDriverProvider);
    }

    public CompaniesOfDeveloperPage newCompaniesOfDeveloperPage(){
        return new CompaniesOfDeveloperPage(webDriverProvider);
    }

    public CompaniesOfFundSponsor newCompaniesOfFundSponsor(){
        return new CompaniesOfFundSponsor(webDriverProvider);
    }

    public  CompaniesOfDealDeveloperFundPage newCompaniesOfDealDeveloperFundPage(){
        return new  CompaniesOfDealDeveloperFundPage(webDriverProvider);
    }

    public  AdvisorSearchPage newAdvisorSearchPage(){
        return new  AdvisorSearchPage(webDriverProvider);
    }

    public  BrokerPage newBrokerPage(){
        return new BrokerPage(webDriverProvider);
    }

    public  InvestmentBankerPage newInvestmentBankerPage(){
        return new InvestmentBankerPage(webDriverProvider);
    }

    public  CompanyProfilePage newCompanyProfilePage(){
        return new CompanyProfilePage(webDriverProvider);
    }

    public  SearchOnProjectSizePage newSearchOnProjectSizePage(){
        return new SearchOnProjectSizePage(webDriverProvider);
    }

    public LogoutPage newLogoutPage() {
        return new LogoutPage(webDriverProvider);
    }

    public InvestmentBankerDirectIntoPage newInvestmentBankerDirectIntoPage() {
        return new InvestmentBankerDirectIntoPage(webDriverProvider);
    }

    public InvestmentDirectIntoValidationPage newInvestmentDirectIntoValidationPage(){
        return new InvestmentDirectIntoValidationPage(webDriverProvider);
    }

    public InvestmentDirectIntoCompanyPage newInvestmentDirectIntoCompanyPage(){
        return new InvestmentDirectIntoCompanyPage(webDriverProvider);
    }
}