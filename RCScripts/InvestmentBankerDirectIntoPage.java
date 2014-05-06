package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import java.util.List;


public class InvestmentBankerDirectIntoPage extends FluentWebDriverPage {

    public InvestmentBankerDirectIntoPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public String verifyFindInSearchOption(){
        String strFind = findElement(By.cssSelector("span.opt > strong")).getText();
        return strFind;
    }

    public void verifyKindInSearchOption(int RowIndex){
        try {
            String strKindName = ReadData.readDataExcel("InvestmentBanker", RowIndex, "KindInSearchOption");
            findElement(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strKindName+"')]")).isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyRiskInSearchOption(int RowIndex){
        try {
            String strRiskName = ReadData.readDataExcel("InvestmentBanker", RowIndex, "RiskInSearchOption");
            findElement(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strRiskName+"')]")).isDisplayed();
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
            //wait until all projects appears
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strProjectName+"')]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickListingOfBanker(int RowIndex){
        try {
            //wait until all listing projects appears
            WaitUtil.simpleSleep(500);
            String strListingName = ReadData.readDataExcel("InvestmentBanker", RowIndex, "InvestmentBankerListing");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strListingName+"')]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDealStage(int RowIndex){
        try{
            //wait until deal stage field appears
            WaitUtil.simpleSleep(500);
            String strProjectFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strProjectTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromDealSize")).sendKeys(strProjectFrom);
            findElement(By.id("ProjectToDealSize")).sendKeys(strProjectTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyCompanyOfBanker(int RowIndex){
        try {
            //wait until companies appears in search
            WaitUtil.simpleSleep(500);
            String strCompanyName = ReadData.readDataExcel("InvestmentBanker", RowIndex, "InvestmentBankerCompany");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]")).isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearDealStage(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(1000);
        findElement(By.id("ProjectFromDealSize")).clear();
        findElement(By.id("ProjectToDealSize")).clear();
    }

    public void enterInvestmentAmount(int RowIndex){
        try{
            //wait until investment field appears
            WaitUtil.simpleSleep(500);
            String strAmountFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strAmountTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromEquityRequired")).sendKeys(strAmountFrom);
            findElement(By.id("ProjectToEquityRequired")).sendKeys(strAmountTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearInvestmentAmount(){
        //wait until investment amount field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("ProjectFromEquityRequired")).clear();
        findElement(By.id("ProjectToEquityRequired")).clear();
    }

    public void enterLocationOfBanker(int RowIndex){
        try {
            //wait until location field is found
            WaitUtil.simpleSleep(500);
            String strLocation = ReadData.readDataExcel("InvestmentBanker", RowIndex, "BankerLocation");
            findElement(By.id("LocationInputSearch")).sendKeys(strLocation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickLocation(int RowIndex){
        try{
            //wait until location is found
            WaitUtil.simpleSleep(1000);
            String strLocation = ReadData.readDataExcel("InvestmentBanker", RowIndex, "DetailLocationOfBanker");
            findElement(By.xpath("//a[contains(text(),'"+strLocation+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean verifyProjectOfBanker(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strProject = ReadData.readDataExcel("InvestmentBanker", RowIndex, "InvestmentBankerProject");
                //wait until page gets loaded
                WaitUtil.simpleSleep(5000);
                String strProjectName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strProject.contains(strProjectName))
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

    public void clearLocationField(){
        //wait until location is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("LocationInputSearch")).clear();
    }

    public void clickProjectAndStrategyField(){
        //wait until project and strategy is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-0")).click();
    }

    public void clickAssetType(){
        //wait until asset type is found
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectOfficeAssetType(){
        //wait until option of asset type
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
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

    public void clearOfficeOfAssetType(){
        //wait until option of asset type
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickStrategyField(){
        //wait until strategy field is found
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectBuyLand(){
        //wait until dropdown is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_33")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearBuyLand(){
        //wait until dropdown is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_33")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickReturnProfile(){
        //wait until return profile field is found
        WaitUtil.simpleSleep(500);
        findElement(By.linkText("Return profile")).click();
    }

    public void enterValuesCashOnCash(int RowIndex){
        try{
            //wait until cash on cash field is found
            WaitUtil.simpleSleep(500);
            String strCashOnCashFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strCashOnCashTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromCashOnCash")).sendKeys(strCashOnCashFrom);
            findElement(By.id("ProjectToCashOnCash")).sendKeys(strCashOnCashTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void closeReturnProfile(){
        //wait until done button is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("closeReturnProfile")).click();
    }

    public void clearValuesCashOnCash(){
        findElement(By.id("ProjectFromCashOnCash")).clear();
        findElement(By.id("ProjectToCashOnCash")).clear();
    }

    public boolean verifyListingOfBanker(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(1000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strListingProject = ReadData.readDataExcel("InvestmentBanker", RowIndex, "InvestmentBankerListing");
                String strListingName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strListingProject.contains(strListingName))
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

    public void enterCapitalReturns(int RowIndex){
        try{
            //wait until capital return field is found
            WaitUtil.simpleSleep(500);
            String strCashOnCashFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strCashOnCashTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromCapitalReturnIrr")).sendKeys(strCashOnCashFrom);
            findElement(By.id("ProjectToCapitalReturnIrr")).sendKeys(strCashOnCashTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearCapitalReturns(){
        //wait until capital return field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("ProjectFromCapitalReturnIrr")).clear();
        findElement(By.id("ProjectToCapitalReturnIrr")).clear();
    }

    public void enterCapitalReturnsROE(int RowIndex){
        try{
            //wait until capital return field is found
            WaitUtil.simpleSleep(500);
            String strCashOnCashFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strCashOnCashTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromCapitalReturnRoe")).sendKeys(strCashOnCashFrom);
            findElement(By.id("ProjectToCapitalReturnRoe")).sendKeys(strCashOnCashTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearCapitalReturnsROE(){
        //wait until CAP field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("ProjectFromCapitalReturnRoe")).clear();
        findElement(By.id("ProjectToCapitalReturnRoe")).clear();
    }

    public void enterCAP(int RowIndex){
        try{
            //wait until CAP field is found
            WaitUtil.simpleSleep(500);
            String strCAPFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strCAPTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromCap")).sendKeys(strCAPFrom);
            findElement(By.id("ProjectToCap")).sendKeys(strCAPTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearCAP(){
        //wait until CAP field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("ProjectFromCap")).clear();
        findElement(By.id("ProjectToCap")).clear();
    }

    public void enterHoldingMin(int RowIndex){
        try{
            //wait until holding min field is found
            WaitUtil.simpleSleep(500);
            String strHoldingMinFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strHoldingMinTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromHoldingYearsMin")).sendKeys(strHoldingMinFrom);
            findElement(By.id("ProjectToHoldingYearsMin")).sendKeys(strHoldingMinTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearHoldingMin() {
        //wait until holding min field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("ProjectFromHoldingYearsMin")).clear();
        findElement(By.id("ProjectToHoldingYearsMin")).clear();
    }

    public void enterHoldingMax(int RowIndex){
        try{
            //wait until holding max field is found
            WaitUtil.simpleSleep(500);
            String strHoldingMaxFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strHoldingMaxTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromHoldingYearsMax")).sendKeys(strHoldingMaxFrom);
            findElement(By.id("ProjectToHoldingYearsMax")).sendKeys(strHoldingMaxTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearHoldingMax(){
        //wait until holding min field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("ProjectFromHoldingYearsMax")).clear();
        findElement(By.id("ProjectToHoldingYearsMax")).clear();
    }

    public void clickFinancial(){
        //wait until financial field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-1")).click();
    }

    public void clickEquityType(){
        //wait until equity field is found
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Equity Type:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void selectPreferredEquity(){
        //wait until dropdown field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("EquitytypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Equity Type:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void clearPreferredEquity(){
        //wait until drop down field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("EquitytypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Equity Type:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void clickDealStageOFEquityType(){
        //wait until dealStage field is found
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void selectOwnedOfEquityType(){
        //wait until drop down field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void clearOwnedOfEquityType(){
        //wait until drop down field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void clickSponsorAndInvestor(){
        //wait until Sponsor field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-2")).click();
    }

    public void clickInvestmentStructure(){
        //wait until investment field is found
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Structure:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void selectGeneralPartner(){
        //wait until investment field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Structure:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void clearGeneralPartner(){
        //wait until investment field is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Structure:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void clickOnSyndicateType(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("syndications_")).click();
    }

    public void unCheckOnSyndicateType(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("syndications_")).click();
    }
}
