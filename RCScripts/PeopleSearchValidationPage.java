package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import java.util.List;

public class PeopleSearchValidationPage extends FluentWebDriverPage {

    ReadData ReadData = new ReadData();
    public PeopleSearchValidationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyInvestorUserNameNotDisplayed(String strInvestorUserName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorUserName+"')]"), getDriverProvider().get()));
    }

    public void verifyInvestorUserNameIsDisplayed(String strInvestorUserName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorUserName+"')]"), getDriverProvider().get()));
    }

    public void verifyDealSponsorUserNameNotDisplayed(String strDealSponsorUserName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorUserName+"')]"), getDriverProvider().get()));
    }

    public void enterInvestorUserName(int RowIndex){
        try{
            //wait until text field is found
            WaitUtil.simpleSleep(500);
            String strUserTitle = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorUserName");
            findElement(By.id("UserTitle")).click();
            findElement(By.id("UserTitle")).clear();
            findElement(By.id("UserTitle")).sendKeys(strUserTitle);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterInvestorJobTitle(int RowIndex){
        try{
            //wait until title field appear
            WaitUtil.simpleSleep(500);
            String strUserJobTitle = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorJobTitle");
            findElement(By.id("UserJobTitle")).click();
            findElement(By.id("UserJobTitle")).sendKeys(strUserJobTitle);
        } catch (Exception e) {
            System.out.println(e);
        }
        //wait until title field appear
        WaitUtil.simpleSleep(15000);
    }

    public void enterInvestorCompanyName(int RowIndex){
        try{
            //wait until company name appear
            WaitUtil.simpleSleep(500);
            String strCompanyName = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorCompanyName");
            findElement(By.id("UserCompanyName")).click();
            findElement(By.id("UserCompanyName")).sendKeys(strCompanyName);
            //wait until company name appear
            WaitUtil.simpleSleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
