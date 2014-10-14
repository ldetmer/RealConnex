package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import test.Support.ReadData;
import test.Support.ReasonsInResultSheet;
import test.steps.VerificationStatements;
import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.NoSuchElementException;


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
            findElement(By.cssSelector("a.sign")).click();
        }catch(NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Sign up Link cannot be clicked\n";
        } catch (WebDriverException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Sign up Link cannot be clicked\n";
        }

    }

    public void enterEmailIdOfUserRoles(){
        /*Actions moveTo = new Actions(getDriverProvider().get());
        moveTo.moveToElement(findElement(By.xpath("//input[@id='UserEmail']")),1,1).click().build().perform();*/
       /*String popUpHeader = findElement(By.xpath("//div[@id='sign']/div/strong")).getText();
        Assert.assertEquals(popUpHeader, "Sign Up Now - It’s FREE!");*/
        gStrFieldName = findElement(By.xpath("//input[@id='UserEmail']")).getAttribute("placeholder");
        gStrEmailId = "Auto"+System.currentTimeMillis()+"@yopmail.com";
        WaitUtil.simpleSleep(5000);
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserEmail"), gStrEmailId, gStrFieldName, LoginRealConnexPage.gStrReason);


        /*findElement(By.xpath("//div[@id='sign']/div/strong[text()='Sign Up Now - It’s FREE!']")).click();
        WaitUtil.simpleSleep(1000);
        findElement(By.id("UserEmail")).click();
        findElement(By.id("UserEmail")).clear();
        findElement(By.id("UserEmail")).sendKeys(gStrEmailId);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.xpath("//input[@id='UserEmail']"), gStrEmailId);
*/
        /*JavascriptExecutor executor = (JavascriptExecutor) (getDriverProvider().get());
        executor.executeScript("window.document.getElementById('UserEmail').clear();");
        executor.executeScript("window.document.getElementById('UserEmail').sendKeys(gStrEmailId);");*/
         //ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserEmail"), gStrEmailId, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void enterFirstName(){
        gStrFieldName = findElement(By.xpath("//input[@id='UserFirstName']")).getAttribute("placeholder");
        String lStrFirstName = "Auto";
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserFirstName"), lStrFirstName, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void enterLastName(){
        gStrFieldName = findElement(By.xpath("//input[@id='UserLastName']")).getAttribute("placeholder");
        String lStrLastName = ""+System.currentTimeMillis();
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
        WaitUtil.simpleSleep(3000);
        try{
            gStrFieldName = findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div[4]/span/div[1]/div")).getText();
            findElement(By.cssSelector("#UserHomeForm > fieldset > div.row > span.selectbox > div.select > div.text")).click();
        } catch (NoSuchElementException e){
           System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Select Role Element is not found\n";
        }
    }

    public void selectInvestorOption(){
        //wait until element is visible
        WaitUtil.simpleSleep(3000);
        findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div/span/div/ul/li[contains(text(),'Investor')]")).click();
    }

    public void selectDealSponsorDeveloperAndFundMangerOption(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div/span/div/ul/li[text()='Developer / Sponsor']")).click();
    }

    public void selectRealEstateAdvisorBrokerOption(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        try{
        gStrFieldName = findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div/span/div/ul/li[5]")).getText();
        findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div/span/div/ul/li[text()='Real Estate Advisor']")).click();
        } catch (NoSuchElementException e){
            System.out.println(e);

        }
    }

    public void selectLenderOption(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div/span/div/ul/li[text()='Lender']")).click();
    }

    public void verifyTextInRoleSelectedDropDown(String lStrSelectedOptionInDropDown){
        String lStrRoleSelectedActual = findElement(By.cssSelector("#UserHomeForm > fieldset > div.row > span.selectbox > div.select > div.text")).getText();
        Assert.assertEquals(lStrSelectedOptionInDropDown,lStrRoleSelectedActual);
    }

    public void clickCertifyAccreditedInvestorCheckBox(){
        //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.id("agreeAccredit")).click();
    }

    public void clickRegisterButton(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#UserHomeForm > fieldset > div.row > input.sbm")).sendKeys(Keys.ENTER);
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
    }

    public void verifyConfirmationMessage(String lStrConfirmationMessage){
         //wait until page load
        WaitUtil.simpleSleep(5000);
        try{
            String lStrMessage = findElement(By.xpath("//div[@id='registerSuccess']/div[1]/strong")).getText();
            Assert.assertEquals(lStrMessage, lStrConfirmationMessage);
            //wait until page load
             WaitUtil.simpleSleep(1000);
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Almost Done Confirmation message not displayed\n";
        }
    }

    public void clickClose(){
        try{
         //wait until page load
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
         //wait until page load
        WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Close button of registration is not clickable\n";
        } catch (WebDriverException W){
            System.out.println(W);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Close button of registration is not clickable\n";
        }
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
        WaitUtil.simpleSleep(3000);
    }

    public void clickCheckInboxButtonInYopmail(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//input[@value='Check Inbox']")).click();
        //wait until page load
        WaitUtil.simpleSleep(3000);
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
        try{
        switchTo().frame("ifinbox");
        findElement(By.xpath("//div[@id='m1']/div/a/span[@class='lmfd']/span[contains(text(),'RealConnex')]")).click();
        switchTo().defaultContent();
        } catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Link is not clicked\n";
        }
    }

    public void clickOnClickHereLink(){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        switchTo().frame("ifmail");
        findElement(By.xpath("//div[@id='mailmillieu']/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/span")).click();
        //findElement(By.linkText("Click here")).click();
         //wait until page load
        WaitUtil.simpleSleep(12000);
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
        WaitUtil.simpleSleep(10000);
    }

    public void verifyRealConnexPage(){
         //wait until page load
        WaitUtil.simpleSleep(100);
        Assert.assertTrue(WaitUtil.isElementPresent(By.cssSelector("h1"),getDriverProvider().get()));
    }

    public void clickSkipTour(){
         //wait until page load
        WaitUtil.simpleSleep(10000);
        findElement(By.cssSelector("a.skip")).click();
         //wait until page load
        WaitUtil.simpleSleep(500);
    }

    public void getUserName(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        LoginRealConnexPage.lStrNewCreatedUserName = findElement(By.xpath("//section[@id='content']/div[@class='top-title']/h1")).getText();
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
