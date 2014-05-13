package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class DeveloperDealAndFundSponsorPage extends FluentWebDriverPage{
    ReadData ReadData = new ReadData();
    public DeveloperDealAndFundSponsorPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyFindSearch(int RowIndex){
        try{
            String strFindText = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyFindSearch");
            String strText = findElement(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strFindText+"')]")).getText();
            Assert.assertTrue(strFindText,strText.contains(strFindText));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifySubRoleSearch(int RowIndex){
        try{
            String strSubRoleText = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifySubRoleSearch");
            String strText = findElement(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strSubRoleText+"')]")).getText();
            Assert.assertTrue(strSubRoleText,strText.contains(strSubRoleText));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}