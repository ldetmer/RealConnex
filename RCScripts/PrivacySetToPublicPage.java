package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;
import test.steps.VerificationStatements;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 12:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrivacySetToPublicPage extends FluentWebDriverPage {
    public PrivacySetToPublicPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyPrivacyButton(){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//nav[@id='nav']/ul[@class='sub-nav']/li/a/span[text()='Privacy']"), getDriverProvider().get()));
    }

    public void clickPrivacyButton(){
        findElement(By.xpath("//nav[@id='nav']/ul[@class='sub-nav']/li/a/span[text()='Privacy']")).click();
    }

    public void verifyPrivacyPage(){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//section[@id='content']/div[@class='top-title']/h1[text()='Privacy']"), getDriverProvider().get()));
    }

    public void selectPublicButton(){
         //wait util page load
        WaitUtil.simpleSleep(5000);
        executeScript("scrollTo(100,0)");
        findElement(By.id("PrivacyStatus1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("PrivacyStatus1"));
    }

    public void clickSaveButton_Me(){
         //wait util page load
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//form[@id='UserMePrivacyForm']/div[@class='clearfix']/input[@class='sbm']")).click();
    }

    public void clickSaveButton_Company(){
        //wait util page load
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//form[@id='UserCompanyPrivacyForm']/div/input[@class='sbm']")).click();
    }

    public void clickSaveButton_Project(){
         //wait until page load
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//form[@id='UserProjectsPrivacyForm']/div[@class='clearfix']/input")).click();
    }

    public void verifyMessage(String lStrMessage){
        //wait until page load
        WaitUtil.simpleSleep(500);
        String lStrMessageFromApplication = findElement(By.cssSelector("div.ui-pnotify-text")).getText();
        Assert.assertEquals(lStrMessage,lStrMessageFromApplication);
    }

    public void clickCompanyTab(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//section[@id='content']/nav/ul/li/a[text()='COMPANY']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickProjectsTab(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//section[@id='content']/nav/ul/li/a[contains(text(),'PROJECTS')]")).click();
    }

    public void clickFundsTab(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//section[@id='content']/nav/ul/li/a[contains(text(),'Funds')]")).click();
    }

    public void clickProductsTab(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//section[@id='content']/nav/ul/li/a[contains(text(),'PRODUCTS')]")).click();
    }

    public void clickProjectOfDealSponsor(int intRowIndex) throws Exception {
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        String lStrProjectName = ReadData.readDataExcel("Privacy", intRowIndex,"ProjectsOfAllRoles");
        findElement(By.xpath("//span[contains(text(),'"+lStrProjectName+"')]")).click();
    }

    public void clickFundOfDealSponsor(int intRowIndex) throws Exception {
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        String lStrFundName = ReadData.readDataExcel("Privacy", intRowIndex,"FundOfAllRoles");
        findElement(By.xpath("//span[contains(text(),'"+lStrFundName+"')]")).click();
    }

    public void clickProjectOfDealSponsor_Private(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'JS Project')]")).click();
    }

    public void clickFundOfDealSponsor_Private(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'JS Fund')]")).click();
    }

    public void clickFundOfInvestor_Private(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'KP Fund')]")).click();
    }

    public void clickLoanOfLender_Private(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'LT Loan')]")).click();
    }

    public void clickMezzOfLender_Private(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'LT Mezz')]")).click();
    }

    public void clickServiceProject_Private(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'EL Services')]")).click();
    }

    public void clickListingProject_Private(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'EL Listing')]")).click();
    }

}
