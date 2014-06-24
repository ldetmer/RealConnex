package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;
import test.steps.VerificationStatements;

public class CompaniesOfFundSponsorPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompaniesOfFundSponsorPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyFundSponsorCompany(int RowIndex){
        try{
            String strFundSponsorCompany = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyFundSponsorCompanyName");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strFundSponsorCompany+"')]"), getDriverProvider().get()));
            //wait until page loads
            WaitUtil.simpleSleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectHealthCare(){
        //wait until project type drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_13"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until project type drop down appears
        WaitUtil.simpleSleep(10000);
    }

    public void clearHealthCare(){
        //wait until project type drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPortfolioAcquisitions(){
        //wait until project type drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearPortfolioAcquisitions(){
        //wait until project type drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectValueAdd(){
        //wait until project type drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until project type drop down appears
        WaitUtil.simpleSleep(1000);
    }

    public void clearValueAdd(){
        //wait until project type drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickAboutField(){
        //wait until about field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-1")).click();
    }

    public void enterProjectFieldOfFundSponsor(int RowIndex){
        try{
            //wait until about field appears
            WaitUtil.simpleSleep(500);
            String strProjectFrom = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "ProjectCompletedFrom");
            String strProjectTo = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "ProjectCompletedTo");
            findElement(By.id("CompanyFromProjectsCompleted")).click();
            findElement(By.id("CompanyFromProjectsCompleted")).sendKeys(strProjectFrom);
            findElement(By.id("CompanyToProjectsCompleted")).click();
            findElement(By.id("CompanyToProjectsCompleted")).sendKeys(strProjectTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearProjectFieldOfFundSponsor(){
        //wait until about field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("CompanyFromProjectsCompleted")).click();
        findElement(By.id("CompanyFromProjectsCompleted")).clear();
        findElement(By.id("CompanyToProjectsCompleted")).click();
        findElement(By.id("CompanyToProjectsCompleted")).clear();
    }

    public void enterSqFtFieldOfAbout(int RowIndex){
        try{
            //wait until sq ft field appears
            WaitUtil.simpleSleep(500);
            String strProjectFrom = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "Sq.Ft developed From");
            String strProjectTo = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "Sq.Ft developed To");
            findElement(By.id("CompanyFromSquareFeet")).click();
            findElement(By.id("CompanyFromSquareFeet")).sendKeys(strProjectFrom);
            findElement(By.id("CompanyToSquareFeet")).click();
            findElement(By.id("CompanyToSquareFeet")).sendKeys(strProjectTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearSqFtFieldOfFundSponsor(){
        //wait until sq ft field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("CompanyFromSquareFeet")).click();
        findElement(By.id("CompanyFromSquareFeet")).clear();
        findElement(By.id("CompanyToSquareFeet")).click();
        findElement(By.id("CompanyToSquareFeet")).clear();
    }

    public void selectIntermediaryOption(){
        //wait until route to developer field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until route to developer field appears
        WaitUtil.simpleSleep(1000);
    }

    public void clearIntermediaryOption(){
        //wait until route to developer field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until route to developer field appears
        WaitUtil.simpleSleep(1000);
    }




}
