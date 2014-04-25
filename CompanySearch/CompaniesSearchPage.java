package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class CompaniesSearchPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompaniesSearchPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyCompanyName(int RowIndex){
        try{
            String strVerifyCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "VerifyCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strVerifyCompanyName+"')]")).isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void openCompanyProfile(int RowIndex){
        try{
            String strVerifyCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "VerifyCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strVerifyCompanyName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterCompanyName(int RowIndex){
        try{
            String strCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "CompanyName");
            findElement(By.id("CompanyTitle")).clear();
            findElement(By.id("CompanyTitle")).click();
            findElement(By.id("CompanyTitle")).sendKeys(strCompanyName);
        } catch (Exception e) {
            System.out.println(e);
        }

        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void enterSubroleType(int RowIndex){
        try{
            String strSubRoleType = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "SubRoleType");
            findElement(By.id("CompanySubrole")).click();
            findElement(By.id("CompanySubrole")).sendKeys(strSubRoleType);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean searchCompany(int RowIndex,int noOfUsers){

        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        boolean status = false;
        String strName = null;
        int j=1;
        try {
            String strSearchedUser = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "SearchedCompany");
            List<WebElement> links;

            //wait until page gets loaded
            WaitUtil.simpleSleep(800);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=0;i<=linksCount;i++){
                if(linksCount == 1) {
                    strName = findElement(By.cssSelector("strong > span")).getText();
                } else {
                    strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+j+"]/td/a/strong/span")).getText();
                    j++;
                }
                if(strName.equals(strSearchedUser)&&linksCount==1)
                {
                    status = true;
                    //break;
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}

