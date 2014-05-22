package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

public class InvestmentDirectIntoCompanyPage extends FluentWebDriverPage{
    ReadData ReadData = new ReadData();

    public InvestmentDirectIntoCompanyPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void selectValueInDealSize(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<1;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<90;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clearValueInDealSize(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<1;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=10;i<=100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void clickInvestorType(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAdvisorOption(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRouteToSponsorField(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectDirectOnlyInRouteToSponsor(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickAssetInterest(){
       //wait until asset interest field appears
       WaitUtil.simpleSleep(100);
       findElement(By.id("ui-accordion-1-header-0")).click();
    }

    public void clickDealStage(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(100);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectOwnedOption(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickAssetStrategyField(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(100);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAcquisitionOption(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSyndicating(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("syndications_")).click();
    }

}
