package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class CompaniesSearchValidationPage extends FluentWebDriverPage{
    test.Support.ReadData ReadData = new ReadData();
    public CompaniesSearchValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    /*public boolean verifyInvestorCompanyName(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strInvestorCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "InvestorCompanyName");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strCompanyName.contains(strInvestorCompanyName))
                {
                   status = false;
                   break;
                }
                else{
                    status = true;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }*/

    public boolean verifyInvestorCompanyName(int RowIndex,String strCondition){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strInvestorCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "InvestorCompanyName");
                //wait until page gets loaded
                WaitUtil.simpleSleep(1000);
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strCondition.contains("not"))
                {
                    if(!strCompanyName.equals(strInvestorCompanyName))
                    {
                        status = true;
                    }
                    else
                    {
                        status = false;
                        break;
                    }
                }
                else
                {
                    if(strCompanyName.equals(strInvestorCompanyName))
                    {
                        status = true;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
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
                String strLenderCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "LenderCompanyName");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
                if(strCompanyName.contains(strLenderCompanyName))
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

    public boolean verifyRealEstateCompanyName(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strServiceCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "LenderCompanyName");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strCompanyName.contains(strServiceCompanyName))
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
                String strInvestorCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "DealSponsorCompanyName");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strInvestorCompanyName.contains(strCompanyName))
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

    public void enterInvestorCompanyTitle(int RowIndex){
        try{
            //wait until company name appear
            WaitUtil.simpleSleep(500);
            String strCompanyName = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorCompanyName");
            findElement(By.id("CompanyTitle")).click();
            findElement(By.id("CompanyTitle")).sendKeys(strCompanyName);
        } catch (Exception e) {
            System.out.println(e);
        }
        //wait until company name appear
        WaitUtil.simpleSleep(10000);
    }

    public void clearInvestorCompanyTitle(){
        //wait until company name appear
        WaitUtil.simpleSleep(500);
        findElement(By.id("CompanyTitle")).clear();
        findElement(By.id("CompanyTitle")).clear();
    }

    public void enterDeveloperType(int RowIndex){
        try{
            //wait until company name appear
            WaitUtil.simpleSleep(500);
            String strSubRoleType = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "SubRole");
            findElement(By.id("CompanySubrole")).click();
            findElement(By.id("CompanySubrole")).sendKeys(strSubRoleType);
            //wait until company name appear
            WaitUtil.simpleSleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean developerCompanyName(int RowIndex){
        boolean status = false;
        try{
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strOtherUser = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "DeveloperCompany");
                //wait until page gets loaded
                WaitUtil.simpleSleep(1000);
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strName.equals(strOtherUser))
                {
                    status = false;
                    break;
                }   else {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public boolean developerCompany(int RowIndex){
        boolean status = false;
        try{
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong"));
            int linksCount = links.size();
            //linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDealSponsorCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "DeveloperCompany");
                //wait until page gets loaded
                WaitUtil.simpleSleep(5000);
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong")).getText();
                if(strCompanyName.contains(strDealSponsorCompanyName))
                {
                    status = true;
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        return status;
    }

}
