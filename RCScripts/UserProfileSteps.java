package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.PageFactory;
import test.pages.UserProfilePage;

public class UserProfileSteps {
    private final UserProfilePage userProfilePage;

    @Inject
    public UserProfileSteps(PageFactory thePageFactory) {
        userProfilePage = thePageFactory.newUserProfilePage();
    }

    @Then("I should see 'Find Now' image")
    public void findNowImg(){
        userProfilePage.findNowImg();
    }

    @When("I click on 'Find Now' button")
    public void clickFindNow(){
        userProfilePage.clickFindNow();
    }
}
