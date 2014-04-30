package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompaniesOfDealSponsorPage;
import test.pages.PageFactory;

public class CompaniesOfDealSponsorSteps {
    private final CompaniesOfDealSponsorPage companiesOfDealSponsorPage;

    @Inject
    public CompaniesOfDealSponsorSteps(PageFactory thePageFactory) {
        companiesOfDealSponsorPage = thePageFactory.newCompaniesOfDealSponsorPage();
    }

    @When("I click on 'Project' field")
    public void clickProject(){
        companiesOfDealSponsorPage.clickProject();
    }

    @When("I click on 'Project Type' drop down field")
    public void clickProjectType(){
        companiesOfDealSponsorPage.clickProjectType();
    }

    @When("I select a project in drop down list")
    public void selectProject(){
        companiesOfDealSponsorPage.selectProject();
    }

    @When("I select office and hotel in project drop down list")
    public void selectSecondOption(){
        companiesOfDealSponsorPage.selectSecondOption();
    }

    @When("I clear project field")
    public void clearProjectField(){
        companiesOfDealSponsorPage.clearProjectField();
    }

    @When("I click on multifamily option in project type")
    public void clickMultiFamily(){
        companiesOfDealSponsorPage.clickMultiFamily();
    }

    @When("I click on hotel option in project type")
    public void clickHotel(){
        companiesOfDealSponsorPage.clickHotel();
    }

    @When("I click on sports option in project type")
    public void clickSports(){
        companiesOfDealSponsorPage.clickSports();
    }

    @When("I click on health care option in project type")
    public void clickHealthCare(){
        companiesOfDealSponsorPage.clickHealthCare();
    }
    @When("I click on storage option in project type")
    public void clickStorage(){
        companiesOfDealSponsorPage.clickStorage();
    }

    @When("I click on other option in project type")
    public void clickOther(){
        companiesOfDealSponsorPage.clickOther();
    }

    @When("I click on retail option in project type")
    public void clickRetail(){
        companiesOfDealSponsorPage.clickRetail();
    }

    @When("I click on industrial option in project type")
    public void clickIndustrial(){
        companiesOfDealSponsorPage.clickIndustrial();
    }

    @When("I click on residential option in project type")
    public void clickResidential(){
        companiesOfDealSponsorPage.clickResidential();
    }

    @When("I click on single option in project type")
    public void clickSingle(){
        companiesOfDealSponsorPage.clickSingle();
    }

    @When("I click on retirement option in project type")
    public void clickRetirement(){
        companiesOfDealSponsorPage.clickRetirement();
    }

    @When("I click on student option in project type")
    public void clickStudent(){
        companiesOfDealSponsorPage.clickStudent();
    }

    @When("I click on other housing option in project type")
    public void clickOtherHousing(){
        companiesOfDealSponsorPage.clickOtherHousing();
    }

    @When("I click on residential multi family option in project type")
    public void clickResidentialMultiFamily(){
        companiesOfDealSponsorPage.clickResidentialMultiFamily();
    }

    @When("I clear residential of project field")
    public void clearResidential(){
        companiesOfDealSponsorPage.clearResidential();
    }

    @When("I click on mixed use option in project type")
    public void clickMixedUse(){
        companiesOfDealSponsorPage.clickMixedUse();
    }

    @When("I click on commercial option in project type")
    public void clickCommercial(){
        companiesOfDealSponsorPage.clickCommercial();
    }

    @When("I click on solar option in project type")
    public void clickSolar(){
        companiesOfDealSponsorPage.clickSolar();
    }

    @When("I clear project option in project type")
    public void clearProject(){
        companiesOfDealSponsorPage.clearProject();
    }

    @When("I click on 'RiskProfile' drop down field")
    public void clickRiskProfile(){
        companiesOfDealSponsorPage.clickRiskProfile();
    }

    @When("I select a risk profile in drop down list")
    public void selectRisk(){
        companiesOfDealSponsorPage.selectRisk();
    }

