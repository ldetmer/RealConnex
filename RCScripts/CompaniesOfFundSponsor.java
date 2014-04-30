package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class CompaniesOfFundSponsor extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompaniesOfFundSponsor(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyFundSponsorCompany(int RowIndex){
        try{
            String strFundSponsorCompany = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyFundSponsorCompanyName");
            String strCompany = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strFundSponsorCompany+"')]")).getText();
            Assert.assertTrue(strFundSponsorCompany, strCompany.contains(strFundSponsorCompany));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
