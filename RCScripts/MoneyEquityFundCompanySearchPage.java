package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class MoneyEquityFundCompanySearchPage extends FluentWebDriverPage {
    ReadData ReadData = new test.Support.ReadData();


    public MoneyEquityFundCompanySearchPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyTypeInMoneySearch(int RowIndex){
        try {
            String strFindName = ReadData.readDataExcel("Money", RowIndex, "TypeInMoneySearch");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strFindName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyKindInMoneySearch(int RowIndex){
        try {
            String strFindName = ReadData.readDataExcel("Money", RowIndex, "KindInMoneySearch");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strFindName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyCompanyNameMoneyFund(String strCompanyNameMoneyFund){
        //wait util page load
        WaitUtil.simpleSleep(100);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyNameMoneyFund+"')]"), getDriverProvider().get()));
    }

    public void clickInvestorCharacteristics(){
        //wait util page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-2")).click();
    }

    public void clickInvestorType(){
        //wait util page load
        WaitUtil.simpleSleep(500);
        executeScript("scrollTo(0,500)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAdvisor(){
        //wait util page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_18")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

}
