package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test.Support.ReadData;

import javax.swing.*;
import java.util.List;

public class CompanyOfAdvisorSearchPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompanyOfAdvisorSearchPage(WebDriverProvider driverProvider){
        super(driverProvider);

    }

    public void verifyFindOfAdvisor(){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Find:')]/strong[contains(text(),'Real Estate Advisors')]"),getDriverProvider().get()));
    }

    public void verifySubroleOfAdvisor(){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Subrole:')]/strong[contains(text(),'Advisor')]"),getDriverProvider().get()));
    }

    public void verifyStrategy(){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Strategy:')]/strong[contains(text(),'Appraisals')]"),getDriverProvider().get()));
    }

    public void clickAppraisalCompany(int RowIndex){
        try{
            String strAppraisalCompany = ReadData.readDataExcel("RealEstateDetails", RowIndex, "AppraisalComp");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAppraisalCompany+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickServiceUser(int RowIndex){
        try{
            String strServiceUser = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyProject");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strServiceUser+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectAssetExperienceDropDown(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void verifyAdvisorCompany(int RowIndex){
            //wait until page gets loaded
            WaitUtil.simpleSleep(500);
            try{
                String strAdvisorCompanyName = ReadData.readDataExcel("RealEstateDetails", RowIndex, "AppraisalComp");
                Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorCompanyName+"')]"), getDriverProvider().get()));
            } catch (Exception e) {
                System.out.println(e);
            }
    }

    public void selectOfficeAssetExperience(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickDealStage(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectOwnedOptionInDealStage(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void slideProjectSize(){
        //WebElement slider = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/div"));
        WebElement slider = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<11;i++){
            slider.sendKeys(Keys.ARROW_UP);
        }
       /* //findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]")).click();
        Actions move = new Actions(getDriverProvider().get());
        move.sendKeys(findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]")),Keys.ARROW_RIGHT);
        //move.dragAndDropBy(slider, 11,40);
        move.build().perform();*/
    }


}

























































    /*public void clickProfile(){
        findElement(By.id("ui-accordion-1-header-0")).click();
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
        } catch (Exception e) {
            System.out.println(e);
        }
        executeScript("scrollTo(250,0)");
    } */







