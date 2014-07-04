package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.MyUniversePage;
import test.pages.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 7/3/14
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyUniverseSteps {
    private final MyUniversePage myUniversePage;

    @Inject
    public MyUniverseSteps(PageFactory thePageFactory) {
        myUniversePage = thePageFactory.newMyUniversePage();
    }

    @When("I click on my universe radio button")
    public void clickMyUniverseRadioButton(){
        myUniversePage.clickMyUniverseRadioButton();
    }

    @When("I click on include radio button")
    public void clickIncludeRadioButton(){
       myUniversePage.clickIncludeRadioButton();
    }

    @When("I select deal sponsor check box")
    public void selectDealSponsorCheckBox(){
        myUniversePage.selectDealSponsorCheckBox();
    }

    @When("I clear deal sponsor check box")
    public void clearDealSponsorCheckBox(){
        myUniversePage.clearDealSponsorCheckBox();
    }

    @When("I select sub role field")
    public void selectSubRoleField(){
        myUniversePage.selectSubRoleField();
    }

    @When("I select developer sub role option")
    public void selectDeveloperOption(){
        myUniversePage.selectDeveloperOption();
    }

    @When("I clear developer sub role option")
    public void clearDeveloperOption(){
        myUniversePage.clearDeveloperOption();
    }

    @When("I set the value in deal/fund size field")
    public void setDealFundSize(){
        myUniversePage.setDealFundSize();
    }

    @When("I clear the value in deal/fund size field")
    public void clearDealFundSize(){
        myUniversePage.clearDealFundSize();
    }

    @When("I select public radio button")
    public void selectPublicRadioButton(){
        myUniversePage.selectPublicRadioButton();
    }

    @When("I click on location field")
    public void clickLocationField(){
        myUniversePage.clickLocationField();
    }

    @When("I clear on location field")
    public void clearLocationField(){
        myUniversePage.clearLocationField();
    }

    @When("I select the location of the user")
    public void selectLocation(){
        myUniversePage.selectLocation();
    }

    @When("I click on save button in my universe page of ME tab")
    public void clickSaveButton(){
        myUniversePage.clickSaveButton();
    }

    @Then("I verify '$lStrUserName' user name who has set privacy include in my universe is displayed")
    public void verifyUserName_Universe(@Named("lStrUserName") String lStrUserName){
        myUniversePage.verifyUserName_Universe(lStrUserName);
    }

    @Then("I verify user whose profile is set to include in my universe is not displayed")
    public void verifyIncludeProfileUserNameNotDisplayed() throws Exception {
        myUniversePage.verifyIncludeProfileUserNameNotDisplayed(5);
    }
}
