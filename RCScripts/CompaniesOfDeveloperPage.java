package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class CompaniesOfDeveloperPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompaniesOfDeveloperPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }


    public void verifyDeveloperCompanyName(int RowIndex){
        try{
            String strDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDeveloperCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDeveloperCompanyName+"')]")).isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyCompanyNameDeveloper(int RowIndex){
        try{
            String strDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDeveloperCompanyName");
            String strCompany = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDeveloperCompanyName+"')]")).getText();
            Assert.assertTrue(strDeveloperCompanyName, strCompany.contains(strDeveloperCompanyName));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
