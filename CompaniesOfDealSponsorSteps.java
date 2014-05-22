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

   /* @When("I click on 'Project' field")
    public void clickProject(){
        companiesOfDealSponsorPage.clickProject();
    }*/

    @When("I select office in the asset type drop down list")
    public void selectProject(){
        companiesOfDealSponsorPage.selectProject();
    }

    @When("I clear asset type drop down")
    public void clearProjectField(){
        companiesOfDealSponsorPage.clearProjectField();
    }

    @When("I click on 'RiskProfile' drop down field")
    public void clickRiskProfile(){
        companiesOfDealSponsorPage.clickRiskProfile();
    }

    @When("I select core option in risk profile drop down")
    public void selectRisk(){
        companiesOfDealSponsorPage.selectRisk();
    }

    @When("I clear risk profile field in project drop down")
    public void clearRiskProfile(){
        companiesOfDealSponsorPage.clearRiskProfile();
    }

    @When("I click on 'Investor and Sponsor' drop down field")
    public void clickInvestorSponsor(){
        companiesOfDealSponsorPage.clickInvestorSponsor();
    }

    @When("I click on 'Investment Method' drop down field")
    public void clickInvestmentMethod(){
        companiesOfDealSponsorPage.clickInvestmentMethod();
    }

    @When("I select advisor option in investment method drop down list")
    public void selectInvestment(){
        companiesOfDealSponsorPage.selectInvestment();
    }

    @When("I clear investment field of investor and sponsor drop down")
    public void clearInvestment(){
        companiesOfDealSponsorPage.clearInvestment();
    }

    @When("I click on 'Route to Sponsor' drop down field")
    public void clickRouteToDeveloper(){
        companiesOfDealSponsorPage.clickRouteToSponsorOfDealSponsor();
    }

    @When("I select direct only option in route to sponsor drop down list")
    public void selectRoute(){
        companiesOfDealSponsorPage.selectRoute();
    }

    @When("I clear route to sponsor drop down")
    public void clearRoute(){
        companiesOfDealSponsorPage.clearRoute();
    }

    @When("I click on asset type field of deal sponsor search")
    public void clickAssetTypeOfDealSponsor(){
        companiesOfDealSponsorPage.clickAssetTypeOfDealSponsor();
    }

    @When("I click on about field in deal sponsor company search")
    public void clickAbout(){
        companiesOfDealSponsorPage.clickAbout();
    }

    @When("I enter project fields of deal sponsor search")
    public void enterAboutField(){
        companiesOfDealSponsorPage.enterProjectField(1);
    }

    @When("I clear project field of deal sponsor search")
    public void clearAboutField(){
        companiesOfDealSponsorPage.clearProjectFieldOfAbout();
    }

    @When("I enter Sq Ft field of deal sponsor search")
    public void enterSqFtField(){
        companiesOfDealSponsorPage.enterSqFtField(1);
    }

    @When("I clear Sq Ft field of deal sponsor search")
    public void clearSqFtField(){
        companiesOfDealSponsorPage.clearSqFtField();
    }

    @When("I click on Syndicate check box")
    public void checkSyndicate(){
        companiesOfDealSponsorPage.checkSyndicate();
    }

    @When("I un check Syndicate check box")
    public void unCheckSyndicate(){
        companiesOfDealSponsorPage.uncheckSyndicate();
    }


}
