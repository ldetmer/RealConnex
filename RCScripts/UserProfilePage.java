package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class UserProfilePage extends FluentWebDriverPage {
    public UserProfilePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void findNowImg(){
        //manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try{
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//nav[@id='nav']/a/em/img"), getDriverProvider().get()));
        } catch (AssertionError e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Find Now Image is not found\n";
        }
        //findElement(By.xpath("//nav[@id='nav']/a/em/img")).isDisplayed();
    }

    public void clickFindNow(){
        //wait until page load
        WaitUtil.simpleSleep(10000);
        executeScript("scrollTo(250,0)");
        try{
            findElement(By.xpath("//nav[@id='nav']/a/em/img")).click();
        } catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Find Now Element is not clicked\n";
        }
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }
}
