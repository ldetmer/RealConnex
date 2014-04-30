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

    public void verifyDeveloperName(int RowIndex){
        try{
            String strDeveloperName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "DeveloperName");
            String strText =  findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text()'"+strDeveloperName+"')]")).getText();
            Assert.assertTrue(strDeveloperName,strText.contains(strDeveloperName));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickVerifyDeveloperName(int RowIndex){
        try{
            String strVerifyDeveloperName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "DeveloperName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strVerifyDeveloperName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectStrategyForUser(){
        findElement(By.id("AssetstrategyId_checkbox_33")).click();
        //wait until checkbox appear
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstrategyId_checkbox_63")).click();
        findElement(By.id("AssetstrategyId_checkbox_58")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div[2]/div/div/div[1]/span[1]")).click();
    }
}