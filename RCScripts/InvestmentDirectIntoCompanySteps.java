package test.steps;


import com.google.inject.Inject;
import org.jbehave.core.annotations.When;
import test.pages.InvestmentDirectIntoCompanyPage;
import test.pages.PageFactory;

public class InvestmentDirectIntoCompanySteps {
    private final InvestmentDirectIntoCompanyPage investmentDirectIntoCompanyPage;

    @Inject
    public InvestmentDirectIntoCompanySteps(PageFactory thePageFactory) {
        investmentDirectIntoCompanyPage = thePageFactory.newInvestmentDirectIntoCompanyPage();
    }

    @When("I select the value in deal size")
    public void selectValueInDealSize(){
        investmentDirectIntoCompanyPage.selectValueInDealSize();
    }

    @When("I clear value in deal size")
    public void clearValueInDealSize(){
        investmentDirectIntoCompanyPage.clearValueInDealSize();
    }

    @When("I click on investor type field")
    public void clickInvestorType(){
        investmentDirectIntoCompanyPage.clickInvestorType();
    }

    @When("I select advisor option in investor type field")
    public void selectAdvisorOption(){
        investmentDirectIntoCompanyPage.selectAdvisorOption();
    }

    @When("I clear advisor option in investor type field")
    public void clearAdvisorOption(){
        investmentDirectIntoCompanyPage.selectAdvisorOption();
    }

    @When("I click route to sponsor field")
    public void clickRouteToSponsorField(){
        investmentDirectIntoCompanyPage.clickRouteToSponsorField();
    }

    @When("I select direct only option in route to sponsor drop down")
    public void selectDirectOnlyInRouteToSponsor(){
        investmentDirectIntoCompanyPage.selectDirectOnlyInRouteToSponsor();
    }

    @When("I clear direct only option in route to sponsor drop down")
    public void clearDirectOnly(){
        investmentDirectIntoCompanyPage.selectDirectOnlyInRouteToSponsor();
    }

    @When("I click on asset interest")
    public void clickAssetInterest(){
        investmentDirectIntoCompanyPage.clickAssetInterest();
    }

    @When("I click on deal stage drop down field")
    public void clickDealStage(){
        investmentDirectIntoCompanyPage.clickDealStage();
    }

    @When("I select owned option in deal stage drop down field")
    public void selectOwnedOption(){
        investmentDirectIntoCompanyPage.selectOwnedOption();
    }

    @When("I clear owned option in deal stage drop down field")
    public void clearOwnedOption(){
        investmentDirectIntoCompanyPage.clearOwnedOption();
    }

    @When("I click on asset strategy drop down")
    public void clickAssetStrategyField(){
        investmentDirectIntoCompanyPage.clickAssetStrategyField();
    }

    @When("I select acquisition option in asset strategy field")
    public void selectAcquisitionOption(){
        investmentDirectIntoCompanyPage.selectAcquisitionOption();
    }

    @When("I clear acquisition option in asset strategy field")
    public void clearAcquisitionOption(){
        investmentDirectIntoCompanyPage.clearAcquisitionOption();
    }

    @When("I check the syndicating check field")
    public void selectSyndicating(){
        investmentDirectIntoCompanyPage.selectSyndicating();
    }

    @When("I un check the syndicating check field")
    public void unCheckSyndicating(){
        investmentDirectIntoCompanyPage.selectSyndicating();
    }

    @When("I select broker or intermediary option in investor type")
    public void selectBrokerOrIntermediary(){
        investmentDirectIntoCompanyPage.selectBrokerOrIntermediary();
    }

    @When("I select consultant option in investor type")
    public void selectConsultant(){
        investmentDirectIntoCompanyPage.selectConsultant();
    }

    @When("I select EB5 program option in investor type")
    public void selectEB5Program(){
        investmentDirectIntoCompanyPage.selectEB5Program();
    }

    @When("I select family office option in investor type")
    public void selectFamilyOffice(){
        investmentDirectIntoCompanyPage.selectFamilyOffice();
    }

