package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.selenium.fluent.FluentWebElements;
import test.Support.ReadData;

import java.util.List;

public class DeveloperDealSponsorPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public DeveloperDealSponsorPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }


    public String verifySearchOption(){
        String strNameOfSubrole = findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/span[@class='opt']/strong")).getText();
        return strNameOfSubrole;
    }

    public void verifyDealSponsorName(int RowIndex){
        try{
            String strDealSponsorUser = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "verifyDealSponsorName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorUser+"')]")).isDisplayed();
            } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickSearchedDealSponsor(int RowIndex){
        try{
            String strDealSponsorUser = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "verifyDealSponsorName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorUser+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickDealSponsorCompany(int RowIndex){
        try{
            String strDealSponsorCompany = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDealCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a[@href='/company/id13']/strong[contains(text(),'"+strDealSponsorCompany+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
    }

    public void enterLocation(int RowIndex){
        try{
            String strLocation = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "DealSponsorLocation");
            findElement(By.id("LocationInputSearch")).clear();
            findElement(By.id("LocationInputSearch")).sendKeys(strLocation);
            findElement(By.xpath("//a[contains(text(),'Los Angeles, California, United States')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean verifyLocation(int RowIndex){
        boolean status = false;
        try {
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(1000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=0;i<=linksCount;i++){
                int j=i+2;
                String strLocation = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "DealSponsorLocation");
                String strName = findElement(By.xpath("//tbody/tr/td["+j+"]")).getText();
                if(strName.contains(strLocation))
                {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void clearLocation(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("LocationInputSearch")).clear();
    }

    public void clickProject(){
        findElement(By.id("ui-accordion-1-header-0")).click();
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
    }

    public boolean companyNameOfAllSearchOption(int RowIndex){
        boolean status = false ;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDSLocation = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "CompanyOfAllSearchOption");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
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

    public void clickStrategy(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectStrategy(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_33")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public boolean userOfAllSearchOption(int RowIndex){
        boolean status = false ;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDSLocation = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "UserOfAllSearchOption");
                String strUserName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strDSLocation.contains(strUserName))
                {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void otherCompany(int RowIndex, String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
            if(strName.equals(strOtherUser))
            {
                System.out.println("Other user is displayed:"+strName);
            }
            else
            {
                System.out.println("Other user is not displayed");
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void otherUsers(int RowIndex, String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
            if(strName.equals(strOtherUser))
            {
                System.out.println("Other user is displayed:"+strName);
            }
            else
            {
                System.out.println("Other user is not displayed");
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void verifyCompany(int RowIndex,String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]")).isDisplayed();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void verifyUser(int RowIndex,String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]")).isDisplayed();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void selectSecondStrategy(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_57")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickDevelopment(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_42")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickBuild(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_42")).click();
        findElement(By.id("AssetstrategyId_checkbox_43")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSpec(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_42")).click();
        findElement(By.id("AssetstrategyId_checkbox_44")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickDevelopmentDevelop(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_42")).click();
        findElement(By.id("AssetstrategyId_checkbox_45")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickForward(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_42")).click();
        findElement(By.id("AssetstrategyId_checkbox_46")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickBuildAndSell(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_42")).click();
        findElement(By.id("AssetstrategyId_checkbox_47")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearDevelopmentField(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_42")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickCorporate(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_54")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickLandBanking(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_54")).click();
        findElement(By.id("AssetstrategyId_checkbox_55")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearCorporate(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_54")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOperating(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_57")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPortfolio(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_57")).click();
        findElement(By.id("AssetstrategyId_checkbox_59")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRecapitalizations(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_59")).click();
        findElement(By.id("AssetstrategyId_checkbox_61")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSales(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_61")).click();
        findElement(By.id("AssetstrategyId_checkbox_63")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickAsset(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_63")).click();
        findElement(By.id("AssetstrategyId_checkbox_34")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickStabilized(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_34")).click();
        findElement(By.id("AssetstrategyId_checkbox_35")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRepositioning(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_34")).click();
        findElement(By.id("AssetstrategyId_checkbox_36")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRedevelopment(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_34")).click();
        findElement(By.id("AssetstrategyId_checkbox_37")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickREO(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_34")).click();
        findElement(By.id("AssetstrategyId_checkbox_38")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickFlip(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_34")).click();
        findElement(By.id("AssetstrategyId_checkbox_39")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickBuy(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_34")).click();
        findElement(By.id("AssetstrategyId_checkbox_40")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickAssetOther(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_34")).click();
        findElement(By.id("AssetstrategyId_checkbox_41")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickLease(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_34")).click();
        findElement(By.id("AssetstrategyId_checkbox_101")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearAssetAcquisitions(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_34")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickLand(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_48")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickDevelop(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_48")).click();
        findElement(By.id("AssetstrategyId_checkbox_49")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickLandOther(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_48")).click();
        findElement(By.id("AssetstrategyId_checkbox_50")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSpeculation(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_48")).click();
        findElement(By.id("AssetstrategyId_checkbox_51")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickLandDevelop(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_48")).click();
        findElement(By.id("AssetstrategyId_checkbox_52")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickLandFlip(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_48")).click();
        findElement(By.id("AssetstrategyId_checkbox_53")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearLand(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_48")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickNotes(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_56")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPlatformBuild(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_56")).click();
        findElement(By.id("AssetstrategyId_checkbox_58")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPublic(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_58")).click();
        findElement(By.id("AssetstrategyId_checkbox_60")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRezones(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_60")).click();
        findElement(By.id("AssetstrategyId_checkbox_62")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOther(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_62")).click();
        findElement(By.id("AssetstrategyId_checkbox_64")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearStrategy(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_33")).click();
        findElement(By.id("AssetstrategyId_checkbox_57")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public boolean searchedCompany(int RowIndex){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        boolean status = false;
        try {
            String strSearchedUser = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDealCompanyName");
            String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a[@href='/company/id13']/strong")).getText();
            if(strName.contains(strSearchedUser))
            {
                status = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        return status;
    }

    public void clearStrategyField(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_64")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }
}