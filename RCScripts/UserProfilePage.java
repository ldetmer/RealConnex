package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.steps.VerificationStatements;

public class UserProfilePage extends FluentWebDriverPage {
    public UserProfilePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void findNowImg(){
        //manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        findElement(By.xpath("//nav[@id='nav']/a/em/img")).isDisplayed();
    }

    public void clickFindNow(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        executeScript("scrollTo(250,0)");
        findElement(By.xpath("//nav[@id='nav']/a/em/img")).click();
    }
}
