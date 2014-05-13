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

    public void verifyInvestorCompanyName(int RowIndex){
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strInvestorCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "InvestorCompanyName");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong")).getText();
                if(strInvestorCompanyName.contains(strCompanyName))
                {
                    System.out.println("Investor company name is not displayed");
                }
                else{
                    System.out.println("Investor company name is displayed");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyLenderCompanyName(int RowIndex){
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strInvestorCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "LenderCompanyName");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong")).getText();
                if(strInvestorCompanyName.contains(strCompanyName))
                {
                    System.out.println("Lender company name is not displayed");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyRealEstateCompanyName(int RowIndex){
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strInvestorCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "LenderCompanyName");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong")).getText();
                if(strInvestorCompanyName.contains(strCompanyName))
                {
                    System.out.println("Real estate advisor company name is not displayed");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyDealSponsorCompanyName(int RowIndex){
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strInvestorCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "DealSponsorCompanyName");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong")).getText();
                if(strInvestorCompanyName.contains(strCompanyName))
                {
                    System.out.println("Deal Sponsor company name is not displayed");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterInvestorType(int RowIndex){
        try{
            String strSubRoleType = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "InvestorType");
            findElement(By.id("CompanySubrole")).click();
            findElement(By.id("CompanySubrole")).sendKeys(strSubRoleType);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
