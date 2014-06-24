package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import java.util.List;

public class FundSponsorPage extends FluentWebDriverPage {

    ReadData ReadData = new ReadData();

    public FundSponsorPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifySubRole(int RowIndex){
        try{
            String strFundSponsorSubRole = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifySubRole");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strFundSponsorSubRole+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyUser(int RowIndex){
        try{
            String strUserName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyUser");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strUserName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnVerifyUser(int RowIndex){
        try{
            executeScript("scrollTo(250,0)");
            String strUserName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyUser");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strUserName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyFundSponsorCompany(int RowIndex){
        try{
            String strCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyFundSponsorCompanyName");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnFundSponsorCompanyName(int RowIndex){
        try{
            String strCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyFundSponsorCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strCompanyName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectStrategyType(){

        //wait until checkbox is found
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until checkbox is found
        WaitUtil.simpleSleep(10000);
    }

    public void clearStrategy()throws ElementNotVisibleException{
        boolean bnlFound = false;
        int intCount = 0;
        while (!bnlFound && intCount <= 5){
            try{
                findElement(By.id("AssetstrategyId_checkbox_13")).click();
                findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
                bnlFound= true;
            }catch(ElementNotVisibleException e){
                WaitUtil.simpleSleep(5000);
                intCount = intCount+1;
            }
        }

    }

    public void verifyFundSponsorUser(int RowIndex){
        try{
            String strUserName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyUser");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strUserName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterLocation(int RowIndex){
        try{
            String strLocation = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "FundSponsorLocation");
            findElement(By.id("LocationInputSearch")).clear();
            findElement(By.id("LocationInputSearch")).sendKeys(strLocation);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickLocation(int RowIndex){
        try{
            //wait until location is found
            WaitUtil.simpleSleep(100);
            String strLocation = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "FundLocation");
            findElement(By.xpath("//a[contains(text(),'"+strLocation+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean verifyLocation(int RowIndex){
        boolean status = false;
        try {
            List<WebElement> links;

            //wait until page gets loaded
            WaitUtil.simpleSleep(1000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=0;i<=linksCount;i++){
                int j=i+2;
                String strLocation = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "FundLocation");
                String strName = findElement(By.xpath("//tbody/tr/td["+j+"]")).getText();
                if(strName.contains(strLocation))
                {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

}
