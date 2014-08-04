package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import test.Support.ReasonsInResultSheet;
import test.steps.VerificationStatements;

import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/24/14
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrivacySetToPrivatePage extends FluentWebDriverPage {
    String gStrFieldName = "";
    public PrivacySetToPrivatePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void clickMeTab(){
         //wait until page is loaded
        WaitUtil.simpleSleep(1000);
        try{
            gStrFieldName = findElement(By.xpath("//section[@id='content']/nav/ul/li[1]/a")).getText();
            findElement(By.xpath("//a[contains(text(),'Me')]")).click();
        } catch (NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Failed to click on the tab\n";
        }
    }

    public void selectPrivateButton(){
         //wait until page is loaded
        WaitUtil.simpleSleep(10000);
        try{
            gStrFieldName = findElement(By.xpath("//input[@id='PrivacyStatus2']/parent::li/label/strong")).getText();
            findElement(By.id("PrivacyStatus2")).click();
        } catch(NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Element was not found\n";
        } catch(WebDriverException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Element not clickable at that point\n";
        }
    }

    public void enterUserName(int intRowIndex) throws Exception {
         //wait until page is loaded
        WaitUtil.simpleSleep(1000);
        gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div/div[1]/label")).getText();
        String lStrDealSponsorName = ReadData.readDataExcel("Privacy", intRowIndex,"NamesOfDifferentRoles");
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserTitle"), lStrDealSponsorName, gStrFieldName, LoginRealConnexPage.gStrReason);
        //wait until page is loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickHereOfPrivateUser(){
         //wait until page is loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//a[contains(text(),'here')]")).click();
         //wait until page is loaded
        WaitUtil.simpleSleep(5000);
    }

    public void verifyHereOfPrivateUser(){
        //wait until page is loaded
        WaitUtil.simpleSleep(5000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//a[contains(text(),'here')]"), getDriverProvider().get()));
        //wait until page is loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickRequestAView(){
         //wait until page is loaded
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("a.request-btn")).click();
    }

    public void verifyMessageDisplayedForClickOnRequestAView(){
         //wait until page is loaded
        WaitUtil.simpleSleep(5000);
        Assert.assertEquals("Your request has been sent to the owner of this profile. You will be e-mailed when you have been granted access.", findElement(By.cssSelector("div.ui-pnotify-text")).getText());
    }

    public void enterYopMailId(int intRowIndex) throws Exception {
        //wait until page load
        WaitUtil.simpleSleep(1000);
        String lStrDealSponsorName = ReadData.readDataExcel("LoginRealConnex",intRowIndex,"EmailId");
        findElement(By.id("login")).clear();
        findElement(By.id("login")).sendKeys(lStrDealSponsorName);
    }

    public void enterMailInatorId_Lender(int intRowIndex) throws Exception {
        //wait until page load
        WaitUtil.simpleSleep(1000);
        String lStrDealSponsorName = ReadData.readDataExcel("LoginRealConnex",intRowIndex,"EmailId");
        findElement(By.id("inboxfield")).clear();
        findElement(By.id("inboxfield")).sendKeys(lStrDealSponsorName);
    }

    public void clickAcceptLink(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        switchTo().frame("ifmail");
        findElement(By.linkText("Accept")).click();
        //wait until page load
        WaitUtil.simpleSleep(10000);
    }

    public void verifyMessage(){
         //wait until page load
        WaitUtil.simpleSleep(5000);
        Assert.assertEquals("Access successfully updated", findElement(By.cssSelector("div.ui-pnotify-text")).getText());
        //wait until page load
        WaitUtil.simpleSleep(5000);
    }

    public void enterCompanyName(int intRowIndex) throws Exception {
        //wait until page is loaded
        WaitUtil.simpleSleep(1000);
        String lStrDealSponsorCompanyName = ReadData.readDataExcel("Privacy", intRowIndex,"CompanyNameOfDifferentRoles");
        findElement(By.id("CompanyTitle")).clear();
        findElement(By.id("CompanyTitle")).sendKeys(lStrDealSponsorCompanyName);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("CompanyTitle"), lStrDealSponsorCompanyName);
        //wait until page is loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickGrantedPermissionLink(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        switchTo().frame("ifmail");
        String lStrString = findElement(By.xpath("//div[2]/a")).getText();
        Assert.assertEquals("You now have access to "+lStrString+" details. Please click "+lStrString+" to view them.", findElement(By.xpath("//div[@id='mailmillieu']//div[2]")).getText());
        findElement(By.xpath("//div[2]/a")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectSliderValue(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<99;i++){
            sliderLeft.sendKeys(Keys.ARROW_DOWN);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectInvestmentAmountValueForListingProject(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<95;i++){
            sliderLeft.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectInvestmentAmountValueForListingProjectInMyUniverse(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<96;i++){
            sliderLeft.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void verifyAccessUpdatedMessage(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        try{
        Assert.assertEquals("Access successfully updated", findElement(By.cssSelector("div.ui-pnotify-text")).getText());
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
    }

    public void verifyNotificationInHeader(){
        findElement(By.xpath("//header[@id='header']/div[@class='note']/img")).click();
        //wait until the element appear
        WaitUtil.simpleSleep(1000);
        String lStrUserName = findElement(By.xpath("//div/ul/li[1]/div/p/strong[1]/a")).getText();
        String lStrProfileSetPrivateName = findElement(By.xpath("//div/ul/li[1]/div/p/strong[2]")).getText();
        Assert.assertEquals(""+lStrUserName+" User want to see your project "+lStrProfileSetPrivateName+". Please click here to allow this request.", findElement(By.cssSelector("p")).getText());
    }

    public void verifyNotificationOfTheRequestedUser(){
        findElement(By.xpath("//header[@id='header']/div[@class='note']/img")).click();
        //wait until the element appear
        WaitUtil.simpleSleep(1000);
        String lStrUserName = findElement(By.xpath("//div[@class='note']/div/ul/li/div/p/strong/a")).getText();
        String lStrProfileSetPrivateName = findElement(By.xpath("//div/ul/li/div/p/strong[2]")).getText();
        Assert.assertEquals(""+lStrUserName+" User allow you to view his project "+lStrProfileSetPrivateName+"", findElement(By.cssSelector("p")).getText());
    }

    public void verifyPrivateUserName(int intRowIndex) throws Exception {
         //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateUserName = ReadData.readDataExcel("Privacy", intRowIndex,"NamesOfDifferentRoles");
        Assert.assertEquals(lStrPrivateUserName, findElement(By.cssSelector("h1")).getText());
    }

    public void verifyPrivateCompanyName(int intRowIndex) throws Exception {
         //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateCompanyName = ReadData.readDataExcel("Privacy", intRowIndex,"CompanyNameOfDifferentRoles");
        Assert.assertEquals(lStrPrivateCompanyName, findElement(By.cssSelector("h1")).getText());
    }

    public void verifyPrivateProjectName(int intRowIndex) throws Exception {
         //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateProjectName = ReadData.readDataExcel("Privacy", intRowIndex,"ProjectsOfAllRoles");
        Assert.assertEquals(lStrPrivateProjectName, findElement(By.cssSelector("h1")).getText());
    }

    public void verifyPrivateFundName(int intRowIndex) throws Exception {
         //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex,"FundOfAllRoles");
        Assert.assertEquals(lStrPrivateFundName, findElement(By.cssSelector("h1")).getText());
    }

    public void verifyPrivateLoanName(int intRowIndex) throws Exception{
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex,"LoanOfAllRoles");
        Assert.assertEquals(lStrPrivateFundName, findElement(By.cssSelector("h1")).getText());
    }

    public void verifyPrivateMezzName(int intRowIndex) throws Exception {
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex,"MezzOfAllRoles");
        Assert.assertEquals(lStrPrivateFundName, findElement(By.cssSelector("h1")).getText());
    }

    public void setInvestmentAmount_Private(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<1;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<98;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setInvestmentAmount_PrivateOfDealSponsor(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<2;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<97;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setInvestmentAmountOfInvestor_Private(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<5;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<94;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setLoanAmount_Private(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<6;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<93;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void setEquity_Private(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<6;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<93;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setProjectSize_Private(){
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<99;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void verifyPropertyServiceProviderServiceProfile(int intRowIndex) throws Exception{
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex,"ServiceOfAllRoles");
        Assert.assertEquals(lStrPrivateFundName, findElement(By.cssSelector("h1")).getText());
    }

    public void verifyPropertyServiceProviderListingProfile(int intRowIndex) throws Exception{
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex,"ListingOfAllRoles");
        Assert.assertEquals(lStrPrivateFundName, findElement(By.cssSelector("h1")).getText());
    }

    public void setLoanAmount_PrivateMyUniverseInclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<8;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<91;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void setEquity_PrivateInMyUniverse(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<7;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<92;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(12000);
    }

    public void setProjectSize_PrivateInMyUniverse(){
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<99;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setLoanAmountOfLenderCompany(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<2;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<97;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }
}
