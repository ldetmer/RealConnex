package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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

    public void clickCloseTutorialField(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@class='top-close-hold']/a[contains(text(),'Close Tutorial?')]")).click();
    }

    public void clickMyUniverseRadioButton(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#PrivacyStatus3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#PrivacyStatus3"));
    }

    public void clickIncludeRadioButton(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#PrivacyStatus4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#PrivacyStatus4"));
    }

    public void clickExcludeRadioButton(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#PrivacyStatus5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#PrivacyStatus5"));
    }

    public void selectDealSponsorCheckBox(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        scrollDown();
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/span/span")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("input[name='data[Privacy][Universe][Include][role_id][]']"));
    }

    public void selectDealSponsorCheckBoxInExclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        scrollDown();
        findElement(By.xpath("//div[@id='excludeRules']/div/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/span/span")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("input[name=\"data[Privacy][Universe][Exclude][role_id][]\"]"));
    }

    public void selectInvestorCheckBoxInExclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        scrollDown();
        findElement(By.xpath("//div[@id='excludeRules']/div/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/span/span")).click();
    }

    public void clearDealSponsorCheckBoxInExclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        scrollDown();
        findElement(By.xpath("//div[@id='excludeRules']/div/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/span/span")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("input[name=\"data[Privacy][Universe][Exclude][role_id][]\"]"));
    }

    public void selectInvestorCheckBox(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        scrollDown();
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/span/span")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.xpath("//tr[3]/td/span/span/input"));
    }

    public void selectLenderCheckBox(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        scrollDown_EndOfWindow();
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Lender')]/parent::tr/td/span/span")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.xpath("//tr[4]/td/span/span/input"));
    }

    public void selectRealEstateAdvisorCheckBox(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        scrollDown_EndOfWindow();
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Real Estate Advisor')]/parent::tr/td/span/span")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.xpath("//tr[5]/td/span/span/input"));
    }

    public void clearDealSponsorCheckBox(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        scrollDown();
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/span/span")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.cssSelector("input[name='data[Privacy][Universe][Include][role_id][]']"));
    }

    public void clearInvestorCheckBox(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        scrollDown();
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/span/span")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.xpath("//tr[3]/td/span/span/input"));
    }

    public void clearLenderCheckBox(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        scrollDown_EndOfWindow();
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Lender')]/parent::tr/td/span/span")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.xpath("//tr[4]/td/span/span/input"));
    }

    public void clearRealEstateAdvisorCheckBox(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        scrollDown_EndOfWindow();
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Real Estate Advisor')]/parent::tr/td/span/span")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.xpath("//tr[5]/td/span/span/input"));
    }

    public void scrollDown(){
        executeScript("scrollTo(0,170)");
    }

    public void scrollDown_EndOfWindow(){
        WebElement footerElement = findElement(By.xpath("//div[@id='footer']"));
        Point position = footerElement.getLocation();
        executeScript("scrollTo(0," + position.getY() + ")");
    }

    public void selectSubRoleField_DealSponsor(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSubRoleField_DealSponsorInMyUniverseExclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='excludeRules']/div/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSubRoleField_InvestorInMyUniverseExclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='excludeRules']/div/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSubRoleField_Investor(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSubRoleField_Lender(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Lender')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSubRoleField_RealEstateAdvisor(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Real Estate Advisor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectDeveloperOption(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#Subroleinclude_Id_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleinclude_Id_checkbox_1"));
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectDeveloperOptionInMyUniverseExclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#Subroleexclude_Id_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleexclude_Id_checkbox_1"));
        findElement(By.xpath("//div[@id='excludeRules']/div/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAdvisorOptionInMyUniverseExclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#Subroleexclude_Id_checkbox_18")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleexclude_Id_checkbox_18"));
        findElement(By.xpath("//div[@id='excludeRules']/div/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearDeveloperOptionInMyUniverseExclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#Subroleexclude_Id_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleexclude_Id_checkbox_1"));
        findElement(By.xpath("//div[@id='excludeRules']/div/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearDeveloperOption(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#Subroleinclude_Id_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleinclude_Id_checkbox_1"));
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAdvisorOption(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#Subroleinclude_Id_checkbox_18")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleinclude_Id_checkbox_18"));
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectFamilyOfficeOption(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#Subroleinclude_Id_checkbox_39")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleinclude_Id_checkbox_39"));
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Lender')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAdvisorOption_RealEstateAdvisor(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#Subroleinclude_Id_checkbox_57")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleinclude_Id_checkbox_57"));
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Real Estate Advisor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearAdvisorOption(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#Subroleinclude_Id_checkbox_18")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleinclude_Id_checkbox_18"));
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearFamilyOfficeOption(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#Subroleinclude_Id_checkbox_39")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleinclude_Id_checkbox_39"));
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Lender')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRealEstateAdvisorAdvisorOption(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("#Subroleinclude_Id_checkbox_57")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#Subroleinclude_Id_checkbox_57"));
        findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Real Estate Advisor')]/parent::tr/td/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void setDealFundSize_DealSponsor(){
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

    public void setDealFundSize_DealSponsorInMyUniverseExclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='excludeRules']/div/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/a[1]"));
        for(int i=1;i<8;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='excludeRules']/div/table/tbody/tr/td[contains(text(),'Deal Sponsor')]/parent::tr/td/div/div/a[2]"));
        for(int i=0;i<91;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public void setDealFundSize_InvestorInMyUniverseExclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='excludeRules']/div/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/div/div/a[1]"));
        for(int i=1;i<9;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='excludeRules']/div/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/div/div/a[2]"));
        for(int i=0;i<90;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public void setDealFundSize_Investor(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/div/div/a[1]"));
        for(int i=1;i<9;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/div/div/a[2]"));
        for(int i=0;i<90;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public void setDealFundSize_Lender(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Lender')]/parent::tr/td/div/div/a[1]"));
        for(int i=1;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Lender')]/parent::tr/td/div/div/a[2]"));
        for(int i=0;i<89;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public void setDealFundSize_RealEstateAdvisor(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Real Estate Advisor')]/parent::tr/td/div/div/a[1]"));
        for(int i=1;i<11;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Real Estate Advisor')]/parent::tr/td/div/div/a[2]"));
        for(int i=0;i<88;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public void clearDealFundSize_DealSponsor(){
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

    public void clearDealFundSize_Investor(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/div/div/a[1]"));
        for(int i=1;i<9;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Investor')]/parent::tr/td/div/div/a[2]"));
        for(int i=0;i<90;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void clearDealFundSize_Lender(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Lender')]/parent::tr/td/div/div/a[1]"));
        for(int i=1;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Lender')]/parent::tr/td/div/div/a[2]"));
        for(int i=0;i<89;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void clearDealFundSize_RealEstateAdvisor(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Real Estate Advisor')]/parent::tr/td/div/div/a[1]"));
        for(int i=1;i<11;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='includeRules']/table/tbody/tr/td[contains(text(),'Real Estate Advisor')]/parent::tr/td/div/div/a[2]"));
        for(int i=0;i<88;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void selectPublicRadioButton_DealSponsor(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#lbl-pub-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#lbl-pub-1"));
    }

    public void selectPublicOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement viewOptions = findElement(By.xpath("//select[@name='data[Privacy][Universe][Exclude][view_permission]']"));
        Select select = new Select(viewOptions);
        select.selectByIndex(1);
    }

    public void selectPublicRadioButton_Investor(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#lbl-pub-2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#lbl-pub-2"));
    }

    public void selectPublicRadioButton_Lender(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#lbl-pub-3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#lbl-pub-3"));
    }

    public void selectPublicRadioButton_RealEstateAdvisor(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#lbl-pub-4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#lbl-pub-4"));
    }

    public void selectPrivateRadioButton_DealSponsor(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#lbl-priv-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#lbl-priv-1"));
    }

    public void selectPrivateRadioButton_Investor(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#lbl-priv-2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#lbl-priv-2"));
    }

    public void selectPrivateRadioButton_Lender(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#lbl-priv-3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#lbl-priv-3"));
        scrollUp();
    }

    public void selectPrivateRadioButton_RealEstateAdvisor(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#lbl-priv-4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#lbl-priv-4"));
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
        executeScript("scrollTo(150,0)");
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
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//form[@id='UserMePrivacyForm']/div/input[@value='Save']")).click();
    }

    public void clickSaveButton_Company(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//form[@id='UserCompanyPrivacyForm']/div/input[@value='Save']")).click();
    }

    public void clickSaveButton_Project(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("input.sbm")).click();
    }

    public void verifyUserName_Universe(String lStrUserName){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrUserName+"')]"), getDriverProvider().get()));
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void verifyCompanyName_Universe(String lStrCompanyName){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrCompanyName+"')]"), getDriverProvider().get()));
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void verifyProjectName_Universe(String lStrCompanyName){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrCompanyName+"')]"), getDriverProvider().get()));
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void verifyLoanName_Universe(String lStrLoanName){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrLoanName+"')]"), getDriverProvider().get()));
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void clickUserName_Universe(String lStrUserName){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrUserName+"')]")).click();
    }

    public void clickCompanyName_Universe(String lStrCompanyName){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrCompanyName+"')]")).click();
    }

    public void clickProjectName_Universe(String lStrUserName){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrUserName+"')]")).click();
    }

    public void clickLoanName_Universe(String lStrLoanName){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrLoanName+"')]")).click();
    }

    public void verifyIncludeProfileUserNameNotDisplayed(int intRowIndex) throws Exception {
        String lStrUserName = ReadData.readDataExcel("Privacy", intRowIndex, "NamesOfDifferentRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'" + lStrUserName + "')]"), getDriverProvider().get()));
    }

    public void clickProfileButton(){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("a.profile")).click();
    }

    public void clickEditButton(){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.id("editMeLink")).click();
    }

    public void selectDeveloperOptionInIAmAField(){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='subRoleSelect']/div/div/span")).click();
        findElement(By.id("SubroleId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='subRoleSelect']/div/div/span")).click();
    }

    public void selectAdvisorOptionInIAmAField(){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div/label[contains(text(),'I am a:')]/parent::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        findElement(By.cssSelector("#SubroleId_checkbox_18")).click();
        findElement(By.xpath("//div/label[contains(text(),'I am a:')]/parent::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectFamilyOfficeOptionInIAmAField(){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='subRoleSelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        findElement(By.cssSelector("#SubroleId_checkbox_39")).click();
        findElement(By.xpath("//div[@id='subRoleSelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAdvisorOptionInIAmAField_RealEstateAdvisor(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='subRoleSelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        findElement(By.cssSelector("#SubroleId_checkbox_57")).click();
        findElement(By.xpath("//div[@id='subRoleSelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOnSaveButtonInUserProfilePage(){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//input[@value='Save']")).click();
    }

    public void clickCompanyTabInUserProfile(){
         //wait until page load
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//a[contains(text(),'COMPANY')]")).click();
        //wait until page load
        WaitUtil.simpleSleep(5000);
    }

    public void clickEditOfStrategyField(){
         //wait until page load
        WaitUtil.simpleSleep(1000);
        scrollDown();
        findElement(By.xpath("//div/div/h3[contains(text(),'Strategy')]/parent::div/a")).click();
         //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void clickEditOfInvestmentStrategyField(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        scrollDown();
        findElement(By.xpath("//div/div/h3[contains(text(),'Investment Strategy')]/parent::div/a")).click();
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void clickEditOfInvestmentStrategyField_Lender(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        scrollDown();
        findElement(By.xpath("//div/div/h3[contains(text(),'Strategy')]/parent::div/a")).click();
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void clickEditOfAboutField(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        scrollDown();
        findElement(By.cssSelector("div.title > a.edit")).click();
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void setValueOfAverageDealSizeInUserProfile(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//dl/dt[contains(text(),'Average Deal Size:')]/parent::dl/dd/div/div/a[1]"));
        for(int i=1;i<8;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//dl/dt[contains(text(),'Average Deal Size:')]/parent::dl/dd/div/div/a[2]"));
        for(int i=0;i<91;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public void setValueOfPreferredDealSizeInUserProfile(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//dl/dt[contains(text(),'Preferred Deal Size:')]/parent::dl/dd/div/div/a[1]"));
        for(int i=1;i<9;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//dl/dt[contains(text(),'Preferred Deal Size:')]/parent::dl/dd/div/div/a[2]"));
        for(int i=0;i<90;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public void setValueOfAverageLoanAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//dl/dt[contains(text(),'Average Loan Amount:')]/parent::dl/dd/div/div/a[1]"));
        for(int i=1;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//dl/dt[contains(text(),'Average Loan Amount:')]/parent::dl/dd/div/div/a[2]"));
        for(int i=0;i<89;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public void setValueOfAverageTransactionSize(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//dl/dt[contains(text(),'Average Transaction Size:')]/parent::dl/dd/div/div/a[1]"));
        for(int i=1;i<11;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//dl/dt[contains(text(),'Average Transaction Size:')]/parent::dl/dd/div/div/a[2]"));
        for(int i=0;i<88;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public void clickSaveButtonInStrategyField(){
         //wait until page load
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div/h3[contains(text(),'Strategy')]/parent::div/input[@value='Save']")).click();
        //wait until page load
        WaitUtil.simpleSleep(10000);
    }

    public void clickSaveButtonInAboutField(){
        //wait until page load
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div/h3[contains(text(),'About')]/parent::div/input[@value='Save']")).click();
        //wait until page load
        WaitUtil.simpleSleep(10000);
    }

    public void scrollUp(){
        executeScript("scrollTo(250,0)");
    }

    public void clickOnEditCompanyField(){
        //wait until page load
        WaitUtil.simpleSleep(10000);
        findElement(By.cssSelector("#initCompanyClick")).click();
    }

    public void enterCompanyName(){
        String lStrCompanyName = "testAuto"+System.currentTimeMillis()+"Company";
        findElement(By.id("CompanyTitle")).clear();
        findElement(By.id("CompanyTitle")).sendKeys(lStrCompanyName);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("CompanyTitle"), lStrCompanyName);
    }

    public void selectDeveloperInWeAreAField(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='subRoleSelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        findElement(By.cssSelector("#SubroleId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='subRoleSelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAdvisorInWeAreAField(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div/label[contains(text(),'We are a:')]/parent::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        findElement(By.cssSelector("#SubroleId_checkbox_18")).click();
        findElement(By.xpath("//div/label[contains(text(),'We are a:')]/parent::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectFamilyOfficeInWeAreAField(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div/label[contains(text(),'We are a:')]/parent::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        findElement(By.cssSelector("#SubroleId_checkbox_39")).click();
        findElement(By.xpath("//div/label[contains(text(),'We are a:')]/parent::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAdvisorOfRealEstateAdvisorProfileInWeAreAField(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div/label[contains(text(),'We are a:')]/parent::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        findElement(By.cssSelector("#SubroleId_checkbox_57")).click();
        findElement(By.xpath("//div/label[contains(text(),'We are a:')]/parent::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSaveButtonOfCompanyProfile(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//input[@value='Save']")).click();
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void setInvestmentAmountOfInvestorProjectIsSetToPrivate(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<7;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<92;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickLoanOfLenderMyUniverse(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'CY Loan')]")).click();
    }

    public void clickMezzOfLenderMyUniverse(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'CY Mezz')]")).click();
    }

    public void clickServiceProjectMyUniverseInclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'Davis Service')]")).click();
    }

    public void clickListingProjectMyUniverseInclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'Davis Listing')]")).click();
    }

    public void verifyProjectOfServiceProviderNameMyUniverseInclude(String lStrProjectOfServiceProviderName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrProjectOfServiceProviderName+"')]"),getDriverProvider().get()));
    }

    public void clickProjectOfServiceProviderNameInMyUniverse(String lStrFundName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrFundName+"')]")).click();
    }

    public void verifyProjectOfLenderNameMyUniverseInclude(String lStrProjectOfLender){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrProjectOfLender+"')]"),getDriverProvider().get()));
    }

    public void clickProjectOfLenderNameInMyUniverse(String lStrProjectOfLender){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrProjectOfLender+"')]")).click();
    }
}
