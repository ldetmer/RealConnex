package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class DeveloperSearchPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();

    public DeveloperSearchPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public String verifySearchOption(){
        String strNameOfSubRole = findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/span[@class='opt']/strong")).getText();
        return strNameOfSubRole;
    }

    public void verifyDeveloperName(int RowIndex){
        try{
            String strDeveloperName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyDeveloperName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDeveloperName+"')]")).isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnDeveloperName(int RowIndex){
        try{
            String strDeveloperName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyDeveloperName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDeveloperName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean searchedDeveloperCompany(int RowIndex){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        boolean status = false;
        try {
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(1000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong"));
            int linksCount = links.size();
            for(int i=1;i<=linksCount;i++){
                String strSearchedCompany = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDeveloperCompanyName");
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong")).getText();
                if(strName.contains(strSearchedCompany))
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

    public void clickOnDeveloperCompany(int RowIndex){
        try{
            String strDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDeveloperCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+strDeveloperCompanyName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectStrategy(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_63")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearStrategy(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_63")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }
}
