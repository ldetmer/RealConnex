package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test.Support.ReadData;
import test.steps.VerificationStatements;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/25/14
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateUserPage extends FluentWebDriverPage {

    String gStrEmailId = "";
    public CreateUserPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void clickNotAMemberLink(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("a.link-1.sign")).click();
    }

    public void enterEmailIdOfUserRoles(){
        gStrEmailId = "testAuto"+System.currentTimeMillis()+"@yopmail.com";
        findElement(By.id("UserEmail")).clear();
        findElement(By.id("UserEmail")).sendKeys(gStrEmailId);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("UserEmail"), gStrEmailId);
    }

    public void enterFirstName(){
        String lStrFirstName = "test"+System.currentTimeMillis();
        findElement(By.id("UserFirstName")).clear();
        findElement(By.id("UserFirstName")).sendKeys(lStrFirstName);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("UserFirstName"), lStrFirstName);
    }

    public void enterLastName(){
        String lStrLastName = "auto"+System.currentTimeMillis();
        findElement(By.id("UserLastName")).clear();
        findElement(By.id("UserLastName")).sendKeys(lStrLastName);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("UserLastName"), lStrLastName);
    }

    public void enterPassword(int intRowIndex) throws Exception {
        String lStrPassword = ReadData.readDataExcel("LoginRealConnex", intRowIndex, "Password");
        findElement(By.id("UserPassword")).clear();
        findElement(By.id("UserPassword")).sendKeys(lStrPassword);
    }

    public void reEnterPassword(int intRowIndex) throws Exception {
        String lStrReEnterPassword = ReadData.readDataExcel("LoginRealConnex",intRowIndex,"Password");
        findElement(By.id("UserConfirmPass")).clear();
        findElement(By.id("UserConfirmPass")).sendKeys(lStrReEnterPassword);
    }

    public void clickSelectRoleDropDown(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("div.text")).click();
    }

    public void selectInvestorOption(){
        //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//span/div/ul/li[text()='Investor']")).click();
    }

    public void selectDealSponsorDeveloperAndFundMangerOption(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//span/div/ul/li[text()='Deal Sponsor, Developer, Fund Manager']")).click();
    }

    public void selectRealEstateAdvisorBrokerOption(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//span/div/ul/li[text()='Real Estate Advisor, Broker']")).click();
    }

    public void selectLenderOption(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//span/div/ul/li[text()='Lender']")).click();
    }

    public void verifyTextInRoleSelectedDropDown(String lStrSelectedOptionInDropDown){
        String lStrRoleSelectedActual = findElement(By.cssSelector("div.text")).getText();
        Assert.assertEquals(lStrSelectedOptionInDropDown,lStrRoleSelectedActual);
    }

    public void clickCertifyAccreditedInvestorCheckBox(){
        //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#accreditAddon > span.checkbox")).click();
    }

    public void clickRegisterButton(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("input.sbm")).click();
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
    }

    public void verifyConfirmationMessage(String lStrConfirmationMessage){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        String lStrMessage = findElement(By.cssSelector("#registerSuccess > div.popup > div.modal-content > div.title > strong")).getText();
        Assert.assertEquals(lStrMessage, lStrConfirmationMessage);
         //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void clickOk(){
         //wait until page load
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#registerSuccess > div.popup > div.modal-content > div.form-holder > fieldset > div.modal-footer > button.sbm")).click();
         //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void launchYopMail(){
        get("http://www.yopmail.com");
    }

    public void enterYopMailId(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("login")).clear();
        findElement(By.id("login")).sendKeys(gStrEmailId);
        System.out.println(gStrEmailId);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("login"), gStrEmailId);
    }

    public void enterCreatedEmailId() throws IOException {
        //wait until page load
        WaitUtil.simpleSleep(5000);
        System.out.println("Email ID:"+gStrEmailId);
        findElement(By.id("UserLoginPopupEmail")).clear();
        findElement(By.id("UserLoginPopupEmail")).sendKeys(gStrEmailId);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("UserLoginPopupEmail"), gStrEmailId);
    }

    public void clickCheckInboxButton() throws IOException {
        //wait until page load
        WaitUtil.simpleSleep(1000);
        Runtime.getRuntime().exec("D:\\RealConnex\\AutoIt\\yopmailpopup.exe");
        findElement(By.xpath("//input[@value='Check Inbox']")).click();
         //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void clickCheckInboxButtonInYopmail(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//input[@value='Check Inbox']")).click();
    }

    public void switchToYopMailTab(){
        //wait until page load
        WaitUtil.simpleSleep(5000);
        ArrayList<String> tabs = new ArrayList<String> (getWindowHandles());
        int lStrTabSize = tabs.size();
        if(lStrTabSize == 2){
        switchTo().window(tabs.get(1));
        close();
        switchTo().window(tabs.get(0));
        }
    }

    public void clickRealConnexMail(){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        switchTo().frame("ifinbox");
        findElement(By.xpath("//div[@id='m1']/div/a/span[@class='lmfd']/span[contains(text(),'RealConnex')]")).click();
        switchTo().defaultContent();
    }

    public void clickOnClickHereLink(){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        switchTo().frame("ifmail");
        findElement(By.linkText("Click here")).click();
         //wait until page load
        WaitUtil.simpleSleep(10000);
    }

    public void clickClickHereLinkInInbox(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        switchTo().frame(0);
        findElement(By.linkText("Click here")).click();
        //wait until page load
        WaitUtil.simpleSleep(10000);
        switchTo().defaultContent();
    }

    public void switchToRealConnexTab(){
        ArrayList<String> tabs2 = new ArrayList<String> (getWindowHandles());
        switchTo().window(tabs2.get(0));
        close();
        switchTo().window(tabs2.get(1));
        //wait until page load
        WaitUtil.simpleSleep(500);
    }

    public void verifyRealConnexPage(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        Assert.assertTrue(WaitUtil.isElementPresent(By.cssSelector("h1"),getDriverProvider().get()));
    }

    public void clickSkipTour(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.cssSelector("a.skip")).click();
         //wait until page load
        WaitUtil.simpleSleep(500);
    }

    public void launchMailInator(){
        get("http://www.mailinator.com");
    }

    public void enterMailInatorId(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("inboxfield")).clear();
        findElement(By.id("inboxfield")).sendKeys(gStrEmailId);
        System.out.println(gStrEmailId);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("inboxfield"), gStrEmailId);
    }

    public void clickCheckItButton(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//btn[@onclick='changeInbox();']")).click();
    }

    public void clickRealConnexMailInMailinator(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//ul[@id='mailcontainer']/li/a/div[@class='from ng-binding']")).click();
        switchTo().defaultContent();
    }

}