    @When("I select fund of funds option in investor type")
    public void selectFundOfFunds(){
        investmentDirectIntoCompanyPage.selectFundOfFunds();
    }

    @When("I select hedge fund option in investor type")
    public void selectHedgeFund(){
        investmentDirectIntoCompanyPage.selectHedgeFund();
    }

    @When("I select individual investor option in investor type")
    public void selectIndividualInvestor(){
        investmentDirectIntoCompanyPage.selectIndividualInvestor();
    }

    @When("I select investment manager option in investor type")
    public void selectInvestmentManager(){
        investmentDirectIntoCompanyPage.selectInvestmentManager();
    }

    @When("I select NCREIF style trust or fund option in investor type")
    public void selectNCREIFStyleTrust(){
        investmentDirectIntoCompanyPage.selectNCREIFStyleTrust();
    }

    @When("I select owner operator option in investor type")
    public void selectOwnerOperator(){
        investmentDirectIntoCompanyPage.selectOwnerOperator();
    }

    @When("I select private equity real estate fund option in investor type")
    public void selectPrivateEquityRealEstateFund(){
        investmentDirectIntoCompanyPage.selectPrivateEquityRealEstateFund();
    }

    @When("I select public REIT option in investor type")
    public void selectPublicREIT(){
        investmentDirectIntoCompanyPage.selectPublicREIT();
    }

    @When("I select sovereign wealth fund option in investor type")
    public void selectSovereignWealthFund(){
        investmentDirectIntoCompanyPage.selectSovereignWealthFund();
    }

    @When("I select bank option in investor type")
    public void selectBank(){
        investmentDirectIntoCompanyPage.selectBank();
    }

    @When("I select construction lender or purchaser option in investor type")
    public void selectConstructionLender(){
        investmentDirectIntoCompanyPage.selectConstructionLender();
    }

    @When("I select crowd funding platform option in investor type")
    public void selectCrowdFundingPlatform(){
        investmentDirectIntoCompanyPage.selectCrowdFundingPlatform();
    }

    @When("I select endowment and foundation option in investor type")
    public void selectEndowmentAndFoundation(){
        investmentDirectIntoCompanyPage.selectEndowmentAndFoundation();
    }

    @When("I select fund option in investor type")
    public void selectFund(){
        investmentDirectIntoCompanyPage.selectFund();
    }

    @When("I select government agency option in investor type")
    public void selectGovernmentAgency(){
        investmentDirectIntoCompanyPage.selectGovernmentAgency();
    }

    @When("I select high net worth investor option in investor type")
    public void selectHighNet(){
        investmentDirectIntoCompanyPage.selectHighNet();
    }

    @When("I select insurance company option in investor type")
    public void selectInsuranceCompany(){
        investmentDirectIntoCompanyPage.selectInsuranceCompany();
    }

    @When("I select mezzanine option in investor type")
    public void selectMezzanine(){
        investmentDirectIntoCompanyPage.selectMezzanine();
    }

    @When("I select other institutional investor option in investor type")
    public void selectOtherInstitutional(){
        investmentDirectIntoCompanyPage.selectOtherInstitutional();
    }

    @When("I select pension fund option in investor type")
    public void selectPensionFund(){
        investmentDirectIntoCompanyPage.selectPensionFund();
    }

    @When("I select private REIT option in investor type")
    public void selectPrivateREIT(){
        investmentDirectIntoCompanyPage.selectPrivateREIT();
    }

    @When("I select senior lender option in investor type")
    public void selectSeniorLender(){
        investmentDirectIntoCompanyPage.selectSeniorLender();
    }

    @When("I select special servicer option in investor type")
    public void selectSpecialServicer(){
        investmentDirectIntoCompanyPage.selectSpecialServicer();
    }

    @When("I select all option in investor type")
    public void selectAllOptionOfInvestorType(){
        investmentDirectIntoCompanyPage.selectAllOptionOfInvestorType();
    }

    @When("I clear all option in investor type")
    public void clearSpecialServicer(){
        investmentDirectIntoCompanyPage.clearAllOptionOfInvestorType();
    }
}