    @When("I select core and core plus in risk profile")
    public void selectSecondRiskProfile(){
        companiesOfDealSponsorPage.selectSecondRiskProfile();
    }

    @When("I clear risk profile field")
    public void clearRiskProfile(){
        companiesOfDealSponsorPage.clearRiskProfile();
    }

    @When("I click on core plus risk profile type")
    public void clickCorePlus(){
        companiesOfDealSponsorPage.clickCorePlus();
    }

    @When("I click on value add risk profile type")
    public void clickValueAdd(){
        companiesOfDealSponsorPage.clickValueAdd();
    }

    @When("I click on development risk profile type")
    public void clickDevelopment(){
        companiesOfDealSponsorPage.clickDevelopment();
    }

    @When("I click on opportunistic risk profile type")
    public void clickOpportunistic(){
        companiesOfDealSponsorPage.clickOpportunistic();
    }

    @When("I click on other risk profile risk profile type")
    public void clickOtherRiskProfile(){
        companiesOfDealSponsorPage.clickOtherRiskProfile();
    }

    @When("I clear risk profile")
    public void clearRisk(){
        companiesOfDealSponsorPage.clearRisk();
    }

    @When("I click on 'Investor and Sponsor' drop down field")
    public void clickInvestorSponsor(){
        companiesOfDealSponsorPage.clickInvestorSponsor();
    }

    @When("I click on 'Investment Method' drop down field")
    public void clickInvestmentMethod(){
        companiesOfDealSponsorPage.clickInvestmentMethod();
    }

    @When("I select a investment method in drop down list")
    public void selectInvestment(){
        companiesOfDealSponsorPage.selectInvestment();
    }

    @When("I select advisor and crowd fund in investment method")
    public void selectSecondInvestment(){
        companiesOfDealSponsorPage.selectSecondInvestment();
    }

    @When("I clear Investment field")
    public void clearInvestment(){
        companiesOfDealSponsorPage.clearInvestment();
    }

    @When("I click on EB5 option in investment method")
    public void clickEB5(){
        companiesOfDealSponsorPage.clickEB5();
    }

    @When("I click on crowd funded option in investment method")
    public void clickCrowdFunded(){
        companiesOfDealSponsorPage.clickCrowdFunded();
    }

    @When("I click on single investor option in investment method")
    public void clickSingleInvestor(){
        companiesOfDealSponsorPage.clickSingleInvestor();
    }

    @When("I click on family office option in investment method")
    public void clickFamilyOffice(){
        companiesOfDealSponsorPage.clickFamilyOffice();
    }

    @When("I click on institution option in investment method")
    public void clickInstitution(){
        companiesOfDealSponsorPage.clickInstitution();
    }

    @When("I click on asset manager option in institute of investment method")
    public void clickAssetManager(){
        companiesOfDealSponsorPage.clickAssetManager();
    }

    @When("I click broker or intermediary option in institute of investment method")
    public void clickBrokerOrIntermediary(){
        companiesOfDealSponsorPage.clickBrokerOrIntermediary();
    }

    @When("I click consultant option in institute of investment method")
    public void clickConsultant(){
        companiesOfDealSponsorPage.clickConsultant();
    }

    @When("I click construction option in institute of investment method")
    public void clickConstruction(){
        companiesOfDealSponsorPage.clickConstruction();
    }

    @When("I click endowment option in institute of investment method")
    public void clickEndowment(){
        companiesOfDealSponsorPage.clickEndowment();
    }

    @When("I click fund of funds option in institute of investment method")
    public void clickFundOfFunds(){
        companiesOfDealSponsorPage.clickFundOfFunds();
    }

    @When("I click government agency in institute of investment method")
    public void clickGovernmentAgency(){
        companiesOfDealSponsorPage.clickGovernmentAgency();
    }

    @When("I click hedge fund in institute of investment method")
    public void clickHedgeFund(){
        companiesOfDealSponsorPage.clickHedgeFund();
    }

