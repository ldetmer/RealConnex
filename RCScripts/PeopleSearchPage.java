package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.OfficeCommonFunctions;
import test.Support.ReadData;
import test.steps.VerificationStatements;

import java.io.File;


public class PeopleSearchPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    int i = 1;
    String[] gStrFieldName;
    public PeopleSearchPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyFind(int RowIndex){
        try{
            String strVerifyFind= ReadData.readDataExcel("PeopleDetails", RowIndex, "VerifyFind");
            Assert.assertEquals(strVerifyFind, findElement(By.cssSelector("span.opt > strong")).getText());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyDealSponsorUserName(String strDealSponsorUserName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorUserName+"')]"), getDriverProvider().get()));
    }

    public void verifyDealSponsorUserIsDisplayedName(String strDealSponsorUserName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        gStrFieldName[i] = findElement(By.xpath("//div[@id='searchFilters']/div/div["+i+"]/label")).getText();
        i++;
        try{
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorUserName+"')]"), getDriverProvider().get()));
        }catch (AssertionError e){
            System.out.println(e);
            String file = "D:/RealConnex/out/production/RealConnex/test/Resources/TestData.xls";
            File newFile = new File(file);
            System.out.println("TestData File: " + newFile);
            OfficeCommonFunctions.UpdateDataToExcel("RunTimeExecutionIds", newFile.getAbsolutePath(), 1, "Field", gStrFieldName[i]);
            OfficeCommonFunctions.UpdateDataToExcel("RunTimeExecutionIds", newFile.getAbsolutePath(), 1, "Reason", e.toString());
        }

    }

    public void clickVerifiedDealSponsorUser(int RowIndex){
        try{
            String strClickDealSponsor = ReadData.readDataExcel("PeopleDetails", RowIndex, "DealSponsorName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickDealSponsor+"')]")).click();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div/h1[contains(text(),'" + strClickDealSponsor + "')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void verifyInvestorUserName(String strInvestorUserName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorUserName+"')]"), getDriverProvider().get()));
    }

    public void clickVerifiedInvestorUser(int RowIndex){
        try{
            String strClickInvestorUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorUserName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickInvestorUser+"')]")).click();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div/h1[contains(text(),'"+strClickInvestorUser+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyLenderUserName(String strLenderUserName){
         //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderUserName+"')]"), getDriverProvider().get()));
    }

    public void clickVerifiedLenderUser(int RowIndex){
        try{
            executeScript("scrollTo(250,0)");
            String strClickLenderUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "LenderUserName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickLenderUser+"')]")).click();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div/h1[contains(text(),'"+strClickLenderUser+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void verifyServiceProviderUserName(String strServiceProviderUserName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strServiceProviderUserName+"')]"), getDriverProvider().get()));
    }

    public void clickVerifiedServiceProvider(int RowIndex){
        try{
            String strClickServiceProviderUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "PropertyServiceProviderUserName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickServiceProviderUser+"')]")).click();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div/h1[contains(text(),'"+strClickServiceProviderUser+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void enterUserTitle(int RowIndex){
        try{
            //wait until title field appears
            WaitUtil.simpleSleep(100);
            executeScript("scrollTo(250,0)");
            String strUserTitle = ReadData.readDataExcel("PeopleDetails", RowIndex, "UserTitle");
            findElement(By.id("UserTitle")).click();
            findElement(By.id("UserTitle")).clear();
            findElement(By.id("UserTitle")).sendKeys(strUserTitle);
            //wait until title field appears
            WaitUtil.simpleSleep(7000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterUserJobTitle(int RowIndex){
        try{
             //wait until title field appears
            WaitUtil.simpleSleep(100);
            String strUserJobTitle = ReadData.readDataExcel("PeopleDetails", RowIndex, "UserJobTitle");
            findElement(By.id("UserJobTitle")).click();
            findElement(By.id("UserJobTitle")).sendKeys(strUserJobTitle);
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.id("UserJobTitle"),strUserJobTitle);
             //wait until title field appears
            WaitUtil.simpleSleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterLocation(int RowIndex){
        try{
            //wait until location field appear
            WaitUtil.simpleSleep(500);
            String strLocation = ReadData.readDataExcel("PeopleDetails", RowIndex, "Location");
            findElement(By.id("LocationInputSearch")).clear();
            findElement(By.id("LocationInputSearch")).sendKeys(strLocation);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickLocation(int RowIndex){
        try{
            //wait until location is found
            WaitUtil.simpleSleep(500);
            String strFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            String strLocation = ReadData.readDataExcel("PeopleDetails", RowIndex, "FullLocationName");
            findElement(By.xpath("//a[contains(text(),'"+strLocation+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterCompanyName(int RowIndex){
        try{
             //wait until title field appears
            WaitUtil.simpleSleep(500);
            String strCompanyName = ReadData.readDataExcel("PeopleDetails", RowIndex, "UserCompanyName");
            findElement(By.id("UserCompanyName")).click();
            findElement(By.id("UserCompanyName")).sendKeys(strCompanyName);
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.id("UserCompanyName"),strCompanyName);
             //wait until company name appear
            WaitUtil.simpleSleep(10000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearTitle(){
        //wait until title field appear
        WaitUtil.simpleSleep(500);
        findElement(By.id("UserTitle")).clear();
    }

    public void clearJobTitle(){
        //wait until job title field appear
        WaitUtil.simpleSleep(500);
        findElement(By.id("UserJobTitle")).clear();
    }

    public void clearLocation(){
         //wait until location field appear
        WaitUtil.simpleSleep(500);
        findElement(By.id("LocationInputSearch")).clear();
    }

    public void clearCompanyField(){
        //wait until company title field appear
        WaitUtil.simpleSleep(500);
        findElement(By.id("UserCompanyName")).clear();
    }
}
