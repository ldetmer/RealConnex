package test.pages;


import org.apache.commons.io.filefilter.FalseFileFilter;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.*;
import test.Support.ReadData;
import test.steps.VerificationStatements;

public class InvestmentDirectIntoCompanyPage extends FluentWebDriverPage{
    ReadData ReadData = new ReadData();

    public InvestmentDirectIntoCompanyPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void selectValueInDealSize(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<60;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }

        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueInDealSize(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=40;i<=100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }

        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
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

    public void clickRouteToSponsorField()throws WebDriverException {
        boolean bnlFound = false;
        int intCount = 0;
        while (!bnlFound && intCount <= 5){
            try{
                findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
                bnlFound= true;
            }catch(WebDriverException e){
                WaitUtil.simpleSleep(1000);
                intCount = intCount+1;
            }
        }
    }

    public void selectDirectOnlyInRouteToSponsor(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickAssetInterest(){
       //wait until asset interest field appears
       WaitUtil.simpleSleep(100);
       findElement(By.id("ui-accordion-1-header-0")).click();
    }

    public void clickDealStage(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(100);
        executeScript("scrollTo(0,550)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectOwnedOption(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void clearOwnedOption(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickAssetStrategyField(){

        //wait until page loads
        WaitUtil.simpleSleep(100);
        executeScript("scrollTo(0,550)");

        //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAcquisitionOption(){
         //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until deal stage field appears
        WaitUtil.simpleSleep(15000);
    }

    public void clearAcquisitionOption(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until deal stage field appears
        WaitUtil.simpleSleep(10000);
    }

    public void selectSyndicating(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("syndications_")).click();
        //wait until deal stage field appears
        WaitUtil.simpleSleep(5000);
    }

    public void selectBrokerOrIntermediary(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectConsultant(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        findElement(By.id("InvestortypeId_checkbox_11")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectEB5Program(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_11")).click();
        findElement(By.id("InvestortypeId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectFamilyOffice(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_13")).click();
        findElement(By.id("InvestortypeId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectFundOfFunds(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_15")).click();
        findElement(By.id("InvestortypeId_checkbox_17")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectHedgeFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_17")).click();
        findElement(By.id("InvestortypeId_checkbox_19")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectIndividualInvestor(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_19")).click();
        findElement(By.id("InvestortypeId_checkbox_21")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectInvestmentManager(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_21")).click();
        findElement(By.id("InvestortypeId_checkbox_23")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectNCREIFStyleTrust(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_23")).click();
        findElement(By.id("InvestortypeId_checkbox_25")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectOwnerOperator(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_25")).click();
        findElement(By.id("InvestortypeId_checkbox_27")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectPrivateEquityRealEstateFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_27")).click();
        findElement(By.id("InvestortypeId_checkbox_29")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectPublicREIT(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_29")).click();
        findElement(By.id("InvestortypeId_checkbox_31")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectSovereignWealthFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_31")).click();
        findElement(By.id("InvestortypeId_checkbox_33")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectBank(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_33")).click();
        findElement(By.id("InvestortypeId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectConstructionLender(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_8")).click();
        findElement(By.id("InvestortypeId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectCrowdFundingPlatform(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_10")).click();
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectEndowmentAndFoundation(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_14")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_14")).click();
        findElement(By.id("InvestortypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectGovernmentAgency(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_16")).click();
        findElement(By.id("InvestortypeId_checkbox_18")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectHighNet(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_18")).click();
        findElement(By.id("InvestortypeId_checkbox_20")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectInsuranceCompany(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_20")).click();
        findElement(By.id("InvestortypeId_checkbox_22")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectMezzanine(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_22")).click();
        findElement(By.id("InvestortypeId_checkbox_24")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectOtherInstitutional(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_24")).click();
        findElement(By.id("InvestortypeId_checkbox_26")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectPensionFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_26")).click();
        findElement(By.id("InvestortypeId_checkbox_28")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectPrivateREIT(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_28")).click();
        findElement(By.id("InvestortypeId_checkbox_30")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSeniorLender(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_30")).click();
        findElement(By.id("InvestortypeId_checkbox_32")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectSpecialServicer(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_32")).click();
        findElement(By.id("InvestortypeId_checkbox_34")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectAllOptionOfInvestorType(){

        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_34")).click();
        findElement(By.id("InvestortypeId_checkbox_36")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearAllOptionOfInvestorType(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_36")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

}
