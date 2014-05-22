package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.When;
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
}