    @When("I click high net in institute of investment method")
    public void clickHighNet(){
        companiesOfDealSponsorPage.clickHighNet();
    }

    @When("I click individual investor in institute of investment method")
    public void clickIndividualInvestor(){
        companiesOfDealSponsorPage.clickIndividualInvestor();
    }

    @When("I click insurance company in institute of investment method")
    public void clickInsuranceCompany(){
        companiesOfDealSponsorPage.clickInsuranceCompany();
    }

    @When("I click other institutional investor in institute of investment method")
    public void clickOtherInstitutionalInvestor(){
        companiesOfDealSponsorPage.clickOtherInstitutionalInvestor();
    }

    @When("I click owner operator in institute of investment method")
    public void clickOwnerOperator(){
        companiesOfDealSponsorPage.clickOwnerOperator();
    }

    @When("I click NCREIF option in institute of investment method")
    public void clickNCREIF(){
        companiesOfDealSponsorPage.clickNCREIF();
    }

    @When("I click senior lender option in institute of investment method")
    public void clickSeniorLender(){
        companiesOfDealSponsorPage.clickSeniorLender();
    }

    @When("I click mezzanine option in institute of investment method")
    public void clickMezzanine(){
        companiesOfDealSponsorPage.clickMezzanine();
    }

    @When("I click junior lender option in institute of investment method")
    public void clickJuniorLender(){
        companiesOfDealSponsorPage.clickJuniorLender();
    }

    @When("I click private equity option in institute of investment method")
    public void clickPrivateEquity(){
        companiesOfDealSponsorPage.clickPrivateEquity();
    }

    @When("I click private REIT option in institute of investment method")
    public void clickPrivateREIT(){
        companiesOfDealSponsorPage.clickPrivateREIT();
    }

    @When("I click public REIT option in institute of investment method")
    public void clickPublicREIT(){
        companiesOfDealSponsorPage.clickPublicREIT();
    }

    @When("I click sovereign option in institute of investment method")
    public void clickSovereign(){
        companiesOfDealSponsorPage.clickSovereign();
    }

    @When("I click special option in institute of investment method")
    public void clickSpecial(){
        companiesOfDealSponsorPage.clickSpecial();
    }

    @When("I clear investment method option")
    public void clearInvestmentMethod(){
        companiesOfDealSponsorPage.clearInvestmentMethod();
    }

    @When("I click on 'Route to Developer' drop down field")
    public void clickRouteToDeveloper(){
        companiesOfDealSponsorPage.clickRouteToDeveloper();
    }

    @When("I select a route to developer in drop down list")
    public void selectRoute(){
        companiesOfDealSponsorPage.selectRoute();
    }

    @When("I select direct only and intermediary in route to development method")
    public void selectSecondRoute(){
        companiesOfDealSponsorPage.selectSecondRoute();
    }

    @When("I clear route field")
    public void clearRoute(){
        companiesOfDealSponsorPage.clearRoute();
    }

    @When("I click on intermediary option in route to developer")
    public void clickIntermediary(){
        companiesOfDealSponsorPage.clickIntermediary();
    }

    @When("I click on brokers option in route to developer")
    public void clickBrokers(){
        companiesOfDealSponsorPage.clickBrokers();
    }

    @When("I click on placement agents option in route to developer")
    public void clickPlacementAgents(){
        companiesOfDealSponsorPage.clickPlacementAgents();
    }

    @When("I clear route to developer option")
    public void clearRouteToDeveloper(){
        companiesOfDealSponsorPage.clearRouteToDeveloper();
    }

    @When("I click on Syndicate type")
    public void clickSyndicateType(){
        companiesOfDealSponsorPage.clickSyndicateType();
    }

    @Then("I verify 'Deal sponsor' company name is displayed")
    public void verifyDealCompanyName(){
        companiesOfDealSponsorPage.verifyDealCompanyName(1);
    }

    @Then("I verify company name of deal sponsor is displayed")
    public void verifyCompanyName(){
        companiesOfDealSponsorPage.verifyCompanyName(1);
    }
}
