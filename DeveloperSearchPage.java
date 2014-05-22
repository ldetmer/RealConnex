package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class DeveloperSearchPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();

    public DeveloperSearchPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public String verifySearchOption(){
        String strNameOfSubRole = findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/span[@class='opt']/strong")).getText();
        return strNameOfSubRole;
    }

    public void verifyDeveloperName(int RowIndex){
        try{
            String strDeveloperName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyDeveloperName");
            //findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDeveloperName+"')]")).isDisplayed();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDeveloperName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnDeveloperName(int RowIndex){
        try{
            String strDeveloperName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyDeveloperName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDeveloperName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void searchedDeveloperCompany(int RowIndex){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        try{
            String strDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDeveloperCompanyName");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDeveloperCompanyName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnDeveloperCompany(int RowIndex){
        try{
            String strDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDeveloperCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+strDeveloperCompanyName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectStrategy(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_63")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until checkbox is found
        WaitUtil.simpleSleep(1000);
    }

    public void clearStrategy(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_63")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }
}
