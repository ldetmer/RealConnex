package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import test.pages.LoginRealConnexPage;
import test.pages.PageFactory;
import java.io.IOException;

public class LoginRealConnexSteps {
    private final LoginRealConnexPage loginRealConnexPage;

    @Inject
    public LoginRealConnexSteps(PageFactory thePageFactory) {
        loginRealConnexPage = thePageFactory.newLoginRealConnexPage();
    }

    @When("I launch RealConnex application")
    public void launchRealConnexPage()throws IOException {
        loginRealConnexPage.launchRealConnexPage();
    }

    @When("I enter user email ID")
    public void enterEmailId(){
        loginRealConnexPage.enterEmailId(1);
    }

    @When("I enter Password")
    public void enterPassword(){
        loginRealConnexPage.enterPassword(1);
    }

    @When("I click on login button")
    public void clickLogin(){
        loginRealConnexPage.clickLogIn();
    }

    @When("I enter email ID of user")
    public void enterEmailId_Privacy() throws Exception {
        loginRealConnexPage.enterEmailId_Privacy(2);
    }

    @When("I enter user login details:$LoginDetailsTable")
    public void enterLoginDetails(ExamplesTable LoginDetailsTable){
        loginRealConnexPage.enterLoginDetails(LoginDetailsTable);
    }
}
