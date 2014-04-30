package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class BrokerPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public BrokerPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyFindSearch(int RowIndex){
        try{
            String strFindText = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyFindOfBroker");
            String strText = findElement(By.cssSelector("span.opt")).getText();
            Assert.assertTrue(strFindText,strText.contains(strFindText));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifySubRoleOfBroker(int RowIndex){
        try{
            String strSubRoleText = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifySubRole");
            String strText = findElement(By.xpath("//div[@id='searchFilters']/div/span[2]")).getText();
            Assert.assertTrue(strSubRoleText,strText.contains(strSubRoleText));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyStrategy(int RowIndex){
        try{
            String strStrategyText = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyStrategy");
            String strText = findElement(By.xpath("//div[@id='searchFilters']/div/span[3]")).getText();
            Assert.assertTrue(strStrategyText,strText.contains(strStrategyText));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectCoreActivity(){
        //wait until core activity field appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstrategyId_checkbox_97")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
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
                String strAdvisor = ReadData.readDataExcel("ValidationDetails", RowIndex, "BrokerOfAllOption");
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
                String strServiceName = ReadData.readDataExcel("ValidationDetails", RowIndex, "BrokerOfAllOption");
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

    public void twoOptions(){
        //wait until core activity dropdown appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstrategyId_checkbox_99")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearCore(){
        //wait until core activity dropdown appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstrategyId_checkbox_97")).click();
        findElement(By.id("AssetstrategyId_checkbox_99")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearOffice(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void clickInvestments(){
        //wait until core activity dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_99")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickTenant(){
        //wait until core activity dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_99")).click();
        findElement(By.id("AssetstrategyId_checkbox_98")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOthers(){
        //wait until core activity dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_98")).click();
        findElement(By.id("AssetstrategyId_checkbox_100")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearCoreActivity(){
        //wait until core activity dropdown appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstrategyId_checkbox_100")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSolar(){
        //wait until asset dropdown appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void twoOptionOfAsset(){
        //wait until asset dropdown appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void clearAsset(){
        //wait until asset dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }
/*
    public void selectAsset(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAssetExperience(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }*/

    public void selectDealStage(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void twoOptionsInDealStage(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearDealStage(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        findElement(By.id("DealstageId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void verifyCompanyName(int RowIndex){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(500);
            String strFindText = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyCompanyName");
            boolean strText = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong")).isDisplayed();
            Assert.assertTrue(strText);
        } catch (Exception e) {
            System.out.println(e);
        }
        //wait until company name appears
        WaitUtil.simpleSleep(100);
    }

    public void clickCompanyName(int RowIndex){
        try{
            String strCompanyName = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyCompanyName");
            //wait until page loads
            WaitUtil.simpleSleep(500);
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'Universal')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyServiceProject(int RowIndex){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(500);
            String strFindText = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyProject");
            String strText = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong")).getText();
            Assert.assertTrue(strFindText,strText.contains(strFindText));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickServiceProject(int RowIndex){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(500);
            String strServiceProject = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyProject");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strServiceProject+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterLocation(int RowIndex){
        try{
            String strLocation = ReadData.readDataExcel("ValidationDetails", RowIndex, "BrokerLocation");
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
            String strLocation = ReadData.readDataExcel("ValidationDetails", RowIndex, "BrokerFullLocation");
            findElement(By.xpath("//a[contains(text(),'"+strLocation+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }



















    public void numOfOffice(int RowIndex){
        try{
            String strFromOffice = ReadData.readDataExcel("RealEstateDetails", RowIndex, "FromOffice");
            String strToOffice = ReadData.readDataExcel("RealEstateDetails", RowIndex, "ToOffice");
            findElement(By.id("ProjectFromOffices")).sendKeys(strFromOffice);
            findElement(By.id("ProjectToOffices")).sendKeys(strToOffice);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void numOfProfessional(int RowIndex){
        try{
            String strFromEmployee = ReadData.readDataExcel("RealEstateDetails", RowIndex, "FromEmployee");
            String strToEmployee = ReadData.readDataExcel("RealEstateDetails", RowIndex, "ToEmployee");
            findElement(By.id("ProjectFromNumberOfEmployees")).sendKeys(strFromEmployee);
            findElement(By.id("ProjectToNumberOfEmployees")).sendKeys(strToEmployee);
            executeScript("scrollTo(250,0)");
        } catch (Exception e) {
            System.out.println(e);
        }
        //wait until company name appears
        WaitUtil.simpleSleep(100);
    }
}
