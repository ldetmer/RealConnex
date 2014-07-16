package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
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
    public PrivacySetToPrivatePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void clickMeTab(){
         //wait until page is loaded
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//a[contains(text(),'Me')]")).click();
    }

    public void selectPrivateButton(){
         //wait until page is loaded
        WaitUtil.simpleSleep(10000);
        findElement(By.id("PrivacyStatus2")).click();
    }

    public void enterUserName(int intRowIndex) throws Exception {
         //wait until page is loaded
        WaitUtil.simpleSleep(1000);
        String lStrDealSponsorName = ReadData.readDataExcel("Privacy", intRowIndex,"NamesOfDifferentRoles");
        findElement(By.id("UserTitle")).clear();
        findElement(By.id("UserTitle")).sendKeys(lStrDealSponsorName);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("UserTitle"), lStrDealSponsorName);
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
        findElement(By.id("login")).sendKeys(lStrDealSponsorName);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("login"), lStrDealSponsorName);
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

    public void verifyAccessUpdatedMessage(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        try{
        Assert.assertEquals("Access successfully updated", findElement(By.cssSelector("div.ui-pnotify-text")).getText());
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
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
}
