package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class CompaniesOfDealSponsorPage extends FluentWebDriverPage{
    ReadData ReadData = new ReadData();
    public CompaniesOfDealSponsorPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void clickProject(){
        //wait until project drop down appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("ui-accordion-1-header-0")).click();
    }

    public void clickProjectType(){
        //wait until project drop down appears
        WaitUtil.simpleSleep(100);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectProject(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearProjectField(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRiskProfile(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectRisk(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRiskProfile(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickInvestorSponsor(){
        //wait until Investor and Sponsor field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-2")).click();
    }

    public void clickInvestmentMethod(){
        //wait until Investor drop down appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectInvestment(){
        //wait until Investor drop down appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearInvestment(){
        //wait until Investor drop down appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRouteToDeveloper(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Developer:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectRoute(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Developer:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRoute(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Developer:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }
}
