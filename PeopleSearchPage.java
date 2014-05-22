package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;


public class PeopleSearchPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
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

    public boolean verifyDealSponsor(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(500);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDealSponsor = ReadData.readDataExcel("PeopleDetails", RowIndex, "DealSponsorName");
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong")).getText();
                if(strName.contains(strDealSponsor)){
                    status = true;
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void clickVerifiedDealSponsorUser(int RowIndex){
        try{
            String strClickDealSponsor = ReadData.readDataExcel("PeopleDetails", RowIndex, "DealSponsorName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickDealSponsor+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public boolean verifyInvestorUser(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strInvestorUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorUserName");
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong")).getText();
                if(strName.contains(strInvestorUser))
                {
                    status = true;
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void clickVerifiedInvestorUser(int RowIndex){
        try{
            String strClickInvestorUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorUserName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickInvestorUser+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean verifyLenderUser(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strInvestorUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "LenderUserName");
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong")).getText();
                if(strName.contains(strInvestorUser))
                {
                    status = true;
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void clickVerifiedLenderUser(int RowIndex){
        try{
            String strClickLenderUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "LenderUserName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickLenderUser+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public boolean verifyServiceProvider(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strInvestorUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "PropertyServiceProviderUserName");
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong")).getText();
                if(strName.contains(strInvestorUser))
                {
                    status = true;
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void clickVerifiedServiceProvider(int RowIndex){
        try{
            String strClickServiceProviderUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "PropertyServiceProviderUserName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickServiceProviderUser+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void enterUserTitle(int RowIndex){
        try{
            //wait until title field appears
            WaitUtil.simpleSleep(500);
            String strUserTitle = ReadData.readDataExcel("PeopleDetails", RowIndex, "UserTitle");
            findElement(By.id("UserTitle")).click();
            findElement(By.id("UserTitle")).clear();
            findElement(By.id("UserTitle")).sendKeys(strUserTitle);
            //wait until title field appears
            WaitUtil.simpleSleep(10000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterUserJobTitle(int RowIndex){
        try{
            //wait until title field appear
            WaitUtil.simpleSleep(500);
            String strUserJobTitle = ReadData.readDataExcel("PeopleDetails", RowIndex, "UserJobTitle");
            findElement(By.id("UserJobTitle")).click();
            findElement(By.id("UserJobTitle")).sendKeys(strUserJobTitle);
            //wait until title field appears
            WaitUtil.simpleSleep(500);
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
            String strLocation = ReadData.readDataExcel("PeopleDetails", RowIndex, "FullLocationName");
            findElement(By.xpath("//a[contains(text(),'"+strLocation+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterCompanyName(int RowIndex){
        try{
            //wait until company name appear
            WaitUtil.simpleSleep(500);
            String strCompanyName = ReadData.readDataExcel("PeopleDetails", RowIndex, "UserCompanyName");
            findElement(By.id("UserCompanyName")).click();
            findElement(By.id("UserCompanyName")).sendKeys(strCompanyName);
            //wait until company name appear
            WaitUtil.simpleSleep(100);
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
       /* //wait until page loads
        WaitUtil.simpleSleep(1000);*/
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
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void searchedUser(int RowIndex){
        try {
            /*//wait until company title field appear
            WaitUtil.simpleSleep(1000);*/
            String strUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "SearchedUser");
            //findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strUser+"')]")).isDisplayed();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strUser+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
