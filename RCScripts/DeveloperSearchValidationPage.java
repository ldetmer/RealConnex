package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class DeveloperSearchValidationPage extends FluentWebDriverPage {
    test.Support.ReadData ReadData = new ReadData();

    public DeveloperSearchValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void selectStrategyType(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_57")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearStrategy(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_63")).click();
        findElement(By.id("AssetstrategyId_checkbox_57")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickBuyLand(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_33")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public boolean userOfAllSearchOption(int RowIndex){
        boolean status = false ;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(1000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strDSLocation = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "DeveloperOfAllSearchOption");
                String strUserName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strDSLocation.contains(strUserName))
                {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void clearStrategyField(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_64")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }
}
