package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class PeopleSearchValidationPage extends FluentWebDriverPage {

    ReadData ReadData = new ReadData();
    public PeopleSearchValidationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public boolean verifyInvestorUser(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strInvestor = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorUserName");
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
                if(strName.contains(strInvestor))
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

    public boolean verifyLenderUser(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strLender = ReadData.readDataExcel("PeopleDetails", RowIndex, "LenderUserName");
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
                if(strName.contains(strLender))
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

    public boolean verifyRealEstateAdvisorUser(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDealSponsor = ReadData.readDataExcel("PeopleDetails", RowIndex, "PropertyServiceProviderUserName");
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
                if(strDealSponsor.contains(strName))
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

    public boolean verifyDealSponsorUser(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDealSponsor = ReadData.readDataExcel("PeopleDetails", RowIndex, "DealSponsorName");
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
                if(strName.contains(strDealSponsor))
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

    public void enterInvestorUserName(int RowIndex){
        try{
            //wait until text field is found
            WaitUtil.simpleSleep(500);
            String strUserTitle = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorUserName");
            findElement(By.id("UserTitle")).click();
            findElement(By.id("UserTitle")).clear();
            findElement(By.id("UserTitle")).sendKeys(strUserTitle);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterInvestorJobTitle(int RowIndex){
        try{
            //wait until title field appear
            WaitUtil.simpleSleep(500);
            String strUserJobTitle = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorJobTitle");
            findElement(By.id("UserJobTitle")).click();
            findElement(By.id("UserJobTitle")).sendKeys(strUserJobTitle);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterInvestorCompanyName(int RowIndex){
        try{
            //wait until company name appear
            WaitUtil.simpleSleep(500);
            String strCompanyName = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorCompanyName");
            findElement(By.id("UserCompanyName")).click();
            findElement(By.id("UserCompanyName")).sendKeys(strCompanyName);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean verifyInvestorUserName(int RowIndex){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strInvestorUser = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorUserName");
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strName.contains(strInvestorUser))
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

}
