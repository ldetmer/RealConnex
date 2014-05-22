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
        investmentDirectIntoCompanyPage.selectOwnedOption();
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
        investmentDirectIntoCompanyPage.selectAcquisitionOption();
    }

    @When("I check the syndicating check field")
    public void selectSyndicating(){
        investmentDirectIntoCompanyPage.selectSyndicating();
    }

    @When("I un check the syndicating check field")
    public void unCheckSyndicating(){
        investmentDirectIntoCompanyPage.selectSyndicating();
    }
}
