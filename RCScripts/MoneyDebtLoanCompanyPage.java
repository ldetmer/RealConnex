package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import test.steps.VerificationStatements;

public class MoneyDebtLoanCompanyPage extends FluentWebDriverPage{
    ReadData ReadData = new test.Support.ReadData();

    public MoneyDebtLoanCompanyPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyFindInMoneyDebtLoan(int RowIndex){
        try {
            String strFindName = ReadData.readDataExcel("Money", RowIndex, "FindInSearchOption");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strFindName+"')]"), getDriverProvider().get()));
        } catch (AssertionError a) {
            System.out.println(a);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Search name could not be found\n";
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyLoanInMoneyDebtLoan(int RowIndex){
        try {
            String strLoanName = ReadData.readDataExcel("Money", RowIndex, "LoanInSearchOption");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strLoanName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError a){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Failed in verifying the search option\n";
        }
    }

    public void verifyCompanyNameDebtLoan(String strCompanyNameDebtLoan){
        //wait util page load
        WaitUtil.simpleSleep(100);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyNameDebtLoan+"')]"), getDriverProvider().get()));
    }

    public void verifyCompanyNameDebtLoanIsNotDisplayed(String strCompanyName){
        //wait util page load
        WaitUtil.simpleSleep(100);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strCompanyName + "')]"), getDriverProvider().get()));
    }

    public void setLoanAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<50;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearLoanAmount(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=50;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void setTerm(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[2]"));
        for(int i=0;i<50;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearTerm(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[2]"));
        for(int i=50;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void selectInsuranceCompany(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_48")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_48"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearInsuranceCompany(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_48")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_48"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickRouteToLender(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement footerElement = findElement(By.xpath("//div[@id='footer']"));
        Point position = footerElement.getLocation();
        executeScript("scrollTo(0," + position.getY() + ")");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRouteToLenderField(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
      /*  WebElement footerElement = findElement(By.xpath("//div[@id='footer']"));
        Point position = footerElement.getLocation();
        executeScript("scrollTo(0," + position.getY() + ")");*/
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectBrokerOption(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("RouteId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearBrokerOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("RouteId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }
}
