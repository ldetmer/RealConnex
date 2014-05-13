package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class InvestmentBankerPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public InvestmentBankerPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifySubRoleOfBanker(int RowIndex){
        try{
            String strSubRoleText = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifySubRole");
            String strText = findElement(By.xpath("//div[@id='searchFilters']/div/span[2]/strong")).getText();
            Assert.assertTrue(strSubRoleText, strText.contains(strSubRoleText));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyStrategyOfBanker(int RowIndex){
        try{
            String strStrategyText = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyStrategy");
            String strText = findElement(By.xpath("//div[@id='searchFilters']/div/span[3]/strong")).getText();
            Assert.assertTrue(strStrategyText,strText.contains(strStrategyText));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyCompany(int RowIndex){
        try{
            String strCompany = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyCompanyName");
            String strText = findElement(By.xpath("//tbody[@id='searchResults']/tr[2]/td/a/strong")).getText();
            Assert.assertTrue(strCompany, strText.contains(strCompany));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnCompanyName(int RowIndex){
        try{
            String strCompany = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strCompany+"')]")).click();
        }catch (Exception e) {
            System.out.println(e);
        }

    }

    public void verifyProject(int RowIndex){
        try{
            String strProject = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyProject");
            String strText = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong")).getText();
            Assert.assertTrue(strProject, strText.contains(strProject));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnProject(int RowIndex){
        try{
            String strProject = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyProject");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strProject+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
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

    public void otherService(int RowIndex, String strColumnName){
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

    public void verifyService(int RowIndex,String strColumnName){
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
                String strAdvisor = ReadData.readDataExcel("ValidationDetails", RowIndex, "InvestmentBankerOfAllOption");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strAdvisor.contains(strCompanyName))
                {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public boolean serviceNameOfAllSearchOption(int RowIndex){
        boolean status = false ;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strServiceName = ReadData.readDataExcel("ValidationDetails", RowIndex, "InvestmentBankerOfAllOption");
                String strService = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strServiceName.contains(strService))
                {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void selectActivity(){
        //wait until core activity field appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstrategyId_checkbox_90")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectTwoOptions(){
        //wait until core activity field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_93")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearCoreDropDown(){
        //wait until core activity field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_93")).click();
        findElement(By.id("AssetstrategyId_checkbox_90")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickEquity(){
        //wait until core activity field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_93")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOperatingCompanies(){
        //wait until core activity field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_93")).click();
        findElement(By.id("AssetstrategyId_checkbox_95")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOther(){
        //wait until core activity field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_95")).click();
        findElement(By.id("AssetstrategyId_checkbox_104")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickDebt(){
        //wait until core activity field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_104")).click();
        findElement(By.id("AssetstrategyId_checkbox_92")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPortfolio(){
        //wait until core activity field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_92")).click();
        findElement(By.id("AssetstrategyId_checkbox_94")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRecapitalizations(){
        //wait until core activity field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_94")).click();
        findElement(By.id("AssetstrategyId_checkbox_96")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearCoreActivity(){
        //wait until core activity field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_96")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void enterLocation(int RowIndex){
        try{
            String strLocation = ReadData.readDataExcel("ValidationDetails", RowIndex, "BankerLocation");
            findElement(By.id("LocationInputSearch")).clear();
            findElement(By.id("LocationInputSearch")).sendKeys(strLocation);
            //findElement(By.xpath("//a[contains(text(),'Newark, Delaware, United States')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickLocation(int RowIndex){
        try{
            //wait until location is found
            WaitUtil.simpleSleep(100);
            String strLocation = ReadData.readDataExcel("ValidationDetails", RowIndex, "BankerFullLocation");
            findElement(By.xpath("//a[contains(text(),'"+strLocation+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectAsset(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectTwoOption(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearAssetField(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        findElement(By.id("AssettypeId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectDeal(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectOptionOfDeal(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearDeal(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_7")).click();
        findElement(By.id("DealstageId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }


































}
