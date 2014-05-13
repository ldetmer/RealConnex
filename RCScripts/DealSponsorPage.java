package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class DealSponsorPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public DealSponsorPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public String verifyFindInSearchOption(){
        String strFindInSearchOption = findElement(By.cssSelector(".opt>strong")).getText();
        return strFindInSearchOption;
    }

    public String verifySearchOption(){
        String strNameOfSubRole = findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/span[@class='opt']/strong")).getText();
        return strNameOfSubRole;
    }

    public void clickProject(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-0")).click();
    }

    public void clickStrategy(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectStrategy(){
        //wait until strategy drop down field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_33")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearStrategyField(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_33")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }
}