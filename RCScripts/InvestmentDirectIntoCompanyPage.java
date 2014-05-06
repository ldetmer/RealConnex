package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class InvestmentDirectIntoCompanyPage extends FluentWebDriverPage{
    ReadData ReadData = new ReadData();

    public InvestmentDirectIntoCompanyPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void enterHoldPeriod(int RowIndex){
        try{
            //wait until deal stage field appears
            WaitUtil.simpleSleep(500);
            String strProjectFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strProjectTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            //wait until deal stage field appears
            WaitUtil.simpleSleep(500);
            findElement(By.id("ProjectFromHoldPeriod")).click();
            findElement(By.id("ProjectFromHoldPeriod")).clear();
            findElement(By.id("ProjectFromHoldPeriod")).sendKeys(strProjectFrom);
            findElement(By.id("ProjectToHoldPeriod")).click();
            findElement(By.id("ProjectToHoldPeriod")).clear();
            findElement(By.id("ProjectToHoldPeriod")).sendKeys(strProjectTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearHoldPeriod(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("ProjectFromHoldPeriod")).clear();
        findElement(By.id("ProjectToHoldPeriod")).clear();
    }

    public void clickWeAreA(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'We are a:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAdvisor(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'We are a:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearAdvisor(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'We are a:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRouteToSponsor(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectDirectOnly(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearDirectOnly(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }
}
