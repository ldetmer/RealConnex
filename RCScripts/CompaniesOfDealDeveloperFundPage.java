package test.pages;

import org.hibernate.validator.AssertTrue;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class CompaniesOfDealDeveloperFundPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompaniesOfDealDeveloperFundPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyDealSponsorCompanyName(int RowIndex){
        try{
            String strDealSponsorCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDealCompanyName");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strDealSponsorCompanyName + "')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickDealSponsorCompany(int RowIndex){
        try{
            String strClickCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDealCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickCompanyName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickDeveloperCompanyName(int RowIndex){
        try{
            String strClickDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDeveloperCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickDeveloperCompanyName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyFundSponsorCompanyName(int RowIndex){
        try{
            String strFundSponsorCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyFundSponsorCompanyName");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strFundSponsorCompanyName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickFundSponsorCompanyName(int RowIndex){
        try{
            String strFundSponsorCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyFundSponsorCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strFundSponsorCompanyName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
