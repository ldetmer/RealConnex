package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import test.steps.VerificationStatements;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 7/3/14
 * Time: 4:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyUniversePage extends FluentWebDriverPage {
    public MyUniversePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void clickMyUniverseRadioButton(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#PrivacyStatus3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#PrivacyStatus3"));
    }

    public void clickIncludeRadioButton(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#PrivacyStatus4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#PrivacyStatus4"));
    }

    public void selectDealSponsorCheckBox(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        scrollDown();
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/span/span")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("input[name='data[Privacy][Universe][Include][role_id][]']"));
    }

    public void clearDealSponsorCheckBox(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        scrollDown();
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/span/span")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.cssSelector("input[name='data[Privacy][Universe][Include][role_id][]']"));
    }

    public void scrollDown(){
        executeScript("scrollTo(0,150)");
    }

    public void selectSubRoleField(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectDeveloperOption(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#Subroleinclude_Id_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleinclude_Id_checkbox_1"));
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearDeveloperOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#Subroleinclude_Id_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleinclude_Id_checkbox_1"));
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void setDealFundSize(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/a[1]"));
        for(int i=1;i<8;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/a[2]"));
        for(int i=0;i<91;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public void clearDealFundSize(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/a[1]"));
        for(int i=1;i<8;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/a[2]"));
        for(int i=0;i<91;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void selectPublicRadioButton(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#lbl-pub-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#lbl-pub-1"));
    }

    public void clickLocationField(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#incAddressInput")).click();
    }

    public void clearLocationField(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#incAddressInput")).clear();
    }

    public void selectLocation(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#incAddressInput")).click();
        String lStrLocation = "Jud, North Dakota, United States";
        findElement(By.cssSelector("#incAddressInput")).sendKeys(lStrLocation);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("#incAddressInput"),lStrLocation);
    }

    public void clickSaveButton(){
        //wait until page load
        WaitUtil.simpleSleep(100);
        findElement(By.xpath("//form[@id='UserMePrivacyForm']/div/input[@value='Save']")).click();
    }

    public void verifyUserName_Universe(String lStrUserName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrUserName+"')]"), getDriverProvider().get()));
    }

    public void verifyIncludeProfileUserNameNotDisplayed(int intRowIndex) throws Exception {
        String lStrUserName = ReadData.readDataExcel("Privacy", intRowIndex, "NamesOfDifferentRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrUserName+"')]"),getDriverProvider().get()));
    }
}
