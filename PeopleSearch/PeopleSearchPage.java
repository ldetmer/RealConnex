package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
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

    public void verifyDealSponsor(int RowIndex){
        try{
            String strDealSponsor = ReadData.readDataExcel("PeopleDetails", RowIndex, "DealSponsorName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsor+"')]")).isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickVerifiedDealSponsorUser(int RowIndex){
        try{
            String strClickDealSponsor = ReadData.readDataExcel("PeopleDetails", RowIndex, "DealSponsorName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickDealSponsor+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void verifyInvestorUser(int RowIndex){
        try{
            String strInvestorUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorUserName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorUser+"')]")).isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickVerifiedInvestorUser(int RowIndex){
        try{
            String strClickInvestorUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorUserName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickInvestorUser+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyLenderUser(int RowIndex){
        try{
            String strLenderUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "LenderUserName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderUser+"')]")).isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void clickVerifiedLenderUser(int RowIndex){
        try{
            String strClickLenderUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "LenderUserName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickLenderUser+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void verifyServiceProvider(int RowIndex){
        try{
            String strServiceProviderUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "PropertyServiceProviderUserName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strServiceProviderUser+"')]")).isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }

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
            String strUserTitle = ReadData.readDataExcel("PeopleDetails", RowIndex, "UserTitle");
            findElement(By.id("UserTitle")).click();
            findElement(By.id("UserTitle")).clear();
            findElement(By.id("UserTitle")).sendKeys(strUserTitle);
        } catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void enterUserJobTitle(int RowIndex){
        try{
            //wait until title field appear
            WaitUtil.simpleSleep(500);
            String strUserJobTitle = ReadData.readDataExcel("PeopleDetails", RowIndex, "UserJobTitle");
            findElement(By.id("UserJobTitle")).click();
            findElement(By.id("UserJobTitle")).sendKeys(strUserJobTitle);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterLocation(int RowIndex){
        try{
            //wait until location field appear
            WaitUtil.simpleSleep(500);
            String strLocation = ReadData.readDataExcel("PeopleDetails", RowIndex, "Location");
            findElement(By.id("LocationInputSearch")).click();
            findElement(By.id("LocationInputSearch")).sendKeys(strLocation);
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
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean searchedUser(int RowIndex,int noOfUsers){

        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        boolean status = false;
        String strName = null;
        int j=1;
        try {
            String strSearchedUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "SearchedUser");
            List<WebElement> links;

            //wait until page gets loaded
            WaitUtil.simpleSleep(500);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=0;i<=linksCount;i++){
                if(linksCount == 1) {
                    strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
                } else {
                    strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+j+"]/td/a/strong")).getText();
                    j++;
                }
                    if(strName.equals(strSearchedUser)&&linksCount==1)
                    {
                        status = true;
                        //break;
                    }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}
