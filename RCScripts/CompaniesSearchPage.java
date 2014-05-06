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

    public void clickDealSponsorCompanyName(int RowIndex){
        try{
            String strVerifyCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "VerifyCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strVerifyCompanyName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean verifyInvestorCompanyName(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDealSponsorCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "InvestorCompanyName");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong")).getText();
                if(strDealSponsorCompanyName.contains(strCompanyName))
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

    public void clickInvestorCompanyName(int RowIndex){
        try{
            String strVerifyCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex,"InvestorCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strVerifyCompanyName+"')]")).click();
        } catch(Exception e) {
            System.out.println();
        }
    }

    public boolean verifyLenderCompanyName(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDealSponsorCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "LenderCompanyName");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong")).getText();
                if(strDealSponsorCompanyName.contains(strCompanyName))
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

    public void clickLenderCompanyName(int RowIndex){
        try{
            String strVerifyCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex,"LenderCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strVerifyCompanyName+"')]")).click();
        } catch(Exception e) {
            System.out.println();
        }
    }

    public boolean verifyAdvisorCompanyName(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDealSponsorCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "RealEstateAdvisorCompany");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong")).getText();
                if(strDealSponsorCompanyName.contains(strCompanyName))
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

    public void clickAdvisorCompanyName(int RowIndex){
        try{
            String strVerifyCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex,"RealEstateAdvisorCompany");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strVerifyCompanyName+"')]")).click();
        } catch(Exception e) {
            System.out.println();
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

    public void enterTypeField(int RowIndex){
        try{
            String strSubRoleType = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "TypeOfUser");
            findElement(By.id("CompanySubrole")).click();
            findElement(By.id("CompanySubrole")).sendKeys(strSubRoleType);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public boolean verifyDealSponsorCompanyName(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDealSponsorCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "DealSponsorCompanyName");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong")).getText();
                if(strDealSponsorCompanyName.contains(strCompanyName))
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

    public void clearCompanyNameField(){
        //wait until name field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("CompanyTitle")).clear();
    }

    public void clearTypeField(){
        //wait until name field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("CompanySubrole")).clear();
    }
}

