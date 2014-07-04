package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 12:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrivacyVerificationPage extends FluentWebDriverPage {
    public PrivacyVerificationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyUserName(String lStrUserName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrUserName+"')]"),getDriverProvider().get()));
    }

    public void clickDealSponsorUserName(String lStrUserName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrUserName+"')]")).click();
    }

    public void verifyCompanyName(String lStrCompanyName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrCompanyName+"')]"),getDriverProvider().get()));
    }

    public void clickCompanyName(String lStrCompanyName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrCompanyName+"')]")).click();
    }

    public void verifyProjectName(String lStrProjectName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrProjectName+"')]"),getDriverProvider().get()));
    }

    public void verifyFundName(String lStrFundName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrFundName+"')]"),getDriverProvider().get()));
    }

    public void verifyLoanName(String lStrLoanName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrLoanName+"')]"),getDriverProvider().get()));
    }

    public void clickDealSponsorProjectName(String lStrProjectName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrProjectName+"')]")).click();
    }

    public void clickAllRolesProjectsFundLoanName(String lStrFundName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrFundName+"')]")).click();
    }

    public void verifyUserProfileNotDisplayed(int intRowIndex) throws Exception {
        String lStrUserName = ReadData.readDataExcel("Privacy", intRowIndex ,"NamesOfDifferentRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrUserName+"')]"),getDriverProvider().get()));
    }

    public void verifyCompanyProfileNotDisplayed(int intRowIndex) throws Exception {
        String lStrCompanyName = ReadData.readDataExcel("Privacy", intRowIndex ,"CompanyNameOfDifferentRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrCompanyName+"')]"),getDriverProvider().get()));
    }

    public void verifyProjectNotDisplayed(int intRowIndex)throws Exception {
        String lStrPrivateProjectName = ReadData.readDataExcel("Privacy", intRowIndex,"ProjectsOfAllRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrPrivateProjectName+"')]"),getDriverProvider().get()));
    }

    public void verifyFundNotDisplayed(int intRowIndex)throws Exception {
        String lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex,"FundOfAllRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrPrivateFundName+"')]"),getDriverProvider().get()));
    }

    public void verifyLoanNotDisplayed(int intRowIndex)throws Exception{
        String lStrPrivateLoanName = ReadData.readDataExcel("Privacy", intRowIndex,"LoanOfAllRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrPrivateLoanName+"')]"),getDriverProvider().get()));
    }

    public void verifyPropertyServiceProviderServiceNotDisplayed(int intRowIndex)throws Exception {
        String lStrPrivateServiceName = ReadData.readDataExcel("Privacy", intRowIndex,"ServiceOfAllRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrPrivateServiceName+"')]"),getDriverProvider().get()));
    }

    public void verifyPropertyServiceProviderListingNotDisplayed(int intRowIndex) throws Exception {
        String lStrPrivateListingName = ReadData.readDataExcel("Privacy", intRowIndex,"ListingOfAllRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrPrivateListingName+"')]"),getDriverProvider().get()));
    }

    public void verifyMezzNotDisplayed(int intRowIndex)throws Exception{
        String lStrPrivateMezzName = ReadData.readDataExcel("Privacy", intRowIndex,"MezzOfAllRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrPrivateMezzName+"')]"),getDriverProvider().get()));
    }

    public void verifyProjectOfServiceProviderName(String lStrProjectOfServiceProviderName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrProjectOfServiceProviderName+"')]"),getDriverProvider().get()));
    }
}
