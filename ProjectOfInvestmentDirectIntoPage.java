package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import java.util.List;


public class ProjectOfInvestmentDirectIntoPage extends FluentWebDriverPage {

    public ProjectOfInvestmentDirectIntoPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public String verifyFindInSearchOption(){
        String strFind = findElement(By.cssSelector("span.opt > strong")).getText();
        return strFind;
    }

    public void verifyKindInSearchOption(int RowIndex){
        try {
            String strKindName = ReadData.readDataExcel("InvestmentBanker", RowIndex, "KindInSearchOption");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strKindName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyRiskInSearchOption(int RowIndex){
        try {
            String strRiskName = ReadData.readDataExcel("InvestmentBanker", RowIndex, "RiskInSearchOption");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strRiskName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickCompanyOfBanker(int RowIndex){
        try {
            //wait until all companies appears
            WaitUtil.simpleSleep(500);
            String strCompanyName = ReadData.readDataExcel("InvestmentBanker", RowIndex, "InvestmentBankerCompany");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strCompanyName+"')]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickProjectOfBanker(int RowIndex){
        try {
             String strProjectName = ReadData.readDataExcel("InvestmentBanker", RowIndex, "InvestmentBankerProject");
             findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strProjectName+"')]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickListingOfBanker(int RowIndex){
        try {
            String strListingName = ReadData.readDataExcel("InvestmentBanker", RowIndex, "InvestmentBankerListing");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strListingName+"')]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyCompanyOfBanker(int RowIndex){
        try {
            //wait until companies appears in search
            WaitUtil.simpleSleep(5000);
            String strCompanyName = ReadData.readDataExcel("InvestmentBanker", RowIndex, "InvestmentBankerCompany");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean verifyProjectOfInvestmentBanker(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(1000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDSLocation = ReadData.readDataExcel("InvestmentBanker", RowIndex, "InvestmentBankerProject");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong")).getText();
                if(strDSLocation.contains(strCompanyName))
                {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public boolean verifyListingOfInvestmentBanker(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(1000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDSLocation = ReadData.readDataExcel("InvestmentBanker", RowIndex, "InvestmentBankerListing");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong")).getText();
                if(strDSLocation.contains(strCompanyName))
                {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void selectInvestmentAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clearInvestmentAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void selectValueOfDealSize(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clearValueOfDealSize(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void clickInvestingAs(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectGeneralPartner(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("InvestortypeId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSingleRadioButton(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("single_lp_fund_0")).click();
    }

    public void clickOnCurrentAssetStatus(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectFullyRented(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstatusId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickReturnProfile(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("ui-accordion-1-header-1"));
    }

    public void selectCocPercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[1]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clearCocPercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[1]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void clickLeveraged(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("cocLeverrage")).click();
    }

    public void clearLeveraged(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("cocLeverrage")).click();
    }

    public void selectIrrPercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clearIrrPercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void selectRoePercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clearRoePercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void clickActual(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("capRetAct")).click();
    }

    public void clearActual(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("capRetAct")).click();
    }

    public void selectCapPercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[3]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clearCapPercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[3]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void clickProForma(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("CapProForm")).click();
    }

    public void clearProForma(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("CapProForm")).click();
    }

    public void selectHoldingMin(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clearHoldingMin(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void selectHoldingMax(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clearHoldingMax(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }


}
