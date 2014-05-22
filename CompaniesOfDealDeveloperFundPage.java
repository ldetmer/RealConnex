package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class CompaniesOfDealDeveloperFundPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompaniesOfDealDeveloperFundPage(WebDriverProvider driverProvider){
        super(driverProvider);
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

    public void verifyFundSponserCompanyName(int RowIndex){
        try{
            String strClickDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyFundSponsorCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickDeveloperCompanyName+"')]")).isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickFundSponserCompanyName(int RowIndex){
        try{
            String strClickDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyFundSponsorCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickDeveloperCompanyName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
