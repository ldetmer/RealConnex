package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class ProjectOfInvestmentBankerSearchPage extends FluentWebDriverPage{
    ReadData ReadData = new ReadData();
    public ProjectOfInvestmentBankerSearchPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyServiceProjectOfInvestmentBanker(int RowIndex){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        try{
            String strServiceProjectOfBroker = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyProject");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strServiceProjectOfBroker + "')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
