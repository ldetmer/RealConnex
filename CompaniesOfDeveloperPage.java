package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class CompaniesOfDeveloperPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompaniesOfDeveloperPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void clickSolar(){
        //wait until project drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until project drop down appears
        WaitUtil.simpleSleep(1000);
    }

   /* public void clearSolar(){
        //wait until project drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }*/

    public void clickSales(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_63")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearSales(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_63")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOpportunistic(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearOpportunistic(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickFamilyOffice(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_11")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearFamilyOffice(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_11")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPlacementAgents(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_4")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearPlacementAgents(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_4")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void developerCompanyName(int RowIndex){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        try{
            String strDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDeveloperCompanyName");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDeveloperCompanyName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

