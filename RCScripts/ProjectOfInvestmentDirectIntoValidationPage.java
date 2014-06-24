package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class ProjectOfInvestmentDirectIntoValidationPage extends FluentWebDriverPage{
    ReadData ReadData = new ReadData();

    public ProjectOfInvestmentDirectIntoValidationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyProjectNameOfInvestmentsIsDisplayed(String strProjectName,String strListingName){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strProjectName+"')]"), getDriverProvider().get()));
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strListingName+"')]"), getDriverProvider().get()));
    }

    public void verifyProjectNameOfInvestmentsNotDisplayed(String strProject, String strListingProject){
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strProject+"')]"), getDriverProvider().get()));
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strListingProject+"')]"), getDriverProvider().get()));
    }

    public void selectInvestmentAmount(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearInvestmentAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectValueOfDealSize(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearValueOfDealSize(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }


    public boolean projectOfInvestmentsNotDisplayed(int RowIndex, String strColumnName){
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
        executeScript("scrollTo(0,550)");
        boolean status = false;
        try{
            List<WebElement> links;
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strCompanyName = ReadData.readDataExcel("Investments", RowIndex, strColumnName);
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strName.equals(strCompanyName))
                {
                    status = false;
                    break;
                } else {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }


    public void projectOfInvestmentsIsDisplayed(int RowIndex,String strColumnName){
        //wait until page gets loaded
        WaitUtil.simpleSleep(6000);
        executeScript("scrollTo(0,550)");
        try {
            String strOtherUser = ReadData.readDataExcel("Investments", RowIndex, strColumnName);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]"), getDriverProvider().get()));
        }
        catch (Exception e) {
            System.out.println(e);
        }
        executeScript("scrollTo(0,550)");
    }

    public void selectGeneralAndLimited(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearGeneralAndLimited(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("InvestortypeId_checkbox_1")).click();
        findElement(By.id("InvestortypeId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectFullyRentedAndReo(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearFullyRentedAndReo(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstatusId_checkbox_1")).click();
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectCOC(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[1]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearCOC(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[1]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectIRR(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearIRR(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectROE(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearROE(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectCAP(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[3]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearCAP(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[3]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectMin(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearMin(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectMax(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearMax(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectCoGpOption(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectCoLeadOption(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_3")).click();
        findElement(By.id("InvestortypeId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectCoDeveloper(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_5")).click();
        findElement(By.id("InvestortypeId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectOtherInvestor()throws ElementNotVisibleException {
        boolean bnlFound = false;
        int intCount = 0;
        while (!bnlFound && intCount <= 5){
            try{
                findElement(By.id("InvestortypeId_checkbox_4")).click();
                findElement(By.id("InvestortypeId_checkbox_6")).click();
                findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
                bnlFound= true;
            }catch(ElementNotVisibleException e){
                WaitUtil.simpleSleep(1000);
                intCount = intCount+1;
            }
        }
    }

    public void selectAllOptionOfInvestingAs(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_6")).click();
        findElement(By.id("InvestortypeId_checkbox_35")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void clearAllOptionOfInvestingAs(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_35")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectPartiallyStabilized(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectVacant(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_3")).click();
        findElement(By.id("AssetstatusId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectUnderConstruction(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_5")).click();
        findElement(By.id("AssetstatusId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectAll(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_7")).click();
        findElement(By.id("AssetstatusId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectReo(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_9")).click();
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectVacantStructure(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        findElement(By.id("AssetstatusId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectPartiallyRented(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_4")).click();
        findElement(By.id("AssetstatusId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectEntitled(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_6")).click();
        findElement(By.id("AssetstatusId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void clearEntitled(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }


}
