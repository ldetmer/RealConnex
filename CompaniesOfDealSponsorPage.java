package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class CompaniesOfDealSponsorPage extends FluentWebDriverPage{
    ReadData ReadData = new ReadData();
    public CompaniesOfDealSponsorPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

   /* public void clickProject(){
        //wait until project drop down appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("ui-accordion-1-header-0")).click();
    }*/

    public void clickProjectType(){
        //wait until project drop down appears
        WaitUtil.simpleSleep(100);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectProject(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearProjectField(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRiskProfile(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        executeScript("scrollTo(0,550)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectRisk(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRiskProfile(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickInvestorSponsor(){
        //wait until Investor and Sponsor field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-2")).click();
    }

    public void clickInvestmentMethod(){
        //wait until Investor drop down appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectInvestment(){
        //wait until Investor drop down appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearInvestment(){
        //wait until Investor drop down appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRouteToSponsorOfDealSponsor(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        executeScript("scrollTo(0,550)");
        //findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[8]/div/div/div/span")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectRoute(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRoute(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickAbout(){
        //wait until about field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-1")).click();
    }

    public void enterProjectField(int RowIndex){
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

    public void clearProjectFieldOfAbout(){
        //wait until about field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("CompanyFromProjectsCompleted")).click();
        findElement(By.id("CompanyFromProjectsCompleted")).clear();
        findElement(By.id("CompanyToProjectsCompleted")).click();
        findElement(By.id("CompanyToProjectsCompleted")).clear();
    }

    public void enterSqFtField(int RowIndex){
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

    public void clearSqFtField(){
        //wait until sq ft field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("CompanyFromSquareFeet")).click();
        findElement(By.id("CompanyFromSquareFeet")).clear();
        findElement(By.id("CompanyToSquareFeet")).click();
        findElement(By.id("CompanyToSquareFeet")).clear();
    }

    public void checkSyndicate(){
        //wait until field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("syndications_")).click();
    }

    public void uncheckSyndicate(){
        //wait until field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("syndications_")).click();
    }

    public void verifyCompanyOfDealSponsor(int RowIndex,String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            //wait until page gets loaded
            WaitUtil.simpleSleep(500);
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]")).isDisplayed();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickAssetTypeOfDealSponsor(){
        //wait until asset type
        WaitUtil.simpleSleep(500);
        executeScript("scrollTo(0,550)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

}
