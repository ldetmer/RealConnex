package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import test.Support.ReadData;
import test.Support.ReasonsInResultSheet;
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

    String gStrEmailId = "", gStrFieldName = "";
    public CreateUserPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void clickNotAMemberLink(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        try{
            findElement(By.cssSelector("a.link-1.sign")).click();
        }catch(NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Link cannot be clicked\n";
        } catch (WebDriverException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Link cannot be clicked\n";
        }

    }

    public void enterEmailIdOfUserRoles(){
        gStrFieldName = findElement(By.xpath("//input[@id='UserEmail']")).getAttribute("placeholder");
        gStrEmailId = "testAuto"+System.currentTimeMillis()+"@yopmail.com";
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserEmail"), gStrEmailId, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void enterFirstName(){
        gStrFieldName = findElement(By.xpath("//input[@id='UserFirstName']")).getAttribute("placeholder");
        String lStrFirstName = "test"+System.currentTimeMillis();
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserFirstName"), lStrFirstName, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void enterLastName(){
        gStrFieldName = findElement(By.xpath("//input[@id='UserLastName']")).getAttribute("placeholder");
        String lStrLastName = "auto"+System.currentTimeMillis();
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserLastName"), lStrLastName, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void enterPassword(int intRowIndex) throws Exception {
        gStrFieldName = findElement(By.xpath("//input[@id='UserPassword']")).getAttribute("placeholder");
        String lStrPassword = ReadData.readDataExcel("LoginRealConnex", intRowIndex, "Password");
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserPassword"), lStrPassword, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void reEnterPassword(int intRowIndex) throws Exception {
        gStrFieldName = findElement(By.xpath("//input[@id='UserConfirmPass']")).getAttribute("placeholder");
        String lStrReEnterPassword = ReadData.readDataExcel("LoginRealConnex",intRowIndex,"Password");
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserConfirmPass"), lStrReEnterPassword, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void clickSelectRoleDropDown(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        try{
            findElement(By.cssSelector("div.text")).click();
        } catch (NoSuchElementException e){
           System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Element is not found\n";
        }
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
        try{
        gStrFieldName = findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div/span/div/ul/li[5]")).getText();
        findElement(By.xpath("//span/div/ul/li[text()='Real Estate Advisor, Broker']")).click();
        } catch (NoSuchElementException e){
            System.out.println(e);

        }
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
